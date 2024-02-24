package ynov.classroom.api.persistence.repositories;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import ynov.classroom.api.domain.models.Admin;
import ynov.classroom.api.domain.ports.AdminPort;
import ynov.classroom.api.persistence.entities.AdminEty;
import ynov.classroom.api.persistence.mappers.AdminMapper;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Repository
@RequiredArgsConstructor
public class AdminRepository implements AdminPort {
    private final AdminRepositoryJPA adminRepository;
    private final AdminMapper mapper;

    @Override
    public Admin findByLoginAndPassword(String login, String password) {
        if (adminRepository.findByLoginAndPassword(login, password) == null) {
            AdminEty newAdmin = new AdminEty();
            newAdmin.setLogin(login);
            newAdmin.setPassword(password);
            newAdmin.setToken(UUID.randomUUID().toString());
            adminRepository.save(newAdmin);
        }
        return mapper.toModel(adminRepository.findByLoginAndPassword(login, password));
    }

    @Override
    public List<Admin> findAll() {
        return adminRepository.findAll().stream().map(mapper::toModel).collect(Collectors.toList());
    }

    @Override
    public Admin save(Admin admin) {
        adminRepository.save(mapper.toEty(admin));
        return admin;
    }

    @Override
    public int updateTokenByLogin(String token, String login) {
        return adminRepository.updateTokenByLogin(token, login);
    }

    @Override
    public boolean existsByToken(String token) {
        return adminRepository.existsByToken(token);
    }
}

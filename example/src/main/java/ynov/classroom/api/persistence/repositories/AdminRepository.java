package ynov.classroom.api.persistence.repositories;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import ynov.classroom.api.persistence.mappers.AdminEtyMapper;

import java.util.List;
import java.util.stream.Collectors;

@Repository
@RequiredArgsConstructor
public class AdminRepository implements AdminPort {
  private final AdminRepositoryJPA adminRepository;
  private final AdminEtyMapper mapper;

  @Override
  public List<Admin> findAll() {
    return adminRepository.findAll().stream().map(mapper::toModel).collect(Collectors.toList());
  }

  @Override
  public Admin save(Admin admin) {
    adminRepository.save(mapper.toEty(admin));
    return admin;
  }
}

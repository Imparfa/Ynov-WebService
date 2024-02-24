package ynov.classroom.api.domain.ports;

import ynov.classroom.api.domain.models.Admin;

import java.util.List;

public interface AdminPort {
    Admin findByLoginAndPassword(String login, String password);

    List<Admin> findAll();

    Admin save(Admin admin);

    int updateTokenByLogin(String token, String login);

    boolean existsByToken(String token);
}

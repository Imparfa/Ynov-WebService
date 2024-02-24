package ynov.classroom.api.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.lang.NonNull;
import org.springframework.transaction.annotation.Transactional;
import ynov.classroom.api.persistence.entities.AdminEty;

public interface AdminRepositoryJPA extends JpaRepository<AdminEty, Integer> {
    @Query("select (count(a) > 0) from AdminEty a where a.token = ?1")
    boolean existsByToken(String token);

    AdminEty findByLoginAndPassword(@NonNull String login, @NonNull String password);

    @Transactional
    @Modifying
    @Query("update AdminEty a set a.token = ?1 where a.login = ?2")
    int updateTokenByLogin(String token, String login);
}

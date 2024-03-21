package ynov.classroom.api.domain.ports;

import java.util.List;

public interface AdminPort {
  List<Admin> findAll();
  Admin save(Admin admin);
}

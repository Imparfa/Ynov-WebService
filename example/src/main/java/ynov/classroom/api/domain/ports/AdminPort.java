package ynov.classroom.api.domain.ports;

import ynov.classroom.api.domain.models.Admin;

import java.util.List;

public interface AdminPort {
  List<Admin> findAll();
  Admin save(Admin admin);
}

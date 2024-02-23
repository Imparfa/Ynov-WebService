package ynov.classroom.api.persistence.mappers;

import org.mapstruct.Mapper;
import ynov.classroom.api.domain.models.Admin;
import ynov.classroom.api.persistence.entities.AdminEty;

@Mapper(componentModel = "spring")
public interface AdminEtyMapper {
    AdminEty toEty(Admin admin);
    Admin toModel(AdminEty ety);
}

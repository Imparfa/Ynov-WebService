package ynov.classroom.api.persistence.mappers;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AdminEtyMapper {
    AdminEty toEty(Admin admin);
    Admin toModel(AdminEty ety);
}

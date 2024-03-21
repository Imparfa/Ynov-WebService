package ynov.classroom.api.web.mappers;

import org.mapstruct.Mapper;
import ynov.classroom.api.web.dtos.AdminDto;

@Mapper
public interface AdminDtoMapper {
  AdminDto toDto(Admin admin);
  Admin toModel(AdminDto adminDto);
}

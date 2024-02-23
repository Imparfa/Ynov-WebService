package ynov.classroom.api.web.mappers;

import org.mapstruct.Mapper;
import ynov.classroom.api.web.dtos.VehiculeDto;
import ynov.classroom.api.domain.models.Vehicle;

@Mapper
public interface VehicleDtoMapper {
  VehiculeDto toDto(Vehicle vehicle);
}

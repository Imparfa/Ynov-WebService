package ynov.classroom.api.persistence.mappers;

import org.mapstruct.Mapper;
import ynov.classroom.api.domain.models.Vehicle;
import ynov.classroom.api.persistence.entities.VehicleEty;

@Mapper(componentModel = "spring")
public interface VehicleEtyMapper {
    VehicleEty toEty(Vehicle vehicle);
    Vehicle toModel(VehicleEty ety);
}

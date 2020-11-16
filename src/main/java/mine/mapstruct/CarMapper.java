package mine.mapstruct;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CarMapper {
	CarMapper INSTANCE = Mappers.getMapper(CarMapper.class);
	
	@Mapping(source = "make", target = "manufacturer")
	@Mapping(source = "numberOfSeats", target = "seatCount")
	CarDto carToCarDto(Car car);
	
	@Mapping(source = "name", target = "fullName")
	PersonDto personToPersonDto(Person person);
}

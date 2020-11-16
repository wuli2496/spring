package mine.mapstruct;

import org.junit.Test;


import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MapStructTest {
	@Test
	public void testCarToCarDto() {
		Car car = new Car();
		car.setMake("test");
		car.setNumberOfSeats(10);
		
		CarDto carDto = CarMapper.INSTANCE.carToCarDto(car);
		log.info("carDto:{}", carDto);
	}
}

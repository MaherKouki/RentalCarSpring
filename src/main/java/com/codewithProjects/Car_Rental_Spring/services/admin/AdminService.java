package com.codewithProjects.Car_Rental_Spring.services.admin;

import com.codewithProjects.Car_Rental_Spring.dto.BookACarDto;
import com.codewithProjects.Car_Rental_Spring.dto.CarDto;

import java.io.IOException;
import java.util.List;

public interface AdminService {

    boolean postCar(CarDto carDto) throws IOException;

    List<CarDto> getAllCars();

    void deleteCar(Long id);

    CarDto getCarById(Long id);

    boolean updateCar(Long carId , CarDto carDto) throws IOException;

    List<BookACarDto> getBookings();

}

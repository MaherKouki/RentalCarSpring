package com.codewithProjects.Car_Rental_Spring.services.customer;

import com.codewithProjects.Car_Rental_Spring.dto.BookACarDto;
import com.codewithProjects.Car_Rental_Spring.dto.CarDto;
import com.codewithProjects.Car_Rental_Spring.entity.Car;

import java.util.List;

public interface CustomerService {

    List<CarDto> getAllCars();

    //boolean bookACar(BookACarDto bookACarDto);
    boolean bookACar(Long carId , BookACarDto bookACarDto);

    CarDto getCarById(Long carId);

    //List<BookACarDto> getBookingsByUserId(Long userId);

}

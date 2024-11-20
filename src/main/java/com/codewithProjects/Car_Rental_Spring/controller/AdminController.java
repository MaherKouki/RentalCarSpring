package com.codewithProjects.Car_Rental_Spring.controller;

import com.codewithProjects.Car_Rental_Spring.dto.CarDto;
import com.codewithProjects.Car_Rental_Spring.services.admin.AdminService;
import lombok.RequiredArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/api/admin")
@RequiredArgsConstructor
public class AdminController {

    private final AdminService adminService;

    /*@PostMapping("/car")
    public ResponseEntity<?> postCar(@ModelAttribute CarDto carDto) throws IOException {
        boolean success = adminService.postCar(carDto);
        if(success) {
            return ResponseEntity.status(HttpStatus.CREATED).build();
        }
        else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }*/

    @PostMapping("/car")
    public ResponseEntity<String> postCar(@ModelAttribute CarDto carDto) throws IOException {
        boolean success = adminService.postCar(carDto);
        if (success) {
            return ResponseEntity.status(HttpStatus.CREATED).body("Car posted successfully");
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Failed to post car");
        }
    }


    @GetMapping("/cars")
    public ResponseEntity<?> getAllCars(){
        return ResponseEntity.ok(adminService.getAllCars());
    }

    @DeleteMapping("/car/{id}")
    public ResponseEntity<?>deleteCar (@PathVariable Long id) {
        adminService.deleteCar(id);
        return ResponseEntity.ok(null);
    }


    @GetMapping("/car/{id}")
    public ResponseEntity<CarDto> getCarById(@PathVariable Long id){
        CarDto carDto = adminService.getCarById(id);
        return ResponseEntity.ok(carDto);
    }


    @PutMapping("/car/{carId}")
    public ResponseEntity<Void> updateCar(@PathVariable Long carId , @ModelAttribute CarDto carDto) throws IOException {
        try{
            boolean success = adminService.updateCar(carId,carDto);
            if(success)
                return ResponseEntity.status(HttpStatus.OK).build();
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }


}

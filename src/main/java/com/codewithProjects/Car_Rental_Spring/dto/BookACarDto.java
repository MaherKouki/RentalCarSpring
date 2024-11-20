package com.codewithProjects.Car_Rental_Spring.dto;


import com.codewithProjects.Car_Rental_Spring.enums.BookCarStatus;
import lombok.Data;

import java.util.Date;

@Data

public class BookACarDto {

    private Long id;

    private Date toDate;

    private Date fromDate;

    private Long days;

    private Long price;

    private BookCarStatus bookCarStatus;

    private Long cardId;

    private Long userId;

    /*private String username;
    private String email;*/

}

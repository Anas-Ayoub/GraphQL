package com.graphql.demo.service.dtos;

import lombok.Data;

@Data
public class CarDTO {
    private String model;
    private String color;
    private Float price;
}

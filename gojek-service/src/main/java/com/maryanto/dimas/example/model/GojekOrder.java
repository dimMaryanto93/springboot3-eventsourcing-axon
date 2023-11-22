package com.maryanto.dimas.example.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class GojekOrder {

    @Data
    @AllArgsConstructor
    public static class Request {
        private String id;
        private Customer customer;
        private String pickUpLocation;
        private String dropOffLocation;
        private LocalDateTime createDate;
    }

    @Data
    @AllArgsConstructor
    @Builder
    public static class Response {
        private String id;
        private Request request;
        private BigDecimal price;
        private Mitra.Driver driver;
        private LocalDateTime createDate;
    }

}

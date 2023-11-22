package com.maryanto.dimas.example.service;

import com.maryanto.dimas.example.model.GojekOrder;
import org.springframework.stereotype.Service;

@Service
public class OrderConfirmService {

    public GojekOrder.Response acceptOrderByDriver(GojekOrder.Request data) {
        return GojekOrder.Response.builder()
                .build();
    }

}

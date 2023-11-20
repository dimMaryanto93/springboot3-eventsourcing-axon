package com.maryanto.dimas.example.service;

import com.maryanto.dimas.example.model.GojekOrder;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class GojekOrderRequestService {

    public GojekOrder.Request orderCreate(GojekOrder.Request request) {
        request.setId(UUID.randomUUID().toString());
//        1. TODO store in database
//        2. TODO request near by driver
//        3. TODO order pick up by drive
        return request;
    }
}

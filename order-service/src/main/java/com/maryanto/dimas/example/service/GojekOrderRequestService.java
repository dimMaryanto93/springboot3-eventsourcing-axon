package com.maryanto.dimas.example.service;

import com.maryanto.dimas.example.model.GojekOrder;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class GojekOrderRequestService {

    public GojekOrder.Request orderCreate(GojekOrder.Request request) {
        request.setId(UUID.randomUUID().toString());
//        1. TODO order request by customer
//        2. TODO request near by driver
//        3. TODO order confirm by driver
//        4. TODO customer confirm to pickup
//        5. TODO order complete mark by driver
        return request;
    }

}

package com.maryanto.dimas.example.service;

import com.maryanto.dimas.example.model.GojekOrder;
import com.maryanto.dimas.example.model.Mitra;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderRequestService {

    public List<Mitra.Driver> findDriverNearBy() {
        return new ArrayList<>();
    }

    public GojekOrder.Response pickAnOrder(GojekOrder.Request data) {
        return GojekOrder.Response.builder()
                .build();
    }

}

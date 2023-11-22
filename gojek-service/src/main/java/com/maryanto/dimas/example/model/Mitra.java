package com.maryanto.dimas.example.model;

public class Mitra {

    public record Driver(String id, String phoneNumber, String nama, Kendaraan kendaraan) {
    }

    public record Kendaraan(String platNo, String jenis, Integer tier) {
    }
}

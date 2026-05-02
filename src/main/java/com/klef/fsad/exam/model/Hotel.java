package com.klef.fsad.exam.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.time.LocalDate;

@Entity
public class Hotel {

    @Id
    private Integer hotelId;   // MUST be manual

    private String name;
    private LocalDate date;
    private String status;

    public Hotel() {}

    public Hotel(Integer hotelId, String name, LocalDate date, String status) {
        this.hotelId = hotelId;
        this.name = name;
        this.date = date;
        this.status = status;
    }

    public Integer getHotelId() { return hotelId; }
    public void setHotelId(Integer hotelId) { this.hotelId = hotelId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public LocalDate getDate() { return date; }
    public void setDate(LocalDate date) { this.date = date; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
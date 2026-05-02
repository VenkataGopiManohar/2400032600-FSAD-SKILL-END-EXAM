package com.klef.fsad.exam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.klef.fsad.exam.model.Hotel;
import com.klef.fsad.exam.service.HotelService;

@RestController
@RequestMapping("/hotel")
public class HotelController {

    @Autowired
    private HotelService service;

    // POST
    @PostMapping
    public Hotel addHotel(@RequestBody Hotel hotel) {
        if (hotel.getHotelId() == null) {
            throw new RuntimeException("Hotel ID must not be null");
        }
        return service.addHotel(hotel);
    }

    // PUT
    @PutMapping("/{id}")
    public Hotel updateHotel(@PathVariable Integer id,
                             @RequestBody Hotel hotel) {
        return service.updateHotel(id, hotel);
    }
}
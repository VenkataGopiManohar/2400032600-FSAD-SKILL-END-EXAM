package com.klef.fsad.exam.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.fsad.exam.model.Hotel;
import com.klef.fsad.exam.repository.HotelRepository;

@Service
public class HotelService {

    @Autowired
    private HotelRepository repo;

    // POST - Add Hotel
    public Hotel addHotel(Hotel hotel) {
        return repo.save(hotel);
    }

    // PUT - Update Hotel
    public Hotel updateHotel(Integer id, Hotel hotelDetails) {

        Optional<Hotel> optional = repo.findById(id);

        if (optional.isPresent()) {
            Hotel hotel = optional.get();
            hotel.setName(hotelDetails.getName());
            hotel.setDate(hotelDetails.getDate());
            hotel.setStatus(hotelDetails.getStatus());
            return repo.save(hotel);
        } else {
            throw new RuntimeException("Hotel not found with ID: " + id);
        }
    }
}
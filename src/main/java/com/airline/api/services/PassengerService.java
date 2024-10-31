// this is the service class for the passenger entity

package com.airline.api.services;

import com.airline.api.models.Passenger;
import com.airline.api.repositories.PassengerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PassengerService {
    @Autowired
    private PassengerRepository passengerRepository;

    public List<Passenger> getPassengers() {
        return passengerRepository.findAll();
    }

    public Passenger getPassenger(Integer id) {
        return passengerRepository.findById(id).orElse(null);
    }

    public Passenger addPassenger(Passenger passenger) {
        return passengerRepository.save(passenger);
    }
}
package com.example.transport.services;

import com.example.transport.city.City;
import com.example.transport.transport.Transport;

public interface IService
{

    Transport[] checkPassengers(Transport[] transports, int passengers);
    double distanceCount(City departureCity, City arrivalCity);
    Transport[] checkPorts(Transport[] transports, City departureCity, City arrivalCity);
    Transport checkSpeed(Transport[] transports, City departureCity, City arrivalCity);
    Transport checkPrice(Transport[] transports);
    Transport[] checkLoadCapacity(Transport[] transports, double load);
}

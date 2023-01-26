package com.example.transport.transport.Air;

import lombok.Getter;
import lombok.Setter;
import com.example.transport.transport.Transport;

@Getter
@Setter
public class AirTransport extends Transport {
    private boolean isAir;
    public AirTransport(String name, double loadCapacity, double transportationPrice, double speed, int passengers) {
        super(name, loadCapacity, transportationPrice, speed, passengers);
        this.isAir = true;
    }
}

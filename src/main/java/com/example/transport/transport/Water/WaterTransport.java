package com.example.transport.transport.Water;

import lombok.Getter;
import lombok.Setter;
import com.example.transport.transport.Transport;

@Getter
@Setter
public class WaterTransport extends Transport {
    private boolean isWater;

    public WaterTransport(String name, double loadCapacity, double transportationPrice, double speed, int passengers) {
        super(name, loadCapacity, transportationPrice, speed, passengers);
        this.isWater = true;
    }
}

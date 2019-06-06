package com.prakash.model.vehicle;

import com.prakash.model.parkingSpace.SlotAllocator;

public class LVehicle extends Vehicle {


    public LVehicle(SlotAllocator slotAllocator, String registrationNumber){
        this.slotAllocator = slotAllocator;
        this.registrationNumber = registrationNumber;
    }
}

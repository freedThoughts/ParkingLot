package com.prakash.model.vehicle;

import com.prakash.model.parkingSpace.SlotAllocator;

public class MVehicle extends Vehicle {

    public MVehicle(SlotAllocator slotAllocator, String registrationNumber){
        this.slotAllocator = slotAllocator;
        this.registrationNumber = registrationNumber;
    }
}

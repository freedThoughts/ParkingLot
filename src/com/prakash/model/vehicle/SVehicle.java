package com.prakash.model.vehicle;

import com.prakash.model.parkingSpace.SlotAllocator;

public class SVehicle extends Vehicle {

    public SVehicle(SlotAllocator slotAllocator, String registrationNumber){
        this.slotAllocator = slotAllocator;
        this.registrationNumber = registrationNumber;
    }
}

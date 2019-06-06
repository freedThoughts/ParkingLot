package com.prakash.model.vehicle;

import com.prakash.model.parkingSpace.SlotAllocator;

public class XLVehicle extends Vehicle {


    public XLVehicle(SlotAllocator slotAllocator, String registrationNumber){
        this.slotAllocator = slotAllocator;
        this.registrationNumber = registrationNumber;
    }
}

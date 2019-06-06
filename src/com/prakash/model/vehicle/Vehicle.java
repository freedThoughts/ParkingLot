package com.prakash.model.vehicle;

import com.prakash.model.parkingSpace.SlotAllocator;

public abstract class Vehicle {

    SlotAllocator slotAllocator;
    String registrationNumber;

    public SlotAllocator getSlotAllocator() {
        return slotAllocator;
    }

    public void setSlotAllocator(SlotAllocator slotAllocator) {
        this.slotAllocator = slotAllocator;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }
}

package com.prakash.model.parkingSpace;

public class LSlotAllocator extends SlotAllocator {

    public LSlotAllocator(SlotAllocator nextSlotAllocator){
        this.nextSlotAllocator = nextSlotAllocator;
    }

}

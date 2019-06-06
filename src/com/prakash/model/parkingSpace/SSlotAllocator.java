package com.prakash.model.parkingSpace;

public class SSlotAllocator extends SlotAllocator {

    public SSlotAllocator(SlotAllocator nextSlotAllocator){
        this.nextSlotAllocator = nextSlotAllocator;
    }

}

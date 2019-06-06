package com.prakash.model.parkingSpace;

public class MSlotAllocator extends SlotAllocator {

    public MSlotAllocator(SlotAllocator nextSlotAllocator){
        this.nextSlotAllocator = nextSlotAllocator;
    }

}

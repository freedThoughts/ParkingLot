package com.prakash.model.parkingSpace;

public class XLSlotAllocator extends SlotAllocator {
    public XLSlotAllocator(SlotAllocator nextSlotAllocator){
        this.nextSlotAllocator = nextSlotAllocator;
    }

}

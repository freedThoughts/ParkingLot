package com.prakash.model.parkingSpace;

public class Slot {

    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public SlotAllocator getSlotAllocator() {
        return slotAllocator;
    }

    public void setSlotAllocator(SlotAllocator slotAllocator) {
        this.slotAllocator = slotAllocator;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    private SlotAllocator slotAllocator;
    private String details;

    public Slot(String id, SlotAllocator slotAllocator, String details){
        this.id = id;
        this.slotAllocator = slotAllocator;
        this.details = details;
    }
}

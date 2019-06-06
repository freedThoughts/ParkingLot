package com.prakash.model.parkingSpace;

import java.util.Queue;

public abstract class SlotAllocator {

    protected SlotAllocator nextSlotAllocator;
    protected Queue<Slot> slots;

    public void addSlot(Slot slot) {
        this.slots.add(slot);
    }

    public Slot getFreeSlot() {
        if (this.slots.size() > 0)
            return this.slots.poll();
        return this.nextSlotAllocator != null ? this.nextSlotAllocator.getFreeSlot() : null;
    }

    public SlotAllocator getNextSlotAllocator() {
        return nextSlotAllocator;
    }

    public void setNextSlotAllocator(SlotAllocator nextSlotAllocator) {
        this.nextSlotAllocator = nextSlotAllocator;
    }

    public Queue<Slot> getSlots() {
        return slots;
    }

    public void setSlots(Queue<Slot> slots) {
        this.slots = slots;
    }
}

package com.prakash;

import com.prakash.model.ParkingLot;
import com.prakash.model.parkingSpace.*;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

import static com.prakash.constant.Constant.*;

public class EntryPoint {

    public static void main(String[] arg) {

        // Adding Parking SlotsAllocator
        // Chain of responsibility - design pattern
        SlotAllocator xlSlotAllocator = new XLSlotAllocator(null);
        SlotAllocator lSlotAllocator = new LSlotAllocator(xlSlotAllocator);
        SlotAllocator mSlotAllocator = new MSlotAllocator(lSlotAllocator);
        SlotAllocator sSlotAllocator = new SSlotAllocator(mSlotAllocator);

        // Adding Parking Slots for each Allocator
        Queue<Slot> sslotQueue = new LinkedList<>();
        for (int i = 0; i < NUMBER_OF_S_SLOT; i++) {
            ((LinkedList<Slot>) sslotQueue).push(new Slot("S_" + i, sSlotAllocator, "Small Slot"));
        }
        sSlotAllocator.setSlots(sslotQueue);

        Queue<Slot> mslotQueue = new LinkedList<>();
        for (int i = 0; i < NUMBER_OF_M_SLOT; i++) {
            ((LinkedList<Slot>) mslotQueue).push(new Slot("M_" + i, mSlotAllocator, "Medium Slot"));
        }
        mSlotAllocator.setSlots(mslotQueue);

        Queue<Slot> lslotQueue = new LinkedList<>();
        for (int i = 0; i < NUMBER_OF_L_SLOT; i++) {
            ((LinkedList<Slot>) lslotQueue).push(new Slot("L_" + i, lSlotAllocator, "Large Slot"));
        }
        lSlotAllocator.setSlots(lslotQueue);

        Queue<Slot> xlslotQueue = new LinkedList<>();
        for (int i = 0; i < NUMBER_OF_XL_SLOT; i++) {
            ((LinkedList<Slot>) xlslotQueue).push(new Slot("XL_" + i, xlSlotAllocator, "Extra Large Slot"));
        }
        xlSlotAllocator.setSlots(xlslotQueue);


        // Adding Mapping of Type and SlotAllocator
        Map<Type, SlotAllocator> typeSlotAllocatorMap = new HashMap<>();
        typeSlotAllocatorMap.put(Type.S, sSlotAllocator);
        typeSlotAllocatorMap.put(Type.M, mSlotAllocator);
        typeSlotAllocatorMap.put(Type.L, lSlotAllocator);
        typeSlotAllocatorMap.put(Type.XL, xlSlotAllocator);

        // Initialising Parking Lot
        ParkingLot parkingLot = new ParkingLot(typeSlotAllocatorMap);
        parkingLot.parkVehicle(Type.XL, "ABC123");
        System.out.println(parkingLot.locateVehicle("ABC123").getId());
        parkingLot.unparkVehicle("ABC123");


    }
}

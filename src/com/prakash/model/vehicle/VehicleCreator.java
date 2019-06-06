package com.prakash.model.vehicle;

import com.prakash.Type;
import com.prakash.model.parkingSpace.SlotAllocator;
import java.util.Map;

// FACTORY DESIGN PATTERN
public class VehicleCreator {

    private Map<Type, SlotAllocator> typeSlotAllocatorMap;

    public VehicleCreator(Map<Type, SlotAllocator> typeSlotAllocatorMap ){
        this.typeSlotAllocatorMap = typeSlotAllocatorMap;
    }

    public Vehicle createVehicle(Type type, String registrationNumber) {
        switch (type) {
            case S:
                return new SVehicle(this.typeSlotAllocatorMap.get(type), registrationNumber);
            case M:
                return new MVehicle(this.typeSlotAllocatorMap.get(type), registrationNumber);
            case L:
                return new LVehicle(this.typeSlotAllocatorMap.get(type), registrationNumber);
            case XL:
                return new XLVehicle(this.typeSlotAllocatorMap.get(type), registrationNumber);
            default:
                return null;

        }
    }
}

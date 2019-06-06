package com.prakash.model;

import com.prakash.Type;
import com.prakash.exception.InValidVehicleParams;
import com.prakash.exception.NoSlotAvailableException;
import com.prakash.model.parkingSpace.Slot;
import com.prakash.model.parkingSpace.SlotAllocator;
import com.prakash.model.vehicle.Vehicle;
import com.prakash.model.vehicle.VehicleCreator;

import java.util.HashMap;
import java.util.Map;

public class ParkingLot {

    private Map<String, Slot> vehicleNumberSlotMap = new HashMap<>();
    private Map<String, Vehicle> vehicleNumberVehicleMap = new HashMap<>();
    private VehicleCreator vehicleCreator;

    public ParkingLot(Map<Type, SlotAllocator> typeSlotAllocatorMap) {
        this.vehicleCreator = new VehicleCreator(typeSlotAllocatorMap);
    }

    private Vehicle getVehicle(Type type, String registrationNumber) {
        return this.vehicleCreator.createVehicle(type, registrationNumber);
    }

    public void parkVehicle(Type type, String registrationNumber) {
        Vehicle vehicle = getVehicle(type, registrationNumber);
        if (vehicle == null)
            throw new InValidVehicleParams();
        Slot freeSlot = vehicle.getSlotAllocator().getFreeSlot();
        if (freeSlot == null)
            throw new NoSlotAvailableException();

        this.vehicleNumberSlotMap.put(registrationNumber, freeSlot);
        this.vehicleNumberVehicleMap.put(registrationNumber, vehicle);
    }

    public Slot locateVehicle(String registrationNumber) {
        return this.vehicleNumberSlotMap.get(registrationNumber);
    }

    public void unparkVehicle(String registrationNumber) {
        Slot slot = this.vehicleNumberSlotMap.get(registrationNumber);
        SlotAllocator slotAllocator = slot.getSlotAllocator();
        slotAllocator.addSlot(slot);
        this.vehicleNumberSlotMap.remove(registrationNumber);
        this.vehicleNumberVehicleMap.remove(registrationNumber);
    }


}

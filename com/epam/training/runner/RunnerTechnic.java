package com.epam.training.runner;

import com.epam.training.entity.Rooms;
import com.epam.training.entity.PortablePowerTool;
import com.epam.training.entity.PowerTool;
import com.epam.training.entity.StationaryPowerTool;
import com.epam.training.manager.ManagerTechnic;

import java.util.ArrayList;
import java.util.List;

public class RunnerTechnic {
    public static void main(String[] args) {

        StationaryPowerTool fridge = new StationaryPowerTool("Fridge", 240, true, Rooms.Kitchen);
        StationaryPowerTool oven = new StationaryPowerTool("Oven", 3600, true, Rooms.Kitchen);
        StationaryPowerTool teapot = new StationaryPowerTool("teapot", 2200, false, Rooms.Kitchen);
        StationaryPowerTool lampKitchen = new StationaryPowerTool("lamp", 20, true, Rooms.Kitchen);
        PortablePowerTool phoneCharger = new PortablePowerTool("phoneCharger", 4, true, Rooms.Kitchen);

        ManagerTechnic managerKitchenTechnic = new ManagerTechnic();
        List<PowerTool> listKitchenTechnic = new ArrayList<PowerTool>();
        listKitchenTechnic.add(fridge);
        listKitchenTechnic.add(oven);
        listKitchenTechnic.add(teapot);
        listKitchenTechnic.add(lampKitchen);
        listKitchenTechnic.add(phoneCharger);
        managerKitchenTechnic.setListTechnic(listKitchenTechnic);

        StationaryPowerTool tv = new StationaryPowerTool("television", 60, false, Rooms.LivingRoom);
        PortablePowerTool humidifier = new PortablePowerTool("humidifier", 75, true, Rooms.LivingRoom);
        StationaryPowerTool lampLivPoom = new StationaryPowerTool("lamp", 20, true, Rooms.LivingRoom);

        ManagerTechnic managerLivingRoomTechnic = new ManagerTechnic();
        List<PowerTool> listLivingRoomTechnic = new ArrayList<PowerTool>();
        listLivingRoomTechnic.add(tv);
        listLivingRoomTechnic.add(humidifier);
        listLivingRoomTechnic.add(lampLivPoom);
        managerLivingRoomTechnic.setListTechnic(listLivingRoomTechnic);

        managerKitchenTechnic.calcularePowerOfTechnicInEachRoom(listKitchenTechnic);
        managerKitchenTechnic.findToolByParameterMaxPower(listKitchenTechnic, 2500);

        System.out.println();

        managerLivingRoomTechnic.calcularePowerOfTechnicInEachRoom(listLivingRoomTechnic);
        managerLivingRoomTechnic.findToolByParameterMaxPower(listLivingRoomTechnic, 50);
    }
}

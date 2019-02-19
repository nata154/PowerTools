package com.epam.training.entity;

public class StationaryPowerTool extends PowerTool{

    public StationaryPowerTool() {
    }

    public StationaryPowerTool(String nameOfTool, int powerOfTool, Boolean availability, Enum installingPlace) {
        super(nameOfTool, powerOfTool, availability, installingPlace);
    }
}

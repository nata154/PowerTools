package com.epam.training.entity;

public class PortablePowerTool extends PowerTool{

    public PortablePowerTool() {
    }

    public PortablePowerTool(String nameOfTool, int powerOfTool, Boolean availability, Enum installingPlace) {
        super(nameOfTool, powerOfTool, availability, installingPlace);
    }
}

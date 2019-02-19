package com.epam.training.entity;

public class PowerTool implements Availability {
    private String nameOfTool;
    private int powerOfTool;
    Boolean availability = false;
    private Enum installingPlace;

    public PowerTool() {
    }

    public PowerTool(String nameOfTool, int powerOfTool, Boolean availability, Enum installingPlace) {
        this.nameOfTool = nameOfTool;
        this.powerOfTool = powerOfTool;
        this.availability = availability;
        this.installingPlace = installingPlace;
    }

    public String getNameOfTool() {
        return nameOfTool;
    }

    public void setNameOfTool(String nameOfTool) {
        this.nameOfTool = nameOfTool;
    }

    public int getPowerOfTool() {
        return powerOfTool;
    }

    public void setPowerOfTool(int powerOfTool) {
        this.powerOfTool = powerOfTool;
    }

    public Boolean getAvailability() {
        return availability;
    }

    public void setAvailability(Boolean availability) {
        this.availability = availability;
    }

    public Enum getInstallingPlace() {
        return installingPlace;
    }

    public void setInstallingPlace(Enum installingPlace) {
        this.installingPlace = installingPlace;
    }

    @Override
    public String toString() {
        return "PowerTool:  " +
                "nameOfTool = " + nameOfTool + ", " +
                "powerOfTool = " + powerOfTool + ", " +
                "availability = " + availability + ", " +
                "installingPlace = " + installingPlace + "; ";
    }
}

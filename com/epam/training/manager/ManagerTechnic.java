package com.epam.training.manager;

import com.epam.training.entity.PowerTool;

import java.util.ArrayList;
import java.util.List;

public class ManagerTechnic {
    List<PowerTool> listTechnic;

    public List<PowerTool> getListTechnic() {
        return listTechnic;
    }

    public void setListTechnic(List<PowerTool> listTechnic) {
        this.listTechnic = listTechnic;
    }

    public void calcularePowerOfTechnicInEachRoom (List <PowerTool> listTechnic){
        List <PowerTool> availableTools = new ArrayList<PowerTool>();
        int sumPowerOfTechnic = 0;
        Enum roomToCalculateIsPlaced = null;
        for (int i = 0; i<listTechnic.size(); i++){
            if (listTechnic.get(i).getAvailability().equals(true)){
                sumPowerOfTechnic += listTechnic.get(i).getPowerOfTool();
                availableTools.add(listTechnic.get(i));
                roomToCalculateIsPlaced = listTechnic.get(i).getInstallingPlace();
            }
        }
        System.out.println("The summary power of available tools in  " + roomToCalculateIsPlaced +
                "  is  " + sumPowerOfTechnic + " kVt.");
        System.out.println('\t' + "It includes: ");
        for (PowerTool powerTools: availableTools) {
            System.out.print('\t');
            System.out.println(powerTools);
        }
        System.out.println();
    }

public List <PowerTool> findToolByParameterMaxPower (List <PowerTool> listTechnic, int maxPowerOfTool){
    List <PowerTool> listToolByParameters = new ArrayList<PowerTool>();
    for (int i = 0; i<listTechnic.size(); i++){
    if (listTechnic.get(i).getPowerOfTool() <= maxPowerOfTool) {
        listToolByParameters.add(listTechnic.get(i));
    }
    }
    System.out.println("You have searched toools within power  " + maxPowerOfTool + "  kVt.");
    for (PowerTool powerTool: listToolByParameters) {
        System.out.print('\t');
        System.out.println(powerTool);
    }
    return listToolByParameters;
}
}

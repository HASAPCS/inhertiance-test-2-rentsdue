package com.example;

public class Appliance {
    // Attributes
    // TODO: Declare common attributes for electronic devices, such as brand and model and powerUsage.
    private String brand;
    private String model;
    private int powerUsage;

    // Constructor
    public Appliance(String brand, String model, int powerUsage) {
        // TODO: Initialize all attributes
        this.brand=brand;
        this.model=model;
        this.powerUsage=powerUsage;
    }

    // Getters
    // TODO: Implement getters for brand, model, and powerUsage
    public String getBrand() {
        return this.brand;
    }

    public String getModel() {
        return this.model;
    }

    public int getPowerUsage() {
        return this.powerUsage;
    }

    public String displayInfo() {
        return "Brand: "+brand+", Model: "+model+", Power Usage: "+powerUsage+" Watts";
    }
    
    public String isEcoFriendly() {
        if (powerUsage<400) {
            return "This appliance is eco-friendly";
        } 
    return "This appliance is not eco-friendly";
    }

}


package com.pluralsight;

public abstract class Asset {
    private String dateAcquired;
    private String description;
    private double originalCost;

    public Asset(String dateAcquired, String description, double originalCost) {
        this.description = description;
        this.dateAcquired = dateAcquired;
        this.originalCost = originalCost;
    }

//    Getters
    public String getDateAcquired() {
        return dateAcquired;
    }
    public String getDescription() {
        return description;
    }
    public double getOriginalCost() {
        return originalCost;
    }

//    Setters
    public void setDateAcquired(String dateAcquired) {
        this.dateAcquired = dateAcquired;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setOriginalCost(double originalCost) {
        this.originalCost = originalCost;
    }

//    Abstract Method
    public abstract double getValue();
}

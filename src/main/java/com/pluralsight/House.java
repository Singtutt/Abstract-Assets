package com.pluralsight;

public class House extends Asset {
    private String address;
    private int condition;
    private int squareFoot;
    private int lotSize;

    public House(String dateAcquired, String description, double originalCost, String address, int condition, int squareFoot, int lotSize) {
        super(dateAcquired, description, originalCost);
        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }

//    Getters
    public String getAddress() {
        return address;
    }
    public int getCondition() {
        return condition;
    }
    public int getSquareFoot() {
        return squareFoot;
    }
    public int getLotSize() {
        return lotSize;
    }

//    Setters
    public void setAddress(String address) {
        this.address = address;
    }
    public void setCondition(int condition) {
        this.condition = condition;
    }
    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }
    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }

    @Override
    public double getValue() {
        double value;

        if (condition == 1) {
            value = squareFoot * 180.00;
        } else if (condition == 2) {
            value = squareFoot * 130.00;
        } else if (condition == 3) {
            value = squareFoot * 90.00;
        } else {
            value = squareFoot * 80.00;
        }
        value += 0.25 * lotSize;
        return value;
    }
}

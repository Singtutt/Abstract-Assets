package com.pluralsight;
import java.time.*;

public class Vehicle extends Asset {
    private String makeModel;
    private int year;
    private int odometer;

    public Vehicle(String dateAcquired, String description, double originalCost, String makeModel, int year, int odometer) {
        super(dateAcquired, description, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

//    Getters
    public String getMakeModel() {
        return makeModel;
    }
    public int getYear() {
        return year;
    }
    public int getOdometer() {
        return odometer;
    }

//    Setters
    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    @Override
    public double getValue() {
        double value;
        int currentYear = LocalDate.now().getYear();
        int age = currentYear - year;

        if (age >= 0 && age <= 3) {
            value = getOriginalCost() * (1 - (0.03 * age));
        } else if (age >= 4 && age <= 6) {
            value = getOriginalCost() * (1 - (0.06 * age));
        } else if (age >= 7 && age <= 10) {
            value = getOriginalCost() * (1 - (0.08 * age));
        } else {
            value = getOriginalCost() * 1000.00;
        }

        if (odometer > 100000 && !makeModel.toLowerCase().contains("honda") && !makeModel.toLowerCase().contains("toyota")) {
            value *= 0.75;
        }
        return value;
    }
}

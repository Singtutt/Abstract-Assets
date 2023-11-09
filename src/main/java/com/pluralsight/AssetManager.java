package com.pluralsight;

import java.util.ArrayList;

public class AssetManager {
    public static void main(String[] args) {
        ArrayList<Asset> assets = new ArrayList<>();

        assets.add(new House("11-08-2023", "Sing's Home", 400000.0, "123 Southside Blvd", 1, 2500, 10000));
        assets.add(new House("11-08-2023", "Sing's Beach-side Home", 650000.0, "456 Northside Blvd", 3, 2000, 50000));
        assets.add(new Vehicle("11-08-23", "Sing's Car", 28000.0, "Toyota Prius", 2024, 110000));
        assets.add(new Vehicle("11-08-23", "William's Car", 30000.0, "Kia Niro SX", 2024, 150000));

        for (Asset asset : assets) {
            System.out.println("Description: " + asset.getDescription() +
                    "\nDate Acquired: " + asset.getDateAcquired() +
                    "\n\tOriginal Cost: $" + asset.getOriginalCost() +
                    "\n\tValue: $" + asset.getValue());

            if (asset instanceof House) {
                House house = (House) asset;
                System.out.println("Address: " + house.getAddress());
            } else if (asset instanceof Vehicle) {
                Vehicle vehicle = (Vehicle) asset;
                System.out.println("Vehicle:: " + vehicle.getYear() + " | " + vehicle.getMakeModel());
            }
            System.out.println();
        }
//        Testing Cash Class
        Cash cash = new Cash("11-09-2023", "Rainy Day Funds", 10000.0);
        System.out.println("Description: " + cash.getDescription() +
                "\nDate: " + cash.getDateAcquired() +
                "\n\tAmount: $" + cash.getOriginalCost());
    }
}

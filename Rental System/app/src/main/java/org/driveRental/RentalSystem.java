package org.driveRental;

import java.util.Collection;

public class RentalSystem {
    private Collection<Vehicle> inventory;

    public Collection<Vehicle> getInventory() {
        return inventory;
    }

    public void setInventory(Collection<Vehicle> inventory) {
        this.inventory = inventory;
    }
}

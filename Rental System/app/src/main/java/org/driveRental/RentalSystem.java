package org.driveRental;

import java.util.Collection;

/**
 * Represents the rental system containing the vehicle inventory.
 */
public class RentalSystem {
    private Collection<Vehicle> inventory;

    /**
     * Gets the inventory of vehicles in the rental system.
     *
     * @return A collection of Vehicle objects.
     */
    public Collection<Vehicle> getInventory() {
        return inventory;
    }

    /**
     * Sets the inventory of vehicles in the rental system.
     *
     * @param inventory A collection of Vehicle objects.
     */
    public void setInventory(Collection<Vehicle> inventory) {
        this.inventory = inventory;
    }
}

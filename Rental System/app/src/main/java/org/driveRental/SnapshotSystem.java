package org.driveRental;

/**
 * Represents the snapshot system containing the rental system.
 */
public class SnapshotSystem {
    private RentalSystem rental_system;

    public RentalSystem getRentalSystem() {
        return rental_system;
    }

    public void setRentalSystem(RentalSystem rental_system) {
        this.rental_system = rental_system;
    }
}

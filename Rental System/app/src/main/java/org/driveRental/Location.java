package org.driveRental;

/**
 * Represents the location details of a vehicle in the rental system.
 */
public class Location {

    private String lotId;
    private String address;
    private boolean isAvailable;

    public Location(String lotId, String address, boolean isAvailable) {
        this.lotId = lotId;
        this.address = address;
        this.isAvailable = isAvailable;
    }

    public Location() {
    }

    public String getLotId() {
        return lotId;
    }

    public void setLotId(String lotId) {
        this.lotId = lotId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
}

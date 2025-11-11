package org.driveRental;

/**
 * Represents the specifications of a vehicle in the rental system.
 */
public class Specifications {
    private int seatingCapacity;
    private int doors;
    private String transmission;
    private String mpgCity;
    private int mpgHighway;
    private double kmPerLitreCity;
    private double kmPerLitreHighway;
    private double fullTankCapacity;
    private int luggageCapacitySuitable;
    private int towingCapacity;

    public Specifications(int seatingCapacity, int doors, String transmission, String mpgCity,
                          int mpgHighway, double kmPerLitreCity, double kmPerLitreHighway,
                          double fullTankCapacity, int luggageCapacitySuitable, int towingCapacity) {
        this.seatingCapacity = seatingCapacity;
        this.doors = doors;
        this.transmission = transmission;
        this.mpgCity = mpgCity;
        this.mpgHighway = mpgHighway;
        this.kmPerLitreCity = kmPerLitreCity;
        this.kmPerLitreHighway = kmPerLitreHighway;
        this.fullTankCapacity = fullTankCapacity;
        this.luggageCapacitySuitable = luggageCapacitySuitable;
        this.towingCapacity = towingCapacity;
    }

    public Specifications() {
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public void setSeatingCapacity(int seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public String getMpgCity() {
        return mpgCity;
    }

    public void setMpgCity(String mpgCity) {
        this.mpgCity = mpgCity;
    }

    public int getMpgHighway() {
        return mpgHighway;
    }

    public void setMpgHighway(int mpgHighway) {
        this.mpgHighway = mpgHighway;
    }

    public double getKmPerLitreCity() {
        return kmPerLitreCity;
    }

    public void setKmPerLitreCity(int kmPerLitreCity) {
        this.kmPerLitreCity = kmPerLitreCity;
    }

    public double getKmPerLitreHighway() {
        return kmPerLitreHighway;
    }

    public void setKmPerLitreHighway(int kmPerLitreHighway) {
        this.kmPerLitreHighway = kmPerLitreHighway;
    }

    public double getFullTankCapacity() {
        return fullTankCapacity;
    }

    public void setFullTankCapacity(int fullTankCapacity) {
        this.fullTankCapacity = fullTankCapacity;
    }

    public int getLuggageCapacitySuitable() {
        return luggageCapacitySuitable;
    }

    public void setLuggageCapacitySuitable(int luggageCapacitySuitable) {
        this.luggageCapacitySuitable = luggageCapacitySuitable;
    }

    public int getTowingCapacity() {
        return towingCapacity;
    }

    public void setTowingCapacity(int towingCapacity) {
        this.towingCapacity = towingCapacity;
    }

}

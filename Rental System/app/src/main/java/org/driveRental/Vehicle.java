package org.driveRental;

import java.util.List;

/**
 * Represents a vehicle in the rental system with its details (Location, Pricing, Specifications).
 */
public class Vehicle {
    
    private String vehicleId;
    private String type;
    private String category;
    private String make;
    private String model;
    private int year;
    private String licensePlate;
    private String vin;
    private String rentalStatus;
    private Location location;
    private Pricing pricing;
    private Specifications specifications;
    private String[] features; 

    public Vehicle(String vehicleId, String type, String category, String make, String model,
                   int year, String licensePlate, String vin, Location location,
                   Pricing pricing, Specifications specifications, List<String> features,
                   String rentalStatus) {
        this.vehicleId = vehicleId;
        this.type = type;
        this.category = category;
        this.make = make;
        this.model = model;
        this.year = year;
        this.licensePlate = licensePlate;
        this.vin = vin;
        this.location = location;
        this.pricing = pricing;
        this.specifications = specifications;
        this.features = features.toArray(new String[0]);
        this.rentalStatus = rentalStatus;
    }

    public Vehicle() {
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Pricing getPricing() {
        return pricing;
    }

    public void setPricing(Pricing pricing) {
        this.pricing = pricing;
    }

    public Specifications getSpecifications() {
        return specifications;
    }

    public void setSpecifications(Specifications specifications) {
        this.specifications = specifications;
    }

    public String getRentalStatus() {
        return rentalStatus;
    }

    public void setRentalStatus(String rentalStatus) {
        this.rentalStatus = rentalStatus;
    }

    public String[] getFeatures() {
        return features;
    }

    public void setFeatures(String[] features) {
        this.features = features;
    }

    /**
     * Returns a string representation of the vehicle.
     *
     * @return A string containing the vehicle details.
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

    sb.append("\n============================\n");
    sb.append("VEHICLE DETAILS\n");
    sb.append("============================\n");
    sb.append("Vehicle ID     : ").append(vehicleId).append("\n");
    sb.append("Type           : ").append(type).append("\n");
    sb.append("Category       : ").append(category).append("\n");
    sb.append("Make & Model   : ").append(make).append(" ").append(model).append(" (").append(year).append(")\n");
    sb.append("License Plate  : ").append(licensePlate).append("\n");
    sb.append("VIN            : ").append(vin).append("\n");

    sb.append("\n----------------------------\n");
    sb.append("LOCATION\n");
    sb.append("----------------------------\n");
    sb.append("Lot ID         : ").append(location.getLotId()).append("\n");
    sb.append("Address        : ").append(location.getAddress()).append("\n");
    sb.append("Available      : ").append(location.isIsAvailable() ? "✅ Yes" : "❌ No").append("\n");

    sb.append("\n----------------------------\n");
    sb.append("PRICING\n");
    sb.append("----------------------------\n");
    sb.append("Daily Rate     : ").append(pricing.getCurrency()).append(" ").append(pricing.getRatePerDay()).append("\n");
    sb.append("Weekly Rate    : ").append(pricing.getCurrency()).append(" ").append(pricing.getRatePerWeek()).append("\n");
    sb.append("Monthly Rate   : ").append(pricing.getCurrency()).append(" ").append(pricing.getRatePerMonth()).append("\n");
    sb.append("Extra per Mile : ").append(pricing.getCurrency()).append(" ").append(pricing.getCostPerExtraMile()).append("\n");
    sb.append("Extra per Km   : ").append(pricing.getCurrency()).append(" ").append(pricing.getCostPerExtraKm()).append("\n");
    sb.append("Security Deposit: ").append(pricing.getCurrency()).append(" ").append(pricing.getSecurityDeposit()).append("\n");

    sb.append("\n----------------------------\n");
    sb.append("SPECIFICATIONS\n");
    sb.append("----------------------------\n");
    sb.append("Seating Capacity   : ").append(specifications.getSeatingCapacity()).append("\n");
    sb.append("Doors              : ").append(specifications.getDoors()).append("\n");
    sb.append("Transmission       : ").append(specifications.getTransmission()).append("\n");
    sb.append("Fuel Economy (MPG) : ").append(specifications.getMpgCity()).append(" city / ")
      .append(specifications.getMpgHighway()).append(" highway\n");
    sb.append("Fuel Efficiency    : ").append(specifications.getKmPerLitreCity()).append(" km/L city / ")
      .append(specifications.getKmPerLitreHighway()).append(" km/L highway\n");
    sb.append("Full Tank Capacity : ").append(specifications.getFullTankCapacity()).append(" L\n");
    sb.append("Luggage Capacity   : Suitable for ").append(specifications.getLuggageCapacitySuitable()).append(" bags\n");
    sb.append("Towing Capacity    : ").append(specifications.getTowingCapacity()).append(" kg\n");

    sb.append("\n----------------------------\n");
    sb.append("FEATURES\n");
    sb.append("----------------------------\n");
    if (features != null && features.length != 0) {
        for (String feature : features) {
            sb.append("- ").append(feature).append("\n");
        }
    } else {
        sb.append("No additional features listed.\n");
    }

    sb.append("\n----------------------------\n");
    sb.append("RENTAL STATUS\n");
    sb.append("----------------------------\n");
    sb.append("Current Status: ").append(rentalStatus != null ? rentalStatus.toUpperCase() : "UNKNOWN").append("\n");

    sb.append("============================\n");

    return sb.toString();
}




}

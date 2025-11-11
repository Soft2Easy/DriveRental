package org.testDriveRental;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collection;

import org.driveRental.Location;
import org.driveRental.Pricing;
import org.driveRental.Specifications;
import org.driveRental.Vehicle;
import org.driveRental.VehicleProcessor;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class VehicleProcessorTest {
    private static Vehicle vehicle1;
    private static Vehicle vehicle2;
    private static Vehicle vehicle3;
    private static Vehicle vehicle4;
    private static Vehicle vehicle5;
    private static Vehicle vehicle6;
    private Collection<Vehicle> vehicles;
    private VehicleProcessor vehicleProcessor;

    @BeforeAll
    public static void setUp(){
        vehicle1 = new Vehicle(
            "ECO123", "Economy", "Car", "Toyota", "Yaris", 2023, "ABC123", "1HGBH41JXMN109186",
            new Location("L001", "123 Main St, Salton, Johannesburg", true),
            new Pricing(647.50, 3885.00, 13875.00, "ZAR", 4.63, 2.88, 3700.00),
            new Specifications(5, 4, "Petrol", "Automatic", 33, 40, 14.0, 17.0, 40, 2),
            Arrays.asList("Bluetooth", "Backup Camera", "Air Conditioning", "Cruise Control"),
            "available"
        );

        vehicle2 = new Vehicle(
            "SUV456", "SUV", "Car", "Honda", "CR-V", 2024, "SUV789", "2FMDK3GC5DBA12345",
            new Location("L001", "123 Main St, Sandton, Johannesburg", true),
            new Pricing(1202.50, 7030.00, 24975.00, "ZAR", 5.55, 3.45, 5550.00),
            new Specifications(5, 4, "Petrol", "Automatic", 28, 34, 11.9, 14.5, 57, 4),
            Arrays.asList("Apple CarPlay", "Android Auto", "AWD", "Sunroof", "Lane Assist"),
            "available"
        );

        vehicle3 = new Vehicle(
            "LUX789", "Luxury", "Car", "BMW", "5 Series", 2023, "LUX101", "WBA53BJ050C789012",
            new Location("L002", "456 Oak Ave, Century City, Cape Town", false),
            new Pricing(2220.00, 12950.00, 46250.00, "ZAR", 8.33, 5.18, 9250.00),
            new Specifications(5, 4, "Petrol", "Automatic", 23, 32, 9.8, 13.6, 68, 3),
            Arrays.asList("Leather Seats", "Heated Seats", "Navigation System", "Premium Sound System", "Panoramic Roof"),
            "rented"
        );

        vehicle4 = new Vehicle(
            "TRK012", "Pickup Truck", "Truck", "Toyota", "Hilux", 2023, "TRK112", "1FTFW1E5XJFA98765",
            new Location("L003", "789 Industrial Rd, Rosslyn, Pretoria", true),
            new Pricing(1572.50, 9250.00, 33300.00, "ZAR", 7.40, 4.60, 7400.00),
            new Specifications(5, 4, "Diesel", "Automatic", 20, 26, 8.5, 11.1, 80, 0),
            Arrays.asList("4x4", "Towing Package", "Backup Camera", "Touchscreen Infotainment"),
            "available"
        );

        vehicle5 = new Vehicle(
            "MVN345", "Minivan", "Van", "Toyota", "Quantum", 2023, "MVN345", "2C4RC1BG9JR123456",
            new Location("L001", "123 Main St, Sandton, Johannesburg", true),
            new Pricing(1295.00, 7770.00, 27750.00, "ZAR", 6.48, 4.03, 6475.00),
            new Specifications(7, 5, "Diesel", "Automatic", 25, 30, 10.6, 12.8, 65, 5),
            Arrays.asList("Sliding Doors", "Air Conditioning", "Bluetooth", "Multiple Seating Configurations"),
            "available"
        );

        vehicle6 = new Vehicle(
            "CGO678", "Cargo Van", "Truck", "Toyota", "Hiace", 2022, "CGO789", "WD3PE8CC3J5890123",
            new Location("L003", "789 Industrial Rd, Rosslyn, Pretoria", true),
            new Pricing(1757.50, 10175.00, 35150.00, "ZAR", 7.03, 4.37, 9250.00),
            new Specifications(2, 3, "Diesel", "Manual", 18, 24, 7.7, 10.2, 70, 0),
            Arrays.asList("Load Securing Rings", "Rear View Camera", "Bluetooth", "High Roof"),
            "available"
        );
    }

    @BeforeEach
    public void init() {
        this.vehicles = Arrays.asList(vehicle1, vehicle2, vehicle3, vehicle4, vehicle5, vehicle6);
        this.vehicleProcessor = new VehicleProcessor(vehicles);
        
    }

    @Test
    public void getCategoriesTest() {
        var categories = vehicleProcessor.getCategories();
        assert(categories.size() == 3);
        assert(categories.contains("Car"));
        assert(categories.contains("Truck"));
        assert(categories.contains("Van"));
    }

    @Test
    public void getVanVehicleMakesTest() {
        var vanMakes = vehicleProcessor.getVehicleMake(0);
        assertEquals(1, vanMakes.size());
        assertTrue(vanMakes.contains("Toyota"));
    }

    @Test
    public void getCarVehicleMakesTest() {
        var carMakes = vehicleProcessor.getVehicleMake(1);
        assertEquals(3, carMakes.size());
        assertTrue(carMakes.contains("Toyota"));
        assertTrue(carMakes.contains("BMW"));
        assertTrue(carMakes.contains("Honda"));
    }

    @Test
    public void getTruckVehicleMakesTest() {
        var truckMakes = vehicleProcessor.getVehicleMake(2);
        assertEquals(2, truckMakes.size());
        assertTrue(truckMakes.contains("Toyota"));
    }

    @Test
    public void getVehicleDetailsTest() {
        var vehicleDetails = vehicleProcessor.getVehicleDetails(1, 2); // Get 3rd vehicle in "Car" category
        assertEquals("LUX789", vehicleDetails.getVehicleId());
        assertEquals("BMW", vehicleDetails.getMake());
        assertEquals("WBA53BJ050C789012", vehicleDetails.getVin());
    } 

}
package org.driveRental;

import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class RentalConsole {

    private SnapshotReading snapshotReading;
    private Collection<Vehicle> vehicles;
    private VehicleProcessor vehicleProcessor;
 

    /**
     * Reads the vehicle data from the snapshot system.
     *
     * @return A collection of Vehicle objects.
     * @throws Exception if there is an error reading the snapshot.
     */
    private Collection<Vehicle> getVehicles() throws Exception {
        snapshotReading = new SnapshotReading();
        vehicles = snapshotReading.readSnapshot("data.json");
        return vehicles;
    }

    /**
     * Retrieves the list of vehicle categories.
     *
     * @return A list of vehicle category names.
     * @throws Exception if there is an error retrieving the vehicles.
     */
    private List<String> getVehicleCategories() throws Exception {
        getVehicles();
        vehicleProcessor = new VehicleProcessor(vehicles);
        return vehicleProcessor.getCategories();
    }

    /**
     * Displays the list of vehicle categories to the console.
     *
     * @throws Exception if there is an error retrieving the categories.
     */
    private void displayVehicleCategories() throws Exception {
        List<String> categories = getVehicleCategories();
        for (int i = 0; i < categories.size(); i++) {
            System.out.println((i + 1) + ". " + categories.get(i));
        }
        System.out.print("Select a category by entering the corresponding number: ");
    }

    /**
     * Retrieves the list of vehicle makes in a specific category.
     *
     * @param index The index of the category.
     * @return A list of vehicle makes in the specified category.
     */
    private List<String> chooseVehiclesByCategory(int index) {
        return vehicleProcessor.getVehicleMake(index);
    }

    /**
     * Displays the list of vehicle makes in a specific category to the console.
     *
     * @param index The index of the category.
     */
    private void displayCategoryDetails(int index) {
        List<String> makes = vehicleProcessor.getVehicleMake(index);
        System.out.println("Available Vehicle Makes:");
        for (int i = 0; i < makes.size(); i++) {
            System.out.println((i + 1) + ". " + makes.get(i));
        }
        System.out.print("Select a vehicle make by entering the corresponding number: ");
    }

    /**
     * Retrieves the details of a specific vehicle by category and vehicle index.
     *
     * @param categoryIndex The index of the category.
     * @param vehicleIndex  The index of the vehicle within the category.
     * @return The Vehicle object representing the selected vehicle.
     */
    private  Vehicle chooseVehicleByMake(int categoryIndex, int vehicleIndex) {
        return vehicleProcessor.getVehicleDetails(categoryIndex, vehicleIndex);
    }

    /**
     * Displays the details of a specific vehicle to the console.
     *
     * @param categoryIndex The index of the category.
     * @param vehicleIndex  The index of the vehicle within the category.
     */
    private void displayVehicleDetails(int categoryIndex, int vehicleIndex) {
        Vehicle selectedVehicle = chooseVehicleByMake(categoryIndex, vehicleIndex);
        System.out.println("You have selected: " + selectedVehicle.toString());
    }

    /**
     * Displays a welcome message to the console.
     */
    private void welcomeMessage() {
        System.out.println("****************************************");
        System.out.println("**  Welcome to the Drive Rental  **");
        System.out.println("****************************************");
        System.out.println("Loading fleet data...");
            System.out.println("Fleet data loaded successfully.");
            System.out.println("Available Vehicle Categories:");
    }

    public void main(String[] args) {
        welcomeMessage();
        try {
            displayVehicleCategories();
            
            try (Scanner scanner = new Scanner(System.in)) {
                int categoryIndex = scanner.nextInt() - 1;
                displayCategoryDetails(categoryIndex);
                
                int vehicleIndex = scanner.nextInt() - 1;
                displayVehicleDetails(categoryIndex, vehicleIndex);
            }
        } catch (Exception e) {
            System.err.println("An error occurred while loading vehicle data.");
            e.printStackTrace();
         }
    }
 }
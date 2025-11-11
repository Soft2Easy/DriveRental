package org.driveRental;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VehicleProcessor {
   private Collection<Vehicle> vehicles;
   private Map<String, List<Vehicle>> categoryMap;
   private List<String> vehicleMake;
   
    public VehicleProcessor(Collection<Vehicle> vehicles) {
         this.vehicles = vehicles;
         this.categoryMap = new HashMap<>();
         this.vehicleMake = new ArrayList<>();
         mapVehiclesByCategory();
         
    }

    {
        if(this.categoryMap != null) {
            this.categoryMap.clear();
        }
    }

    /**
     * Maps vehicles by their category.
     * @return A map where the key is the vehicle category and the value is a list of vehicles in that category.
     */
    private Map<String, List<Vehicle>> mapVehiclesByCategory() {
            
            for(Vehicle vehicle : this.vehicles) {
               String category = vehicle.getCategory();
               this.categoryMap.putIfAbsent(category, new ArrayList<>());
               this.categoryMap.get(category).add(vehicle);
            }
            return this.categoryMap;
    }

    /**
     * Retrieves the list of category groups.
     * @return A list of category names.
     */
    public List<String> getCategories() {
            
            return this.categoryMap.keySet().stream().toList();
    }

     /**
      * Retrieves the vehicles in a specific category group by index.
      * @param index The index of the category group.
      * @return A list of vehicles in the specified category group.
      */
    private List<Vehicle> getVehiclesByCategoryIndex(int index) {
          if (index < 0 || index >= this.categoryMap.size()) {
                    throw new IndexOutOfBoundsException("Invalid category index: " + index);
            }
             List<String> selectedCategories = new ArrayList<>(this.categoryMap.keySet());
            return this.categoryMap.get(selectedCategories.get(index));
    }

    /**
     * Retrieves the makes of vehicles in a specific category group by index.
     * @param index The index of the category group.
     * @return A list of vehicle makes in the specified category group.
     */
    public List<String> getVehicleMake(int index) {
          if (index < 0 || index >= this.categoryMap.size()) {
                    throw new IndexOutOfBoundsException("Invalid category index: " + index);
            }
          List<Vehicle> vehiclesInCategory = getVehiclesByCategoryIndex(index);
          for (Vehicle vehicle : vehiclesInCategory) {
               this.vehicleMake.add(vehicle.getMake());
          }
          return this.vehicleMake;
  }

     /**
      * Retrieves the vehicle details in a specific category group by index.
      * @param index The index of the category group.
      * @return The vehicle details in the specified category group.
      */
     public Vehicle getVehicleDetails(int categoryIndex, int vehicleIndex) {
        List<Vehicle> vehiclesInCategory = getVehiclesByCategoryIndex(categoryIndex);
        if (vehicleIndex < 0 || vehicleIndex >= vehiclesInCategory.size()) {
            throw new IndexOutOfBoundsException("Invalid vehicle index: " + vehicleIndex);
        }
        return vehiclesInCategory.get(vehicleIndex);
     }
}

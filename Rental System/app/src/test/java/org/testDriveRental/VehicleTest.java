package org.testDriveRental;

import java.util.Collection;

import org.driveRental.SnapshotReading;
import org.driveRental.Vehicle;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class VehicleTest {
   
    private SnapshotReading snapshotReading;
    private Collection<Vehicle> vehicles;

    @BeforeEach
    public void setup() throws Exception {
        this.snapshotReading = new SnapshotReading();
        this.vehicles = snapshotReading.readSnapshot("src/main/resources/data.json");
    }

    @Test
    public void vehicleQuantityTest()  {
        assertEquals(6, vehicles.size());     
    }

}

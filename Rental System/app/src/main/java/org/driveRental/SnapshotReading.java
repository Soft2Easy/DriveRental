package org.driveRental;

import java.io.File;
import java.io.InputStream;
import java.util.Collection;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;

/**
 * Handles reading the snapshot data from a JSON file.
 */
public class SnapshotReading {
    private final ObjectMapper objectMapper;

    public SnapshotReading() {
        objectMapper = new ObjectMapper();
        objectMapper.setPropertyNamingStrategy(PropertyNamingStrategies.SNAKE_CASE);
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }   
    
    /**
     * Reads the snapshot data from the specified JSON file.
     *
     * @param fileName The name of the JSON file containing the snapshot data.
     * @return A collection of Vehicle objects representing the inventory.
     * @throws Exception If there is an error reading or parsing the file.
     */
    public Collection<Vehicle> readSnapshot(String fileName) throws Exception {
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream(fileName);

        if (inputStream == null) {
            throw new IllegalArgumentException("File not found in resources: " + fileName);
        }

        SnapshotSystem snapshotSystem = objectMapper.readValue(inputStream, SnapshotSystem.class);
        return snapshotSystem.getRentalSystem().getInventory();
    }
}

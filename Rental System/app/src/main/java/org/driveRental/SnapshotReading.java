package org.driveRental;

import java.io.File;
import java.util.Collection;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;

public class SnapshotReading {
    private final ObjectMapper objectMapper;

    public SnapshotReading() {
        objectMapper = new ObjectMapper();
        objectMapper.setPropertyNamingStrategy(PropertyNamingStrategies.SNAKE_CASE);
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }   
    
    public Collection<Vehicle> readSnapshot(String filePath) throws Exception {
        SnapshotSystem snapshotSystem = objectMapper.readValue(new File(filePath), SnapshotSystem.class);
        return snapshotSystem.getRentalSystem().getInventory();
    }
}

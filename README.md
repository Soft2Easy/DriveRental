# 🚗 Drive Rental System
A comprehensive Java-based vehicle rental management system that provides an interactive console interface for browsing and selecting rental vehicles with detailed specifications, pricing, and location information.

## 🚀 Quick Start

git clone (https://github.com/Soft2Easy/DriveRental.git)
cd drive-rental
./gradlew build
./gradlew run

## 📋 Features

* Interactive Console UI - Browse vehicles by category (Car, Van, Truck)

* Detailed Vehicle Info - Specifications, pricing, features, and availability

* JSON Data Management - Jackson-based data parsing from data.json

* Comprehensive Testing - JUnit tests for core functionality

* Gradle Build - Easy dependency management

## 🏗️ Architecture

```
src/
├── main/
│   ├── java/org/driveRental/
│   │   ├── Location.java          # Vehicle location and availability
│   │   ├── Pricing.java           # Rental pricing structure
│   │   ├── RentalConsole.java     # Main user interface
│   │   ├── RentalSystem.java      # Core rental system container
│   │   ├── SnapshotReading.java   # JSON data reader
│   │   ├── SnapshotSystem.java    # Snapshot data container
│   │   ├── Specifications.java    # Vehicle specifications
│   │   ├── Vehicle.java           # Main vehicle entity
│   │   └── VehicleProcessor.java  # Vehicle filtering and categorization
│   └── resources/
│       └── data.json              # Vehicle database
└── test/
    └── java/org/testDriveRental/
        ├── VehicleProcessorTest.java  # Vehicle processor tests
        └── VehicleTest.java           # Vehicle entity tests
```
## 🧪 Testing

./gradlew test

Tests cover vehicle categorization, JSON parsing, and data integrity

## 📁 Project Structure

* Main Source: src/main/java/org/driveRental/

* Tests: src/test/java/org/testDriveRental/

* Data: src/main/resources/data.json

* Build: Gradle with JUnit

**Tech Stack** : Java 17+, Jackson, Gradle, JUnit

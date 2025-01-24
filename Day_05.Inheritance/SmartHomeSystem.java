// Superclass: Device
class Device {
    // Attributes of the Device class
    String deviceId;
    String status;

    // Constructor for the Device class
    Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    // Method to display device status
    void displayStatus() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status: " + status);
    }
}

// Subclass: Thermostat
class Thermostat extends Device {
    // Additional attribute for the Thermostat class
    double temperatureSetting;

    // Constructor for the Thermostat class
    Thermostat(String deviceId, String status, double temperatureSetting) {
        super(deviceId, status); // Call the superclass constructor
        this.temperatureSetting = temperatureSetting;
    }

    // Overridden displayStatus method to include thermostat-specific information
    @Override
    void displayStatus() {
        super.displayStatus(); // Display device status using the superclass method
        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
    }
}

// Main class to test the system
public class SmartHomeSystem {
    public static void main(String[] args) {
        // Create a Thermostat object
        Thermostat thermostat = new Thermostat("SHS1001", "Active", 25.6);

        // Display the thermostat's status
        System.out.println("Thermostat Details:");
        thermostat.displayStatus();
    }
}

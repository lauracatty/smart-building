// Package declaration
package building.climate_control;

// Importing necessary classes from Java standard library
import java.util.Map;
import java.util.HashMap;

// The main class declaration
public class ClimateControl {

    // Map to store the temperature for different areas
    private Map<String, Float> areaTemperature;
    
    // Map to store the humidity for different areas
    private Map<String, Float> areaHumidity;
    
    // Map to store the HVAC conditions for different areas
    private Map<String, HVACCondition> areaHVACConditions;

    // Constructor for the ClimateControl class
    public ClimateControl() {
        // Initializing maps
        this.areaTemperature = new HashMap<>();
        this.areaHumidity = new HashMap<>();
        this.areaHVACConditions = new HashMap<>();
    }

    // Method to update the temperature for a given area
    public void updateTemperature(String areaId, Float temperature) {
        this.areaTemperature.put(areaId, temperature);
    }

    // Method to update the humidity for a given area
    public void updateHumidity(String areaId, Float humidity) {
        this.areaHumidity.put(areaId, humidity);
    }

    // Method to update the HVAC conditions for a given area
    public void updateHVACCondition(String areaId, HVACCondition hvacCondition) {
        this.areaHVACConditions.put(areaId, hvacCondition);
    }

    // Method to get the temperature for a given area, returns -1 if the area is not found
    public float getTemperature(String areaId) {
        return this.areaTemperature.getOrDefault(areaId, (float) -1);
    }

    // Method to get the humidity for a given area, returns -1 if the area is not found
    public float getHumidity(String areaId) {
        return this.areaHumidity.getOrDefault(areaId, (float) -1);
    }

    // Method to get the HVAC conditions for a given area, returns null if the area is not found
    public HVACCondition getHVACCondition(String areaId) {
        return this.areaHVACConditions.getOrDefault(areaId, null);
    }
    
    // Inner class to represent the HVAC condition for a given area
    public class HVACCondition {
        // Field for the status of the HVAC system
        private boolean status;
        
        // Field for the current temperature of the HVAC system
        private float currentTemperature;
        
        // Field for the set temperature of the HVAC system
        private float setTemperature;
        
        // Field for the error code of the HVAC system
        private String errorCode;

		
        
        // Constructor
        public HVACCondition(boolean status, float currentTemperature, float setTemperature, String errorCode) {
            this.status = status;
            this.currentTemperature = currentTemperature;
            this.setTemperature = setTemperature;
            this.errorCode = errorCode;
        }

        // Getters
        public boolean getStatus() {
            return this.status;
        }

        public float getCurrentTemperature() {
            return this.currentTemperature;
        }

        public float getSetTemperature() {
            return this.setTemperature;
        }

        public String getErrorCode() {
            return this.errorCode;
        }
        
        // Setters
        public void setStatus(boolean status) {
            this.status = status;
        }

        public void setCurrentTemperature(float currentTemperature) {
            this.currentTemperature = currentTemperature;
        }

        public void setSetTemperature(float setTemperature) {
            this.setTemperature = setTemperature;
        }

        public void setErrorCode(String errorCode) {
            this.errorCode = errorCode;
        }
    }
		
        
        
        
    }



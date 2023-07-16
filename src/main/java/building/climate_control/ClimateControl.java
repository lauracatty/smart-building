package building.climate_control;

import java.util.Map;
import java.util.HashMap;

public class ClimateControl {

    private Map<String, Float> areaTemperature;

    public ClimateControl() {
        this.areaTemperature = new HashMap<>();
        this.humidity= new HashMap <>();
    }

    // Rest of your service methods go here, which can use the 'climateConditions' map
    // For example, you could have a method to update the climate condition for a specific area:

    public void updateClimateCondition(String areaId, Float temperature) {
        this.areaTemperature.put(areaId, temperature);
    }
    
    
    
    public float getTemperature(String areaId) {
    	return this.areaTemperature.getOrDefault(areaId, (float) -1);
    	
    }
    
    
    private Map<String, Float> humidity;
    
}

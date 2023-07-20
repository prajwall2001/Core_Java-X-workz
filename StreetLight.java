class StreetLight{
	public static void main(String[] args)
	{
	System.out.println("StreetLight information");
	    float light_intensity = 500.55f;
        float power_consumption = 150.0f;
        int operating_volt = 220;
        String lamp_typ = "LED";
        float height = 10.0f;
        float width = 1.5f;
        String material = "Aluminum";
        int color_temp = 4000;
        int lumens_op = 5000;
        String mounting_typ = "Pole-mounted";
        String control_system = "Centralized";
        boolean motion_sensor = true;
        int lightsource_lifespan = 56000;
        boolean weather_resistance = true;
        boolean dimming_capability = false;
        boolean photocell_presence = true; 
        String maintenance_schedule = "Monthly";
        String gps_coordinates = "40.7128° N, 74.0060° W";
        String street_name = "Main Street";
		int size=5;
        
        System.out.println("Light Intensity: " + light_intensity + " lux");
        System.out.println("Power Consumption: " + power_consumption + " watts");
        System.out.println("Operating Voltage: " + operating_volt + " volts");
        System.out.println("Lamp Type: " + lamp_typ);
        System.out.println("Height: " + height + " meters");
        System.out.println("Width: " + width + " meters");
        System.out.println("Material: " + material+ "Aluminum");
        System.out.println("Color Temperature: " + color_temp+ " Kelvin");
        System.out.println("Lumens Output: " + lumens_op + " lumens");
        System.out.println("Mounting Type: " + mounting_typ);
        System.out.println("Control System: " + control_system);
        System.out.println("Motion Sensor: " + motion_sensor);
        System.out.println("Light Source Lifespan: " + lightsource_lifespan + " hours");
        System.out.println("Weather Resistance: " + weather_resistance);
        System.out.println("Dimming Capability: " + dimming_capability);
        System.out.println("Photocell Presence: " + photocell_presence);
        System.out.println("Maintenance Schedule: " + maintenance_schedule);
        System.out.println("GPS Coordinates: " + gps_coordinates);
        System.out.println("Street Name: " + street_name);
		System.out.println("size: " + size);
    }
}
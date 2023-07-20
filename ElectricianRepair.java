class ElectricianRepair{
    public static void main(String[] args)
	{
	System.out.println("Running main in elctrician...");
        Electrician.installLighting();
        Electrician.installSwitches();
        Electrician.installOutlets();
        Electrician.installCircuitBreakers();
        Electrician.testWiring();
        Electrician.replaceLightBulbs();
        Electrician.troubleshootPowerOutage();
        Electrician.installCeilingFans();
        Electrician.installSecurityCameras();
        Electrician.installSmokeDetectors();
		Electrician.installCeilingFans("Havels",5);
		Electrician.testWiring(true,9);
		Electrician.installSmokeDetectors(8);
		Electrician.installSwitches(false);
		Electrician.replaceLightBulbs(8);
    }
}

package com.gadget.app;

public class Gadget {
    public void use() {
        System.out.println("Using the gadget");
        use("Default");
        use(0);
    }
    
    public void use(String mode) {
    	System.out.println("Invoking String in use() ");
        System.out.println("Using with mode: " + mode);
    }
    
    public void use(int setting) {
      	System.out.println("Invoking int in use() ");
        System.out.println("Using with setting: " + setting);
    }
    
    public void use(String mode, int setting) {
      	System.out.println("Invoking String,int in use() ");
        System.out.println("Using with mode: " + mode + " and setting: " + setting);
        use(mode);
        use(setting);
    }

}

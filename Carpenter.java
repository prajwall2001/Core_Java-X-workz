 class Carpenter {
    
    static void cutWood() {
        System.out.println("Cutting wood.");
    }
 static void sharpenWood(){
	 System.out.println("Sharpening wood");
 }
    static void shapeWood() {
        System.out.println("Shaping wood.");
    }
    
    static void sandWood() {
        System.out.println("Sanding wood.");
	}
		static void varnishWood() {
        System.out.println("Varnishing wood.");
    }
    
    static void assembleFurniture() {
        System.out.println("Assembling furniture.");
		
    }
	static void cutAndShapeWood() {
        System.out.println("Cutting and shape wood");
    }
    
    static void cutAndSandWood() {
        System.out.println("Cutting and sand wood . ");
    }
    
    static void shapeWood(int length,String woodType) {
        System.out.println("Shaping wood of length " + length + " inches.");
		  System.out.println("Shaping" +woodType);
    }
	  
	  static void shapeWood(String shapeType,int takeHours) {
        System.out.println("Shaping wood of type " + shapeType);
		  System.out.println("Taking hours
		  " +takeHours);
    }
	
    static void varnishWood(int quantity) {
        System.out.println("Varnishing " + quantity + " pieces of wood.");
    }
	 static void assembleFurniture(String furnitureType) {
        System.out.println("Assembling " + furnitureType + ".");
    }
	static void sandWood(int quantity) {
        System.out.println("Sanding " + quantity + " pieces of wood.");
    }
	 static void cutWood(int quantity) {
        System.out.println("Cutting " + quantity + " pieces of wood.");
    }
 }
    
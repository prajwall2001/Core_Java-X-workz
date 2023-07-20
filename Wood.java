class Wood {
    double price;
    String color;
    float weight;
    String quality;
    int length;

    Wood(double price) {
		super();
        this.price = price;
		System.out.println("Invoking double constructor");		
        System.out.println("Price of wood: " + price);
    }

    Wood(double price, String color) {
        this(price);
        this.color = color;
		System.out.println("Invoking double,string constructor");		
        System.out.println("Price and color of wood: " + price + ", " + color);
    }

    Wood(double price, String color, float weight) {
        this(price, color);
        this.weight = weight;
		System.out.println("Invoking double,string,float constructor");		
        System.out.println("Price, color, and weight of wood: " + price + ", " + color + ", " + weight);
    }

    Wood(double price, String color, float weight,String quality) {
        this(price, color,weight);
        this.quality = quality;
		System.out.println("Invoking double,string,float,string constructor");
        System.out.println("Price, color,  weight and quality of wood: " + price + ", " + color + ", " + weight +","+quality);
    }
	
	  Wood(double price, String color, float weight,String quality,int length) {
        this(price, color,weight,quality);
        this.length=length;
		System.out.println("Invoking double,string,float,string constructor");
        System.out.println("Price, color,  weight ,quality and length of wood: " + price + ", " + color + ", " + weight +","+quality+","+length);
    }
}
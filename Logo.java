class Logo {
 String color;
 int width;
 int height;
 boolean hasText;
 String text;
 boolean isCircular;
 int fontSize;
 String fontType;
 String backgroundColor;

   
    Logo() {
        System.out.println("Invoking no-args constructor");
        System.out.println("Inside constructor: " + this.color);
        System.out.println("Inside constructor: " + this.width);
        System.out.println("Inside constructor: " + this.height);
        System.out.println("Inside constructor: " + this.hasText);
        System.out.println("Inside constructor: " + this.text);
        System.out.println("Inside constructor: " + this.isCircular);
        System.out.println("Inside constructor: " + this.fontSize);
        System.out.println("Inside constructor: " + this.fontType);
        System.out.println("Inside constructor: " + this.backgroundColor);
    }

    Logo(String color) {
        System.out.println("Invoking String parameterized constructor");
        this.color = color;
    }
	Logo(String color, int width) {
        System.out.println("Invoking String, int, int parameterized constructor");
        this.color = color;
        this.width = width;
	}

    Logo(String color, int width, int height) {
        System.out.println("Invoking String, int, int parameterized constructor");
        this.color = color;
        this.width = width;
        this.height = height;
    }

    Logo(String color, int width, int height, boolean hasText) {
        System.out.println("Invoking String, int, int, boolean parameterized constructor");
        this.color = color;
        this.width = width;
        this.height = height;
        this.hasText = hasText;
    }

    Logo(String color, int width, int height, boolean hasText, String text) {
        System.out.println("Invoking String, int, int, boolean, String parameterized constructor");
        this.color = color;
        this.width = width;
        this.height = height;
        this.hasText = hasText;
        this.text = text;
    }

    Logo(String color, int width, int height, boolean hasText, String text, boolean isCircular) {
        System.out.println("Invoking String, int, int, boolean, String, boolean parameterized constructor");
        this.color = color;
        this.width = width;
        this.height = height;
        this.hasText = hasText;
        this.text = text;
        this.isCircular = isCircular;
    }

    Logo(String color, int width, int height, boolean hasText, String text, boolean isCircular, int fontSize) {
        System.out.println("Invoking String, int, int, boolean, String, boolean, int parameterized constructor");
        this.color = color;
        this.width = width;
        this.height = height;
        this.hasText = hasText;
        this.text = text;
        this.isCircular = isCircular;
        this.fontSize = fontSize;
    }

    Logo(String color, int width, int height, boolean hasText, String text, boolean isCircular, int fontSize, String fontType) {
        System.out.println("Invoking String, int, int, boolean, String, boolean, int, String parameterized constructor");
        this.color = color;
        this.width = width;
        this.height = height;
        this.hasText = hasText;
        this.text = text;
        this.isCircular = isCircular;
        this.fontSize = fontSize;
        this.fontType = fontType;
    }

    Logo(String color, int width, int height, boolean hasText, String text, boolean isCircular, int fontSize, String fontType, String backgroundColor) {
        System.out.println("Invoking all properties of constructor");
        this.color = color;
        this.width = width;
        this.height = height;
        this.hasText = hasText;
        this.text = text;
        this.isCircular = isCircular;
        this.fontSize = fontSize;
        this.fontType = fontType;
        this.backgroundColor = backgroundColor;
    }
}



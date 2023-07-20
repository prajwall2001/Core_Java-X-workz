class Scanner {
    static void scan(String document, int rupees, boolean isColor) {
        System.out.println("Scanning document: " + document);
        System.out.println("Rupees : " + rupees);
        System.out.println("Color mode Black and White is " +isColor);
		if(document!=null)
		{
			System.out.println("Enter document "+document);
			return;
		}
		else{
			System.out.println("Invalid document "+document);
		}
	if (rupees > 0) {
            System.out.println("Rupees: " + rupees);
			return;
        } else {
            System.out.println("Invalid rupees value.");
        }

        if (isColor) {
            System.out.println("Color mode: Color");
        } else {
            System.out.println("Color mode: Black and White");
        }
    }
}

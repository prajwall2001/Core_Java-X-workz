class ScannerIs {
    public static void main(String[] args) {
	System.out.println("Invoking main in Scanner");
        String document = "Aadhar";
        int rupees = 300;
        boolean isColor = true;

        Scanner.scan(document,rupees, isColor);
    }
}

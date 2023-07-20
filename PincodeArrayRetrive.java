class PincodeArrayRetrive {
    public static void main(String[] args) {
        System.out.println("Pin codes are below.....");
        int pincode1 = 123456;
        int pincode2 = 654321;
        int Pincode3 = 987654;
        int pincode4 = 456789;
        int pincode5 = 321654;
        int pincode6 = 654987;
        int pincode7 = 789123;
        int pincode8 = 456123;

        int[] pinCodes = { pincode1, pincode2, pincode3, pincode4, pincode5, pincode6, pincode7, pincode8 };
        int ref = pinCodes[2];
        System.out.println("Pin code 3: " + ref);

        int ref1 = pinCodes[5];
        System.out.println("Pin code 6: " + ref1);
    }
}

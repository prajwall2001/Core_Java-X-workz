public class MobileNumArray {
    public static void main(String[] args) {
        System.out.println("Mobile numbers are below.....");
        long mobileNumber1 = 9234567890L;
        long mobileNumber2 = 9876543210L;
        long mobileNumber3 = 9567891230L;
        long mobileNumber4 = 7891234560L;
        long mobileNumber5 = 8216549870L;
        long mobileNumber6 = 9549873210L;
        long mobileNumber7 = 7561237890L;
        long mobileNumber8 = 8543219870L;

        long[] mobileNumbers = { mobileNumber1, mobileNumber2, mobileNumber3, mobileNumber4, mobileNumber5, mobileNumber6, mobileNumber7, mobileNumber8 };
        
        long refMobileNumber1 = mobileNumbers[2];
        System.out.println("Mobile number 3: " + refMobileNumber1);

        long refMobileNumber2 = mobileNumbers[5];
        System.out.println("Mobile number 6: " + refMobileNumber2);
    }
}


public class CityRetrieveArray {
    public static void main(String[] args) {
        System.out.println("Famous Cities in Karnataka are.....:");
        String Bengaluru = "Bengaluru";
        String Mysuru = "Mysuru";
        String Hubballi = "Hubballi";
        String Mangaluru= "Mangaluru";
        String Belagavi = "Belagavi";
        String Gulbarga= "Gulbarga";
        String Davanagere = "Davanagere";
        String Ballari = "Ballari";

        String[] Cities = {Bengaluru,Mysuru,Hubballi,Mangaluru,Belagavi,Gulbarga,Davanagere,Ballari};

        String ReferenceCity = Cities[3];
        System.out.println("Famous for Beaches,temple is: " + ReferenceCity);

        String ReferenceCity1 = Cities[1];
        System.out.println("Famous for palaces is : " + ReferenceCity1);
    }
}

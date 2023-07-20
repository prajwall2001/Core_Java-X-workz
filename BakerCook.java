class BakerCook{
    public static void main(String[] args) {
		System.out.println("Invoking main in BakerCook");
        String foodItem = "Cake";
        int noOfPeople = 10;
        String workingFor = "A2B Bakery";
        int experience = 5;
        int duration = 60;
        String assistance = "Arun";

        Baker.cooking(foodItem, noOfPeople, workingFor, experience, duration, assistance);
    }
}
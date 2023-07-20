class Teacher {
    String name;
    int age;
    String subject;
    int yearsOfExperience;
    float salary;

    public static void main(String[] args) {
        System.out.println("Invoking main in Teacher");

        Teacher teacher1 = new Teacher();
        System.out.println("teacher1 default value is " + teacher1.name);
        System.out.println("teacher1 default value is " + teacher1.age);
        System.out.println("teacher1 default value is " + teacher1.subject);
        System.out.println("teacher1 default value is " + teacher1.yearsOfExperience);
        System.out.println("teacher1 default value is " + teacher1.salary);

        System.out.println();

        Teacher teacher2 = new Teacher();
        System.out.println("teacher2 default value is " + teacher2.name);
        System.out.println("teacher2 default value is " + teacher2.age);
        System.out.println("teacher2 default value is " + teacher2.subject);
        System.out.println("teacher2 default value is " + teacher2.yearsOfExperience);
        System.out.println("teacher2 default value is " + teacher2.salary);

        teacher1.name = "Rohit";
        teacher1.age = 35;
        teacher1.subject = "Math";
        teacher1.yearsOfExperience = 10;
        teacher1.salary = 5000.00f;

        teacher2.name = "Rohan";
        teacher2.age = 40;
        teacher2.subject = "English";
        teacher2.yearsOfExperience = 15;
        teacher2.salary = 6000.00f;

        System.out.println();

        System.out.println("teacher1 values: ");
        System.out.println("Name: " + teacher1.name);
        System.out.println("Age: " + teacher1.age);
        System.out.println("Subject: " + teacher1.subject);
        System.out.println("Years of Experience: " + teacher1.yearsOfExperience);
        System.out.println("Salary: " + teacher1.salary);

        System.out.println();

        System.out.println("teacher2 values: ");
        System.out.println("Name: " + teacher2.name);
        System.out.println("Age: " + teacher2.age);
        System.out.println("Subject: " + teacher2.subject);
        System.out.println("Years of Experience: " + teacher2.yearsOfExperience);
        System.out.println("Salary: " + teacher2.salary);
    }
}

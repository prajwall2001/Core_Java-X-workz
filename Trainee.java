class Trainee{
static void getTrain() {
        String name = "Prajwal";
		System.out.print("My name is:"+name);
    }
	static void getAge(){
	int age=22;
	System.out.println("Age is :"+age);
}
static void trainee(String department) {
	System.out.println("I am from " +department+ "department");
}
static void trainee(String topic,int minute) {
        System.out.println("Taking notes on the topic: " + topic);
		System.out.println("Taking minutes for topic: " + minute);
    }
	
static void requestHelp() {
        System.out.println("I need some help.");
}
static void attendWorkshop(String workshopName,String skills) {
        System.out.println("I'm attending the workshop: " + workshopName);
		 System.out.println("I'm attending the workshop: " + workshopName);
    }
	static void practiceSkills() {
        System.out.println("I'm practicing my skills.");
    }
	static void completeTask(String taskName,int takeBreak) {
        System.out.println("I have completed the task: " + taskName);
		System.out.println("Take a break for" +takeBreak+ "minutes");
    }
	static void askQuestion(String question) {
        System.out.println("I have a question: " + question);
    }
	static void study() {
        System.out.println("I'm studying for my training program.");
    }
}

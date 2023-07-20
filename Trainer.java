class Trainer{
    static void introduce() {
        System.out.println("Hello, I am a trainer.");
    } 
	static void train(){
	System.out.println("Training java ");
	}
	
    static void train(String topic) {
        System.out.println("Conducting training on " + topic);
    }
    
   
    static void train(String skill) {
        System.out.println("Demonstrating " + skill + " skill.");
    }
    
 
    static void train(String name,String qualification,int salary) {
		System.out.println("Trainer name "+name);
		System.out.println("Trainer qualification "+qualification);
		System.out.println("Trainer salary "+salary);
	
    }
    
    static void trainerWorkshop(String workshopName, String location) {
        System.out.println("Organizing workshop: " + workshopName + " at " + location);
    }
    
    static void provideFeedback(String participantName, String feedback) {
        System.out.println("Providing feedback to " + participantName + ": " + feedback);
    }
    
    static void createTrainingPlan(String topics) {
        System.out.println("Creating training plan for the following topics:");
	}
    

    static void isCertified() {
		System.out.println("Yes");
        
    }
    
  
    static void takeBreak(int minutes) {
        System.out.println("Taking a " + minutes + " minute break.");
    }
	  static void provideMaterials() {
        System.out.println("Providing training materials.");
    }
}



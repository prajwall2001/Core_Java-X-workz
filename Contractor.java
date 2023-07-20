class Contractor {
 
    static void introduce() {
        System.out.println("Hello, I am a contractor.");
    }
	
	static void experience() {
	int experience=3;
        System.out.println("I have " +experience+ " year experience");
    }
    
  
    static void contractor(String projectName, float estimatedCost) 
	{
        System.out.println("Submitting  project: " + projectName );
		 System.out.println("estimated cost: Rs" + estimatedCost);
    }
	
      static void contractor(String projectLeader) {
        System.out.println("Initiating project: " + projectLeader);
    }
    
  
    static void contractTerms() {
        System.out.println("Negotiating contract terms with the client.");
    }
   
    static void calculateProfit(float totalRevenue, float totalCost) {
       System.out.println("Total revenue is "+totalRevenue);
	   System.out.println("Total cost is "+totalCost);
    } 

    static void manageResources() {
        System.out.println("Managing project resources.");
    }
    

    static void resolveIssues(String projectName, String issue) {
        System.out.println("Resolving issue: " + issue + " in project: " + projectName);
    }
    
 
    static void provideStatusReport(String projectName) {
        System.out.println("Providing status report for project: " + projectName);
    }
    
  
    static void completeProject(String projectName) {
        System.out.println("Completing project: " + projectName);
    }
}

class {
public static void main(String[] args){
System.out.println("Invoking main in jobGetter");
Job.apply();
Job.apply("prajwal",3);
Job.apply("Infosys",3,"Arun");
Job.apply(5);
Job.rejectOffer();
}
}
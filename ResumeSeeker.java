class ResumeSeeker{
public static void main(String[] args){
System.out.println("Invoking main in resume seeker");
Resume.format();
Resume.format("CV");
Resume.format("CV",2);
Resume.clear();
Resume.delete();
}
}
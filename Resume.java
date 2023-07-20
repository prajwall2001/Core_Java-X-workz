class Resume{
static void format()
{
	System.out.println("Invoking main in resume");
	String usn="4su19is016";
	System.out.println("Person Usn:" +usn);	
}
static void format(String resumeType)
{
System.out.println("Type of Resume:"+resumeType);
}
static void format(String resumeType,int pages)
{
System.out.println("Type of Resume:"+resumeType );
System.out.println("Number of pages:"+pages);
}
static void clear()
{
System.out.println("Clear format");
}
static void delete()
{
	System.out.println("Delete format");
}
}
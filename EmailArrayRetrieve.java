class EmailArrayRetrieve{
public static void main(String[] args)
{
System.out.println("Emails are below.....");

	String Prajwal="prajwall.xworkz@gmail.com";
	String Xworkz="hr@Xworkz.in";
	String Tcs="hr@tcs.in";
	String Accenture="hr@accenture.in";
	String LG="hr@lgglobal.in";
	String Infosys="hr@infosys.in";
	String Apple="hr@appleindia.in";
	String Winman="hr@winmans.in";
	String[] Emails={"prajwall.xworkz@gmail.com","hr@Xworkz.in","hr@tcs.in","hr@accenture.in","hr@lgglobal.in","hr@infosys.in","hr@appleindia.in","hr@winmans.in"};
	
	String RefEmail=Emails[5];
	System.out.println("Infosys Email is here:"+RefEmail);
	String Ref1Email=Emails[0];
	System.out.println("Prajwal's Email is here:"+Ref1Email);
	
}
}
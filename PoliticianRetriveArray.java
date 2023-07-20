class PoliticianRetriveArray{
public static void main(String[] args)
{
System.out.println("Politicians are below.....");

	String PrimeMinister="Narendra Modi";
	String President="Droupadi Murmu";
	String Railway_Minister="Piyush Goyal";
	String Fin_minister="Nirmala Sitaraman";
	String Women_Child_Minister="Smriti Irani";
	String Road_Transport_Minister="Nitin Gadkari";
	String Mp_Loksabha="Amit shah";
	String DefenceMinister="Rajnath Singh";
	
	String[] Politicians={PrimeMinister,President,Railway_Minister,Fin_minister,Women_Child_Minister,Road_Transport_Minister,Mp_Loksabha,DefenceMinister};
	
	String Ref=Politicians[3];
	System.out.println("Prime minister of India:"+Ref);
	String Ref1=Politicians[7];
	System.out.println("Defence Minister of India:"+Ref1);
	
}
}
class EngineCar
{
static String getCCModel(String car)
 {
  System.out.println("Invoking getCCModel from Engine");
  
  if(car!=null)
  {
   System.out.println("valid" );
   
   if("Swift" == car)
   {
    return "1200cc";
   }
   if("Rapid" == car)
   {
    return "1800cc";
   }
   if("BMW" == car)
   {
    return "1500cc";
   }
   if("Benz" == car)
   {
    return "1950cc";
   }
   if("Audi" == car)
   {
    return "1730cc";
   }
   if("Bently" == car)
   {
    return "1505cc";
   }
  }
  else
  {
    System.err.println("invalid CCmodel");
  }
  return "car";
  }
  
	
}
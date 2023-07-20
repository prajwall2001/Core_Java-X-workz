class EngineRunner{
public static void main(String[] args)
  {
   System.out.println("running in EngineRunner");
   
   String ref=EngineCar.getCCModel("Swift");
   System.out.println("Ref is :"+ ref);
   
   String ref1=EngineCar.getCCModel("Audi");
   System.out.println("Ref is :"+ ref1);
   
   String ref2=EngineCar.getCCModel("Benz");
   System.out.println("Ref is :"+ ref2);
   
   String ref3=EngineCar.getCCModel("Bently");
   System.out.println("Ref is :"+ ref3);
   
   String ref4=EngineCar.getCCModel("BMW");
   System.out.println("Ref is :"+ ref4);
   
   String ref5=EngineCar.getCCModel("Rapid");
   System.out.println("Ref is :"+ ref5);
   
   EngineCar.getCCModel("car");
  }
}
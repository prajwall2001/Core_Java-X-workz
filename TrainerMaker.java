class TrainerMaker{
   public static void main(String [] args )
 {
  System.out.println("Invoking methods in TrainerMaker");
  Trainer.introduce();
  Trainer.train();
  Trainer.train("Array");
  Trainer.train("java");
  Trainer.train("Ganesh","B.E",15000);
  Trainer.trainerWorkshop("2D arrays","Banglore");
  Trainer.provideFeedback("Prajwal","Good");
  Trainer.createTrainingPlan("Array,Methods,OOPs");
  Trainer.isCertified();
  Trainer.takeBreak(45);
  Trainer.provideMaterials();
 }
}
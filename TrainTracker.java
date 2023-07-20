class TrainTracker {
    public static void main(String[] args) {
        int trainNumber = 11013;
        String trainName = TrainName.getTrainName(trainNumber);
        System.out.println("Train Name: " + trainName);
		
		int trainNumber = 11014;
        String trainName = TrainName.getTrainName(trainNumber);
        System.out.println("Train Name: " + trainName);
		
		int trainNumber = 12134;
        String trainName = TrainName.getTrainName(trainNumber);
        System.out.println("Train Name: " + trainName);
		
		int trainNumber = 22691;
        String trainName = TrainName.getTrainName(trainNumber);
        System.out.println("Train Name: " + trainName);
    }
}

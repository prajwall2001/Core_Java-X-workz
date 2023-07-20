class TrainName {
    static String getTrainName(int trainNumber) {
        System.out.println("Invoking getTrainName in Train");
        if (trainNumber!=null) 
		{
            System.out.println("getTrainNumber is valid");
			}
            else if (trainNumber == 11013)
			{
                return "Coimbatore Express Train";
            }
            else if (trainNumber == 11014)
			{
                return "Mumbai Train";
            }
			else if (trainNumber == 12134)
			{
                return "Mumbai CSMT SF Train";
            }
			else if (trainNumber == 22691)
			{
                return "Rajdani Express Train";
            }
           
        } else
			{
            System.err.println("getTrainNumber is invalid");
        }
        return "Unknown Train";
    }
}

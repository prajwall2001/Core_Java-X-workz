class PersonAge{
	static int getAgeByName(String personAge){
		System.out.println("invoking PersonAgeByName in PersonAge");
		if(personAge!=null){
			
			if("Prajwal"==personAge){
			return 22;
		    }
		    if("Arun"==personAge){
			return 21;
		    }
		    if("Rohan"==personAge){
			return 22;
		    }
		    if("Advi"==personAge){
			return 15;
		    }
		    if("Anith"==personAge){
			return 24;
		    }
		    if("Anup"==personAge){
			return 25;
		    }
			if("Rohit"==personAge){
			return 26;
		    }
			if("Amar"==personAge){
			return 20;
		    }
			if("Amit"==personAge){
			return 21;
		    }
			if("Anu"==personAge){
			return 23;
		    }
		}
		else
		{
			System.err.println(" personAge is in valid");
		    }
			
		
		return 00;
		
	}
	
}
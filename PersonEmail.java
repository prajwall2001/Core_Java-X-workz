class PersonEmail{
	static String getEmailByName(String personName){
		System.out.println("invoking getEmailByName in PersonEmail");
		if(personName!=null){
			System.out.println("getAgeByName is valid");
			if("Prajwal"==personName){
			return "prajwal@gmail.com";
		    }
		    if("Arun"==personName){
			return "arun@gmail.com";
		    }
		    if("Rohan"==personName){
			return "rohan@gmail.com";
		    }
		    if("Advi"==personName){
			return "advi7@gmail.cdviom";
		    }
		    if("Anith"==personName){
			return "anith@gmail.com";
		    }
		    if("Anup"==personName){
			return "anup@gmail.com";
		    }
			if("Rohit"==personName){
			return "rohit@gmail.com";
		    }
			if("Amar"==personName){
			return "amar@gmail.com";
		    }
			if("Amit"==personName){
			return "amit@gmail.com";
		    }
			if("Anu"==personName){
			return "anu@gmail.com";
		    }
			
		else{
			System.err.println("getEmailByName is in valid");
		    }
			
		}
		return "none@gmail.com";
		
	}
	
}
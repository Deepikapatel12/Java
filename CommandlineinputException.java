class CommandlineinputException{
	public static void main(String args[]){

	int num=0;
	try{
	num=Integer.parseInt(args[0]);
	}
	catch(ArrayIndexOutOfBoundsException ae){
	System.out.println("Please enter At least one Argument");
	}
	catch(NumberFormatException ne){
	System.out.println("Please Enter Numeric Value only");
	}
	
	System.out.println("Result : "+Math.pow(num,2));
	//System.out.println("Result : "+(int)(Math.pow(num,2)));//to convert integer value
	}	
	}


class Exception{

		//also compile javac AgeException.java
	public static void main(String args[]){
	int a=-1;
	
	try{
		a=Integer.parseInt(args[0]);
			if(a<0 || a>100){
			AgeException ae=new AgeException("INvalid Age");
	
				throw ae;
				}
			System.out.println("Valid Age");
			}
			catch(AgeException x){
				System.out.println(x.getMsg());
				}
			}
				}
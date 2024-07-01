class Secondlargestnum{
	public static void main(String args[]){
	int arr[]={100,20,40,30,500};
	int max=arr[0];
	for(int i=0;i<arr.length;i++){
	if(arr[i]>max){
	max=arr[i];
	}
	}
	System.out.println("First max Element : "+max);
	int max1=arr[0];
	for(int i=0;i<arr.length;i++){
	if(arr[i]>max1 && arr[i]<max){
	max1=arr[i];
	}
	}
	System.out.println("second largesst element :"+max1);
	}
}
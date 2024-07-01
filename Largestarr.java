class Largestarr{
	public static void main(String args[]){
	int arr[]={100,20,200,30,500};

	int max=arr[0];
	for(int i=0;i<arr.length;i++){
	if(arr[i]>max){
	max=arr[i];

	}
	}
	System.out.println("Largest Elements of Array : "+max);
	}
	}
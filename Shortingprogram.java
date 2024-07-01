 class Shortingprogram{
	public static void main(String args[]){
	//acending order array shorting
	//bubble shorting
	int arr[]={30,10,20,40,60,80,70};
	System.out.println("BEfore Sorting :");
	for(int i=0;i<arr.length;i++){
	System.out.print("\t"+arr[i]);
	}
	//sorting
	for(int i=0;i<arr.length;i++){
	for(int j=1;j<arr.length;j++){
	if(arr[i]>arr[j]){
int temp;
	temp=arr[i];
	arr[i]=arr[j];
	arr[j]=temp;
	}
	}
	}

	System.out.println("\tAfter Sorting :");
	for(int i=0;i<arr.length;i++){
	System.out.print("\t"+arr[i]);
	}
}
}
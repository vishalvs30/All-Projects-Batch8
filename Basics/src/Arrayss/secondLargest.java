package Arrayss;

public class secondLargest {
public static void main(String[] args) {
	int[] arr= {67,87,25,59,43,37,78,86,99,77};
	int large=arr[0];
	int slarge=-1;
	for(int i=1;i<arr.length;i++) {
		if(arr[i]<large) {
			slarge=large;
			large=arr[i];
		}
		else if(arr[i]<large&&arr[i]<slarge) {
			slarge=arr[i];
		}
	}
	System.out.println(slarge);
	
}
}

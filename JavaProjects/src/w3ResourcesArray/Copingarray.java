package w3ResourcesArray;

import java.util.Arrays;

public class Copingarray {
	
	public static void main(String args[]){
		int arr[]={2,3,4,5,67,90};
		int len=arr.length;
		System.out.println(Arrays.toString(arr));
		int arr1[]=new int[len];
		
		for(int i=0; i<len; i++){
			arr1[i]=arr[i];
		}
		
		System.out.println(Arrays.toString(arr1));
	}

}

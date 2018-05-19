package w3ResourcesArray;

import java.util.Arrays;

public class MaxMinValue {
	
	public static void main(String args[]){
		int arr[]={12,43,22,33,54,21};
		int len=arr.length;
		int temp;
		for(int i=0; i<len; i++){
			 for(int j=0; j<len-1; j++){
				
				 if(arr[j]>arr[j+1]){
				 temp=arr[j];
				 arr[j]=arr[j+1];
				 arr[j+1]=temp;
				 }
						 
			 }
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println("Max element is: "+arr[len-1]);
		System.out.println("Min element is: "+arr[0]);
	}

}

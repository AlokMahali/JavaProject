package w3ResourcesArray;

import java.util.Arrays;

public class IntSortingTriangleForm {
	
	public static void main(String args[]){
		
		int arr[]={2,6,15,4,5,1,25,10,1};
		int len=arr.length;
		
		for(int i=0; i<len; i++){
			
			System.out.print(arr[i]+" ");
		}
		/*for(int k=0; k<len; k++){
			for(int l=0; l<k; l++){
				System.out.print(arr[l]+" ");
			}
			System.out.println();
		}*/
		for (int p=0; p<len;p++){
			for(int q=0; q<len-1; q++){
				
				if(arr[q]>arr[q+1]){
					int temp=arr[q];
					arr[q]=arr[q+1];
					arr[q+1]=temp;
					}
				}
		}
		for(int k=0; k<len; k++){
			for(int l=0; l<k; l++){
				System.out.print(arr[l]+" ");
			}
			System.out.println();
		}
		
		
	}

}

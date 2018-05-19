package w3ResourcesArray;

import java.util.Arrays;

public class RemEleArray {
	
	public static void main(String args[]){
		
		int arr[]={2,4,5,6,22,44,55};
		System.out.print("Before remove: "+arr.length);
		int idx = 1;
		
		System.out.print(Arrays.toString(arr));
		for(int i=idx; i<arr.length-1;i++){
			arr[i]=arr[i+1];
		}
		System.out.println("after remove: "+arr.length);
		System.out.println(Arrays.toString(arr));
	}

}

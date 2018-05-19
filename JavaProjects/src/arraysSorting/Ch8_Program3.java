package arraysSorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ch8_Program3 {
	
	public static void main(String args[]) throws NumberFormatException, IOException{
		BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter size of the array : ");
		int n = Integer.parseInt(Br.readLine());
		
		int arr[] = new int [n];
		System.out.println("Enter the values into the array");
		
		for (int k=0; k< arr.length; k++){
			
			arr[k]=Integer.parseInt(Br.readLine());
		}
		int limit=n-1;
		int temp;
		boolean flag = false;
		for (int i=0; i<limit; i++){
			
			
			for (int j=0; j<limit-1; j++){
				
				if(arr[j] > arr[j+1]){
					
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					flag = true;
				}
							
			}
			if (flag==false)	break;
			else flag =true;
			
			
		}
		
		System.out.println("=====Sorted array======");
		for(int i=0; i<n; i++){
			System.out.println(arr[i]);
		}
	}

}

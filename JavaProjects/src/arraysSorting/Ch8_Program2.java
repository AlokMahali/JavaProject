package arraysSorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ch8_Program2 {
	
	public static void main(String args[]) throws NumberFormatException, IOException{
				
		int Total = 0;
		BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter No of Subjects");
		int n=Integer.parseInt(Br.readLine());
		int Marks[] = new int[n];
		
		System.out.println("Enter the different Subject Marks");
		for(int k=0; k<n ; k++) {
			Marks[k] = Integer.parseInt(Br.readLine());
			
		}
		
		
		for (int k=0; k<n ; k++){
			Total +=Marks[k];
		}
		System.out.println("Total marks of the subjects are : " + Total);
		
		
		float avg = Total/n;
		
		System.out.println("Average Marks is : " +avg);
		
	}

}

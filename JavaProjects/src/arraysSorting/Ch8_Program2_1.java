package arraysSorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class MarksDetails{
	
	int Total = 0;
	//int Marks[]= new int [3];
	
	int Size;
	public int Sum(int Marks1[]){
		
		for (int k=0; k<Marks1.length; k++){
		Total += Marks1[k];}
		
		Size=Marks1.length;
		System.out.println("Sum total of the marks is : "+Total);
		return Total;
	}
	
	public void avg(int Total){
		
		float average = Total/Size;
		
		System.out.println("Average of Marks is: " + average);
		
		
	}
}

public class Ch8_Program2_1 {
	
	public static void main(String args[]) throws NumberFormatException, IOException{
		
		
		BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter No of Subjects");
		int n=Integer.parseInt(Br.readLine());
		int Marks[] = new int[n];
		
		System.out.println("=====Enter the different Subject Marks======");
		for(int k=0; k<n ; k++) {
			System.out.println("Mark of Subject-" +(k+1));
			Marks[k] = Integer.parseInt(Br.readLine());
			
		}
		
		MarksDetails MD = new MarksDetails();
		int SumTotal =  MD.Sum(Marks);
		MD.avg(SumTotal);
		
	}

}

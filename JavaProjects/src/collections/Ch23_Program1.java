package collections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Resource{
	int id;
	String name;
	
	Resource(int i, String n){
		id=i;
		name=n;
	}
	
	void display(){
		System.out.println(id + "\t" + name);
	}
	
}
public class Ch23_Program1 {
	
	public static void main(String args[]) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Resource Emp[]= new Resource[2];
		for (int i=0;i<Emp.length; i++){
			System.out.println("Enter Id: ");
			int id=Integer.parseInt(br.readLine());
			System.out.println("Enter name: ");
			String name=br.readLine();
			Emp[i]= new Resource(id,name);
		}
		System.out.println("THe Employee information is: ");
		
		for (int i=0; i<Emp.length; i++){
			Emp[i].display();
		}
	}

}

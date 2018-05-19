package arraysExample;

class Students{
	
	int Roll_no;
	String Name;
	
	Students(int i, String N){
		Roll_no=i;
		Name=N;
	}
}

public class ArrayOfObjects {
	
	public static void main(String args[]){
		Students[] arr=new Students[5];
		
		arr[0]=new Students(1,"A");
		arr[1]=new Students(2,"B");
		arr[2]=new Students(3,"C");
		arr[3]=new Students(4,"D");
		arr[4]=new Students(5,"E");
		
		for (int i=0; i<5; i++){
			System.out.println("Element at "+ i+":  "+ arr[i].Roll_no+"   "+arr[i].Name);
		}
	}

}

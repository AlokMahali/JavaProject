package arraysExample;

public class CloneTest {
	
	public static void main(String args[]){
		int arr[]={2,4,5,6,7,8};
		int arr1[]=arr.clone();
		
		for(int i=0;i<arr1.length; i++){
			System.out.println("Elements are: "+ arr1[i]);
		}
	}

}

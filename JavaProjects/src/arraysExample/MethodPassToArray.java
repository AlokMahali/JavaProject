package arraysExample;

public class MethodPassToArray {
	
	public static void main(String args[]){
		
		int arr[]= {1,3,5,6};
		sum(arr);
				
	}
	
	public static void sum (int[]  arr1){
			 int tot=0;
			 for(int i=0; i <arr1.length; i++){
				 tot +=arr1[i];
			 }
			 System.out.println("Sum of Numbers " +tot);
			
		}
	}

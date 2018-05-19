package arraysSorting;

public class MaximumNumInArray {
	
	
	
	public void findMaxvalue(int value[]){
		int Max1=0;
		int Max2=0;
		int Max3=0;
		
		for(int in :value){
			
			if(Max1<in ){
				Max2 = Max1;
				Max1=in;
			}
			else if(Max2<in){
				//Max2 = Max1;
				Max2=in;
			}
			
			
				
		}
		System.out.println("Maximum vlaue is : " + Max1);
		System.out.println("2nd Max vlaue is : " + Max2);
		
	}
	
	public static void main(String args[]){
		
		MaximumNumInArray MaxMin=new MaximumNumInArray();
		int arr[] = {12,34,32,25,45,23,55,52};
		MaxMin.findMaxvalue(arr);
	}

}

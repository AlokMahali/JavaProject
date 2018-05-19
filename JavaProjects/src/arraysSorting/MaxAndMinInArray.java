package arraysSorting;

public class MaxAndMinInArray {
	
	public void MaxMin(int arr[]){
		int Max=0;
		int Min=0;
		
		for (int i=0;i<arr.length-1;i++){
			if (arr[i]<arr[i+1]){
				Min=arr[i];
			}
			else
				Min=arr[i+1];
		}
		for (int in:arr){
						
			if (Max<in){
				Max=in;
			}
			
			
		}
		System.out.println("Min value is: "+Min);
		System.out.println("Max value is: "+Max);
	}
	
	public static void main(String args[]){
		MaxAndMinInArray MAM = new MaxAndMinInArray();
		int MaxMinarr[]={23,54,32,9,54,21,2};
		
		MAM.MaxMin(MaxMinarr);
	}

}

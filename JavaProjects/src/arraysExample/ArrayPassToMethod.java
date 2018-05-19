package arraysExample;

class Sample{
	
	void Sum(int arr[]){
		int tot=0;
		for(int i=0; i<arr.length; i++){
			
			tot+=arr[i];
		}
		
		System.out.println("Sum of Nums is : "+ tot);
	}
}
public class ArrayPassToMethod {
	
	public static void main(String args[]){
		int value[]={2,4,3,5,2};
		
		Sample Sp= new Sample();
		Sp.Sum(value);
		
	}

}

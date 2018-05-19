package w3ResourcesArray;

public class ContainsSpecElement {
	
	public static void main(String args[]){
		
		boolean res=false;
		int arr[]={23,1,4,5,33};
		int temp=3;
		for(int n:arr){
			if(temp==n){
				res=true;
			}
			
		}
		if(res){
			System.out.println("Found the element in array");
		}
		else{
			System.out.println("Not Found the element in array");
		}
	}

}

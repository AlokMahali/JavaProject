package arraysSorting;

public class CommonElementsInArr {
	
	public static void main(String args[]){
		int arr1[]= {2,32,45,54,65,55,43};
		int arr2[]= {3,43,54,55,73,43,1};
		
		for(int i=0;i<arr1.length; i++){
			
			for(int j=0;j<arr2.length;j++){
				
				if(arr1[i]==arr2[j]){
					System.out.println("Common elements:" + arr1[i] );
				}
			}
		}
	}

}

package w3ResourcesArray;

public class IntSorting {
	
	public static void main(String args[]){
		
		int arr[]= {5,6,4,15,12,10};
		int len = arr.length;
		System.out.println("Length of Array " +len);
		/*for (int i=0; i<len-1; i++){
			for(int j=0; j<len-1; j++){
				
				if(arr[j]>arr[j+1]){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
		System.out.println("+++++Sorted array is+++");
		for(int i=0;i<len; i++){
			System.out.print(arr[i]+" ");}*/
			
			for (int k=0; k<len; k++){
				for(int l=0; l<k; l++){
					
					if(arr[l]>arr[l+1]){
						int temp=arr[l];
						arr[l]=arr[l+1];
						arr[l+1]=temp;
					}
					
					System.out.print(arr[l]+" ");
				}
				System.out.println("");
			}
			
			System.out.println("\n+++++Sorted array is+++");
			System.out.println("");
			for(int k=0; k<len; k++){
				
				//System.out.print(arr[k]+" ");
				
			}
		}
		
	}



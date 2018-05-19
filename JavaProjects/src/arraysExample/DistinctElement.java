package arraysExample;

class CheckDistinct{
	
	public void getDistinct(int arr[]){
		//System.out.println(arr.length);
		int n=arr.length;
		for(int i=0; i<=n-1; i++)
		{
			boolean status=false;
			
			for(int j=0; j<=n-1; j++)
			{
				if(arr[j]==arr[j+1]){
					status=true;
					break;
				}
			}
			
			if(!status){
				System.out.print(" " +arr[i]);
			}
			
			
		}
	}
}
public class DistinctElement {
	
	public static void main(String args[]){
		
		CheckDistinct CD= new CheckDistinct();
		int CDarr[] = {1,3,1,4};
		CD.getDistinct(CDarr);
		
	}

}

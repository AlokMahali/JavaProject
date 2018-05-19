package practice;

public class PerfectNumber {
	
	int Tot = 0;
	
	public void IsPerfectNo(int Number){
		int i;
		for (i=1;i<=Number/2;i++){
			
			if(Number%i==0){
				Tot=Tot+i;
			}
		}
		
		if (Tot==Number){
			System.out.println("Number is a Perfect_No");
		}
		else
		{
			System.out.println("Number is not a Perfect_No");
		}
	}	
		public static void main (String args[]){
			
			PerfectNumber PN = new PerfectNumber();
			PN.IsPerfectNo(8);
		
		
	}

}

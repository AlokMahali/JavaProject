package practice;

class ToPrime{
	
	public void TestPrime(int Num){
		boolean flag =false;;
		for(int i=2; i<=Num/2; i++){
			
			if(Num%i==0){
				flag=true;}
			else{
				flag=false;}
			}
		
		if (flag==true){
			System.out.println(Num + " - this is Not Prime");
		}
		else{
			System.out.println(Num +" - This is Prime");
		}
			
	}
}

public class IsPrimeNumber {
	
	public static void main(String args[]){
		ToPrime TP = new ToPrime();
		TP.TestPrime(25);
		TP.TestPrime(12);
		TP.TestPrime(5);
	}

}

package practice;

public class NumberSum {
	int tot= 0;
	public void Sum(int Num){
		
		while(Num>0){
			tot+= Num%10;
			
			Num=Num/10;
		}
		
		System.out.println("Number Sum is : " +tot);
	}
	
	public static void main(String args[]){
		
		NumberSum NS = new NumberSum();
		NS.Sum(1598);
	}

}

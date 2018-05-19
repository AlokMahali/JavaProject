package practice;

public class NumberReverse {
	
	int reverse =0;
	
	public int reverseNumber(int Num){
		
		while(Num!=0){
			reverse =(reverse*10) + Num%10;
			Num=Num/10;
				}
		return reverse;
		
	}
	
	public static void main(String args[]){
		NumberReverse NR = new NumberReverse();
		System.out.println("Reverse number is: " +NR.reverseNumber(321354));
	}
	

}

package practice;

class Sample1{
	
	int temp;
	double Dec=0;
	
	public void getDecimal(int Num){
		int x=Num;
		int len = Integer.toString(Num).length();
		int Count=0;
		for(int i=len;i>0;i--)
			{
				temp=Num%10;
				Num=Num/10;
				Dec=Dec+temp* Math.pow(2, Count);
				Count++;
			}
		System.out.println("Decimal value of binary "+ x +" is = " +Dec);
	}
	
}

public class BinaryToDecimal {
	
	public static void main(String args[]){
		
		Sample1 Samp = new Sample1();
		Samp.getDecimal(110110);
		
	}

}

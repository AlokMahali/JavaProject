package practice;

class Sample{
	int x;
	public void CheckArmstrong(int Num){
		x=Num;
		int tot=0;
		int temp;
		while (Num>0){
			temp = Num%10;
			tot+=Math.pow(temp, 3);
			Num=Num/10;
		}
		
		if(tot==x){
			System.out.println("Total is : " + tot);
			System.out.println(x + " - is an armstrong number");}
		
		else
			{System.out.println("Total is : " + tot);
			System.out.println(x + " - is not an armstrong number");}
	}
}

public class ArmStrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sample Sam = new Sample();
		Sam.CheckArmstrong(371);
		Sam.CheckArmstrong(153);
		Sam.CheckArmstrong(254);

	}

}

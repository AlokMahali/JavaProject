package practice;

public class DecimalToBinary {
	
	int index = 0;
	int Binary[] = new int[25];

	public void PrintBinary(int Number){
		
		while(Number>0){
			
			Binary[index]=Number%2;
			Number= Number/2;
			index++;
		}
		
		for(int i=index-1; i>=0; i--){
			System.out.print(Binary[i]);
		}
	}
	public static void main(String args[]){
		DecimalToBinary DB = new DecimalToBinary();
		DB.PrintBinary(25);
	}
}

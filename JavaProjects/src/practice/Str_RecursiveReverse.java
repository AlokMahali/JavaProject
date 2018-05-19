package practice;

public class Str_RecursiveReverse {
	
	String reverse = "";
	
	public String reverseString(String Str){
		if (Str.length()==1){
			reverse = Str;
		}
		
		else
		{
			reverse+=Str.charAt(Str.length()-1)+reverseString(Str.substring(0, Str.length()-1));
			
		}
		
		return reverse;
		
	}
	
	public static void main(String args[]){
		
		Str_RecursiveReverse rev = new Str_RecursiveReverse();
		
		System.out.println("Reverse of the string is :" + rev.reverseString("Hello"));
	}

}

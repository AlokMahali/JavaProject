package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharsInString {
	
	public void findDuplicateChars(String Str){
		
		Map<Character, Integer> dupMap=new HashMap<Character, Integer>();
		char chrs[] = Str.toCharArray();
		
		for(Character ch:chrs){
			if(dupMap.containsKey(ch)){
				dupMap.put(ch, dupMap.get(ch)+1);}
				
			else{
				dupMap.put(ch, 1); }
			}
		Set <Character> keys = dupMap.keySet();
		
		for(Character ch:keys){
			if(dupMap.get(ch)>1){
				System.out.println(ch+"----->"+dupMap.get(ch));
			}
		}
	}
	
	public static void main(String args[]){
		DuplicateCharsInString dup=new DuplicateCharsInString();
		dup.findDuplicateChars("HelloAAMrr kkkk");
	}

}

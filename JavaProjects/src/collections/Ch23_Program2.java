package collections;

import java.util.HashSet;
import java.util.Iterator;

public class Ch23_Program2 {
	
	

	public static void main(String args[]){
		
		HashSet<String> hs = new HashSet();
		hs.add("A");
		hs.add("B");
		hs.add("C");
		hs.add("D");
		
		System.out.println("Hash Set = "+ hs);
		System.out.println("Size of Hashset is : "+hs.size());
		
		/*if (hs.contains(A))
			System.out.println("A is present in the hash set");
		else
			System.out.println("A is not present in the hash set");*/
		
		Iterator it = hs.iterator();
		System.out.println("Elelments using Iterator :");
		
		while(it.hasNext()){
			//String s = (String)it.next();
			System.out.println(it.next());
				}
		if (hs.isEmpty())
			System.out.println("Hash set is empty");
		else
			System.out.println("Hash set is not empty");
		hs.clear();
		if (hs.isEmpty())
			System.out.println("Hash set is empty");
		else
			System.out.println("Hash set is not empty");
		//System.out.println("Hash Set = "+ hs);
			
	}

}

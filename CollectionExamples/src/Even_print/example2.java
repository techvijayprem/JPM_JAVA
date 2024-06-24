package Even_print;

import java.util.*;


public class example2 {

	public static void main(String [] args)
	{
		
	List <String> l1 = new Vector<String>(30); 
	//empty ,by default 10 
	
	
	l1.add("Pooja");
	l1.add("vijay");
	l1.add("leela");
	l1.add("12/12/2009");
	
	System.out.println(l1);
	
	Iterator ir = l1.iterator();
	
	while(ir.hasNext()) {	
		System.out.println(ir.hasNext());
	}	
 }
	
}

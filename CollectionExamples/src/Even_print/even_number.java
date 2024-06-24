package Even_print;

import java.util.*;

public class even_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	List l1 = new ArrayList<>(10);
	l1.add(11);
	l1.add(22);
	l1.add(32);
	l1.add(54);
	l1.add(51);
	l1.add(66);
	l1.add(47);
	l1.add(80);
	l1.add(90);
	l1.add(19);

	 
	int total = 0;

	@SuppressWarnings("rawtypes")
	Iterator re = l1.iterator();
	
	while(re.hasNext()) {
		int r =  Integer.parseInt(re.next().toString());
		
		if(r%2 == 0)
		{
			total ++;
		}
	}
	
	System.out.println("total even number => " + total);
	}

}

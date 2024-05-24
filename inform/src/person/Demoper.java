package person;

import country.country;
import state.stateinfo;

public class Demoper {

	public static void main(String [] args)
	{
		
		country c = new country("INDIA");
		stateinfo s = new stateinfo("GUJ");
		perinfo p = new perinfo("vijay",c,s,100000,45);
		
		System.out.println(p);
		
		TaxCalculation tc = new TaxCalculation();
		tc.calculateTax(p);
				
		country c1 = new country("INDIA");
		stateinfo s1 = new stateinfo("GUJ");
		perinfo p1 = new perinfo("vijay",c,s,100000,45);
		c1.setCname("India");
		
		s1.setSname("Gujarat");
		
		p1.setC1(c1);
		p1.setS1(s1);
		
		p1.setPname("Rahul");
		p1.setAge(19);
		p1.setIncome(200000);
		
		System.out.println(p1);
		
		tc.calculateTax(p1);
	}
}

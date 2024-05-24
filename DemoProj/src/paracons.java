 
public class paracons {

	String name;
	
	public paracons(String name) {
		 
		this.name = name;
		System.out.println("Hello This is Parameterise Constructor"+name);

	}
	
	void dis()
	{
		System.out.println("This is a Method of Class");
	}
	
	public static void main(String[] args)
	{
		paracons pcn = new paracons("vijay");	
		pcn.dis();
	}
}

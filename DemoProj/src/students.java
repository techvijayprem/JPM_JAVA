public class students {

	private String name ;

	public students () {
		
		this.name = "Unknown";
	}
	
	public students(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return "students [name=" + name + "]";
	}
	
	 public static void main(String [] args)
	 {
		 students sc = new students();
		 students s2 = new students("vijay");
		 
		 
		 System.out.println(sc);
		 System.out.println(s2);
	 }
	
}

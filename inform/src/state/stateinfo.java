package state;

public class stateinfo {

	private String sname;

	public stateinfo(String sname) {
		 
		this.sname = sname;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	@Override
	public String toString() {
		return "stateinfo [sname=" + sname + "]";
	}
}

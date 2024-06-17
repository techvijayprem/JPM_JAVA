package functionl_interface_ex;

 

class datastore {
	
	private String name,address,headOf_family;
	private int telephone,mobile,uId;
	
	public datastore(String name, String address, String headOf_family, int telephone, int mobile, int uId) {
		super();
		this.name = name;
		this.address = address;
		this.headOf_family = headOf_family;
		this.telephone = telephone;
		this.mobile = mobile;
		this.uId = uId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getHeadOf_family() {
		return headOf_family;
	}

	public void setHeadOf_family(String headOf_family) {
		this.headOf_family = headOf_family;
	}

	public int getTelephone() {
		return telephone;
	}

	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}

	public int getMobile() {
		return mobile;
	}

	public void setMobile(int mobile) {
		this.mobile = mobile;
	}

	public int getuId() {
		return uId;
	}

	public void setuId(int uId) {
		this.uId = uId;
	}

	@Override
	public String toString() {
		return "datastore [name=" + name + ", address=" + address + ", headOf_family=" + headOf_family + ", telephone="
				+ telephone + ", mobile=" + mobile + ", uId=" + uId + "]";
	}
	
}

public class Drector {	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub	

	}

}

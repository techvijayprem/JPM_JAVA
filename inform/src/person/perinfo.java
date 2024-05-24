package person;

import country.country;
import state.stateinfo;

public class perinfo {

    private String pname;
    private country c1;
    private stateinfo s1;
    private int income;
	private int age;
   
	
    public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	 
    public perinfo(String pname, country c1, stateinfo s1, int income, int age) {
		this.pname = pname;
		this.c1 = c1;
		this.s1 = s1;
		this.income = income;
		this.age = age;
	}

	public int getIncome() {
		return income;
	}

	public void setIncome(int income) {
		this.income = income;
	}

	public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public country getC1() {
        return c1;
    }

    public void setC1(country c1) {
        this.c1 = c1;
    }

    public stateinfo getS1() {
        return s1;
    }

    public void setS1(stateinfo s1) {
        this.s1 = s1;
    }

    
    
    
    @Override
	public String toString() {
		return "perinfo [pname=" + pname + ", c1=" + c1 + ", s1=" + s1 + ", income=" + income + ", age=" + age + "]";
	}

//	public static void main(String[] args) {
//        country c1 = new country("INDIA");
//        stateinfo s1 = new stateinfo("GUJRAT");
//        perinfo pi = new perinfo("vijay", c1, s1);
//        
//        System.out.println(pi);
//    }
}

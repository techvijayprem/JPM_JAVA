 
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Fd {
	
@Id	
private int	 ano   ;
private String aname;
private int  balance;
public int getAno() {
	return ano;
}
public void setAno(int ano) {
	this.ano = ano;
}
public String getAname() {
	return aname;
}
public void setAname(String aname) {
	this.aname = aname;
}
public int getBalance() {
	return balance;
}
public void setBalance(int balance) {
	this.balance = balance;
}
@Override
public String toString() {
	return "Fd [ano=" + ano + ", aname=" + aname + ", balance=" + balance + "]";
}




}

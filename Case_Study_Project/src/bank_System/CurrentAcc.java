package bank_System;



//3. Abstract CurrentAcc extends BankAcc
public abstract class CurrentAcc extends BankAcc {
private final float creditLimit;

public CurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
   super(accNo, accNm, accBal);
   this.creditLimit = creditLimit;
}

@Override
public void withdraw(float amount) {
   if (amount > 0 && getBalance() + creditLimit >= amount) {
       super.withdraw(amount);
   } else {
       System.out.println("Withdrawal amount exceeds balance and credit limit.");
   }
}

@Override
public String toString() {
   return "CurrentAcc{" +
           "accNo=" + getAccNo() +
           ", accNm='" + getAccNm() + '\'' +
           ", accBal=" + getBalance() +
           ", creditLimit=" + creditLimit +
           '}';
}
}

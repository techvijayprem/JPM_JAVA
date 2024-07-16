package bank_System;

//2. Abstract SavingAcc extends BankAcc
public abstract class SavingAcc extends BankAcc {
private final boolean isSalaried;
private static final float MINBAL = 1000.0f;

public SavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
 super(accNo, accNm, accBal);
 this.isSalaried = isSalaried;
}

@Override
public void withdraw(float amount) {
 if (amount > 0 && getBalance() - amount >= MINBAL) {
     super.withdraw(amount);
 } else {
     System.out.println("Withdrawal amount exceeds minimum balance.");
 }
}

@Override
public String toString() {
 return "SavingAcc{" +
         "accNo=" + getAccNo() +
         ", accNm='" + getAccNm() + '\'' +
         ", accBal=" + getBalance() +
         ", isSalaried=" + isSalaried +
         '}';
}
}

package bank_System;

//1. Abstract BankAcc
public abstract class BankAcc {
 private final int accNo;
 private String accNm;
 private float accBal;

 public BankAcc(int accNo, String accNm, float accBal) {
     this.accNo = accNo;
     this.accNm = accNm;
     this.accBal = accBal;
 }

 public int getAccNo() {
     return accNo;
 }

 public String getAccNm() {
     return accNm;
 }

 public void setAccNm(String accNm) {
     this.accNm = accNm;
 }

 public float getBalance() {
     return accBal;
 }

 public void withdraw(float amount) {
     if (amount > 0) {
         accBal -= amount;
     }
 }

 public void deposit(float amount) {
     if (amount > 0) {
         accBal += amount;
     }
 }

 @Override
 public String toString() {
     return "BankAcc{" +
             "accNo=" + accNo +
             ", accNm='" + accNm + '\'' +
             ", accBal=" + accBal +
             '}';
 }
}


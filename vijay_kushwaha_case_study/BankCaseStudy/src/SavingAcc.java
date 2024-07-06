public abstract class SavingAcc extends BankAcc {
    private boolean isSalaried;
    private static final float MINBAL = 500.0f;

    public SavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
        super(accNo, accNm, accBal);
        this.isSalaried = isSalaried;
    }

    @Override
    public void withdraw(float amount) {
        if (getAccBal() - amount >= MINBAL) {
            super.deposit(-amount); // Same as withdraw
        } else {
            System.out.println("Cannot withdraw beyond minimum balance.");
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", Salaried: " + isSalaried;
    }
}

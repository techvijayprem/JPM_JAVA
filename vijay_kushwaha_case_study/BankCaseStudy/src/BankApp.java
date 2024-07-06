public class BankApp {
    public static void main(String[] args) {
        BankFactory factory = new MMBankFactory();

        SavingAcc savingAcc = factory.getNewSavingAcc(1, "vijay kush", 200.0f, true);
        CurrentAcc currentAcc = factory.getNewCurrentAcc(2, "leela rathod", 2000.0f, 800.0f);

        System.out.println(savingAcc);
        savingAcc.withdraw(900);
        System.out.println(savingAcc);

        System.out.println(currentAcc);
        currentAcc.withdraw(2100);
        System.out.println(currentAcc);
    }
}

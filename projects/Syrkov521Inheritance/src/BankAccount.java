public class BankAccount {

    private double balance;

    public BankAccount() {

    }

    public double getAmount() {
        return balance;
    }

    public boolean put(double moneyValue) {
        if (moneyValue < 0)
            return false;
        balance += moneyValue;
        return true;
    }

    public boolean take(double moneyValue) {
        if (balance < moneyValue || moneyValue < 0)
            return false;
        balance -= moneyValue;
        return true;
    }

    @Override
    public String toString() {
        return "Balance: " + balance;
    }
}

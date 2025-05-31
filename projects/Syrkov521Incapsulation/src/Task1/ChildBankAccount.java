package Task1;

public class ChildBankAccount {

    private double balance;
    private final double maxBalance;

    public ChildBankAccount(double maxBalance) {
        this(0, maxBalance);
    }

    public ChildBankAccount(double balance, double maxBalance) {
        this.balance    = balance;
        this.maxBalance = maxBalance;
    }

    public boolean depositMoney(double value) {
        //проверка аргумента
        if (value < 0 || value > maxBalance)
            return false;
        //проверка пополнения
        if (maxBalance - balance < value)
            return  false;
        balance += value;
        return true;
    }

    public boolean debitMoney(double value) {
        if (value < 0 || value > maxBalance)
            return false;
        if (balance < value)
            return false;
        balance -= value;
        return true;
    }

    public double getBalance() {
        return balance;
    }
}

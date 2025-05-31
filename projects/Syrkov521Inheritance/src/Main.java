import java.time.LocalDate;

public class Main {

    private static void _assert(boolean expr) {
        if (!expr)
            throw new AssertionError();
    }

    private static void bankAccount() {
        BankAccount acc = new BankAccount();
        acc.put(100);
        acc.take(10);
        System.out.println("Bank: " + acc);
        _assert(acc.getAmount() == 90);
    }

    private static void cardAccount() {
        BankAccount acc = new CardAccount();
        acc.put(100);
        acc.take(10);
        System.out.println("Card: " + acc);
        _assert(acc.getAmount() == (100 - (10.0 + (10.0 / 100.0))));
    }

    private static void depositAccount() {
        BankAccount acc = new DepositAccount(100, LocalDate.of(2025, 1, 20));
        acc.take(10);
        System.out.println("Deposit: " + acc);
    }

    public static void main(String[] args) {
        bankAccount();
        cardAccount();
        depositAccount();
    }
}
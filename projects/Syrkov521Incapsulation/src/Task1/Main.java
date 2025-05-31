package Task1;

public class Main {


    private static void _assert(boolean expr) {
        if (!expr)
            throw new AssertionError();
    }

    private static void test(ChildBankAccount account, double expect) {
        _assert(account.getBalance() == expect);
    }

    public static void main(String[] args) {
        ChildBankAccount account =  new ChildBankAccount(10000);

        account.depositMoney(1000);
        account.depositMoney(2000);
        account.depositMoney(10000);
        account.depositMoney(-1000);
        System.out.println("Balance: " + account.getBalance());
        test(account, 3000.0);

        account.debitMoney(500);
        account.debitMoney(422.75);
        account.debitMoney(50000);
        account.debitMoney(-50);
        System.out.println("Balance: " + account.getBalance());
        test(account, 2077.25);

        //Выполните получившийся код и сверьте результат с эталонным:
        //Balance: 3000.0
        //Balance: 2077.25

    }
}
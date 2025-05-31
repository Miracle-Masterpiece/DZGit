import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class DepositAccount extends BankAccount {

    LocalDate lastIncome;

    DepositAccount(double deposit) {
        this(deposit, LocalDate.now());
    }

    DepositAccount(double deposit, LocalDate date) {
        if (deposit < 0)
            throw new IllegalArgumentException("Deposit must be >= 0");
        super.put(deposit);
        lastIncome = date;
    }

    @Override
    public boolean put(double moneyValue) {
        if (super.put(moneyValue)) {
            lastIncome = LocalDate.now();
            return true;
        }
        return false;
    }

    @Override
    public boolean take(double moneyValue) {
        LocalDate now = LocalDate.now();
        if (ChronoUnit.MONTHS.between(lastIncome, now) >= 1) {
            return super.take(moneyValue);
        }
        return false;
    }
}

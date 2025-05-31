public class CardAccount extends BankAccount{
    @Override
    public boolean take(double moneyValue) {
        /**
         * 100%       \| 1%
         * moneyValue |\ x
         */
        double withdrawWithPercent = moneyValue * 1 / 100.0;
        return super.take(moneyValue + withdrawWithPercent);
    }
}

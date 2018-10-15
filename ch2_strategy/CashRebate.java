package ch2_strategy;

/**
 * Created by nnkwrik
 * 18/10/10 17:48
 */
public class CashRebate implements CashSuper {

    private double moneyRebate = 1d;

    public CashRebate(String moneyRebate) {
        this.moneyRebate = Double.parseDouble(moneyRebate);
    }

    @Override
    public double acceptCash(double money) {
        return money * moneyRebate;
    }
}

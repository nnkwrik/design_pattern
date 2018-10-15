package ch2_strategy;

/**
 * Created by nnkwrik
 * 18/10/10 17:48
 */
public class CashReturn implements CashSuper {

    private double moneyCondition = 0.0d;
    private double moneyReturn = 0.0d;

    public CashReturn(String moneyCondition, String moneyReturn) {
        this.moneyCondition = Double.parseDouble(moneyCondition);
        this.moneyReturn = Double.parseDouble(moneyReturn);
    }

    @Override
    public double acceptCash(double money) {
        if (money > moneyCondition) money = money - moneyReturn;
        return money;
    }
}

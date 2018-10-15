package ch2_strategy;

/**
 * Created by nnkwrik
 * 18/10/10 17:48
 */
public class CashNormal implements CashSuper {

    @Override
    public double acceptCash(double money) {
        return money;
    }
}

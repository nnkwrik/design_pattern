package ch2_strategy;

/**
 * Created by nnkwrik
 * 18/10/10 17:59
 */
public class CashContext {
    private CashSuper cs;

    public CashContext(CashSuper cs) {
        this.cs = cs;
    }

    public double getResult(double money){
        return cs.acceptCash(money);
    }
}

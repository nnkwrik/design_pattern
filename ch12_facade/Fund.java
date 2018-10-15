package ch12_facade;

/**
 * Created by nnkwrik
 * 18/10/10 20:20
 */
public class Fund {
    Stock1 stock1 = new Stock1();
    Stock2 stock2 = new Stock2();
    Stock3 stock3 = new Stock3();

    public void buyFund(){
        stock1.buy();
        stock2.buy();
        stock3.buy();
    }

    public void sellFund(){
        stock1.sell();
        stock2.sell();
        stock3.sell();
    }
}

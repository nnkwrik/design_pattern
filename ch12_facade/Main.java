package ch12_facade;

/**
 * Created by nnkwrik
 * 18/10/10 20:17
 * 外观模式 :　为子系统中的一组接口提供一个一致的界面，　让子系统更方便使用
 */
public class Main {
    public static void main(String[] args) {
        Fund fund = new Fund();
        fund.buyFund();
        fund.sellFund();


    }
}

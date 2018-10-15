package ch1_simpleFactory;

/**
 * Created by nnkwrik
 * 18/10/10 17:42
 */
public class Main {

    public static void main(String[] args) {
        Operation ope = OperationFactory.createOpe("+");
        ope.setNumA(1);
        ope.setNumB(5);
        double result = ope.getResult();
        System.out.println(result);
    }
}

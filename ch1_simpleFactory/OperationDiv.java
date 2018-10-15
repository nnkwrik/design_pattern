package ch1_simpleFactory;

/**
 * Created by nnkwrik
 * 18/10/10 17:33
 */
public class OperationDiv extends Operation {
    @Override
    public double getResult() {

        return numA / numB;
    }
}

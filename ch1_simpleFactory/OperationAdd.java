package ch1_simpleFactory;

/**
 * Created by nnkwrik
 * 18/10/10 17:33
 */
public class OperationAdd extends Operation {
    @Override
    public double getResult() {
        return numA + numB;
    }
}

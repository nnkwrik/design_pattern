package ch1_simpleFactory;

/**
 * Created by nnkwrik
 * 18/10/10 17:30
 */
public class Operation {

    protected double numA = 0;
    protected double numB = 0;

    public double getNumA() {
        return numA;
    }

    public void setNumA(double numA) {
        this.numA = numA;
    }

    public double getNumB() {
        return numB;
    }

    public void setNumB(double numB) {
        this.numB = numB;
    }

    public double getResult(){
        double result = 0;
        return result;
    }
}

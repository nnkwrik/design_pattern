package ch1_simpleFactory;

/**
 * Created by nnkwrik
 * 18/10/10 17:37
 * 简单工厂类 : 根据需求提供适合的工具
 */
public class OperationFactory {
    public static Operation createOpe(String operate){

        switch (operate){
            case "+":
                return new OperationAdd();
            case "-":
                return new OperationSub();
            case "*":
                return new OperationMul();
            case "/":
                return new OperationDiv();
        }

        return null;

    }
}

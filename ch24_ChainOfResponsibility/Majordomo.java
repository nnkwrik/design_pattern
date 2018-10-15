package ch24_ChainOfResponsibility;

/**
 * Created by nnkwrik
 * 18/10/15 15:05
 */
public class Majordomo extends Manager {
    public Majordomo(String name) {
        super(name);
    }

    @Override
    public void requestApplication(String request) {
        if (request.equals("请病假")) {
            System.out.println(name + ": 批准");
        } else if (request.equals("回老家")) {
            System.out.println(name + ": 批准");
        } else {
            if (superior != null)
                superior.requestApplication(request);
        }
    }
}

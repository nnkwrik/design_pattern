package ch8_factoryMethod;

/**
 * Created by nnkwrik
 * 18/10/10 19:31
 */
public class SimpleFactory {

    public static Leifeng createLeifeng(String type){
        switch (type){
            case "student":
                return new Student();
            case "volunteer":
                return new Volunteer();
        }
        return null;
    }
}

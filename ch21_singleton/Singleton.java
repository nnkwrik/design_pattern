package ch21_singleton;

/**
 * Created by nnkwrik
 * 18/10/15 13:50
 */
public class Singleton {
//    private static Singleton instance;
    private static Singleton instance = new Singleton();    //饿汗式　多线程下也是安全的

    private Singleton() {
    }

    //懒汉式　：多线程情况下不安全, ->双重锁定
//    public static Singleton getInstance() {
//        if (instance == null) {
//            synchronized (Singleton.class) {
//                if (instance == null) instance = new Singleton();
//            }
//        }
//
//        return instance;
//    }

    public static Singleton getInstance() {
        return instance;
    }
}

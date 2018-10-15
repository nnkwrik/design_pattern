package ch21_singleton;

/**
 * Created by nnkwrik
 * 18/10/15 13:45
 * 单例模式 :保证一个类仅有一个实例，　并提供一个访问它的全局访问点
 */
public class Main {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println(s1 == s2);
    }
}

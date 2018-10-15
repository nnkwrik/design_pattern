package ch20_iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by nnkwrik
 * 18/10/15 13:30
 * 迭代器模式 : 提供一种方法顺序访问一个聚合对象中各个元素, 而又不暴露该对象的内部表示
 */
public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");

        Iterator<String> it = list.iterator();
        while (it.hasNext())
            System.out.println(it.next());
    }
}

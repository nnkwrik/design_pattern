package ch28_visitor;

/**
 * Created by nnkwrik
 * 18/10/15 16:31
 * 访问者模式 :　表示一个作用于某个对象结构中的各元素的操作．他使你可以再不更改元素的情况下执行新的操作
 * 组合（combination）? 只要添加个结婚的状态就能看男人和女人的反映了．　好复杂
 */
public class Main {

    public static void main(String[] args) {
        ObjectStructure o = new ObjectStructure();

        o.attach(new Man());
        o.attach(new Woman());

        Success v1 = new Success();
        o.display(v1);

        Failing v2 = new Failing();
        o.display(v2);
    }
}

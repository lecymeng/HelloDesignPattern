package design.pattern.structure.composite.safe;

/**
 * Created by Weicools on 2017/3/18.
 * <p>
 * desc: 通过Component接口操纵组合节点的对象
 */
public class Client {
    public static void main(String[] args) {
        //构造一个根节点
        Composite root = new Composite("Root");

        //构造两个分支子节点
        Composite branch1 = new Composite("Branch1");
        Composite branch2 = new Composite("Branch2");

        //构造两个叶子节点
        Leaf leaf1 = new Leaf("Leaf1");
        Leaf leaf2 = new Leaf("Leaf2");

        //将叶子节点添加到分支子节点
        branch1.addChild(leaf1);
        branch2.addChild(leaf2);

        //将分支子节点添加到根节点
        root.addChild(branch1);
        root.addChild(branch2);

        root.doSomething();
    }
}

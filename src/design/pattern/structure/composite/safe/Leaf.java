package design.pattern.structure.composite.safe;

/**
 * Created by Weicools on 2017/3/18.
 * <p>
 * desc: 具体叶子节点，叶子节点没有子节点，在组合中定义节点对象的行为
 */
public class Leaf extends Component {
  public Leaf(String name) {
    super(name);
  }

  @Override
  public void doSomething() {
    System.out.println(name);
  }
}

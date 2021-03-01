package design.pattern.structure.composite.transparent;

/**
 * Created by Weicools on 2017/3/17.
 * <p>
 * desc: 抽象根节点，为组合中的对象声明接口。在适当的情况下，实现所有类共有接口的缺省行为
 */
public abstract class Component {
  protected String name;

  public Component(String name) {
    this.name = name;
  }

  /**
   * 具体由子类实现
   */
  public abstract void doSomething();

  /**
   * 添加子节点
   *
   * @param child 子节点
   */
  public abstract void addChild(Component child);

  /**
   * 移除子节点
   *
   * @param child 子节点
   */
  public abstract void removeChild(Component child);

  /**
   * 获取子节点
   *
   * @param index 子节点下标
   * @return 子节点
   */
  public abstract Component getChildren(int index);
}

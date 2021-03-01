package design.pattern.structure.composite.safe;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Weicools on 2017/3/17.
 * <p>
 * desc: 具体分支节点，定义有子节点行为
 */
public class Composite extends Component {
  /**
   * 存储节点容器
   */
  private List<Component> mComponentList = new ArrayList<>();

  public Composite(String name) {
    super(name);
  }

  @Override
  public void doSomething() {
    System.out.println(name);
    if (mComponentList != null) {
      for (Component component : mComponentList) {
        component.doSomething();
      }
    }
  }

  /**
   * 添加子节点
   *
   * @param component 子节点
   */
  public void addChild(Component component) {
    mComponentList.add(component);
  }

  /**
   * 移除子节点
   *
   * @param component 子节点
   */
  public void removeChild(Component component) {
    mComponentList.remove(component);
  }

  /**
   * 获取子节点
   *
   * @param index 子节点下标
   * @return 子节点
   */
  public Component getChildren(int index) {
    return mComponentList.get(index);
  }
}

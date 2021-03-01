package design.pattern.structure.facade;

/**
 * Created by Weicools on 2017/3/17.
 * <p>
 * desc: 电话模块实现
 */
public class PhoneImpl implements Phone {
  @Override
  public void call() {
    System.out.println("打电话");
  }

  @Override
  public void hangUp() {
    System.out.println("挂断电话");
  }
}

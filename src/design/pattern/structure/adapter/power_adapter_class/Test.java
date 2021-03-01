package design.pattern.structure.adapter.power_adapter_class;

/**
 * Created by Weicools on 2018/3/14.
 * <p>
 * desc: 笔记本电脑一都是需要5V电压，而生活电压一般都是220V，这个时候就产生了不兼容情况
 * 需要一个适配器来把220V电压转换成5V电压
 * 对应就是Target需要得到5V电压，而Adaptee正常输出220V，Adapter类则是继承Adaptee实现Target
 * 将220V转为5V，解决接口不兼容问题
 */
public class Test {
  public static void main(String[] args) {
    VoltAdapter adapter = new VoltAdapter();
    System.out.println("输出电压: " + adapter.getVolt5());
  }
}

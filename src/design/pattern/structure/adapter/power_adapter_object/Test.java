package design.pattern.structure.adapter.power_adapter_object;

/**
 * Created by Weicools on 2018/3/14.
 * <p>
 * desc: 笔记本电脑一都是需要5V电压，而生活电压一般都是220V，这个时候就产生了不兼容情况
 * 需要一个适配器来把220V电压转换成5V电压
 * 直接将被适配的对象传到Adapter中，使用组合形式实现接口兼容效果
 * 比类适配器更加灵活，适配对象的方法也不会暴露出来
 */
public class Test {
    public static void main(String[] args) {
        VoltAdapter adapter = new VoltAdapter(new Volt220());
        System.out.println("输出电压: " + adapter.getVolt5());
    }
}

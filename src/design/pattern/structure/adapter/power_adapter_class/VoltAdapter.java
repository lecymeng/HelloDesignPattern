package design.pattern.structure.adapter.power_adapter_class;

/**
 * Created by Weicools on 2018/3/14.
 * <p>
 * desc: Adapter 角色
 */
public class VoltAdapter extends Volt220 implements FiveVolt {
    @Override
    public int getVolt5() {
        return 5;
    }
}

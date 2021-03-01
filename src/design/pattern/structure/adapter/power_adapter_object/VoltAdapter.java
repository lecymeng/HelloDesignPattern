package design.pattern.structure.adapter.power_adapter_object;

/**
 * Created by Weicools on 2018/3/14.
 * <p>
 * desc: Adapter 角色
 */
public class VoltAdapter implements FiveVolt {
  private Volt220 mVolt220;

  VoltAdapter(Volt220 volt220) {
    mVolt220 = volt220;
  }

  public int getVOlt220() {
    return mVolt220.getVolt220();
  }

  @Override
  public int getVolt5() {
    return 5;
  }
}

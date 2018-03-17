package design.pattern.structure.proxy.sample;

/**
 * Created by Weicools on 2017/3/17.
 * <p>
 * desc: 具体诉讼人
 */
public class Weicools implements ILawsuit {
    @Override
    public void submit() {
        System.out.println("老板拖欠工资，特此申请仲裁！");
    }

    @Override
    public void burden() {
        System.out.println("这是合同书和过去一年的银行工资流水。");
    }

    @Override
    public void defend() {
        System.out.println("证据确凿，不需要做任何辩护！");
    }

    @Override
    public void finish() {
        System.out.println("诉讼成功，判决老板七天内结算工资！");
    }
}

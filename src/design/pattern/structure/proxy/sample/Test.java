package design.pattern.structure.proxy.sample;

/**
 * Created by Weicools on 2017/3/17.
 * <p>
 * desc:
 */
public class Test {
    public static void main(String[] args) {
        ILawsuit weico = new Weicools();
        ILawsuit layer = new ProxyLayer(weico);

        layer.submit();
        layer.burden();
        layer.defend();
        layer.finish();
    }
}

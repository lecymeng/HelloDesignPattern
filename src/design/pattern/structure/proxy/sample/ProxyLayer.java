package design.pattern.structure.proxy.sample;

/**
 * Created by Weicools on 2017/3/17.
 * <p>
 * desc: 代理律师
 */
public class ProxyLayer implements ILawsuit {
  private ILawsuit mLawsuit;

  public ProxyLayer(ILawsuit lawsuit) {
    mLawsuit = lawsuit;
  }

  @Override
  public void submit() {
    mLawsuit.submit();
  }

  @Override
  public void burden() {
    mLawsuit.burden();
  }

  @Override
  public void defend() {
    mLawsuit.defend();
  }

  @Override
  public void finish() {
    mLawsuit.finish();
  }
}

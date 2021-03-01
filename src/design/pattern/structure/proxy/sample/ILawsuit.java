package design.pattern.structure.proxy.sample;

/**
 * Created by Weicools on 2017/3/17.
 * <p>
 * desc: 诉讼接口类
 */
public interface ILawsuit {
  /**
   * 提交申请
   */
  void submit();

  /**
   * 禁行举证
   */
  void burden();

  /**
   * 开始辩护
   */
  void defend();

  /**
   * 诉讼完成
   */
  void finish();
}

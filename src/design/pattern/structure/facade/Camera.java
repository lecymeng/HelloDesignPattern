package design.pattern.structure.facade;

/**
 * Created by Weicools on 2017/3/17.
 * <p>
 * desc:
 */
public interface Camera {
  /**
   * 打开相机
   */
  void open();

  /**
   * 拍照
   */
  void takePicture();

  /**
   * 关闭相机
   */
  void close();
}

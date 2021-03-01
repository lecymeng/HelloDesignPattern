package design.pattern.structure.facade;

/**
 * Created by Weicools on 2017/3/17.
 * <p>
 * desc: 外观类
 */
public class MobileFacade {
  private Phone mPhone = new PhoneImpl();
  private Camera mCamera = new SonyCamera();

  public void call() {
    mPhone.call();
  }

  public void videoChat() {
    System.out.println("视频正在连接……");
    mCamera.open();
    mPhone.call();
  }

  public void hangUp() {
    mPhone.hangUp();
  }

  public void takePicture() {
    mCamera.open();
    mCamera.takePicture();
  }

  public void closeCamera() {
    mCamera.close();
  }
}

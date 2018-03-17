package design.pattern.structure.facade;

/**
 * Created by Weicools on 2017/3/17.
 * <p>
 * desc: 相机模块实现
 */
public class SonyCamera implements Camera {

    @Override
    public void open() {
        System.out.println("打开相机");
    }

    @Override
    public void takePicture() {
        System.out.println("拍个照片");
    }

    @Override
    public void close() {
        System.out.println("关闭相机");
    }
}

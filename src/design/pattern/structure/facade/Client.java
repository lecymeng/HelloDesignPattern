package design.pattern.structure.facade;

/**
 * Created by Weicools on 2018/3/17.
 * <p>
 * desc:
 */
public class Client {
    public static void main(String[] args) {
        MobileFacade mobileFacade = new MobileFacade();

        mobileFacade.videoChat();
        mobileFacade.takePicture();
        mobileFacade.closeCamera();
    }
}

package design.pattern.structure.proxy;

/**
 * Created by Weicools on 2017/3/17.
 * <p>
 * desc:
 */
public class Client {
    public static void main(String[] args) {
        Subject subject = new ProxySubject(new RealSubject());

        subject.visit();
    }
}

package design.pattern.creator.abstractFactory.skin.product;

public class SpringTextField implements TextField {
    @Override
    public void displayTextField() {
        System.out.println("display Spring TextField");
    }
}

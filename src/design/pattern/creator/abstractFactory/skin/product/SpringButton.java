package design.pattern.creator.abstractFactory.skin.product;

public class SpringButton implements Button {
    @Override
    public void displayButton() {
        System.out.println("display Spring Button");
    }
}

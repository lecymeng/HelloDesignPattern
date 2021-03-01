package design.pattern.creator.abstractFactory.skin.product;

public class SummerTextField implements TextField {
  @Override
  public void displayTextField() {
    System.out.println("display Summer TextField");
  }
}

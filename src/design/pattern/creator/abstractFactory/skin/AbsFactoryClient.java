package design.pattern.creator.abstractFactory.skin;

import design.pattern.creator.abstractFactory.skin.factory.SkinFactory;
import design.pattern.creator.abstractFactory.skin.factory.SpringSkinFactory;
import design.pattern.creator.abstractFactory.skin.factory.SummerSkinFactory;

public class AbsFactoryClient {
  public static void main(String[] args) {
    SkinFactory springFactory = new SpringSkinFactory();
    springFactory.createButton().displayButton();
    springFactory.createTextField().displayTextField();
    springFactory.createComboBox().displayComboBox();

    System.out.println("\n");

    SkinFactory summerFactory = new SummerSkinFactory();
    summerFactory.createButton().displayButton();
    summerFactory.createTextField().displayTextField();
    summerFactory.createComboBox().displayComboBox();
  }
}

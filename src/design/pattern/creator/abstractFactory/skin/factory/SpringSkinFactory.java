package design.pattern.creator.abstractFactory.skin.factory;

import design.pattern.creator.abstractFactory.skin.product.*;

public class SpringSkinFactory implements SkinFactory {
  @Override
  public Button createButton() {
    return new SpringButton();
  }

  @Override
  public TextField createTextField() {
    return new SpringTextField();
  }

  @Override
  public ComboBox createComboBox() {
    return new SpringComboBox();
  }
}

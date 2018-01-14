package design.pattern.creator.abstractFactory.skin.factory;

import design.pattern.creator.abstractFactory.skin.product.Button;
import design.pattern.creator.abstractFactory.skin.product.ComboBox;
import design.pattern.creator.abstractFactory.skin.product.TextField;

public interface SkinFactory {
    public Button createButton();

    public TextField createTextField();

    public ComboBox createComboBox();
}

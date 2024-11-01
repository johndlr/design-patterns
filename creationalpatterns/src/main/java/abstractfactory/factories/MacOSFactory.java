package abstractfactory.factories;

import abstractfactory.buttons.Button;
import abstractfactory.buttons.MacOSButton;
import abstractfactory.checkboxes.CheckBox;
import abstractfactory.checkboxes.MacOSCheckbox;

public class MacOSFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public CheckBox createCheckbox() {
        return new MacOSCheckbox();
    }
}

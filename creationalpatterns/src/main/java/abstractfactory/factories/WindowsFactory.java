package abstractfactory.factories;

import abstractfactory.buttons.Button;
import abstractfactory.buttons.WindowsButton;
import abstractfactory.checkboxes.CheckBox;
import abstractfactory.checkboxes.WindowsCheckbox;

public class WindowsFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public CheckBox createCheckbox() {
        return new WindowsCheckbox();
    }
}

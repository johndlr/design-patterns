package abstractfactory.factories;

import abstractfactory.buttons.Button;
import abstractfactory.checkboxes.CheckBox;

public interface GUIFactory {

    //Factory methods
    Button createButton();
    CheckBox createCheckbox();
}

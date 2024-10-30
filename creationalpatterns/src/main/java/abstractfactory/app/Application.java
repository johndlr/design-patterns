package abstractfactory.app;

import abstractfactory.buttons.Button;
import abstractfactory.checkboxes.CheckBox;
import abstractfactory.factories.GUIFactory;

public class Application {
    private Button button;
    private CheckBox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}

package factorymethod.factory;

import factorymethod.buttons.Button;

public abstract class Dialog {

    public void renderWindow() {
        Button okButton = createButton();
        okButton.render();
    }

    /**
     *
     * Fabric method
     */
    public abstract Button createButton();
}

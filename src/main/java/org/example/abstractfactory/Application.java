package org.example.abstractfactory;

import org.example.abstractfactory.uifactory.UIFactory;
import org.example.abstractfactory.widget.Button;
import org.example.abstractfactory.widget.Checkbox;

public class Application {

    private final Button button;
    private final Checkbox checkbox;

    public Application(UIFactory uiFactory) {
        this.button = uiFactory.createButton();
        this.checkbox = uiFactory.createCheckBox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}

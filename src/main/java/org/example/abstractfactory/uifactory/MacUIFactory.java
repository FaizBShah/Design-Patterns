package org.example.abstractfactory.uifactory;

import org.example.abstractfactory.widget.Button;
import org.example.abstractfactory.widget.Checkbox;
import org.example.abstractfactory.widget.mac.MacButton;
import org.example.abstractfactory.widget.mac.MacCheckbox;

public class MacUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckBox() {
        return new MacCheckbox();
    }
}

package org.example.abstractfactory.uifactory;

import org.example.abstractfactory.widget.Button;
import org.example.abstractfactory.widget.Checkbox;
import org.example.abstractfactory.widget.windows.WindowsButton;
import org.example.abstractfactory.widget.windows.WindowsCheckBox;

public class WindowsUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckBox() {
        return new WindowsCheckBox();
    }
}

package org.example.abstractfactory.widget.windows;

import org.example.abstractfactory.widget.Checkbox;

public class WindowsCheckBox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Painting Windows Checkbox on screen");
    }
}

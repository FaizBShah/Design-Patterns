package org.example.abstractfactory.widget.mac;

import org.example.abstractfactory.widget.Checkbox;

public class MacCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Painting Mac Checkbox on screen");
    }
}

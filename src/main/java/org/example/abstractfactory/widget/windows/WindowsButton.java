package org.example.abstractfactory.widget.windows;

import org.example.abstractfactory.widget.Button;

public class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("Painting Windows Button on screen");
    }
}

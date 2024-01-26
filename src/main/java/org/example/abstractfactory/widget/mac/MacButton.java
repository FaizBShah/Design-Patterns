package org.example.abstractfactory.widget.mac;

import org.example.abstractfactory.widget.Button;

public class MacButton implements Button {
    @Override
    public void paint() {
        System.out.println("Painting Mac Button on screen");
    }
}

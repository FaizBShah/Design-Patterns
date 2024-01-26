package org.example.abstractfactory.uifactory;

import org.example.abstractfactory.widget.Button;
import org.example.abstractfactory.widget.Checkbox;

public interface UIFactory {
    Button createButton();
    Checkbox createCheckBox();
}

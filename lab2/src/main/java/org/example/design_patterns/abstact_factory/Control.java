package org.example.design_patterns.abstact_factory;

public abstract class Control {
    protected abstract Button createButton();
    protected abstract Checkbox createCheckbox();

}

package org.example.design_patterns.abstact_factory;

public class Application {

    public static void main(String[] args) {

       //Create buttons
        Button windowsBtn = new  ControlsFactory.Windows().createButton();
        Button macBtn = new ControlsFactory.MacOS().createButton()
;
        //create checkboxes
        Checkbox windowsCheckbox = new ControlsFactory.Windows().createCheckbox();
        Checkbox macCheckbox = new ControlsFactory.MacOS().createCheckbox();

        windowsBtn.onClick();
        macBtn.onClick();

        macCheckbox.uncheck();
        windowsCheckbox.uncheck();

    }
}

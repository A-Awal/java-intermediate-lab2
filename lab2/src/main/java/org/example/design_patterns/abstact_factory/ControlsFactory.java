package org.example.design_patterns.abstact_factory;

public class ControlsFactory{

    //prevent instanciation
    private ControlsFactory(){}

    public static class MacOS extends Control {
        @Override
        public  Button createButton() {
            return new MacOsButtonImpl();
        }

        @Override
        public Checkbox createCheckbox() {
            return new MacOSCkecboxImpl();
        }

        private class MacOsButtonImpl implements Button {
            @Override
            public void onClick() {
                System.out.println("MacOsButtonImpl onClick");
            }
        }
        private class MacOSCkecboxImpl implements Checkbox{
            @Override
            public void check() {
                System.out.println("MacOSCkecboxImpl checked");
            }

            @Override
            public void uncheck() {
                System.out.println("MacOSCkecboxImpl unchecked");
            }
        }
    }

    public static class Windows extends Control {
        @Override
        public Button createButton() {
            return new WindowsButtonImpl();
        }

        @Override
        public Checkbox createCheckbox() {
            return new WindowsCheckBoxImpl();
        }

        private class WindowsButtonImpl implements Button {
            @Override
            public void onClick() {
                System.out.println("WindowsButtonImpl onClick");
            }
        }
        private class WindowsCheckBoxImpl implements  Checkbox{
            @Override
            public void check() {
                System.out.println("Checking Windows CheckBox");
            }

            @Override
            public void uncheck() {
                System.out.println("Unchecking Windows CheckBox");
            }
        }
    }
}

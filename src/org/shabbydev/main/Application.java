package org.shabbydev.main;


import org.shabbydev.main.server.ui.UIConsoleReader;

public class Application {
    public static void main(String[] args) {
        UIConsoleReader uiConsoleReader = new UIConsoleReader();
        uiConsoleReader.create();
    }
}

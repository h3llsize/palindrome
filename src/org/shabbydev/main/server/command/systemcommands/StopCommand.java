package org.shabbydev.main.server.command.systemcommands;

import org.shabbydev.main.server.ui.UIPrinter;

public class StopCommand implements Command{
    @Override
    public void execute() {
        UIPrinter.sendMessage("Спасибо, за то, что поиграли в нашу игру!");
        System.exit(1);
    }
}

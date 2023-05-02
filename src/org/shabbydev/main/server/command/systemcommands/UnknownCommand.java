package org.shabbydev.main.server.command.systemcommands;

import org.shabbydev.main.server.ui.UIPrinter;

public class UnknownCommand implements Command {
    @Override
    public void execute() {
        UIPrinter.sendMessage("Неизвестная команда :(");
    }
}

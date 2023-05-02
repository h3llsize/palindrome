package org.shabbydev.main.server.command.systemcommands;

import org.shabbydev.main.server.ui.UIPrinter;

public class HelpCommand implements Command{
    @Override
    public void execute() {
        UIPrinter.sendMessage("Список команд - \n" +
                "/help \n" +
                "/getscore \n" +
                "/stop");
    }
}

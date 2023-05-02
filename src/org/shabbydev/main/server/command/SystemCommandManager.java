package org.shabbydev.main.server.command;

import org.shabbydev.main.server.command.systemcommands.Command;
import org.shabbydev.main.server.command.systemcommands.CommandHolder;
import org.shabbydev.main.server.command.systemcommands.GetScoreCommand;

import java.util.HashMap;
import java.util.Map;

public class SystemCommandManager implements CommandManager {

    protected CommandHolder commandHolder = new CommandHolder();

    @Override
    public void handleCommand(String command) {
        commandHolder.exec(command);
    }
}

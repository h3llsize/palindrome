package org.shabbydev.main.server.command;

public class CommandManagerImpl implements CommandManager {

    protected CommandManager gameCommandManager = new GameCommandManager();

    protected CommandManager systemCommandManager = new SystemCommandManager();

    @Override
    public void handleCommand(String command) {
        if(isGameCommand(command)) {
            handleGameCommand(command);
        } else {
            handleSystemCommand(command);
        }

    }

    protected boolean isGameCommand(String command) {
        return !command.startsWith("/");
    }

    protected void handleGameCommand(String command) {
        gameCommandManager.handleCommand(command);
    }

    protected void handleSystemCommand(String command) {
        systemCommandManager.handleCommand(command);
    }
}

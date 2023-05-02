package org.shabbydev.main.server.command.systemcommands;

import org.shabbydev.main.server.command.CommandManager;
import org.shabbydev.main.server.ui.UIPrinter;
import org.shabbydev.main.user.UserSession;

public class GetScoreCommand implements Command {
    @Override
    public void execute() {
        UIPrinter.sendMessage("Ваш текущий счёт - " + UserSession.getCurrentUser().getScore());
    }
}

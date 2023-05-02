package org.shabbydev.main.server.command;

import org.shabbydev.main.server.command.game.PalindromeChecker;
import org.shabbydev.main.server.ui.UIPrinter;
import org.shabbydev.main.user.UserSession;

import java.util.Locale;

public class GameCommandManager implements CommandManager{

    protected PalindromeChecker palindromeChecker = new PalindromeChecker();

    @Override
    public void handleCommand(String command) {
        String tempCommand = command.toLowerCase(Locale.ROOT);

        int score = palindromeChecker.getPoints(command);

        if(palindromeChecker.check(tempCommand))
        {

            UserSession.getCurrentUser().addScore((long) score);

            UIPrinter.sendMessage("Поздравляем, вы получили " + score +
                    (score < 5 ? " очка." : " очков.") +
                    " Они зачислены на ваш счёт!");
        } else {
            UserSession.getCurrentUser().minusScore((long) score);

            UIPrinter.sendMessage("Вы указали неверный палиндром! У вас -" + score +
                    (score < 5 ? " очка." : " очков."));
        }
    }
}

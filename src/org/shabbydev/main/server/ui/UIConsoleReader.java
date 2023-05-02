package org.shabbydev.main.server.ui;

import org.shabbydev.main.server.command.CommandManager;
import org.shabbydev.main.server.command.CommandManagerImpl;

import java.util.Scanner;

public class UIConsoleReader {

    protected Scanner scanner = new Scanner(System.in);

    protected CommandManager commandManager = new CommandManagerImpl();

    public void create() {
        UIPrinter.sendMessage("Приветствуем вас в игре палиндром! Список команд - \n" +
                "/help \n" +
                "/getscore \n" +
                "/stop");

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();

            commandManager.handleCommand(line);
        }
    }
}

package org.shabbydev.main.server.command.systemcommands;

import java.util.HashMap;
import java.util.Map;

public class CommandHolder {
    protected Map<String, Command> commands = new HashMap<>();

    public CommandHolder() {
        commands.put("/getscore", new GetScoreCommand());
        commands.put("/help", new HelpCommand());
        commands.put("/stop", new StopCommand());
        commands.put("unknown", new UnknownCommand());
    }

    public void exec(String command) {
        if(commands.containsKey(command))
            commands.get(command).execute();
        else
            commands.get("unknown").execute();
    }
}

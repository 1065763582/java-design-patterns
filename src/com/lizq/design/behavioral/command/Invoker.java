package com.lizq.design.behavioral.command;

import java.util.ArrayList;
import java.util.List;

/**
 * 调用者
 *
 * @author lizq
 * @date 2019/02/07 15:24
 */
public class Invoker {

    private List<Command> commands = new ArrayList<>();

    public List<Command> getCommands() {
        return commands;
    }

    public void addCommand(Command command) {
        commands.add(command);
    }

    public void executeOnce() {
        if (commands.size() > 0) {
            commands.get(0).execute();
            commands.clear();
        }
    }

    public void executeAll() {
        if (commands.size() > 0) {
            for (Command c : commands) {
                c.execute();
            }
            commands.clear();
        }
    }
}

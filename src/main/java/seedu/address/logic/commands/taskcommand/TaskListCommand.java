package seedu.address.logic.commands.taskcommand;

import seedu.address.logic.commands.CommandResult;
import seedu.address.logic.commands.exceptions.CommandException;
import seedu.address.model.Model;

public class TaskListCommand extends TaskCommands {
    public static final String COMMAND_WORD = "list";

    @Override
    public CommandResult execute(Model model) throws CommandException {
        return null;
    }

    @Override
    public boolean equals(Object other) {
        return false;
    }

}
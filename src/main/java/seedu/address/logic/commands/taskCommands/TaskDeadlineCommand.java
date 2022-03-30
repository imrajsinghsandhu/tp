package seedu.address.logic.commands.taskCommands;

import static java.util.Objects.requireNonNull;

import seedu.address.logic.commands.CommandResult;
import seedu.address.logic.commands.exceptions.CommandException;
import seedu.address.logic.parser.Type;
import seedu.address.model.Model;
import seedu.address.model.tasks.Deadlines;

public class TaskDeadlineCommand extends TaskCommands {
    public static final String COMMAND_WORD = "deadline";

    public static final String MESSAGE_USAGE = COMMAND_WORD + "todo : Adds a todo task to the list of tasks."
            + "Parameters: ";

    public static final String MESSAGE_SUCCESS = "New todo task added successfully!";
    public static final String MESSAGE_DUPLICATE_TODO = "This task already exists in the task list";

    public final Deadlines toAdd;

    public TaskDeadlineCommand(Deadlines deadline) {
        requireNonNull(deadline);
        toAdd = deadline;
    }

    @Override
    public CommandResult execute(Model model) throws CommandException {

        requireNonNull(model);


        return new CommandResult(String.format(MESSAGE_SUCCESS, toAdd), getType());
    }
    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof TaskDeadlineCommand // instanceof handles nulls
                && toAdd.equals(((TaskDeadlineCommand) other).toAdd));
    }

    @Override 
    public Type getType() {
        return Type.TASK;
    }
}
package seedu.address.model.application;

import seedu.address.model.person.Person;

import static seedu.address.commons.util.CollectionUtil.requireAllNonNull;

import java.util.Objects;

/** Represents the job application details of an applicant.
 * Guarantees: details are present and not null, field values are validated, immutable.
 */
public class Application {

    //fields
    private final Job job;
    private final Stage stage;

    /**
     * Every field must be present and not null.
     */
    public Application(Job job, Stage stage) {
        requireAllNonNull(job, stage);
        this.job = job;
        this.stage = stage;
    }

    public Job getJob() {
        return job;
    }

    public Stage getStage() {
        return stage;
    }

    /**
     * Returns true if both job applications are for the same Job positions
     * and are at the same Stage.
     * This defines a stronger notion of equality between two applications.
     */
    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        seedu.address.model.application.Application otherApplication =
                (seedu.address.model.application.Application) other;
        return otherApplication == this;
    }

    @Override
    public int hashCode() {
        // use this method for custom fields hashing instead of implementing your own
        return Objects.hash(job, stage);
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append("[Job: ")
                .append(getJob())
                .append(", Stage: ")
                .append(getStage())
                .append("]");
        return builder.toString();
    }

}

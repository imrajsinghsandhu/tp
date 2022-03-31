package seedu.address.model.interview;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Comparator;

public class DateTimeComparator implements Comparator<Interview> {
    @Override
    public int compare(Interview o1, Interview o2) {
        LocalDate o1Date = LocalDate.parse(o1.getDate().value);
        LocalDate o2Date = LocalDate.parse(o2.getDate().value);
        if (o1Date.isBefore(o2Date)) {
            return -1;
        } else if (o1Date.isAfter(o2Date)) {
            return 1;
        } else {
            LocalTime o1Time = LocalTime.parse(o1.getTime().value);
            LocalTime o2Time = LocalTime.parse(o2.getTime().value);
            if (o1Time.isBefore(o2Time)) {
                return -1;
            } else {
                return 1;
            }
        }

    }
}

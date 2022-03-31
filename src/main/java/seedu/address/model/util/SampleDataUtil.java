package seedu.address.model.util;

import seedu.address.model.AddressBook;
import seedu.address.model.ReadOnlyAddressBook;
import seedu.address.model.interview.Date;
import seedu.address.model.interview.Interview;
import seedu.address.model.interview.Time;
import seedu.address.model.person.Address;
import seedu.address.model.person.Email;
import seedu.address.model.person.Job;
import seedu.address.model.person.Name;
import seedu.address.model.person.Person;
import seedu.address.model.person.Phone;
import seedu.address.model.person.Stage;


/**
 * Contains utility methods for populating {@code AddressBook} with sample data.
 */
public class SampleDataUtil {
    public static Person[] getSamplePersons() {
        return new Person[] {
            new Person(new Name("Alex Lee"), new Phone("87438807"), new Email("alexlee@gmail.com"),
                    new Address("30 Defu Lane 10 #04-104"), new Job("Software Engineer"), new Stage("INPROGRESS")),
            new Person(new Name("Alex Tan"), new Phone("94825832"), new Email("alext@gmail.com"),
                    new Address("1 Finlayson Green #13-00"), new Job("Data Scientist"), new Stage("ACCEPTED")),
            new Person(new Name("Alex Chan"), new Phone("82619180"), new Email("alex1996@yahoo.com"),
                    new Address("6 Ang Mo Kio Industrial Park 2"), new Job("Data Scientist"), new Stage("REJECTED")),
            new Person(new Name("Alex Lee Kai Jie"), new Phone("92462946"), new Email("alexlkj@gmail.com"),
                    new Address("76 Lorong 19 Geylang #03-01"), new Job("Data Scientist"), new Stage("INPROGRESS")),
            new Person(new Name("Steven Tan Kai Ming"), new Phone("84303712"), new Email("stevent@yahoo.com"),
                    new Address("10 Admiralty Street #01-78 North Link Building"),
                    new Job("Mobile Engineer"), new Stage("INPROGRESS")),
            new Person(new Name("Lee Kai Jie"), new Phone("92821318"), new Email("lkj1994@gmail.com"),
                    new Address("252 Jurong East Street 24 #01-139"), new Job("Software Engineer"),
                    new Stage("ACCEPTED")),
            new Person(new Name("Janet Tan"), new Phone("94303312"), new Email("janettan@yahoo.com"),
                    new Address("10 Admiralty Street #01-78 North Link Building"),
                    new Job("Software Developer"), new Stage("REJECTED")),
            new Person(new Name("Lew Jia Xin"), new Phone("92573826"), new Email("lewjx@hotmail.com"),
                    new Address("261 Yishun St 22 #01-137"), new Job("Software Developer"), new Stage("ACCEPTED")),
            new Person(new Name("Tan Jia Ling"), new Phone("93375454"), new Email("tjialing@outlook.com"),
                    new Address("12 New Industrial Road #05-05 Morningstar Centre"),
                    new Job("Data Analyst"), new Stage("ACCEPTED")),
            new Person(new Name("Zhou Jia Ling"), new Phone("92462146"), new Email("jialingz@hotmail.com"),
                    new Address("80 Marine Parade Rd #21-08"), new Job("Software Engineer"), new Stage("INPROGRESS")),
        };
    }

    public static Interview[] getSampleInterview(Person[] persons) {
        return new Interview[]{
            new Interview(persons[0], new Date("2022-01-20"), new Time("04:01")),
            new Interview(persons[1], new Date("2022-01-22"), new Time("04:02")),
            new Interview(persons[2], new Date("2021-02-23"), new Time("04:03")),
            new Interview(persons[3], new Date("2027-03-21"), new Time("04:04")),
            new Interview(persons[4], new Date("2022-05-21"), new Time("04:05")),
            new Interview(persons[5], new Date("2024-11-21"), new Time("04:06")),
            new Interview(persons[6], new Date("2012-01-21"), new Time("04:07")),
        };
    }


    public static ReadOnlyAddressBook getSampleAddressBook() {
        AddressBook sampleAb = new AddressBook();
        Person[] samplePersons = getSamplePersons();
        Interview[] sampleInterviews = getSampleInterview(samplePersons);

        for (Person samplePerson : samplePersons) {
            sampleAb.addPerson(samplePerson);
        }

        for (Interview sampleInterview : sampleInterviews) {
            sampleAb.addInterview(sampleInterview);
        }

        return sampleAb;
    }

}

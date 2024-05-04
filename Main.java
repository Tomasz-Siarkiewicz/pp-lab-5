import company.beans.Person;
import company.exceptions.InvalidAgeException;
import company.implementations.EmailMessenger;

import static company.utils.MathUtils.add;

public class Main {
    public static void main(String[] args) {
        final int b = 10;
        Person[] people = new Person[5];
        try {
            new Person("Jan Kowalski", 10);
            for (int i = 0; i < people.length; i++) {
                people[i] = new Person("Person " + (i + 1), (i + 2) * 5);
            }

        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
        EmailMessenger emailMessenger = new EmailMessenger();

        int sum = add(3, 6);
        System.out.println(sum);

        emailMessenger.sendMessage(sum + "");

        for (Person person : people) {
            emailMessenger.sendMessage(add(person.getAge(), b) + "");
        }

    }
}

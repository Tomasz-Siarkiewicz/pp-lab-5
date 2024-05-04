import company.beans.Person;
import company.exceptions.InvalidAgeException;

public class Main {
    public static void main(String[] args) {
        try {
            new Person("Jan Kowalski", 222);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}

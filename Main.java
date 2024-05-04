import company.beans.Person;
import company.exceptions.InvalidAgeException;
import company.implementations.EmailMessenger;
import company.interfaces.Messenger;
import company.utils.MathUtils;

public class Main {
    public static void main(String[] args) {
        try {
            new Person("Jan Kowalski", 222);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
        EmailMessenger emailMessenger = new EmailMessenger();

        int sum = MathUtils.add(3, 6);
        System.out.println(sum);

        emailMessenger.sendMessage(sum + "");
    }
}

import org.jfairy.Fairy;
import org.jfairy.producer.person.Person;

/**
 * Created by stycz0007 on 28.04.16.
 */
public class MainApp {
    public static void main(String[] args) {
        Fairy fairy = Fairy.create();
        Person person1 = fairy.person();
        System.out.println(person1.fullName());
        System.out.println(person1.dateOfBirth());
        System.out.println(person1.getAddress());
    }
}

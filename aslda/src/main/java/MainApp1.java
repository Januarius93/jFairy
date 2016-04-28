import org.jfairy.Fairy;
import org.jfairy.producer.person.Person;
import java.util.Locale;

/**
 * Created by stycz0007 on 28.04.16.
 */
public class MainApp1 {
    public static void main(String[] args) {
        Fairy fairy = Fairy.create(Locale.forLanguageTag("pl"));
        Person person1 = fairy.person();
        System.out.println(person1.fullName());
        System.out.println(person1.dateOfBirth());
        System.out.println(person1.getAddress());
        System.out.println(person1.email());
    }
}

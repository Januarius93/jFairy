import org.jfairy.Fairy;
import org.jfairy.producer.person.Person;
import static org.jfairy.producer.person.PersonProperties.female;
import static org.jfairy.producer.person.PersonProperties.minAge;

/**
 * Created by stycz0007 on 28.04.16.
 */
public class MainApp2 {
    public static void main(String[] args) {
        Fairy fairy = Fairy.create();
        Person person1 = fairy.person(female(), minAge(18));
        System.out.println(person1.fullName());
        System.out.println(person1.dateOfBirth());
        System.out.println(person1.isFemale());
        System.out.println(person1.age());
    }
}



import org.jfairy.Fairy;
import org.jfairy.producer.person.Person;

/**
 * Created by stycz0007 on 28.04.16.
 */
public class MainApp3 {
    public static void main(String[] args) {
    Fairy fairy = Fairy.create();
    Person person1 = fairy.person();
    System.out.println(person1.nationalIdentificationNumber());
    System.out.println(person1.nationalIdentityCardNumber());
}
}

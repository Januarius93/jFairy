import org.jfairy.Fairy;
import org.jfairy.producer.company.Company;
import org.jfairy.producer.person.Person;

import static org.jfairy.producer.person.PersonProperties.female;
import static org.jfairy.producer.person.PersonProperties.minAge;
import static org.jfairy.producer.person.PersonProperties.withCompany;

/**
 * Created by stycz0007 on 28.04.16.
 */
public class MainApp4 {
    public static void main(String[] args) {
        Fairy fairy = Fairy.create();
        Company company = fairy.company();
        System.out.println(company.email());
        System.out.println(company.domain());
        System.out.println(company.url());
        System.out.println(company.vatIdentificationNumber());
        Person person = fairy.person(withCompany(company));
        System.out.println(person.getCompany());
        System.out.println(person.companyEmail());
    }
}

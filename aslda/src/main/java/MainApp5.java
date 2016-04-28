import org.jfairy.Fairy;
import org.joda.time.DateTimeZone;
import org.joda.time.Period;

import static org.jfairy.producer.person.PersonProperties.withCompany;

/**
 * Created by stycz0007 on 28.04.16.
 */
public class MainApp5 {
    public static void main(String[] args) {
        Fairy fairy = Fairy.create();
        //dates
        System.out.println(fairy.dateProducer().randomDateBetweenNowAndFuturePeriod(Period.years(100)));
        System.out.println(fairy.dateProducer().randomDateInTheFuture().withZone(DateTimeZone.getDefault()));
        System.out.println(fairy.dateProducer().randomDateInThePast(10000).toLocalTime().getSecondOfMinute());
        System.out.println(fairy.dateProducer().randomDateInTheFuture(1000).plus(10));
        System.out.println(fairy.dateProducer().randomDateBetweenYearAndNow(100).yearOfEra().getField().getDurationField().getDifferenceAsLong(100, 100000));
        //text
        System.out.println(fairy.textProducer().loremIpsum());
        System.out.println(fairy.textProducer().sentence()); // random sentence
        System.out.println(fairy.textProducer().paragraph());
        System.out.println(fairy.textProducer().randomString(30));
        System.out.println(fairy.textProducer().result("WAT"));
        System.out.println(fairy.textProducer().word());
        System.out.println(fairy.textProducer().word(34));



    }
}

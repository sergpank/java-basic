import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TimeTest {
    public static void main(String[] args) {
        ZonedDateTime odessa = ZonedDateTime.of(LocalDateTime.of(2021, 11, 11, 10, 0), ZoneId.of("EET"));
        System.out.println("Odessa tz           = " + odessa);
        System.out.println("withZoneSameLocal   = " + odessa.withZoneSameLocal(ZoneId.of("UTC")));
        System.out.println("withZoneSameInstant = " + odessa.withZoneSameInstant(ZoneId.of("UTC")));
        System.out.println("withFixedOffsetZone = " + odessa.withFixedOffsetZone());
    }
}

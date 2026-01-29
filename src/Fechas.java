import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.TemporalAdjusters;
import java.util.*;
public class Fechas {
    public static void main(String[] args) {

        System.out.println("La fecha actual es: " + LocalDate.now());
        System.out.println("La hora actual es: " + LocalTime.now());
        System.out.println("La fecha y horas actuales son: " + LocalDateTime.now());
        System.out.println("El instante actual es :" + Instant.now());
        System.out.println("La fecha y hora actuales con zona horaria son: ");
        System.out.println("El primer dia dia del proximo mes es: " +  LocalDate.now().with(TemporalAdjusters.firstDayOfNextMonth()).getDayOfWeek());



    }
}

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class EjFechas {


    public static boolean Abisiesto() {
        LocalDate AñoActual = LocalDate.now();
        if (AñoActual.equals(LocalDate.of(2025, Month.FEBRUARY, 29))) {
            return true;

        } else {
            return false;
        }
    }
    public static boolean Abisiesto2(LocalDate sumaAño) {

        return sumaAño.isLeapYear();
    }


    public static void main(String[] args) {

        LocalDate fecha= LocalDate.now();
        System.out.println("La fecha de hoy es: \n" + fecha);

        int dia = fecha.getDayOfMonth();
        int mes = fecha.getMonthValue();
        int anio = fecha.getYear();

        StringBuilder sbuilder = new StringBuilder();
        sbuilder.append(dia).append("/").append(mes).append("/").append(anio);
        String fechaString = sbuilder.toString();

        System.out.println(fechaString);

        LocalTime hora= LocalTime.now();
        System.out.println("La hora es: \n" + hora);

        System.out.println("Fecha: " + fechaString + " Hora: " + hora);

        LocalDate Fnacimiento= LocalDate.of(2005, Month.MARCH,12);
        System.out.println("Mi fecha  de nacimiento es en formato estandar: " + Fnacimiento);

        System.out.println("Dia: "+ Fnacimiento.getDayOfMonth()+ " Mes: " + Fnacimiento.getMonth() + " Año: " + Fnacimiento.getYear());

        //System.out.println(Abisiesto());

        //System.out.println("La fecha de hoy es: "+ fechaString+"\n" + Abisiesto());

        LocalDate sumaAño= LocalDate.now().plusYears(2);

        System.out.println("¿El año es bisiesto dentro de dos años?-->" +Abisiesto2(sumaAño));

        System.out.println("Dentro de dos  años será: "+sumaAño.getDayOfWeek());

        Period Edad = Fnacimiento.until(fecha);
        int dias= Edad.getDays();
        int meses= Edad.getMonths();
        int anios= Edad.getYears();
        System.out.println("Hace "+"Dias "+ dias + " Meses " + meses+ " Años "+ anios+" que nací.");

        Period cumpleaños= Period.between(Fnacimiento,LocalDate.now());
        System.out.println(cumpleaños.getDays()+" dias "+cumpleaños.getMonths()+" meses");

        LocalDate Fnacimiento2= LocalDate.of(1981,Month.SEPTEMBER,16);

        boolean mayor= Fnacimiento2.isBefore(Fnacimiento);
        System.out.println("¿Mi madre es mayor que yo?-->"+mayor);


    }
}

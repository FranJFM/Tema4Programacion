import java.time.LocalDate;
import java.time.Period;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import lombok.*;
public class ClaseInformatca {

    public enum Aulas{
        Aula1,
        Aula2,
        Aula3;
    }


    public enum Grupos{
        Grupo1,
        Grupo2,
        Grupo3;
    }

    @Getter
    @Setter
    @AllArgsConstructor

public static class Estudiante{
    private String nombreEstudiante;
    private String apellidosEstudiante;
    private LocalDate fechaNacimiento;
    private String dni;
    private Grupos grupos;
        @Override
        public String toString() {
            StringBuilder builder = new StringBuilder();
            builder.append("Estudiante [nombreEstudiante=").append(nombreEstudiante).append(", apellidosEstudiante=").append(apellidosEstudiante).append(", fechaNacimiento=").append(fechaNacimiento).append(", dni=").append(dni).append(", grupos=").append(grupos).append("]");
            return builder.toString();
        }
}

public static boolean MayorEdad(Estudiante estudiante) {
        return Period.between(estudiante.getFechaNacimiento(), LocalDate.now()).getYears() >= 18;
}

    @AllArgsConstructor
public static class claseInformatca{
        private Aulas aulas;
        private Grupos  grupos;
        static Set<Estudiante> estudiantes = new HashSet<>() ;

        public static String EstudianteporDni(String DNI){
            for (Estudiante estudiante : estudiantes) {
                if (estudiante.getDni().equals(DNI)) {
                    return estudiante.getNombreEstudiante();
                }
            }
            return null;
        }
        public static String menoresEdad(Estudiante estudiante) {
            if(MayorEdad(estudiante)==false) {
                return "Es menor de edad";
            }else
                return "Es mayor de edad";

        }






        public static String EstudiantesCumplenEdad(Estudiante estudiante) {
            LocalDate FechaHoy= LocalDate.now();
            int Dia=FechaHoy.getDayOfMonth();
            int Mes=FechaHoy.getMonthValue();

            int cumDia= estudiante.getFechaNacimiento().getDayOfMonth();
            int cumMes= estudiante.getFechaNacimiento().getMonthValue();
            if(cumDia == Dia && cumMes== Mes){
                return "!Es tu cumpleaños!";
            }else
                return "No es tu cumpleaños :(";
        }
        public static void eliminarEstudiantesporDni(Estudiante estudiante){
            Scanner sc= new Scanner(System.in);

            System.out.println("Ingrese el DNI del estudiante que desea eliminar: ");
            String DNIe=sc.nextLine();

            if(estudiante.getDni().equals(DNIe)){
                estudiantes.remove(estudiante);
                System.out.println("Estudiante eliminado");

            }

            System.out.println(estudiantes);

        }


    }

    public static void main(String[] args) {
        Estudiante est= new Estudiante("Manuel","Fuentes",LocalDate.of(2005,2,11),"26532484Y", Grupos.Grupo1);
        System.out.println(est);
        claseInformatca.estudiantes.add(est);
        System.out.println("El estudiante con DNI(26532484Y) es: "+claseInformatca.EstudianteporDni("26532484Y"));
        System.out.println("¿El alumno es menor o mayor de edad?"  + claseInformatca.menoresEdad(est));
        System.out.println("¿Es el cumpleaños del alumno? " + claseInformatca.EstudiantesCumplenEdad(est));
        claseInformatca.eliminarEstudiantesporDni(est);



    }

}

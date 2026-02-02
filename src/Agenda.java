import lombok.*;
import java.util.*;


public class Agenda {
    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    static class Contacto{
        private String NombreContacto;
        private String NumeroTelefono;

        @Override
        public String toString(){
            return "Nombre: "+ getNombreContacto() + "\nTelefono: "+ getNumeroTelefono();
        }
    }
    class Agendaaa{
        private String NombreAgenda;

    }
    public static void main(String[] args) {
        Contacto c1= new Contacto();
        System.out.print(c1.toString());

    }
}

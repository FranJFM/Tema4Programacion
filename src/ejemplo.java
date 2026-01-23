public class ejemplo {


     public static class Fecha {
        private int dia;
        private int mes;
        private int anno;

        public int getDia() {
            return dia;
        }
        public void setDia(int valor) {
            dia = valor;
        }
        public int getMes() {
            return mes;

        }
        public void setMes(int valor) {
            mes = valor;
        }



    }


    public static void main(String[] args) {
        Fecha f = new Fecha();
        f.dia = 23;
        f.mes = 12;
        f.anno = 2001;
        System.out.println("Día: " + f.dia + " " + "Mes: " + f.mes + " "+ "Año: " + f.anno);
    }
}

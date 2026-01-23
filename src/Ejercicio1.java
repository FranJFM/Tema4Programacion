import java.util.*;


public class Ejercicio1 {





    public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);

                System.out.print("Introduce el radio: ");
                double radio = sc.nextDouble();

                System.out.print("Introduce la altura: ");
                double altura = sc.nextDouble();

                Cilindro c = new Cilindro(radio, altura);

                System.out.println("Radio: " + c.getRadio());
                System.out.println("Altura: " + c.getAltura());

                System.out.println("elvalor de esto es " + c.toString());


    }









}











class Cilindro {
    private double radio;
    private double altura;

    public Cilindro(double radio, double altura) {
        this.radio = radio;
        this.altura = altura;
    }

    public double getRadio() {
        return radio;
    }

    public double getAltura() {
        return altura;
    }
    public  static double areaLateral(double radio, double altura){
        double pi=3.14;
        double arealateral;
        arealateral=2*pi*radio*altura;
        return arealateral;

    }
    public  static double areaBase(double radio){
        double pi=3.14;
        double areaBase;
        areaBase=pi*(radio*radio);
        return areaBase;

    }
    public static double areaTotal(double areaLateral,double areaBase){
        double pi=3.14;
        double areaTotal;
        areaTotal=areaLateral+(2*areaBase);
        return areaTotal;
    }
    public static double volumen(double radio, double altura){
        double pi=3.14;
        double volumen;
        volumen=pi*(radio*radio)*altura;
        return volumen;

    }
    @Override
    public String toString(){
        return "Cilindro [radio=" + radio + ", altura=" + altura + "], el área ["+ areaTotal(radio, altura)+"]"+ "y el volumen es ["+volumen(radio, altura)+"]"  ;
    }
    }
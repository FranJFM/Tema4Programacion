import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



public class Ejercicio2 {



    @Test
    public void test1(){
        TrianguloRectangulo tr= new TrianguloRectangulo(2.5,4.6);
        double valorEsperado=4.0;
        double valorActual=tr.Hipotenusa();

        assertEquals(valorActual,valorEsperado);
    }
    public static void main(String[] args) {
        TrianguloRectangulo tr= new TrianguloRectangulo(2.5,4.6);
        System.out.println("Los catetos son: " +tr.cateto1()+" "+tr.cateto2());
        System.out.println("La hipotenusa del triangulo es: " +tr.Hipotenusa());
        System.out.println("El perímetro del triangulo es: " +tr.perimetro());


    }




}

record TrianguloRectangulo(double cateto1,double cateto2) {
    public double Hipotenusa(){
        double cuadrado= cateto1*cateto1;
        double cuadrado2= cateto2*cateto2;

        double suma= cuadrado+cuadrado2;

        double raiz= Math.sqrt(suma);


        return raiz;


    }
    public double perimetro(){
        double cuadrado= cateto1*cateto1;
        double cuadrado2= cateto2*cateto2;
        double suma= cuadrado+cuadrado2;
        double raiz= Math.sqrt(suma);
        double area= cuadrado+cuadrado2+raiz;
        return area;


    }


}






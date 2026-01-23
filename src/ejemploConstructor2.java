public class ejemploConstructor2 {

    public static void main(String[] args) {


        Numero1 numero1 =new Numero1();
        Numero1 numero2 =new Numero1(1);
        System.out.println(numero1.getValor());
        System.out.println(numero2.getValor());
    }

}
class Numero1 {

    private int valor;
    public Numero1() {
        this.valor = 5;

    }
    public Numero1(int valor) {
        this.valor = valor;
    }
    public int getValor() {
        return valor;
    }

}
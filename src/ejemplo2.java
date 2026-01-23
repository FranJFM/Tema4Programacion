public class ejemplo2 {

    public static void main(String[] args) {

        System.out.println("Suma : " + suma(1));
        System.out.println("Suma : " + suma(1,2));
        System.out.println("Suma : " + suma(1,2,3));
    }


    public static int suma(int... args) {
        int suma = 0;

        for (int i = 0; i < args.length; i++) {
            suma += args[i];
        }
        return suma;
    }
}


public class ejemploRecord {

    public static void main(String[] args) {

        Person p1=new Person(1, "Sasuke");
        Person p2=new Person(2, "Naruto");

        System.out.println("El valor de p1 y p2?");
        System.out.println(p1.toString());

        System.out.println("¿Son iguales p1 y p2?");
        System.out.println(p1.equals(p2));

        System.out.println("¿Cual es el nombre de p1?");
        System.out.println(p1.name());;

    }
}

record Person(int id, String name) {

}

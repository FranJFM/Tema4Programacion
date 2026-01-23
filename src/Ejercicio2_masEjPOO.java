import java.util.*;
public class Ejercicio2_masEjPOO {


    public static void main(String[]args){
        Account cuenta= new Account();
        System.out.println("Su id es: " + cuenta.IngresarId());
        System.out.println("Su balance actual es: " + cuenta.getBalance());

        cuenta.setBalance(cuenta.deposit(cuenta.getBalance()));


        System.out.println(cuenta.getMonthlyInterestRate(cuenta.getBalance()));


        System.out.println(cuenta.withdraw(cuenta.getBalance()));






    }

static class Account{
        private int id;
        private double balance;
        private double annualInteresRate;
        private Date DateCreated;


    Account() {
        this.annualInteresRate = annualInteresRate;
        this.balance=balance;
        this.id=id;
    }
    Account(int id, double balance) {
        this.id =0;
        this.balance =0;

    }

    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;

    }
    public double getAnnualInteresRate() {
        return annualInteresRate;
    }
    public void setAnnualInteresRate(double annualInteresRate) {
        this.annualInteresRate = 4.5;
    }
    public Date getDateCreated() {
        return DateCreated;
    }
    public void setDateCreated(Date DateCreated) {
        this.DateCreated = DateCreated;

    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }



    public double getMonthlyInterestRate(double balance){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el valor del ratio: ");
        double rate = sc.nextDouble();
        double interest = balance * (1+(rate/100));
        return interest;
    }
    public int IngresarId(){
        Scanner sc = new Scanner(System.in);
        int id = 0;
        System.out.println("Ingrese el numero de identificacion: ");
        id = sc.nextInt();
        return id;
    }
    public double withdraw(double balance){
        Scanner sc = new Scanner(System.in);
        System.out.println("El balance actual es: " +balance+"$");
        System.out.println("Ingrese la cantidad que desea retirar: ");
        double cantidad = sc.nextDouble();
        double resta=balance-cantidad;
        balance =resta;
        System.out.println("Su ceunta ahora tiene un balance de: " +balance+"$");
        return balance;
    }
    public double deposit(double balance){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la cantidad que desea ingresar: ");
        double cantidad = sc.nextDouble();
        double suma=cantidad+balance;
        balance=suma;
        System.out.println("Su balance ahora es de : " +balance+"$");

        return balance;
    }



}
}

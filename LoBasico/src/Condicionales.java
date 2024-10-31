import java.util.Scanner;

public class Condicionales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero mayor a 10: ");
        int a = scanner.nextInt();
        /*if (condicion){
            se ejecuta si la condicion se cumple
        }*/
        if (a > 10){
            System.out.println("El numero ingresado es mayor a 10");
        }else {
            System.out.println("El numero ingresado es menor a 10");
        }
        System.out.println("Sali del if");
        System.out.println(a +" / 2 = " + (a/2));
        System.out.println(a +" MOD 2 = " + (a%2));
        if ((a%2) == 0){
            System.out.println("El numero ingresado es par");
        }else {
            System.out.println("El numero ingresado es inpar");
        }
    }
}

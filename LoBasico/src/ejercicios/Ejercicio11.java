package ejercicios;

public class Ejercicio11 {
    public static void main(String[] args) {
        //Intercambiar los valores de A y B utilizando una variable auxiliar.
        int a = 10;
        int b = 20;
        System.out.println("El valor de a: "+ a);
        System.out.println("El valor de b: "+ b);
        int auxiliar;
        auxiliar = a;
        a = b;
        b = auxiliar;
        System.out.println("------------ Despues del cambia de variable -------------");
        System.out.println("El valor de a: "+ a);
        System.out.println("El valor de b: "+ b);
    }
}

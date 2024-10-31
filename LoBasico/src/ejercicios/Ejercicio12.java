package ejercicios;

public class Ejercicio12 {
    public static void main(String[] args) {
        /*Escribir las instrucciones necesarias para intercambiar entre si los valores de 3 variables:
            B toma el valor de A
            C toma el valor de B
            A toma el valor de C
        Nota. Sólo se debe utilizar una variable auxiliar. */
        // antes del cambio
        int a = 10;
        int b = 20;
        int c = 30;
        System.out.println("El valor de a: "+ a);
        System.out.println("El valor de b: "+ b);
        System.out.println("El valor de c: "+ c);
        //despues del cambio
        int auxiliar = b;
        b = a;
        a = c;
        c = auxiliar;
        System.out.println("El valor de a: "+ a);
        System.out.println("El valor de b: "+ b);
        System.out.println("El valor de c: "+ c);
    }
}
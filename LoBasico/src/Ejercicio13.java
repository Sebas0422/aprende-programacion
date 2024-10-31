public class Ejercicio13 {
    //Intercambiar los valores de A y B sin utilizar una variable auxiliar.
    public static void main(String[] args) {
        //antes del cambio
        int a = 50;
        int b = 200;
        System.out.println("el valor de a es:" + a);
        System.out.println("el valor de b es:" + b);
        //despues del cambio
        a = a * a / b;
        b = a + a;
        a = b + b;
        System.out.println("el valor de a es:" + a);
        System.out.println("el valor de b es:" + b);


    }
}

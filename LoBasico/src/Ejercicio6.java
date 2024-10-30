public class Ejercicio6 {
    // ¿Cuáles son los valores de a, b y c después de las siguientes operaciones?
    public static void main(String[] args) {
        int a1 = 3;
        int b1 = 4;
        int dos = 2;
        int c1 = a1 + dos * b1;
        int c2 = c1 + b1;
        int b2 = c2 - a1;
        int a2 = b2 * c2;
        System.out.println("el valor de a:" + a1);
        System.out.println("el valor de b1:" + b1);
        System.out.println("el valor de c1:" + c1);
        System.out.println("el valor de c2:" + c2);
        System.out.println("el valor de b2:" + b2);
        System.out.println("el valor de a2:" + a2);
    }
}


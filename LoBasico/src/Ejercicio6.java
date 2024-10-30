public class Ejercicio6 {
    // ¿Cuáles son los valores de a, b y c después de las siguientes operaciones?
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int dos = 2;
        int c = a + dos * b;
        c = c + b;
        b = c - a;
        a = b * c;
        System.out.println("el valor de a:" + a);
        System.out.println("el valor de b:" + b);
        System.out.println("el valor de c:" + c);
    }
}


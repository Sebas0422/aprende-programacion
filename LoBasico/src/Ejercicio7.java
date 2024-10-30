public class Ejercicio7 {
    //Cuál es el valor de x después de las siguientes operaciones?
    public static void main(String[] args) {
        int x1 = 2;
        int cuadrado1 = (x1 * x1)*(x1 * x1);
        int x2 = cuadrado1;
        int cuadrado2 = (x2 + (x2 * x2) + 5) * ( x2 + (x2 * x2) + 5);
        int x3 = cuadrado2;
        System.out.println("el valor de x1:" + x1);
        System.out.println("el valor de x2:" + x2);
        System.out.println("el valor de x3:" + x3);
    }
}

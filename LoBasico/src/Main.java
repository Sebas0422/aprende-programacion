import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String nombre = "Sebastian";
        Persona persona = new Persona(15,nombre, "Catedo Ribera");
        int a = 10; //10
        double b = 10.00;//10.00
        boolean c = false;//0<-- false, 1<-- true
        char letra = 'H';
        String texto = "Hello World!";// "Hola wordl!"
        System.out.println(a);
        persona.Saludar("Dinmy");
        int suma = sumar(10,10);
        System.out.println(suma);
        System.out.println(texto+(a+b));
    }

    public static int sumar(int a, int b){
        int resultado = a + b;
        return resultado;
    }
}
package lecturaDatos;

import java.util.Scanner;

public class LecturaDatos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        double decimal;
        System.out.println("Ingrese un numero: ");
        String auxiliar = scanner.nextLine();
        //a = scanner.nextInt();
        decimal = Double.parseDouble(auxiliar);
        a = (int) Math.round(decimal);
        System.out.println("El numero ingresado es: "+ a);
        System.out.println("El numero ingresado es: "+ decimal);
        boolean bool = scanner.nextBoolean();
        System.out.println("Esto es: "+ bool);
    }
}

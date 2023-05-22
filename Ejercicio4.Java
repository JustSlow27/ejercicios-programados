import java.util.Scanner;
public class EjercicioCuatro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        double num1 = sc.nextDouble();
        System.out.println("Ingrese el segundo numero: ");
        double num2 = sc.nextDouble();
        System.out.println("La suma de los numeros es: " + (num1 + num2));
        System.out.println("La resta de los numeros es: " + (num1 - num2));
        System.out.println("La multiplicacion de los numeros es: " + (num1 * num2));
        System.out.println("La division de los numeros es: " + (num1 / num2));
    }
}
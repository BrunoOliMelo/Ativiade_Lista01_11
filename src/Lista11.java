import java.util.Scanner;

public class Lista11 {
    public static void main(String[] args) {
        int num1, num2;
        double num3, resultado1, resultado2, resultado3;
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("Esvreva o primeiro número:");
        num1 = teclado.nextInt();
        System.out.println("Esvreva o segundo número:");
        num2 = teclado.nextInt();
        System.out.println("Esvreva o terceiro número:");
        num3 = teclado.nextDouble();

        resultado1 = (2 * num1) + (num2 / 2.0);
        resultado2 = (3 * num1) + num3;
        resultado3 = Math.pow(num3, 3);

        System.out.println("A." + resultado1);
        System.out.println("B." + resultado2);
        System.out.println("C." + resultado3);
  
        teclado.close();
    }
}

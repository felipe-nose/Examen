import java.util.Scanner;

public class Examen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero1, numero2;

        System.out.print("Ingrese un numero ");
        numero1 = scanner.nextInt();
        System.out.print("Ingrese un numero ");
        numero2 = scanner.nextInt();

        if (numero1 % numero2 == 0) {
            System.out.println(numero1 + " es multiplo de " + numero2);
        }
        else {
            if (numero2 % numero1 == 0) {
                System.out.println(numero2+" es multiplo de "+numero1);
            }
            else{
                System.out.println("no hay multiplos entre el primero y segundo numero");
            }
        }

}
}
import java.util.Scanner;

public class exx003 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = leitor.nextInt();

        System.out.println("Digite outro número: ");
        int numero2 = leitor.nextInt();

        if (numero > numero2) {
            System.out.println("O número: " + numero + " é maior!");
        } else if (numero < numero2) {
            System.out.println("O número: " + numero2 + " é maior!");
        } else {
            System.out.println("Os número são iguais!");
        }
    }
}
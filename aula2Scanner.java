import java.util.Scanner;

public class aula2Scanner {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um texto: ");
        String texto = leitor.nextLine();
        System.out.println("Texto digitado: " + texto);

        System.out.println("Digite um número: ");
        int numero = leitor.nextInt();
        System.out.println("Número digitado: " + numero);
    }
}
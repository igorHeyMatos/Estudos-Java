import java.util.Scanner;

public class exx002 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um valor em real: ");
        float real = leitor.nextFloat();

        float dolar = 5.17f;
        float euro = 6.14f;
        float peso = 0.05f;

        System.out.println("Real: " + real + "\nDólar: " + real / dolar + "\nEuro: " + real / euro + "\nPeso: " + real / peso);
    }
}
import java.util.Scanner;

public class exx001 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a altura do retangulo: ");
        float altura = leitor.nextFloat();

        System.out.println("Digite a largura do retangulo: ");
        float largura = leitor.nextFloat();

        float area = altura * largura;

        System.out.println("Area total: " + area);
    }
}
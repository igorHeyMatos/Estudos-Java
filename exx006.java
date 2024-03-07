import java.util.Scanner;

public class exx006 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        float[] vet = new float[2];

        for (int i = 0; i < 2; i++) {
            System.out.println("Vetor " + i);
            System.out.println("Digite a altura: ");
            float altura = leitor.nextFloat();
            System.out.println("Digite a largura: ");
            float largura = leitor.nextFloat();
            float area = altura * largura;
            vet[i] = area;
        }

        for (int i = 0; i < 2; i++) {
            System.out.println("Vetor " + i);
            System.out.println("Area: " + vet[i]);
        }
    }
}
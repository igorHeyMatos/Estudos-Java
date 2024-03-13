import java.util.Scanner;

public class exx007 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o nome do aluno: ");
        String nomeAluno = leitor.nextLine();

        System.out.println("Digite a matricula do aluno: ");
        String matricula = leitor.nextLine();

        float[] nota = new float[5];

        for (int i = 0; i < 5; i++) {
            do {
                System.out.println("Digite a nota " + (i + 1) + " do aluno: ");
                nota[i] = leitor.nextFloat();
            } while (nota[i] < 0 || nota[i] > 10);
        }

        System.out.println("Aluno: " + nomeAluno);
        System.out.println("Matricula: " + matricula);
        for (int i = 0; i < 5; i++) {
            System.out.println("Nota " + (i + 1) + ":" + nota[i]);
        }
    }
}
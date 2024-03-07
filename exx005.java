import java.util.Scanner;

public class exx005 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o número da matricula: ");
        int matricula = leitor.nextInt();
        leitor.nextLine();

        System.out.println("Digite o nome do aluno: ");
        String nome = leitor.nextLine();

        System.out.println("Digite a nota 1 do aluno: ");
        float nota1 = leitor.nextFloat();

        System.out.println("Digite a nota 2 do aluno: ");
        float nota2 = leitor.nextFloat();

        float notaFinal = (nota1 + nota2) / 2;

        System.out.println("<---------------->");
        System.out.println("Matricula: " + matricula);
        System.out.println("Nome: " + nome);
        if (notaFinal >= 6) {
            System.out.println("Aprovado ( X ) Reprovado (   )");
        } else {
            System.out.println("Aprovado (   ) Reprovado ( X )");
        }
        System.out.println("Nota final: " + notaFinal);

        leitor.close();
    }
}
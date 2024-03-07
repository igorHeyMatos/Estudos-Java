import java.util.Scanner;

public class exx006 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a quantidade de alunos: ");
        int qtd_alunos = leitor.nextInt();

        int[] matriculaAluno = new int[qtd_alunos];
        String[] nomeAluno = new String[qtd_alunos];
        float[] notaFinalAluno = new float[qtd_alunos];

        for (int i = 0; i < qtd_alunos; i++) {
            System.out.println("Digite o número de matricula: ");
            int matricula = leitor.nextInt();
            matriculaAluno[i] = matricula;
            leitor.nextLine();

            System.out.println("Digite o nome do aluno: ");
            String nome = leitor.nextLine();
            nomeAluno[i] = nome;

            System.out.println("Digite a nota 1 do aluno: ");
            float nota1 = leitor.nextFloat();

            System.out.println("Digite a nota 2 do aluno: ");
            float nota2 = leitor.nextFloat();

            float notaFinal = (nota1 + nota2) / 2;

            notaFinalAluno[i] = notaFinal;
        }

        for (int i = 0; i < qtd_alunos; i++) {

            System.out.println("<------------>");

            System.out.println("Matricula: " + matriculaAluno[i]);

            System.out.println("Aluno: " + nomeAluno[i]);

            if (notaFinalAluno[i] >= 6) {
                System.out.println("Aprovado ( X ) Reprovado (   )");
            } else {
                System.out.println("Aprovado (   ) Reprovado ( X )");
            }

            System.out.println("Nota final: " + notaFinalAluno[i]);

        }

        leitor.close();
    }
}
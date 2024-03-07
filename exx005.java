import java.util.Scanner;

public class exx005 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int[] mat = new int[5];
        float[] notaFinal = new float[5];

        for (int i = 0; i < 1; i++) {
            for (int c = 0; c < 2; c++) {
                System.out.println("Digite o numero da matricula: ");
                int matricula = leitor.nextInt();
                mat[c] = matricula;
                System.out.println("Digite a nota do aluno: ");
                float nota = leitor.nextFloat();
                notaFinal[c] = nota;
            }
        }

        for (int i = 0; i < 1; i++) {
            for (int c = 0; c < 2; c++) {
                System.out.println("Matricula: " + mat[c]);
                System.out.println("Situação: ");
                if (notaFinal[c] > 6) {
                    System.out.println("Aprovado ( X ) Reprovado (  )");
                } else {
                    System.out.println("Aprovado (  ) Reprovado ( X )");
                }
                System.out.println("Nota final: " + notaFinal[c]);
            }
        }
    }
}
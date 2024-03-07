import java.util.Scanner;

public class exx004 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = leitor.nextInt();

        if (idade > 0 && idade <= 13) {
            System.out.println("Criança : " + idade + " anos.");
        } else if (idade > 13 && idade <= 18) {
            System.out.println("Adolescente : " + idade + " anos.");
        } else if (idade > 18 && idade <= 60) {
            System.out.println("Adulto : " + idade + " anos.");
        } else if (idade > 60 && idade < 110) {
            System.out.println("Idoso : " + idade + " anos.");
        } else if (idade > 110 || idade < 1) {
            System.out.println("ERRO!!!");
        }

        leitor.close();
    }
}
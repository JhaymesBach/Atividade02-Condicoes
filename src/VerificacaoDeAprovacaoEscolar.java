import java.util.Scanner;

public class VerificacaoAprovacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a média final do aluno: ");
        double mediaFinal = scanner.nextDouble();
        
        if (mediaFinal >= 7) {

            System.out.println("O aluno está Aprovado.");
        } else if (mediaFinal >= 5) {

            System.out.println("O aluno está em Recuperação.");
        } else {

            System.out.println("O aluno está Reprovado.");
        }
        
        scanner.close();
    }
}

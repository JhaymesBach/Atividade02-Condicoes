import java.util.Scanner;

public class VerificacaoLogin {
    public static void main(String[] args) {
        String nomeUsuarioCorreto = "Calleri";
        String senhaCorreta = "9090";
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o nome de usuário: ");
        String nomeUsuarioInserido = scanner.nextLine();
        
        System.out.print("Digite a senha: ");
        String senhaInserida = scanner.nextLine();
        
        if (nomeUsuarioCorreto.equals(nomeUsuarioInserido) && senhaCorreta.equals(senhaInserida)) {

            System.out.println("Login bem-sucedido!");
        } else {
            System.out.println("Nome de usuário ou senha incorretos.");
        }
        
        scanner.close();
    }
}

import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();
        
        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();
        
        System.out.print("Digite a operação desejada (+, -, *, /): ");
        char operacao = scanner.next().charAt(0);
        
        double resultado;
        switch (operacao) {
            case '+':
                resultado = numero1 + numero2;
                System.out.println("Resultado: " + resultado);
                break;
            case '-':
                resultado = numero1 - numero2;
                System.out.println("Resultado: " + resultado);
                break;
            case '*':
                resultado = numero1 * numero2;
                System.out.println("Resultado: " + resultado);
                break;
            case '/':

                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                    System.out.println("Resultado: " + resultado);
                } else {
                    System.out.println("Erro: Divisão por zero não permitida.");
                }
                break;
            default:

                System.out.println("Operação inválida. Use +, -, * ou /.");
                break;
        }
        
        scanner.close();
    }
}

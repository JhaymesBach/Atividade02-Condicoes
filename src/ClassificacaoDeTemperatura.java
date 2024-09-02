import java.util.Scanner;

public class ClassificacaoTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a temperatura em graus Celsius: ");
        double temperatura = scanner.nextDouble();
        
        if (temperatura > 30) {
            System.out.println("Classificação: Quente");
        } else if (temperatura >= 15) {
            System.out.println("Classificação: Agradável");
        } else {
            System.out.println("Classificação: Frio");
        }
        
        scanner.close();
    }
}

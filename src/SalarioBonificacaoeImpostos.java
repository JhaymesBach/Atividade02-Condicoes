import java.util.Scanner;

public class CalculadoraSalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o salário bruto do funcionário: R$ ");
        double salarioBruto = scanner.nextDouble();
        
        System.out.print("Digite o número de anos que o funcionário trabalhou na empresa: ");
        int anosTrabalhados = scanner.nextInt();
        
        double bonus = 0;
        double percentualImposto = 0;
        double impostoDescontado;
        double salarioLiquido;
        
        if (anosTrabalhados > 10) {
            bonus = salarioBruto * 0.10; 
        } else if (anosTrabalhados >= 5) {
            bonus = salarioBruto * 0.05; 
        } else {
            bonus = 0; 
        }
        
        if (salarioBruto > 5000) {
            percentualImposto = 27; 
        } else if (salarioBruto >= 3000) {
            percentualImposto = 18; 
        } else {
            percentualImposto = 10; 
        }
        
        impostoDescontado = salarioBruto * percentualImposto / 100;
        salarioLiquido = salarioBruto + bonus - impostoDescontado;
        
        System.out.println("Salário Bruto: R$ " + String.format("%.2f", salarioBruto));
        System.out.println("Bônus recebido: R$ " + String.format("%.2f", bonus));
        System.out.println("Imposto descontado: R$ " + String.format("%.2f", impostoDescontado));
        System.out.println("Salário Líquido: R$ " + String.format("%.2f", salarioLiquido));
        
        scanner.close();
    }
}

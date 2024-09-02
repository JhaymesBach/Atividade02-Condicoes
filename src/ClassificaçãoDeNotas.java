public class ClassificacaoNota {

public static void main(String[] args) {

double nota = 8.5;

String classificacao;

if (nota >= 9) {
    classificacao = "Excelente";
}   else if (nota >= 7) {
    classificacao = "Bom";
}   else if (nota >= 5){
    classificacao = "Satisfatorio";
}   else if (nota < 5) {
    classificacao = "Insatisfatorio";
}

System.out.println ("Classificacao: " + classificacao);

}

}
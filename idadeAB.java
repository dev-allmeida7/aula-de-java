public class idadeAB
{
    public static void main (String[] args) {
    int idadeA = 15;
    int idadeB = 15;
    
    boolean mesmaIdade = idadeA == idadeB;
    boolean maiorQue18 = idadeA > 18;
    
    boolean primeiraComparacao = mesmaIdade && maiorQue18;
    
    boolean idadesDiferentes = idadeA != idadeB;
    boolean menorQue12 = idadeB < 12;
    
    boolean segundaComparacao = idadesDiferentes && menorQue12;
    }
}

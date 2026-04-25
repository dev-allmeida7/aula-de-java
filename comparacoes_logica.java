public class Main
{
    public static void main (String[] args) {
    boolean estaChovendo = true;
    boolean estaRelampejando = true;
    boolean naoVouSairDeCasa = estaRelampejando && estaChovendo;
    
    boolean temMacarrao = false;
    boolean temEstrogonofe = false;
    boolean estouFeliz = estaRelampejando || temEstrogonofe;
    }
}

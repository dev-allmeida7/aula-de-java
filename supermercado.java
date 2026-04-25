import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double prab = 7.30;
		double prma = 2.00;
		double prpe = 3.00;

		System.out.print("Insira a quantidade de abacaxis: ");
		int quantidade_abacaxi = scanner.nextInt ();
		System.out.print("Insira a quantidade de maçãs: ");
		int quantidade_maca = scanner.nextInt ();
		System.out.print("Insira a quantidade de pêras: ");
		int quantidade_pera = scanner.nextInt ();
		double resultado = (quantidade_abacaxi * prab) + (quantidade_pera * prpe) + (quantidade_maca + prma);
		System.out.println("O valor total foi de: R$" + resultado);
	}
}
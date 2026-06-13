import java.util.Scanner;
public class arranjo
{
	public static void main(String[] args) {
		System.out.print("Coloque sua sequência de números: ");
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int arranjo[] = new int[N];

		for (int i = 0; i < arranjo.length; i++) {
			arranjo[i] = sc.nextInt();
		}

		for (int numero: arranjo) {
			System.out.print(numero + " ");
		}
	}
}
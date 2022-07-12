import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double totalA = 0, totalB = 0;

		System.out.print("Diga a quantidade de livros que deseja comprar: ");
		int quant = sc.nextInt();

		totalA = (quant * 0.25) + 7.50;
		totalB = (quant * 0.5) + 2.5;

		if (totalA > totalB) {
			System.out.println("O critério B vale mais a pena!");
		} else if (totalB > totalA) {
			System.out.println("O critério A vale mais a pena!");
		} else {
			System.out.println("Ambos darão o mesmo preço!");
		}

		sc.close();
	}

}

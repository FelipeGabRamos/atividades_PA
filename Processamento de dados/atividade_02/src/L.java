import java.util.Scanner;

public class L {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double custo, ingresso, valer;
		
		System.out.println("Diga o custo total do teatro: ");
		custo = sc.nextDouble();
		
		System.out.println("Diga o custo do ingresso");
		ingresso = sc.nextDouble();
		
		valer = custo/ingresso;
		
		System.out.println("Você deve vender "+valer+" para valer.");
		
		
		sc.close();
	}

}

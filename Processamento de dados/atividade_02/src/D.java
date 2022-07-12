import java.util.Scanner;

public class D {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double preco, desconto;
		
		System.out.println("Diga o preço do produto");
		preco = sc.nextDouble();
		
		desconto = preco*0.9;
		System.out.println("O preço com o desconto é: "+desconto);
		sc.close();
	}

}

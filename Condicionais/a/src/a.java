import java.util.Scanner;

public class a {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num;
		
		System.out.print("Diga um número: ");
		num = sc.nextDouble();
		
		System.out.println("Número ao quadrado: "+Math.pow(num, 2));
		System.out.println("Número ao cubo: "+Math.pow(num, 3));
		System.out.println("raiz quadrática: "+Math.sqrt(num));
		System.out.println("raiz cúbica: "+Math.cbrt(num));
		sc.close();
	}

}

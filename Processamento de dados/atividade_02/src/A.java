import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a, b;
		
		System.out.println("Diga o primeiro n�mero: ");
		a = sc.nextDouble();
		System.out.println("Diga o segundo n�mero: ");
		b = sc.nextDouble();
		
		System.out.println("A subtra��o do primeiro pelo segundo �: "+(a-b));
		
		
		sc.close();
	}

}

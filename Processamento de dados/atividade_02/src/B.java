import java.util.Scanner;

public class B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a, b, c;
		
		System.out.println("Diga o primeiro n�mero: ");
		a = sc.nextDouble();
		System.out.println("Diga o segundo n�mero: ");
		b = sc.nextDouble();
		System.out.println("Diga o terceiro n�mero: ");
		c = sc.nextDouble();
		
		System.out.println("A multiplica��o dos n�meros �: "+(a*b*c));
		
		
		
		sc.close();
	}
}

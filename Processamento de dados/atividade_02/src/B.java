import java.util.Scanner;

public class B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a, b, c;
		
		System.out.println("Diga o primeiro número: ");
		a = sc.nextDouble();
		System.out.println("Diga o segundo número: ");
		b = sc.nextDouble();
		System.out.println("Diga o terceiro número: ");
		c = sc.nextDouble();
		
		System.out.println("A multiplicação dos números é: "+(a*b*c));
		
		
		
		sc.close();
	}
}

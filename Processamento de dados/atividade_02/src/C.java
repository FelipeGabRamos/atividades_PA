import java.util.Scanner;

public class C {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a, b;
		
		System.out.println("Diga o primeiro número diferente de zero: ");
		a = sc.nextDouble();
		System.out.println("Diga o segundo número: ");
		b = sc.nextDouble();
		
		System.out.println("A divisão do primeiro pelo segundo é: "+(a/b));
		
		sc.close();
	}

}

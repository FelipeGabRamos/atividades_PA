import java.util.Scanner;

public class a {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num;
		
		System.out.print("Diga um n�mero: ");
		num = sc.nextDouble();
		
		System.out.println("N�mero ao quadrado: "+Math.pow(num, 2));
		System.out.println("N�mero ao cubo: "+Math.pow(num, 3));
		System.out.println("raiz quadr�tica: "+Math.sqrt(num));
		System.out.println("raiz c�bica: "+Math.cbrt(num));
		sc.close();
	}

}

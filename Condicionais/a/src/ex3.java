import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num1, num2;
		
		System.out.println("Diga o primeiro n�mero: ");
		num1 = sc.nextDouble();
		System.out.println("Diga o segundo n�mero: ");
		num2 = sc.nextDouble();
		
		if(num1>num2) {
			System.out.println("O primeiro n�mero � maior!");
		}else {
			System.out.println("O segundo n�mero � maior!");
		}
		
		sc.close();
	}

}

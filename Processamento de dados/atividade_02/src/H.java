import java.util.Scanner;

public class H {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double salario, salarioF, multa;
		
		System.out.println("Diga o sal�rio de Jo�o: ");
		salario = sc.nextDouble();
		
		multa = salario*0.02;
		
		salarioF = salario - multa;
		
		System.out.println(salarioF);
		
		
		sc.close();
	}

}

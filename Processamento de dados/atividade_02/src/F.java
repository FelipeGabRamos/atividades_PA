import java.util.Scanner;

public class F {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double salarioM, salarioF;
		double qntd;
		
		System.out.println("Informe o salário mínimo: ");
		salarioM = sc.nextDouble();
		
		System.out.println("Informe o salário do funcionário: ");
		salarioF = sc.nextDouble();
		
		qntd = salarioF/salarioM;
		
		System.out.println("O funcionário recebe: "+qntd+" de salários mínimos.");
		sc.close();

	}

}

import java.util.Scanner;

public class F {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double salarioM, salarioF;
		double qntd;
		
		System.out.println("Informe o sal�rio m�nimo: ");
		salarioM = sc.nextDouble();
		
		System.out.println("Informe o sal�rio do funcion�rio: ");
		salarioF = sc.nextDouble();
		
		qntd = salarioF/salarioM;
		
		System.out.println("O funcion�rio recebe: "+qntd+" de sal�rios m�nimos.");
		sc.close();

	}

}

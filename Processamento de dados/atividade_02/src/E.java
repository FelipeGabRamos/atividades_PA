import java.util.Scanner;

public class E {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double salario, salarioF, vendas, comissao;
		
		System.out.println("Diga seu sal�rio: ");
		salario = sc.nextDouble();
		
		System.out.println("Informe o valor de suas vendas: ");
		vendas = sc.nextDouble();
		
		comissao = vendas*0.04;
		salarioF = salario+comissao;
		
		System.out.println("Seu sal�rio final �: "+salarioF);
		sc.close();
	}

}

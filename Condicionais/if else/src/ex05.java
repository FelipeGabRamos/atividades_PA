import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cod;
		double salario, salarioF;
		System.out.print("Diga o seu c�digo: ");
		cod = sc.nextInt();
		System.out.print("Diga seu sal�rio atual: ");
		salario = sc.nextDouble();
		if(cod == 1) {
			System.out.println("Seu cargo: Escritu�rio");
			salarioF = salario*0.5;
			System.out.println("Seu salario atual: "+salario);
			System.out.println("Seu salario p�s aumento: "+(salarioF+salario));
		}else if(cod == 2) {
			System.out.println("Seu cargo: Secret�rio");
			salarioF = salario*0.35;
			System.out.println("Seu salario atual: "+salario);
			System.out.println("Seu salario p�s aumento: "+(salarioF+salario));
		}else if(cod == 3) {
			System.out.println("Seu cargo: Caixa");
			salarioF = salario*0.2;
			System.out.println("Seu salario atual: "+salario);
			System.out.println("Seu salario p�s aumento: "+(salarioF+salario));
		}else if(cod == 4) {
			System.out.println("Seu cargo: Gerente");
			salarioF = salario*0.1;
			System.out.println("Seu salario atual: "+salario);
			System.out.println("Seu salario p�s aumento: "+(salarioF+salario));
		}else if(cod == 5) {
			System.out.println("Seu cargo: Diretor");
			System.out.println("Seu salario atual: "+salario);
			System.out.println("Seu salario p�s aumento: (n�o possui aumento) "+salario);
		}else {
			System.out.println("C�digo n�o encontrado!");
		}
		sc.close();
	}

}

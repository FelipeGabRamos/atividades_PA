import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int op;
		double salario, imposto;
		System.out.print("-- Menu de op��es: --\n\n1. Imposto\n2. Novo Sal�rio\n3. Classifica��o\n\nDigite a op��o desejada: ");
		op = sc.nextInt();
		if(op == 1) {
			System.out.println("Digite seu sal�rio: ");
			salario = sc.nextDouble();
			if(salario<500) {
				imposto = salario*0.05;
				System.out.println("O valor do imposto �: "+imposto);
			}else if(salario>=500 && salario <=850) {
				imposto = salario*0.10;
				System.out.println("O valor do imposto �: "+imposto);
			}else {
				imposto = salario*0.15;
				System.out.println("O valor do imposto �: "+imposto);
			}
		}else if(op == 2) {
			System.out.println("Digite seu sal�rio: ");
			salario = sc.nextDouble();
			if(salario<450) {
				System.out.println("Seu novo sal�rio: "+(salario+100));
			}else if(salario>=450 && salario<750) {
				System.out.println("Seu novo sal�rio: "+(salario+75));
			}else if(salario>=750 && salario<=1500) {
				System.out.println("Seu novo sal�rio: "+(salario+50));
			}else {
				System.out.println("Seu novo sal�rio: "+(salario+25));
			}
		}else if(op == 3) {
			System.out.println("Digite seu sal�rio: ");
			salario = sc.nextDouble();
			if(salario<=700) {
				System.out.println("Mal remunerado");
			}else {
				System.out.println("Bem remunerado");
			}
		}else {
			System.out.println("Op��o n�o encontrada!");
		}
		sc.close();
	}

}

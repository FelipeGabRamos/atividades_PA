import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int op;
		double salario, imposto;
		System.out.print("-- Menu de opções: --\n\n1. Imposto\n2. Novo Salário\n3. Classificação\n\nDigite a opção desejada: ");
		op = sc.nextInt();
		if(op == 1) {
			System.out.println("Digite seu salário: ");
			salario = sc.nextDouble();
			if(salario<500) {
				imposto = salario*0.05;
				System.out.println("O valor do imposto é: "+imposto);
			}else if(salario>=500 && salario <=850) {
				imposto = salario*0.10;
				System.out.println("O valor do imposto é: "+imposto);
			}else {
				imposto = salario*0.15;
				System.out.println("O valor do imposto é: "+imposto);
			}
		}else if(op == 2) {
			System.out.println("Digite seu salário: ");
			salario = sc.nextDouble();
			if(salario<450) {
				System.out.println("Seu novo salário: "+(salario+100));
			}else if(salario>=450 && salario<750) {
				System.out.println("Seu novo salário: "+(salario+75));
			}else if(salario>=750 && salario<=1500) {
				System.out.println("Seu novo salário: "+(salario+50));
			}else {
				System.out.println("Seu novo salário: "+(salario+25));
			}
		}else if(op == 3) {
			System.out.println("Digite seu salário: ");
			salario = sc.nextDouble();
			if(salario<=700) {
				System.out.println("Mal remunerado");
			}else {
				System.out.println("Bem remunerado");
			}
		}else {
			System.out.println("Opção não encontrada!");
		}
		sc.close();
	}

}

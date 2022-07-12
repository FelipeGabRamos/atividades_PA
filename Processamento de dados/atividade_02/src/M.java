import java.util.Scanner;

public class M {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double salario, qw, qg, custo;
		
		System.out.println("Diga o valor do salário mínimo: ");
		salario = sc.nextDouble();
		
		qw = salario/5;
		
		System.out.println("Diga a quantidade de quilowatts consumida: ");
		qg = sc.nextDouble();
		
		custo = qg*qw;
		
		System.out.println(qw);
		System.out.println(custo);
		System.out.println(custo*0.85);
		
		sc.close();
	}

}

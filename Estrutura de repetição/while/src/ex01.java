import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int contM = 0;
		System.out.print("Olá Carlos, diga seu salário: ");
		double salC = sc.nextDouble();
		
		double salJ = salC/3;
		while(salJ<salC) {
			salC *= 1.02;
			salJ *= 1.05;
			contM++;
		}
		System.out.println("A quantidade de meses necessário para João igualar ou ultrapassar o salário de Carlos é de "+contM+" meses!");
		sc.close();
	}

}

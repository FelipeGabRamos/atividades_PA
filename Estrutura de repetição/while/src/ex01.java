import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int contM = 0;
		System.out.print("Ol� Carlos, diga seu sal�rio: ");
		double salC = sc.nextDouble();
		
		double salJ = salC/3;
		while(salJ<salC) {
			salC *= 1.02;
			salJ *= 1.05;
			contM++;
		}
		System.out.println("A quantidade de meses necess�rio para Jo�o igualar ou ultrapassar o sal�rio de Carlos � de "+contM+" meses!");
		sc.close();
	}

}

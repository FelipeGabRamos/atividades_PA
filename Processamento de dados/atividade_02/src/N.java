import java.util.Scanner;

public class N {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double peso, qntd, total5, resto;
		
		System.out.println("Diga o peso do saco em quilos: ");
		peso = sc.nextDouble();
		
		System.out.println("Diga a quantidade de ra��o dada a cada gato: ");
		qntd = sc.nextDouble();
		
		total5 = qntd*2*5;
		resto = peso-total5;
		
		System.out.println("Restar� "+resto+" de ra��o ap�s 5 dias");
		
		sc.close();
	}

}

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double precoTG = 0, precoT = 0;
		
		System.out.print("Diga o c�digo do produto: (de 1 � 10)");
		int codProd = sc.nextInt();
		System.out.print("Diga o peso em quilos do produto: ");
		double peso = sc.nextDouble();
		System.out.print("Diga o c�digo do pa�s: (de 1 � 3) ");
		int codPa = sc.nextInt();
		
		if(codProd >= 1 && codProd <= 4) {
			precoTG = 0.10 * peso;
		} else if(codProd >= 5 && codProd <= 7) {
			precoTG = 0.25 * peso;
		} else if(codProd >= 8 && codProd <=10) {
			precoTG = 0.35 * peso;
		} else {
			System.out.println("C�digo inv�lido!");
		}
		
		switch (codPa) {
		case 1:
			System.out.printf("Seu pre�o fica: %.2f"+precoTG);
			break;
		case 2:
			precoT = precoTG*1.15;
			System.out.printf("Seu pre�o fica: %.2f"+precoT);
			break;
		case 3:
			precoT = precoTG*1.25;
			System.out.printf("Seu pre�o fica: %.2f"+precoT);
			break;
		default:
			System.out.println("C�digo de pa�s inv�lido!");
		}
		sc.close();
	}

}

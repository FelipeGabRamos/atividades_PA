import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double alt = 0, parcela = 0;
		
		System.out.print("1 - � vista\n2 - com cheque pr�-datado\n3 - parcelado em 6 vezes sem juros\n4 - parcelado em 12 vezes com juros\nDiga qual das op��es voc� gostaria:");
		int op = sc.nextInt();
		System.out.print("Diga o valor da compra: ");
		double compra = sc.nextDouble();
		
		switch (op) {
		case 1:
			alt = compra-(compra*0.15);
			System.out.println("Pre�o do desconto: "+alt+"\nPre�o total: "+(compra+alt));
			break;
		case 2:
			alt = compra-(compra*0.10);
			System.out.println("Pre�o do desconto: "+alt+"\nPre�o total: "+(compra+alt));
			break;
		case 3:
			parcela = compra/6;
			System.out.println("Pre�o de cada parcela: "+parcela+"\nPre�o total: "+compra);
			break;
		case 4:
			alt = compra*1.08;
			parcela = alt/12;
			System.out.println("Valor com acr�scimo: "+alt+"\nValor de cada parcela: "+parcela);
			break;
		default:
			System.out.println("C�digo inv�lido!");
			break;
		}
		sc.close();
	}

}

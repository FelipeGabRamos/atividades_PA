import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Diga o primeiro dia: ");
		int dia1 = sc.nextInt();
		System.out.println("Diga o primeiro mês: ");
		int mes1 = sc.nextInt();
		System.out.println("Diga o primeiro ano: ");
		int ano1 = sc.nextInt();
		System.out.println("Diga o segundo dia: ");
		int dia2 = sc.nextInt();
		System.out.println("Diga o segundo mês: ");
		int mes2 = sc.nextInt();
		System.out.println("Diga o segundo ano: ");
		int ano2 = sc.nextInt();
		
		String data1 = dia1+"/"+mes1+"/"+ano1;
		String data2 = dia2+"/"+mes2+"/"+ano2;
		
		int dias1 = dia1+(mes1*30)+(ano1*365);
		int dias2 = dia2+(mes2*30)+(ano2*365);
		
		if(dias1>dias2) {
			System.out.println("A maior data é "+data1);
		}else if(dias2>dias1) {
			System.out.println("A maior data é "+data2);
		}else {
			System.out.println("Ambas as datas são iguais!");
		}
		sc.close();
	}

}
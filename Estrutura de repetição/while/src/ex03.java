import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double soma = 0, somaP = 0, maior = 0, menor = 9999;
		System.out.print("Diga um n�mero (30000 para sair): ");
		double num = sc.nextDouble();
		int cont = 0, numP = 0, numI = 0;
		while(num!=30000) {
			soma+=num;
			cont++;
			
			if(num>maior) {
				maior = num;
			}
			if(num<menor) {
				menor = num;	
			}
			if(num%2 == 0) {
				numP++;
				somaP += num;
				
			}else {
				numI++;
			}
			System.out.println("Digite outro n�mero: ");
			num = sc.nextDouble();
		}
		System.out.println("Soma: "+soma);
		System.out.println("Quantidade digitada: "+cont);
		System.out.println("Maior n�mero: "+maior);
		System.out.println("Menor n�mero: "+menor);
		System.out.println("M�dia dos pares: "+(somaP/numP));
		System.out.println("Porcentagem dos �mpares: "+((double)numI/cont));

		sc.close();
	}

}
//double[] num = new double[9999];
//int i = 0, cont = 0;
//double soma = 0;
//System.out.print("Diga um n�mero: ");
//num[0] = sc.nextDouble();
//while (num[i] != 30000) {
//	i++;
//	cont++;
//	System.out.print("Digite outro n�mero: ");
//	num[i] = sc.nextDouble();
//}
//int x = 0;
//int a = 0;
//while (x <= i) {
//	soma += num[x];
//}
//while (a <= i) {
//	if (num[i] > num[a]) {
//
//	}
//	
//}
import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cont = 0, qntdC = 0;
		double valor = 0, faturamento = 0;
		System.out.println("Diga o salário mínimo: ");
		double salM = sc.nextDouble();
		
		double qw = salM/8;
		System.out.println("Diga a quantidade de quilowatts");
		int qntd = sc.nextInt();
		
		while(qntd>0) {
			System.out.println("Diga o tipo de de consumidor: ");
			int tipo = sc.nextInt();
			valor = qntd*qw;
			switch(tipo) {
			case 1:
				valor *= 1.05;
				break;
			case 2:
				valor *= 1.10;
				break;
			case 3:
				valor *= 1.15;
				break;
			}
			if(valor >= 500 && valor <= 1000) {
				qntdC++;
			}
			faturamento += valor;
			
			System.out.println("Valor a Pagar: "+valor);
			cont++;
			System.out.println("Consumidor "+cont+"\nQuantidade de QW: "+qntd);
			
		}
		System.out.println("Faturamento geral da empresa: "+faturamento);
		System.out.println("Quantidade de consumidores que gastam entre R$ 500 e R$ 1000: "+qntdC);
		sc.close();

	}

}
//double[] w = new double[9999];
//int[] tipo = new int[9999];
//System.out.print("Diga o salário mínimo: ");
//double salM = sc.nextDouble();
//System.out.print("Diga quantos tipos de consumidor quer inserir: ");
//int n = sc.nextInt();
//int x = 1;
//int y = 0;
//while (x <= n) {
//	System.out.print("Diga a o tipo de consumidor (1, 2 ou 3): ");
//	tipo[y] = sc.nextInt();
//	System.out.print("Diga a quantidade de watts gasta por esse consumidor: ");
//	w[y] = sc.nextDouble();
//	x++;
//	y++;
//}
//x = 1;
//y = 0;
//while (x <= n) {
//	if(tipo)
//}

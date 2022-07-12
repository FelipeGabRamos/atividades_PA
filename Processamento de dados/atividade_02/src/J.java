import java.util.Scanner;

public class J {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double reais, dolar, euro, libra;
		
		System.out.println("Diga seu dinheiro em reais: ");
		reais = sc.nextDouble();
		
		dolar = reais*4.97;
		euro = reais*5.23;
		libra = reais*6.25;
		
		System.out.println("Seu dinheiro em dólar é: "+dolar);
		System.out.println("Seu dinheiro em euro é: "+euro);
		System.out.println("Seu dinheiro em libras esterlinas é: "+libra);
		
		sc.close();
	}

}

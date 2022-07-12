import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Diga o dia atual: ");
		int dia = sc.nextInt();
		System.out.print("Diga o mês atual: ");
		int mes = sc.nextInt();
		System.out.print("Diga o ano atual: ");
		int ano = sc.nextInt();
		System.out.print("Diga a hora atual: ");
		int hora = sc.nextInt();
		System.out.print("Diga os minutos atuais: ");
		int min = sc.nextInt();
		
		if(mes == 1) {
			System.out.println("Data: "+dia+"/Janeiro/"+ano);
			System.out.println("Hora: "+hora+";"+min);
		}else if(mes == 2) {
			System.out.println("Data: "+dia+"/Fevereiro/"+ano);
			System.out.println("Hora: "+hora+";"+min);
		}else if(mes == 3) {
			System.out.println("Data: "+dia+"/Março/"+ano);
			System.out.println("Hora: "+hora+";"+min);
		}else if(mes == 4) {
			System.out.println("Data: "+dia+"/Abril/"+ano);
			System.out.println("Hora: "+hora+";"+min);
		}else if(mes == 5) {
			System.out.println("Data: "+dia+"/Maio/"+ano);
			System.out.println("Hora: "+hora+";"+min);
		}else if(mes == 6) {
			System.out.println("Data: "+dia+"/Junho/"+ano);
			System.out.println("Hora: "+hora+";"+min);
		}else if(mes == 7) {
			System.out.println("Data: "+dia+"/Julho/"+ano);
			System.out.println("Hora: "+hora+";"+min);
		}else if(mes == 8) {
			System.out.println("Data: "+dia+"/Agosto/"+ano);
			System.out.println("Hora: "+hora+";"+min);
		}else if(mes == 9) {
			System.out.println("Data: "+dia+"/Setembro/"+ano);
			System.out.println("Hora: "+hora+";"+min);
		}else if(mes == 10) {
			System.out.println("Data: "+dia+"/Outubro/"+ano);
			System.out.println("Hora: "+hora+";"+min);
		}else if(mes == 11) {
			System.out.println("Data: "+dia+"/Novembro/"+ano);
			System.out.println("Hora: "+hora+";"+min);
		}else if(mes == 12) {
			System.out.println("Data: "+dia+"/Dezembro/"+ano);
			System.out.println("Hora: "+hora+";"+min);
		}else {
			System.out.println("Mês inválido");
		}
		sc.close();	
	}

}
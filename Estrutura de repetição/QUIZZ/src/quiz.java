//FEITO POR FELIPE GABRIEL RAMOS
import java.util.Scanner;
//Chamei a biblioteca do Scanner

public class quiz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Acima criei o Scanner sc
		String resp, jogar;
		int cont = 0, resP;
		//Acima criei as variáveis
		do {
			//A estrutura Do While serve para repetir caso o jogador queira jogar novamente
			System.out.println("Bem - vindo ao quiz dos games!");
			System.out.println(
					"Você deseja saber:\n\n(lol) - Qual a porcentagem de lolzeiro que corresponde a você\n(val) - Qual a porcentagem de valoranter que corresponde a você\n(lol2) - O quão você conhece de lol\n(val2) - O quão você conhece de valorant\nSua resposta: ");
			resp = sc.next();
			//Aqui é requisitado qual dos quizes o jogador deseja jogar
			if (resp.equals("Lol") || resp.equals("lol") || resp.equals("LOL")) {
				//Este If corresponde a primeira opção
				System.out.println("1. Você joga lol apesar de não gostar do jogo? ");
				resp = sc.next();
				//Pergunta 1 LOL
				if (resp.equals("Sim") || resp.equals("sim") || resp.equals("SIM")) {
					cont++;
					//Contabiliza para efetuar o calculo da porcentagem ao final
				}
				System.out.println("2. Você já xingou aliados e inimigos de maneiras inimagináveis? ");
				resp = sc.next();
				//Pergunta 2 LOL
				if (resp.equals("Sim") || resp.equals("sim") || resp.equals("SIM")) {
					cont++;
					//Contabiliza para efetuar o calculo da porcentagem ao final
				}
				System.out.println("3. Você é nível maior que 300? ");
				resp = sc.next();
				//Pergunta 3 LOL
				if (resp.equals("Sim") || resp.equals("sim") || resp.equals("SIM")) {
					cont++;
					//Contabiliza para efetuar o calculo da porcentagem ao final
				}
				System.out.println("4. Você já gastou muito dinheiro em lol? ");
				resp = sc.next();
				//Pergunta 4 LOL
				if (resp.equals("Sim") || resp.equals("sim") || resp.equals("SIM")) {
					cont++;
					//Contabiliza para efetuar o calculo da porcentagem ao final
				}
				System.out.println("5. Você já ficou 0/todos? ");
				resp = sc.next();
				//Pergunta 5 LOL
				if (resp.equals("Sim") || resp.equals("sim") || resp.equals("SIM")) {
					cont++;
					//Contabiliza para efetuar o calculo da porcentagem ao final
				}
				System.out.println("Você é " + ((cont * 100) / 5) + "% lolzeiro!");
				//Realiza o calculo de porcentagem e imprime na tela

			} else if (resp.equals("Val") || resp.equals("val") || resp.equals("VAL")) {
				//Este If corresponde a segunda opção
				System.out.println("1. Você tem picos entre jogadas lindas e jogadas feias? ");
				resp = sc.next();
				//Pergunta 1 VAL
				if (resp.equals("Sim") || resp.equals("sim") || resp.equals("SIM")) {
					cont++;
					//Contabiliza para efetuar o calculo da porcentagem ao final
				}
				System.out.println("2. Você já realizou algum clutch? ");
				resp = sc.next();
				//Pergunta 2 VAL
				if (resp.equals("Sim") || resp.equals("sim") || resp.equals("SIM")) {
					cont++;
					//Contabiliza para efetuar o calculo da porcentagem ao final
				}
				System.out.println("3. Você já carregou seu time? ");
				resp = sc.next();
				//Pergunta 3 VAL
				if (resp.equals("Sim") || resp.equals("sim") || resp.equals("SIM")) {
					cont++;
					//Contabiliza para efetuar o calculo da porcentagem ao final
				}
				System.out.println("4. Você já comprou uma skin linda da sua loja? ");
				resp = sc.next();
				//Pergunta 4 VAL
				if (resp.equals("Sim") || resp.equals("sim") || resp.equals("SIM")) {
					cont++;
					//Contabiliza para efetuar o calculo da porcentagem ao final
				}
				System.out.println("5. Você já afundou seu time? ");
				resp = sc.next();
				//Pergunta 5 VAL
				if (resp.equals("Sim") || resp.equals("sim") || resp.equals("SIM")) {
					cont++;
					//Contabiliza para efetuar o calculo da porcentagem ao final
				}
				System.out.println("Você é " + ((cont * 100) / 5) + "% valoranter!");
				//Realiza o calculo de porcentagem e imprime na tela
				
			} else if (resp.equals("lol2") || resp.equals("lol 2") || resp.equals("Lol2") || resp.equals("Lol 2") || resp.equals("LOL2") || resp.equals("LOL 2")) {
				//Este If corresponde a terceira opção
				System.out.println("1. Quantas skins com referência ao Brasil existem?\n3\n4\n5\n1\nNúmero: ");
				resP = sc.nextInt();
				//Pergunta 1 LOL2
				if(resP == 4) {
					System.out.println("Você acertou, são elas: Nami Iara, Carnanivia, Hecarim Sabugueiro e Gankplank Forças Especiais");
					cont++;
				}else {
					System.out.println("Você errou, são elas: Nami Iara, Carnanivia, Hecarim Sabugueiro e Gankplank Forças Especiais");
				}
				//if e else para verificar a resposta
				
				System.out.println("2. Qual destes campeões fazem referência a um cientista do mundo real?\n1 - Heimerdinger\n2 - Dr.Mundo\n3 - Ryze\n4 - Warwick\nNúmero: ");
				resP = sc.nextInt();
				//Pergunta 2 LOL2
				if(resP == 1) {
					System.out.println("Você acertou, é heimerdinger cujo nome nasce da junção de Robert Oppenheimer com Erwin Schrödinger");
					cont++;
				}else {
					System.out.println("Você errou, é heimerdinger cujo nome nasce da junção de Robert Oppenheimer com Erwin Schrödinger");;
				}
				//if e else para verificar a resposta
				
				System.out.println("3. Qual foi o primeiro campeão criado em League of Legends?\n1 - Katarina\n2 - Garen\n3 - Master Yi\n4 - Singed\nNúmero: ");
				resP = sc.nextInt();
				//Pergunta 3 LOL2
				if(resP == 4) {
					System.out.println("Você acertou, é Singed");
					cont++;
				}else {
					System.out.println("Você errou, é Singed");
				}
				//if e else para verificar a resposta
				
				System.out.println("4. Qual campeão foi criado a partir de um emote?\n1 - Rammus\n2 - Teemo\n3 - Tristana\n4 - Jinx\nNúmero: ");
				resP = sc.nextInt();
				//Pergunta 4 LOL2
				if(resP == 2) {
					System.out.println("Você acertou, Teemo nasceu do emoticon de sorriso e seu nome é até um anagrama da palavra 'emote'");
					cont++;
				}else {
					System.out.println("Você errou, Teemo nasceu do emoticon de sorriso e seu nome é até um anagrama da palavra 'emote'");
				}
				//if e else para verificar a resposta
				
				System.out.println("5. O que a narradora do jogo dizia para o jogador que conseguisse seis abates em sequência?\n1 - Legendarykill\n2 - Ultra kill\n3 - Ace\n4 - Pentakill\nNúmero: ");
				resP = sc.nextInt();
				//Pergunta 5 LOL2
				if(resP == 1) {
					System.out.println("Você acertou, O sexto abate não era anunciado na tela do jogo, mas havia uma fala para tal 'Legendarykill'");
					cont++;
				}else {
					System.out.println("Você errou, O sexto abate não era anunciado na tela do jogo, mas havia uma fala para tal 'Legendarykill'");
				}
				//if e else para verificar a resposta
				
				if(cont==5) {
					System.out.println("Parabéns, sua pontuação foi de "+(cont)+"/5");
				}else if(cont<5 && cont>2) {
					System.out.println("Quase, sua pontuação foi de "+(cont)+"/5");
				}else {
					System.out.println("MEU DEUS, sua pontuação foi de "+(cont)+"/5");
				}
				
			
			} else if (resp.equals("val2") || resp.equals("val 2") || resp.equals("Val2") || resp.equals("Val 2") || resp.equals("VAL2") || resp.equals("VAL 2")) {
				//Este If corresponde a quarta opção
				System.out.println("1. Quantos agentes usam óculos?\n1\n2\n4\n5\nNúmero: ");
				resP = sc.nextInt();
				//Pergunta 1 VAL2
				if(resP == 2) {
					System.out.println("Você acertou, são eles Killjoy e Chamber");
					cont++;
				}else {
					System.out.println("Você errou, são eles Killjoy e Chamber");
				}
				//if e else para verificar a resposta
				
				System.out.println("2. Quanto custa o passe de batalha no Valorant?\n1 - 1200\n2 - 1000\n3 - 950\n4 - 1050\nNúmero: ");
				resP = sc.nextInt();
				//Pergunta 2 VAL2
				if(resP == 2) {
					System.out.println("Você acertou");
					cont++;
				}else {
					System.out.println("Você errou");
				}
				//if e else para verificar a resposta
				
				System.out.println("3. Quantos agentes do Valorant não precisam ser desbloqueados?\n4\n5\n6\n9\nNúmero: ");
				resP = sc.nextInt();
				//Pergunta 3 VAL2
				if(resP == 6) {
					System.out.println("Você acertou");
					cont++;
				}else {
					System.out.println("Você errou");
				}
				//if e else para verificar a resposta
				
				System.out.println("4. Quantos personagens são integrantes da Kingdom?\n9\n11\n8\n10\nNúmero: ");
				resP = sc.nextInt();
				//Pergunta 4 VAL2
				if(resP == 9) {
					System.out.println("Você acertou");
					cont++;
				}else {
					System.out.println("Você errou");
				}
				
				System.out.println("5. O que são agentes radiantes?\n1 - Agentes duelistas\n2 - Agentes da Kingdom\n3 - Agentes que tem habilidades fenomenais ou usam tecnologia radiante\n4 - Agentes de outro planeta\nNúmero: ");
				resP = sc.nextInt();
				//Pergunta 5 VAL2
				if(resP == 3) {
					System.out.println("Você acertou");
					cont++;
				}else {
					System.out.println("Você errou");
				}
				//if e else para verificar a resposta
				
				if(cont==5) {
					System.out.println("Parabéns, sua pontuação foi de "+(cont)+"/5");
				}else if(cont<5 && cont>2) {
					System.out.println("Quase, sua pontuação foi de "+(cont)+"/5");
				}else {
					System.out.println("MEU DEUS, sua pontuação foi de "+(cont)+"/5");
				}
				//if e else para verificar a resposta
			
			}else {
				//Este else corresponde a burrice do indivíduo
				System.out.println("Sabe escrever não?");
			}
			System.out.println("Deseja jogar novamente?");
			jogar = sc.next();
			//Acima pergunta se o jogador quer jogar novamente, pergunta que cabe ao Do While realizar
		} while (!jogar.equals("Não") && !jogar.equals("não") && !jogar.equals("NÃO") && !jogar.equals("Nao")
				&& !jogar.equals("nao") && !jogar.equals("NAO"));
		sc.close();
	}

}


//eodiga na yeogi nama itjanha
//jebal dugo gaji ma
//han siganman nan jigeum animyeon
//an doendan mariya i sigana
//
//michin malcheoreom chochimeun dallyeo jigeum nal deryeoga
//honja meomulleo isseumyeo gwageoreul jeulgijaneun mal
//haji ma oetori gateun gibun
//na hollo bichamhage dotaedoegineun sildan mariya
//Take me to you now
//
//Too fast neoeui georeume matchuda neomeojyeo
//ajik nan yeojeonhi igose seo isseo
//bulgwa myeot dal jeon nawa gati geotdeon i gire
//
//na hollo walking on the way
//neomu chuwo i georin so cold
//jeomjeom nae georeumgeori neuryeoppajin slow mode
//
//hangsang apseogadeon nae moseubeun da black or white
//sajincheoreom imi jinan iri dwaesseo
//
//ireoda yeogi honja meomchwojilkka duryeowo
//kkumeul kkumyeo dallideon gichaneun gojang nago
//
//yeojeonhi nunape areungeorineun manheun seom
//geugose na honja mot daheulkkabwa duryeowo ey
//haru jongil meori gamssamyeo
//ping doneun nunmul hangsang gateun jari
//ttokgateun siksanghan noraewa gasa
//modeun ge 1nyeon jeongwa gateun neukkim
//
//jebal jom jalhaebwa eodi gaseo
//bukkeureopji anheul su itge yeah
//na jasineul bol ttae nado useumyeonseo
//nae moseup jarangseureopge
//
//sumanheun saramdeul ape nareul da naeboyeosseul ttae
//yojeumeun jogeumssik changpihae
//chorahan nae moseup eotteolkka ey
//naman ppaego moduga apeuro georeoga
//hangsang nawa geotdeon geudeuldo
//ijeneun jogeumssik meoreojyeo
//nae nunedo boijiga anha yeah, yeah
//
//Too fast neoeui georeume matchuda neomeojyeo
//ajik nan yeojeonhi igose seo isseo
//bulgwa myeot dal jeon nawa gati geotdeon i gire
//
//na hollo walking on the way
//neomu chuwo i georin so cold
//jeomjeom nae georeumgeori neuryeoppajin slow mode
//
//hangsang apseogadeon nae moseubeun da black or white
//sajincheoreom imi jinan iri dwaesseo
//
//ireoda yeogi honja meomchwojilkka duryeowo
//kkumeul kkumyeo dallideon gichaneun gojang nago
//
//yeojeonhi nunape areungeorineun manheun seom
//geugose na honja mot daheulkkabwa duryeowo ey



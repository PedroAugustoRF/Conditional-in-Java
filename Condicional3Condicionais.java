import java.util.Locale;
import java.util.Scanner;

public class Condicional3Condicionais{
	public static void main(String[] args){
		
		// Estruturas condicionais If-Else
		// É uma estrutura de controle
		// E permite a execução de um bloco de comando dependendo da condição
		
		// São dois tipos de estrutura: simples e composta.
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x = 5;
		
		if(x > 5){// simples
			System.out.println("Cinco é maior!");
		}
		else{// composta, quando há continuação
			System.out.println("Cinco é menor ou igual!");
		}
		
		int hora;
		
		System.out.println("Quantas horas? (Sem os minutos)");
		hora = sc.nextInt();
		
		if(hora <= 12){
			System.out.println("Bom Dia!");
		}
		else if(hora >= 13 && hora < 19){
			System.out.println("Boa Tarde!");
		}
		else{
			System.out.println("Boa Noite!");
		}
		sc.close();
	}
}
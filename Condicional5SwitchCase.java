import java.util.Locale;
import java.util.Scanner;

public class Condicional5SwitchCase{
	public static void main(String[] args){
		// Estrutura Switch-Case util em casos com vários fluxos, evita condicionais aninhadas
		// switch (<variável>){
		// case <valorVariável>
		// 		comandos;
		//		break;
		// }
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String dia;
		
		System.out.print("Qual dia da semana (1-7)? ");
		int caso = sc.nextInt();
		
		switch(caso){
			case 1:
				dia = "Domingo";
				break;				
			case 2:
				dia = "Segunda-Feira";
				break;				
			case 3:
				dia = "Terça-Feira";
				break;
				
			case 4:
				dia = "Quarta-Feira";
				break;				
			case 5:
				dia = "Quinta-Feira";
				break;				
			case 6:
				dia = "Sexta-Feira";
				break;				
			case 7:
				dia = "Sábado";
				break;				
			default:
				dia = "Valor digitado inválido";
				break;
		}
		System.out.printf("%n%s", dia);
		sc.close();
	}
}
import java.util.Locale;
import java.util.Scanner;

public class ex6{
	public static void main(String[] args){
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double valor = 0;
		
		System.out.print("Digite um valor aí: ");
		valor = sc.nextDouble();
		
		if(valor < 0 || valor > 100)
			System.out.print("\nValor fora de intervalo");
		else if(valor >= 0 && valor <= 25)
			System.out.print("\nIntervalo [0,25]");
		else if(valor > 25 && valor <= 50)
			System.out.print("\nIntervalo [25,50]");
		else if(valor > 50 && valor <= 75)
			System.out.print("\nIntervalo [50,75]");
		else if(valor > 75 && valor <= 100)
			System.out.print("\nIntervalo [75,100]");
		
		sc.close();
	}
}
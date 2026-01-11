import java.util.Locale;
import java.util.Scanner;

public class Condicional4Cumulativo{
	public static void main(String[] args){
			
		// Operadores cumulativos: +=, -=, *=, /=, %=
		// x (+-*/%)= y é nada mais que x = x =-*/% y
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int minutos = 0;
		double conta = 50;
		
		System.out.print("Quantos minutos você usou? ");
		minutos = sc.nextInt();
		
		if(minutos > 100){
			conta += (minutos - 100) * 2.0;
		}
		System.out.printf("%nValor da conta: R$%.2f", conta);
		
		sc.close();	
	}
}

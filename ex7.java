import java.util.Locale;
import java.util.Scanner;

public class ex7{
	public static void main(String[] args){
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x = 0, y = 0;
		
		System.out.print("Digite um valor: ");
		x = sc.nextDouble();
		System.out.print("\nDigite outro valor: ");
		y = sc.nextDouble();
		
		if(x == 0 && y == 0)
			System.out.print("\nOrigem");
		else if(x == 0 || y == 0)
			System.out.print("\n“Eixo X” ou “Eixo Y”");
		else if(x > 0 && y > 0)
			System.out.print("\nQ1");
		else if(x < 0 && y > 0)
			System.out.print("\nQ2");
		else if(x < 0 && y < 0)
			System.out.print("\nQ3");
		else if(x > 0 && y < 0)
			System.out.print("\nQ4");
		
		sc.close();
	}
}
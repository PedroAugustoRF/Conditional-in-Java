import java.util.Locale;
import java.util.Scanner;

public class ex8{
	public static void main(String[] args){
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double salario = 0, imposto = 0, salarioFinal = 0;
		
		System.out.print("Qual seu salário? (Use '.' como delimitador)");
		salario = sc.nextDouble();
		
		if(salario < 0)
			System.out.print("\nSalário inválido");
		
		else if(salario == 0.00 && salario <= 2000.00)
			System.out.print("\nIsento de impostos");
		
		else if(salario > 2000.00 && salario <= 3000.00){
			imposto = (salario * 8) / 100;
			salarioFinal = salario - imposto;
		
			System.out.printf("%nR$%.2f", imposto);
		}
		else if(salario > 3000.00 && salario <= 4500.00){
			imposto = (salario * 18) / 100;
			salarioFinal = salario - imposto;
			
			System.out.printf("%nR$%.2f", imposto);
			}
		else{
			imposto = (salario * 28) / 100;
			salarioFinal = salario - imposto;
			
			System.out.printf("%nR$%.2f", imposto);
		}
		sc.close();
	}
}
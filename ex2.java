import java.util.Scanner;

public class ex2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		
		System.out.print("Digite um número inteiro: ");
		num = sc.nextInt();
		
		if(num % 2 == 0)
			System.out.printf("%n%d é um valor par", num);
		else
			System.out.printf("%n%d é um valor ímpar", num);
		
		sc.close();
	}
}
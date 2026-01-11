import java.util.Scanner;

public class ex3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int A = 0, B = 0;
		
		System.out.print("Digite um inteiro: ");
		A = sc.nextInt();
		
		System.out.print("\nDigite outro inteiro: ");
		B = sc.nextInt();
		
		if(A % B == 0 || B % A == 0)
			System.out.print("\nSão Multiplos");
		else
			System.out.print("\nNão são Multiplos");
		
		sc.close();
	}
}

// Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A seguir:
// calcule e mostre o valor da conta a pagar.
import java.util.Scanner;

public class ex5{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int codigoItem = 0, quantidadeItem = 0;
		double precoPedido = 0.0;
		
		System.out.print("Qual código do item escolhido? ");
		codigoItem = sc.nextInt();
		
		System.out.print("\nQuantos desse item voce quer? ");
		quantidadeItem = sc.nextInt();
		
		if(codigoItem < 1 || codigoItem > 5)
			System.out.print("\nItem Inválido!");
		
		else if(codigoItem == 1){
			precoPedido = 4.00 * quantidadeItem;
			System.out.printf("%nPreço do pedido: %.2f", precoPedido);
		}
		
		else if(codigoItem == 2){
			precoPedido = 4.50 * quantidadeItem;
			System.out.printf("%nPreço do pedido: %.2f", precoPedido);
		}
		
		else if(codigoItem == 3){
			precoPedido = 5.00 * quantidadeItem;
			System.out.printf("%nPreço do pedido: %.2f", precoPedido);
		}
		
		else if(codigoItem == 4){
			precoPedido = 2.00 * quantidadeItem;
			System.out.printf("%nPreço do pedido: %.2f", precoPedido);
		}
		
		else if(codigoItem == 5){
			precoPedido = 1.50 * quantidadeItem;
			System.out.printf("%nPreço do pedido: %.2f", precoPedido);
		}
		
		sc.close();
	}
}
public class Condicional6Ternaria{
	public static void main(String[] args){
		// Há uma condição, caso seja verdadeira, "executa" o lado 1, se falsa o lado dois
		// (Condição) ? verdade : falso
		
		double preco = 34.5, desconto = 0;
		desconto = (preco < 20) ? preco * 0.1 : preco * 0.05;
		
		System.out.printf("Desconto de: %.2f", desconto);
	}
}
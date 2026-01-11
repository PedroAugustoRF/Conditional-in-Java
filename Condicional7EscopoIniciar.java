public class Condicional7EscopoIniciar{
	public static void main(String[] args){
		// Escopo da variável: a região do programa onde ela é válida, escopo local e global;
		// onde a variável pode ser referenciada;
		
		// Inicializar a variável: ela não pode ser usada sem ser inicializada, ou seja, lixo de memória
		
		int valor = 10;
		double iniciar = 10.0;
		double semIniciar;
		
		System.out.println(semIniciar); // vai dar erro
		System.out.println(iniciar); // vai dar bom
		
		if(valor = 10){
			double escopo = 20;
		}
		
		System.out.println(escopo); // escopo só existe durante a execução da condicional, logo da errado
		// não posso usar pós uma condicional ou outra estrutura, uma variável declarada dentro da mesma
		
		// Resumo, sempre inicialize a variável independente do caso
		// caso for usar-las pós estrutura, declare antes da estrutura
					
		
	}
}

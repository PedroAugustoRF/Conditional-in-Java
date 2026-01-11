import java.util.Scanner;

public class ex4{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int horaInicial = 0, horaFinal = 0, duracao = 0, duracaoAbs;
		
		System.out.print("Que horas você começou a jogar? ");
		horaInicial = sc.nextInt();
		
		System.out.print("\nQue horas você parou de jogar? ");
		horaFinal = sc.nextInt();
		
		duracao = horaInicial - horaFinal;
		duracaoAbs = Math.abs(duracao);
		
		if(horaInicial < 1 && horaFinal > 24)
			System.out.print("\nVocê inseriu horas inválidas (1h-24h apenas)");
		else if(horaInicial == 0 && horaFinal == 0)
			System.out.print("\nO JOGO DUROU 24 HORAS(S)");
		else
			System.out.printf("%nO JOGO DUROU %d HORA(S)", duracaoAbs);
		
		sc.close();
	}
}
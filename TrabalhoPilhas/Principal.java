import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		String expressao = "";
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Digite o calculo a ser calculado:");
		expressao = keyboard.next();

		if (expressao.equalsIgnoreCase("fim")) {
			System.out.println("Obrigado!");
		} else {
			// MANDAR PARA O CONVERSOR
			Conversor c = new Conversor(expressao);
			c.leitorConversor();
		}
		
	}

}

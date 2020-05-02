package empresa;

import java.util.Scanner;

public class Tratamento_erro {

	Scanner sc = new Scanner(System.in);

	public int erro() {
		int opcao = usuario(sc);
		return opcao;
	}

	private int usuario(Scanner sc2) {
		try {
			return Integer.parseInt(sc2.next());
		} catch (NumberFormatException e) {
			System.out.println("Digite só número!");
			return usuario(sc2);
		}
	}
}

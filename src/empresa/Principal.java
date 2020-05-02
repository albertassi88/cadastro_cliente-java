package empresa;

public class Principal {

	public static void main(String[] args) {

		Tratamento_erro t_e = new Tratamento_erro();
		Cliente cliente = new Cliente();

		System.out.println("Opção 1 - Cliente");
		System.out.println("Opção 2 - Sair");
		int op = t_e.erro();

		while (op != 1 & op != 2) {
			System.out.println("Digite uma opção válida!");
			op = t_e.erro();
		}

		switch (op) {
		case 1:
			cliente.cadastro();
			break;
		default:
			break;
		}
	}
}

package empresa;

import java.util.Scanner;

public class Cliente {

	Tratamento_erro t_e = new Tratamento_erro();
	Cadastro cadastro = new Cadastro();
	Principal principal = new Principal();
	Scanner sc = new Scanner(System.in);

	private String nome;
	private String endereco;
	private String email;
	private Integer telefone;

	public Cliente() {
	}

	public Cliente(String nome, String endereco, String email, Integer telefone) {
		this.nome = nome;
		this.endereco = endereco;
		this.email = email;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndere�o(String endereco) {
		this.endereco = endereco;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getTelefone() {
		return telefone;
	}

	public void setTelefone(Integer telefone) {
		this.telefone = telefone;
	}

	public void cadastro() {
		System.out.println("");
		System.out.println("Op��o 1 - Cadastrar Cliente");
		System.out.println("Op��o 4 - Sair");

		int op = t_e.erro();
		while (op != 1 & op != 4) {
			System.out.println("Op��o Inv�lida!");
			op = t_e.erro();
		}

		while (op != 4) {
			switch (op) {
			case 1:
				cadastro.cadastro_cliente();
				System.out.println("");
				System.out.println("Op��o 2 - Consultar Clientes Cadastrados");
				System.out.println("Op��o 3 - Editar Cliente");
				System.out.println("Op��o 4 - Voltar");
				op = t_e.erro();
				while ((op != 2) & (op != 3) & (op != 4)) {
					System.out.println("Op��o invalida! Digite umas das op��es.");
					op = t_e.erro();
				}
				break;
			case 2:
				cadastro.consulta_cliente();
				System.out.println("");
				System.out.println("Op��o 2 - Consultar Clientes Cadastrados");
				System.out.println("Op��o 3 - Editar Cliente");
				System.out.println("Op��o 4 - Sair");
				op = t_e.erro();
				while ((op != 2) & (op != 3) & (op != 4)) {
					System.out.println("Op��o invalida! Digite umas das op��es.");
					op = t_e.erro();
				}
				break;
			case 3:
				System.out.println("Qual c�digo do cliente voc� deseja editar?");
				op = t_e.erro();
				while (op > cadastro.op) {
					System.out.println("C�digo inv�lido!");
					op = t_e.erro();
				}
				System.out.print("Nome:");
				String nome = sc.nextLine();
				System.out.print("Endere�o:");
				String endereco = sc.nextLine();
				System.out.print("E-mail:");
				String email = sc.nextLine();
				System.out.print("Telefone:");
				int telefone = t_e.erro();

				System.out.println("");
				cadastro.editar_cliente(op, nome, endereco, email, telefone);
				System.out.println("");
				System.out.println("Op��o 2 - Cadastro dos Clientes");
				System.out.println("Op��o 3 - Editar Cliente");
				System.out.println("Op��o 4 - Voltar");
				op = t_e.erro();
				while ((op != 2) & (op != 3) & (op != 4)) {
					System.out.println("Op��o invalida! Digite umas das op��es.");
					op = t_e.erro();
				}
				break;
			default:
				break;
			}
		}
	}
}

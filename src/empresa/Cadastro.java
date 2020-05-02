package empresa;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Cadastro {

	Scanner sc = new Scanner(System.in);
	Map<Integer, Cliente> map = new HashMap<>();
	Tratamento_erro t_e = new Tratamento_erro();

	public int op;

	public void cadastro_cliente() {
		System.out.println("Quantos clientes você deseja cadastrar?");
		op = t_e.erro();

		for (int n = 1; n <= op; n++) {
			System.out.println("Cliente: " + n);
			System.out.print("Nome:");
			String nome = sc.nextLine();
			System.out.print("Endereço:");
			String endereco = sc.nextLine();
			System.out.print("E-mail:");
			String email = sc.nextLine();
			System.out.print("Telefone:");
			int telefone = t_e.erro();

			System.out.println("");
			Cliente cliente = new Cliente(nome, endereco, email, telefone);
			map.put(n, cliente);
		}
	}

	public void consulta_cliente() {
		for (Integer key : map.keySet()) {
			System.out.println("Código: " + key + " - Nome: " + map.get(key).getNome() + " - Endereço: "
					+ map.get(key).getEndereco() + " - E-mail: " + map.get(key).getEmail() + " - Telefone: "
					+ map.get(key).getTelefone());
		}
	}

	public void editar_cliente(Integer n, String nome, String endereco, String email, Integer telefone) {
		for (Integer key : map.keySet()) {
			if (key == n) {
				map.get(key).setNome(nome);
				map.get(key).setEndereço(endereco);
				map.get(key).setEmail(email);
				map.get(key).setTelefone(telefone);
			}
		}
	}
}

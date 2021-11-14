import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Principal {
	public static void main(String[] args) throws IOException {
		BufferedReader dados = new BufferedReader(new InputStreamReader(System.in));
		
		ArrayList<Setor> setor = new ArrayList<Setor>();
		ArrayList<Funcionario> funcionario = new ArrayList<Funcionario>();
		ArrayList<ClienteComum> clienteC = new ArrayList<ClienteComum>();
		ArrayList<ClienteFidelidade> clienteF = new ArrayList<ClienteFidelidade>();
		
		int op;
		
		do {		
			System.out.println("-------------------------------------------------");
			System.out.println("Menu");
			System.out.println("-------------------------------------------------");
			System.out.println("1. Cadastrar Setor");
			System.out.println("2. Cadastrar Funcionario");
			System.out.println("3. Cadastrar Cliente Comum");
			System.out.println("4. Cadastrar Cliente Fidelidade");
			System.out.println("5. Listar Setor");
			System.out.println("6. Listar Funcionario");
			System.out.println("7. Listar Cliente Comum");
			System.out.println("8. Listar Cliente Fidelidade");
			System.out.println("0. Sair");
			System.out.println("-------------------------------------------------");
			System.out.print("Opcao: ");
			op = Integer.parseInt(dados.readLine());
			
			switch(op) {
				case 1: {
					System.out.println("-------------------------------------------------");
					System.out.println("Cadastrar Setor");
					System.out.println("-------------------------------------------------");
					int id = setor.size() + 1;
					System.out.println("ID: " + id);
					System.out.print("Descricao: ");
					String descricao = dados.readLine();
					
					Setor set = new Setor();
					set.cadastrar(id, descricao);
					
					setor.add(set);

					break;
				}
				
				case 2: {
					System.out.println("-------------------------------------------------");
					System.out.println("Cadastrar Funcionario");
					System.out.println("-------------------------------------------------");
					int codigo = funcionario.size() + 1;
					System.out.println("Codigo: " + codigo);
					System.out.print("Nome: ");
					String nome = dados.readLine();
					System.out.print("E-Mail: ");
					String email = dados.readLine();
					System.out.print("Telefone: ");
					String telefone = dados.readLine();
					System.out.print("CPF: ");
					String cpf = dados.readLine();
					System.out.print("Salario: ");
					double salario = Double.parseDouble(dados.readLine());
					System.out.print("Carga Horária: ");
					int ch = Integer.parseInt(dados.readLine());
					
					
					String aux = "";
					
					for(int x = 0; x < setor.size(); x++) {
						aux += setor.get(x).getId() + "-"
							 +	setor.get(x).getDescricao() + " | ";
					}
					
					System.out.print("Setor [" + aux.substring(0, aux.length() - 3) + "]: ");
					int seto = Integer.parseInt(dados.readLine());
					
					Funcionario func = new Funcionario();
					func.cadastrar(codigo, nome, email, telefone,cpf, salario, ch,
							       setor.get(seto - 1));
					
					funcionario.add(func);
					
					break;
				}
				
				case 3: {
					System.out.println("-------------------------------------------------");
					System.out.println("Cadastrar Cliente Comum");
					System.out.println("-------------------------------------------------");
					int codigo = clienteC.size() + 1;
					System.out.println("Codigo: " + codigo);
					System.out.print("Nome: ");
					String nome = dados.readLine();
					System.out.print("E-Mail: ");
					String email = dados.readLine();
					System.out.print("Telefone: ");
					String telefone = dados.readLine();
					System.out.print("CPF: ");
					String cpf = dados.readLine();
					System.out.print("Observacao: ");
					String observacao = dados.readLine();
					System.out.print("Pontuação: ");
					int pontuacao = Integer.parseInt(dados.readLine());
					
					ClienteComum cliC = new ClienteComum();
					cliC.cadastrar(codigo, nome, email, telefone, pontuacao, cpf, observacao );
					
					clienteC.add(cliC);
					
					break;
				}
				
				case 4: {
					System.out.println("-------------------------------------------------");
					System.out.println("Cadastrar Cliente Fidelidade");
					System.out.println("-------------------------------------------------");
					int codigo = clienteF.size() + 1;
					System.out.println("Codigo: " + codigo);
					System.out.print("Nome: ");
					String nome = dados.readLine();
					System.out.print("E-Mail: ");
					String email = dados.readLine();
					System.out.print("Telefone: ");
					String telefone = dados.readLine();
					System.out.print("CPF: ");
					String cpf = dados.readLine();
					System.out.print("Bonus: ");
					double bonus = Double.parseDouble(dados.readLine());
					System.out.print("Desconto: ");
					int desconto = Integer.parseInt(dados.readLine());
					
					ClienteFidelidade cliF = new ClienteFidelidade();
					cliF.cadastrar(codigo, nome, email, telefone, cpf, desconto, bonus );
					
					clienteF.add(cliF);
					
					break;
				}
				
				case 5: {
					System.out.println("-------------------------------------------------");
					System.out.println("Listar Setor");
					System.out.println("-------------------------------------------------");
					
					for(int x = 0; x < setor.size(); x++)
						System.out.println(setor.get(x).mostrar());

					break;
				}
				
				case 6: {
					System.out.println("-------------------------------------------------");
					System.out.println("Listar Funcionario");
					System.out.println("-------------------------------------------------");
					
					for(int x = 0; x < funcionario.size(); x++)
						System.out.println(funcionario.get(x).mostrar());
					
					break;
				}
				
				case 7: {
					System.out.println("-------------------------------------------------");
					System.out.println("Listar Cliente Comum");
					System.out.println("-------------------------------------------------");
					
					for(int x = 0; x < clienteC.size(); x++)
						System.out.println(clienteC.get(x).mostrar());
					
					break;
				}
				
				case 8: {
					System.out.println("-------------------------------------------------");
					System.out.println("Listar Cliente Fidelidade");
					System.out.println("-------------------------------------------------");
					
					for(int x = 0; x < clienteF.size(); x++)
						System.out.println(clienteF.get(x).mostrar());
					
					break;
				}
			}
		} while(op > 0);
	}
}

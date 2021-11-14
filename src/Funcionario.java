public class Funcionario extends Pessoa {
	private double salario;
	private int ch;
	private Setor setor;
	
	public void cadastrar(int codigo, String nome, String email,
			              String telefone,String cpf, double salario, int ch, Setor setor) {
		this.codigo = codigo;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.salario = salario;
		this.ch = ch;
		this.setor = setor;
	}
	
	public String mostrar() {
		return "Funcionario " + this.codigo + ": " + this.nome + " | Setor: "
		  	   + this.setor.getDescricao();
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getCh() {
		return ch;
	}

	public void setCh(int ch) {
		this.ch = ch;
	}
}

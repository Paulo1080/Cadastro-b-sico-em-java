public class ClienteComum extends Pessoa {
	private int pontuacao;
	private String observacao;
	
	public void cadastrar(int codigo, String nome, String email, String telefone, int pontuacao, String cpf,
			              String observacao) {
		this.codigo = codigo;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.cpf = cpf;
		this.pontuacao = pontuacao;
		this.observacao = observacao;
	}
	
	public String mostrar() {
		return "Cliente " + this.codigo + ": " + this.nome + " | Pontuação: " + this.pontuacao + " | obs:" + this.observacao;
	}

	public int getPontuacao() {
		return pontuacao;
	}

	public void setPontuacao(int pontuacao) {
		this.pontuacao = pontuacao;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
}

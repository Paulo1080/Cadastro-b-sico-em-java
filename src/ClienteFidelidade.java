public class ClienteFidelidade extends Pessoa {
	private int desconto;
	private double bonus;
	
	public void cadastrar(int codigo, String nome, String email, String telefone, String cpf,
			              int desconto, double bonus) {
		this.codigo = codigo;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.cpf = cpf;
		this.desconto = desconto;
		this.bonus = bonus;
	}
	
	public String mostrar() {
		return "Cliente " + this.codigo + ": " + this.nome + " | Desconto: " + this.desconto + "%" + " | Bônus na próxima compra: R$" + this.bonus ;
	}

	public int getDesconto() {
		return desconto;
	}

	public void setDesconto(int desconto) {
		this.desconto = desconto;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
}

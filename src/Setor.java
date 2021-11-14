public class Setor {
	private int id;
	private String descricao;
	
	public void cadastrar(int id, String descricao) {
		this.id = id;
		this.descricao = descricao;
	}
	
	public String mostrar() {
		return "Departamento " + this.id + ": " + this.descricao;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}

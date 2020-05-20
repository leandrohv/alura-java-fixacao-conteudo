package escola;

public class Oficina {
	private int id;
	private String nome;
	private int ano;
	private String nivelRestricao;

	public Oficina(int id, String nome, int ano, String nivelRestricao) {
		super();
		this.id = id;
		this.nome = nome;
		this.ano = ano;
		this.nivelRestricao = nivelRestricao;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAno() {
		return this.ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getNivelRestricao() {
		return this.nivelRestricao;
	}

	public void setNivelRestricao(String nivelRestricao) {
		this.nivelRestricao = nivelRestricao;
	}

	@Override
	public String toString() {
		return "Oficina [id=" + id + ", nome=" + nome + ", ano=" + ano + ", nivelRestricao=" + nivelRestricao + "]";
	}

}

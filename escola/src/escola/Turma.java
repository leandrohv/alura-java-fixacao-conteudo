package escola;

public class Turma {
	private Long id;
	private String nome;
	private int ano;
	private String nivelRestricao;

	public Turma(Long id, String nome, int ano) {
		super();
		this.id = id;
		this.nome = nome;
		this.ano = ano;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
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
		return "Turma [id=" + id + ", nome=" + nome + ", ano=" + ano + ", nivelRestricao=" + nivelRestricao + "]";
	}

}

package escola;

public class Estado {
	private Long id;
	private String nome;
	private String sigla;
	private Pais pais;

	public Estado(Long id, String nome, String sigla, Pais pais) {
		super();
		this.id = id;
		this.nome = nome;
		this.sigla = sigla;
		this.pais = pais;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	@Override
	public String toString() {
		return "Estado [id=" + id + ", nome=" + nome + ", sigla=" + sigla + ", pais=" + pais + "]";
	}

}

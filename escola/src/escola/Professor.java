package escola;

public class Professor {
	private Long id;
	private Pessoa pessoa;
	private String curriculo;

	public Professor(Long id, Pessoa pessoa, String curriculo) {
		super();
		this.id = id;
		this.pessoa = pessoa;
		this.curriculo = curriculo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public String getCurriculo() {
		return curriculo;
	}

	public void setCurriculo(String curriculo) {
		this.curriculo = curriculo;
	}

	@Override
	public String toString() {
		return "Professor [id=" + id + ", pessoa=" + pessoa + ", curriculo=" + curriculo + "]";
	}

}

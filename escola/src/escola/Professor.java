package escola;

public class Professor {
	private Long id;
	private Pessoa pessoa;
	private String curriculo;
	private String disciplinaLeciona;

	public Professor(Long id, Pessoa pessoa, String curriculo, String disciplinaLeciona) {
		super();
		this.id = id;
		this.pessoa = pessoa;
		this.curriculo = curriculo;
		this.disciplinaLeciona = disciplinaLeciona;
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

	public String getDisciplinaLeciona() {
		return disciplinaLeciona;
	}

	public void setDisciplinaLeciona(String disciplinaLeciona) {
		this.disciplinaLeciona = disciplinaLeciona;
	}

	@Override
	public String toString() {
		return "Professor [id=" + id + ", pessoa=" + pessoa + ", curriculo=" + curriculo + ", disciplinaLeciona="
				+ disciplinaLeciona + "]";
	}

}

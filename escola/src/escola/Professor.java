package escola;

public class Professor {
	private int id;
	private Pessoa pessoa;
	private String curriculo;
	private String disciplinaLeciona;

	public Professor(int id, Pessoa pessoa, String curriculo, String disciplinaLeciona) {
		super();
		this.id = id;
		this.pessoa = pessoa;
		this.curriculo = curriculo;
		this.disciplinaLeciona = disciplinaLeciona;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
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

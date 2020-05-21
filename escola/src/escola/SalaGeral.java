package escola;

public class SalaGeral {
	private Long id;
	private Professor professor;
	private Oficina oficina;
	private Disciplina disciplina;

	public SalaGeral(Long id, Professor professor, Oficina oficina, Disciplina disciplina) {
		super();
		this.id = id;
		this.professor = professor;
		this.oficina = oficina;
		this.disciplina = disciplina;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Oficina getOficina() {
		return oficina;
	}

	public void setOficina(Oficina oficina) {
		this.oficina = oficina;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	@Override
	public String toString() {
		return "SalaGeral [id=" + id + ", professor=" + professor + ", oficina=" + oficina + ", disciplina="
				+ disciplina + "]";
	}

}

package escola;

public class Sala {
	private Long id;
	private Professor professor;
	private Turma turma;
	private Disciplina disciplina;
	private int vaga;

	public Sala(Long id, Professor professor, Turma turma, Disciplina disciplina, int vaga) {
		super();
		this.id = id;
		this.professor = professor;
		this.turma = turma;
		this.disciplina = disciplina;
		this.vaga = vaga;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
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

	public int getVaga() {
		return vaga;
	}

	public void setVaga(int vaga) {
		this.vaga = vaga;
	}

	@Override
	public String toString() {
		return "SalaGeral [id=" + id + ", professor=" + professor + ", turma=" + turma + ", disciplina=" + disciplina
				+ ", vaga=" + vaga + "]";
	}

}

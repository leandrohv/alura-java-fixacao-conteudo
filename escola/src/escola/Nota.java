package escola;

public class Nota {
	private Long id;
	private Aluno aluno;
	private Turma turma;
	private double nota;

	public Nota(Long id, Aluno aluno, Turma turma, double nota) {
		super();
		this.id = id;
		this.aluno = aluno;
		this.turma = turma;
		this.nota = nota;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	@Override
	public String toString() {
		return "Bimestre [id=" + id + ", turma=" + turma + ", aluno=" + aluno + ", nota=" + nota + "]";
	}

}

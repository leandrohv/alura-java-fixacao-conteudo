package escola;

public class Bimestre {
	private Long id;
	private SalaGeral salaGeral;
	private Aluno aluno;
	private double nota;
	private int falta;

	public Bimestre(Long id, SalaGeral salaGeral, Aluno aluno, double nota, int falta) {
		super();
		this.id = id;
		this.salaGeral = salaGeral;
		this.aluno = aluno;
		this.nota = nota;
		this.falta = falta;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public SalaGeral getSalaGeral() {
		return salaGeral;
	}

	public void setSalaGeral(SalaGeral salaGeral) {
		this.salaGeral = salaGeral;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	public int getFalta() {
		return falta;
	}

	public void setFalta(int falta) {
		this.falta = falta;
	}

	@Override
	public String toString() {
		return "Bimestre [id=" + id + ", salaGeral=" + salaGeral + ", aluno=" + aluno + ", nota=" + nota + ", falta="
				+ falta + "]";
	}

}

package escola;

public class Bimestre {
	private int id;
	private Aluno aluno;
	private SalaGeral salaGeral;
	private double nota;
	private int falta;

	public Bimestre(int id, Aluno aluno, SalaGeral salaGeral, double nota, int falta) {
		super();
		this.id = id;
		this.aluno = aluno;
		this.salaGeral = salaGeral;
		this.nota = nota;
		this.falta = falta;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public SalaGeral getSalaGeral() {
		return salaGeral;
	}

	public void setSalaGeral(SalaGeral salaGeral) {
		this.salaGeral = salaGeral;
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
		return "Bimestre [id=" + id + ", aluno=" + aluno + ", salaGeral=" + salaGeral + ", nota=" + nota + ", falta="
				+ falta + "]";
	}

}

package escola;

public class SalaGeral {
	private int id;
	private Oficina idOficina;
	private Professor idProfessor;
	private Disciplina idDisciplina;

	public SalaGeral(int id, Oficina idOficina, Professor idProfessor, Disciplina idDisciplina) {
		super();
		this.id = id;
		this.idOficina = idOficina;
		this.idProfessor = idProfessor;
		this.idDisciplina = idDisciplina;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Oficina getIdOficina() {
		return idOficina;
	}

	public void setIdOficina(Oficina idOficina) {
		this.idOficina = idOficina;
	}

	public Professor getIdProfessor() {
		return idProfessor;
	}

	public void setIdProfessor(Professor idProfessor) {
		this.idProfessor = idProfessor;
	}

	public Disciplina getIdDisciplina() {
		return idDisciplina;
	}

	public void setIdDisciplina(Disciplina idDisciplina) {
		this.idDisciplina = idDisciplina;
	}

	@Override
	public String toString() {
		return "SalaGeral [id=" + id + ", idOficina=" + idOficina + ", idProfessor=" + idProfessor + ", idDisciplina="
				+ idDisciplina + "]";
	}

}

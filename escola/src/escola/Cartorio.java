package escola;

import java.util.Date;

public class Cartorio {
	private int id;
	private String nome;
	private String numeroCertidao;
	private Date dataExpedicaoCertidao;
	private int numeroLivro;
	private int numeroPagina;

	public Cartorio(int id, String nome, String numeroCertidao, Date dataExpedicaoCertidao, int numeroLivro,
			int numeroPagina) {
		super();
		this.id = id;
		this.nome = nome;
		this.numeroCertidao = numeroCertidao;
		this.dataExpedicaoCertidao = dataExpedicaoCertidao;
		this.numeroLivro = numeroLivro;
		this.numeroPagina = numeroPagina;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNumeroCertidao() {
		return numeroCertidao;
	}

	public void setNumeroCertidao(String numeroCertidao) {
		this.numeroCertidao = numeroCertidao;
	}

	public Date getDataExpedicaoCertidao() {
		return dataExpedicaoCertidao;
	}

	public void setDataExpedicaoCertidao(Date dataExpedicaoCertidao) {
		this.dataExpedicaoCertidao = dataExpedicaoCertidao;
	}

	public int getNumeroLivro() {
		return numeroLivro;
	}

	public void setNumeroLivro(int numeroLivro) {
		this.numeroLivro = numeroLivro;
	}

	public int getNumeroPagina() {
		return numeroPagina;
	}

	public void setNumeroPagina(int numeroPagina) {
		this.numeroPagina = numeroPagina;
	}

	@Override
	public String toString() {
		return "Cartorio [id=" + id + ", nome=" + nome + ", numeroCertidao=" + numeroCertidao
				+ ", dataExpedicaoCertidao=" + dataExpedicaoCertidao + ", numeroLivro=" + numeroLivro
				+ ", numeroPagina=" + numeroPagina + "]";
	}

}

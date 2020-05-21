package escola;

import java.util.Date;

public class Cartorio {
	private Long id;
	private String nome;
	private String numeroCertidao;
	private Date expedicaoCertidao;
	private int numeroLivro;
	private int numeroPagina;

	public Cartorio(Long id, String nome, String numeroCertidao, Date expedicaoCertidao, int numeroLivro,
			int numeroPagina) {
		super();
		this.id = id;
		this.nome = nome;
		this.numeroCertidao = numeroCertidao;
		this.expedicaoCertidao = expedicaoCertidao;
		this.numeroLivro = numeroLivro;
		this.numeroPagina = numeroPagina;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	public Date getExpedicaoCertidao() {
		return expedicaoCertidao;
	}

	public void setExpedicaoCertidao(Date expedicaoCertidao) {
		this.expedicaoCertidao = expedicaoCertidao;
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
				+ ", expedicaoCertidao=" + expedicaoCertidao + ", numeroLivro=" + numeroLivro
				+ ", numeroPagina=" + numeroPagina + "]";
	}

}

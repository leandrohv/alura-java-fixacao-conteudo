package escola;

import java.util.Date;

public class Pessoa {
	private int id;
	private String nome;
	private String rg;
	private String cpf;
	private String senha;
	private String orgaoEmissor;
	private Date entradaCol;
	private Date saidaCol;
	private Sexo sexo;
	private Logradouro endereco;

	public Pessoa(int id, String nome, String cpf, String senha, Date entradaCol,
			Sexo sexo, Logradouro endereco) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.senha = senha;
		this.entradaCol = entradaCol;
		this.sexo = sexo;
		this.endereco = endereco;
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

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getOrgao_emissor() {
		return orgaoEmissor;
	}

	public void setOrgao_emissor(String orgao_emissor) {
		this.orgaoEmissor = orgao_emissor;
	}

	public Date getEntradaCol() {
		return entradaCol;
	}

	public void setEntradaCol(Date entradaCol) {
		this.entradaCol = entradaCol;
	}

	public Date getSaidaCol() {
		return saidaCol;
	}

	public void setSaidaCol(Date saidaCol) {
		this.saidaCol = saidaCol;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public Logradouro getEndereco() {
		return endereco;
	}

	public void setEndereco(Logradouro endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", nome=" + nome + ", rg=" + rg + ", cpf=" + cpf + ", senha=" + senha
				+ ", orgao_emissor=" + orgaoEmissor + ", entradaCol=" + entradaCol + ", saidaCol=" + saidaCol
				+ ", sexo=" + sexo + ", endereco=" + endereco + "]";
	}

}

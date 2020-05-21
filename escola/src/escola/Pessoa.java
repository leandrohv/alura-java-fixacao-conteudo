package escola;

import java.util.Date;

public class Pessoa {
	private Long id;
	private String nome;
	private Date nascimento;
	private String rg;
	private String cpf;
	private String senha;
	private String orgaoEmissor;
	private Date entrada;
	private Date saida;
	private Sexo sexo;
	private Logradouro endereco;

	public Pessoa(Long id, String nome, Date nascimento, String cpf, String senha, Date entrada, Sexo sexo, Logradouro endereco) {
		super();
		this.id = id;
		this.nome = nome;
		this.nascimento = nascimento;
		this.cpf = cpf;
		this.senha = senha;
		this.entrada = entrada;
		this.sexo = sexo;
		this.endereco = endereco;
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

	public Date getNascimento() {
		return nascimento;
	}

	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
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

	public String getOrgaoEmissor() {
		return orgaoEmissor;
	}

	public void setOrgaoEmissor(String orgaoEmissor) {
		this.orgaoEmissor = orgaoEmissor;
	}

	public Date getEntrada() {
		return entrada;
	}

	public void setEntrada(Date entrada) {
		this.entrada = entrada;
	}

	public Date getSaida() {
		return saida;
	}

	public void setSaida(Date saida) {
		this.saida = saida;
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
		return "Pessoa [id=" + id + ", nome=" + nome + ", nascimento=" + nascimento + ", rg=" + rg + ", cpf=" + cpf + ", senha=" + senha
				+ ", orgaoEmissor=" + orgaoEmissor + ", entrada=" + entrada + ", saida=" + saida + ", sexo=" + sexo
				+ ", endereco=" + endereco + "]";
	}

}

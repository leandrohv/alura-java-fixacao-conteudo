package escola;

public class Logradouro {
	private Long id;
	private int cep;
	private String endereco;
	private String numero;
	private String complemento;
	private String bairro;
	private Cidade cidade;

	public Logradouro(Long id, int cep, String endereco, String numero, String bairro, Cidade cidade) {
		super();
		this.id = id;
		this.cep = cep;
		this.endereco = endereco;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getCep() {
		return cep;
	}

	public void setCep(int cep) {
		this.cep = cep;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public Cidade getCidade() {
		return this.cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	@Override
	public String toString() {
		return "Logradouro [id=" + this.id + ", cep=" + this.cep + ", endereco=" + this.endereco + ", numero="
				+ this.numero + ", complemento=" + this.complemento + ", bairro=" + this.bairro + ", cidade="
				+ this.cidade + "]";
	}

}

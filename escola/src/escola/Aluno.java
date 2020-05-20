package escola;

public class Aluno {
	private int id;
	private Pessoa pessoa;
	private String nomeMae;
	private String nomePai;
	private String cpfMae;
	private String cpfPai;
	private String telefone;
	private String celular;
	private Cartorio cartorio;

	public Aluno(int id, Pessoa pessoa, String nomeMae, String nomePai, String celular, Cartorio cartorio) {
		super();
		this.id = id;
		this.pessoa = pessoa;
		this.nomeMae = nomeMae;
		this.nomePai = nomePai;
		this.celular = celular;
		this.cartorio = cartorio;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public String getCpfMae() {
		return cpfMae;
	}

	public void setCpfMae(String cpfMae) {
		this.cpfMae = cpfMae;
	}

	public String getCpfPai() {
		return cpfPai;
	}

	public void setCpfPai(String cpfPai) {
		this.cpfPai = cpfPai;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public Cartorio getCartorio() {
		return cartorio;
	}

	public void setCartorio(Cartorio cartorio) {
		this.cartorio = cartorio;
	}

	@Override
	public String toString() {
		return "Aluno [id=" + id + ", pessoa=" + pessoa + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai + ", cpfMae="
				+ cpfMae + ", cpfPai=" + cpfPai + ", telefone=" + telefone + ", celular=" + celular + ", cartorio="
				+ cartorio + "]";
	}

}

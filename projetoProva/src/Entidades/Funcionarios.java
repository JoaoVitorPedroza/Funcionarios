package Entidades;
import java.util.Date;
public class Funcionarios {
	protected String nome;
	protected Integer numeroIndenticacao;
	protected Date dataAdmissao;
	protected Double salario;
	public Funcionarios(String nome, Integer numeroIndenticacao, Date dataAdmissao, Double salario) {
		super();
		this.nome = nome;
		this.numeroIndenticacao = numeroIndenticacao;
		this.dataAdmissao = dataAdmissao;
		this.salario = salario;
	}
	
	public Funcionarios(String nome2, String captura, Double salario2) {
		// TODO Auto-generated constructor stub
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getNumeroIndenticacao() {
		return numeroIndenticacao;
	}

	public void setNumeroIndenticacao(Integer numeroIndenticacao) {
		this.numeroIndenticacao = numeroIndenticacao;
	}

	public Date getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(Date dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Total";
	}
	
}
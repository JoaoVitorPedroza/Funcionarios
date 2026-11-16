package Entidades;

import java.util.Date;

public class Estagiario extends Funcionarios {
	protected Double valorBolsa = 1.200;
	protected String universidade;
	protected Double calcularSalario;
	//da classe
	Integer tempoEstagio = 6;
	public Estagiario(Double valorBolsa, String universidade, Double calcularSalario, String nome, Integer numeroIndenticacao, Date dataAdmissao, Double salario) {
		super(nome, numeroIndenticacao, dataAdmissao,  salario);
		this.valorBolsa = valorBolsa;
		this.universidade = universidade;
		this.calcularSalario = calcularSalario;
	}
	public Double getValorBolsa() {
		return valorBolsa;
	}
	public void setValorBolsa(Double valorBolsa) {
		this.valorBolsa = valorBolsa;
	}
	public String getUniversidade() {
		return universidade;
	}
	public void setUniversidade(String universidade) {
		this.universidade = universidade;
	}
	public Double getCalcularSalario() {
		return calcularSalario;
	}
	public void setCalcularSalario(Double calcularSalario) {
		this.calcularSalario = calcularSalario;
	}
	public Double calcularSalario() {
		return valorBolsa; 
	}
	@Override
	public String toString() {
		return "Estagiario [valorBolsa=" + valorBolsa + ", universidade=" + universidade + ", calcularSalario="
				+ calcularSalario + "]";
	}
	
}
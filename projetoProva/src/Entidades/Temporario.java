package Entidades;

import java.util.Date;

public class Temporario extends Funcionarios{
	protected  Double salarioHora;
	protected Integer horas;
	public Temporario(Double salarioHora, Integer horas, String nome, Integer numeroIndenticacao, Date dataAdmissao, Double salario) {
		super(nome, numeroIndenticacao, dataAdmissao,  salario);
		this.salarioHora = salarioHora;
		this.horas = horas;
	}
	public Double getSalarioHora() {
		return salarioHora;
	}
	public void setSalarioHora(Double salarioHora) {
		this.salarioHora = salarioHora;
	}
	public Integer getHoras() {
		return horas;
	}
	public void setHoras(Integer horas) {
		this.horas = horas;
	}
	public  Double calcularSalario(Double salario, Integer horas) {
		return salarioHora = salario*horas;
	}
	@Override
	public String toString() {
		return "Salario por hora: "+ salarioHora;
	}
	
}

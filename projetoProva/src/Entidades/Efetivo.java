package Entidades;

import java.util.Date;

public class Efetivo extends Funcionarios {
	protected Double salarioMensal;
	
	public Efetivo(String nome, Integer numeroIndenticacao, Date dataAdmissao, Double salario) {
		super(nome, numeroIndenticacao, dataAdmissao,  salario);
	}
	
	public Double getSalarioMensal() {
		return salarioMensal;
	}

	public void setSalarioMensal(Double salarioMensal) {
		this.salarioMensal = salarioMensal;
	}

	public Double calcularSalario(Double salario) {
		return salarioMensal;
	}

	@Override
	public String toString() {
		return "Efetivo [salarioMensal=" + salarioMensal + "]";
	}

}

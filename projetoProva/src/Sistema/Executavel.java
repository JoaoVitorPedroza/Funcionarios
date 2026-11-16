package Sistema;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import Entidades.Estagiario;
import Entidades.Efetivo;
import Entidades.Funcionarios;
import Entidades.Temporario;

public class Executavel {
	static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public static void main(String[] args) throws ParseException{
		// TODO Auto-generated method stub
		ArrayList<Funcionarios> Efetivos = new ArrayList<>();
		ArrayList<Funcionarios> Temporarios = new ArrayList<>();
		ArrayList<Funcionarios> Estagiarios = new ArrayList<>();
		String Nome, captura;
		Integer tipo, numeroFun;
	
		Double salario;
		Scanner sc = new Scanner(System.in);
		System.out.println("informe o numero de funcionarios: ");
		numeroFun = sc.nextInt();
		for(int i = 0; numeroFun > i;i++) {
		System.out.println("*** Informe os dados dos funcionários ***");
		sc.nextLine();
		System.out.println("Nome: ");
		Nome = sc.nextLine();
		System.out.println("Data Admissão (DD/MM/YYYY): ");
		captura = sc.next();
		Date data = sdf.parse(captura);
		System.out.println("Informe o tipo (1)Efetivo (2)Estagiário (3)Temporário: ");
		tipo = sc.nextInt();
		System.out.println("Informe o salário mensal: ");
		salario = sc.nextDouble();
		if (tipo == 1) {
			Efetivos.add(new Efetivo(Nome, i, data, salario));
			int EfetivoL = 1;
			Funcionarios funcionario = new Funcionarios (Nome, captura, salario);
		} 
		else if (tipo == 2) {
			Estagiarios.add(new Estagiario(salario, Nome, salario, captura, i, data, salario));
			int EstagiarioL = 1;
		} 
		else if (tipo == 3) {
			Temporarios.add(new Temporario(salario, i, Nome, i, data, salario));
			int TemporarioL = 1;
		} 
		else {
			System.out.println("Tipo inválido! Funcionário não cadastrado.");
		}
		
		}
	}

}

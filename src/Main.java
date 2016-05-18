import java.util.Scanner;

import com.sun.javafx.css.CalculatedValue;

import java.util.ArrayList;

public class Main {
	private static ArrayList<Paciente> Pacientes;
	Scanner Entrada;
	static String eNome;
	static int eIdade;
	static double ePeso;
	static double eAltura;
	static String eSexo;
	static double eIMC;
	static double eNivel;
	
	public static void main(String[] args) {
		/* solicita os dados : nome, idade, peso, altura, sexo
		 * calcula o imc
		 * lista os n�veis de atividade fisica, conforme o sexo
		 * ao informar o nivel de ativ, calcular a nee correspondente (homem/mulher eutrofico/sobrepeso)
		*/
		Pacientes = new ArrayList<Paciente>();
		do{
			Scanner Entrada = new Scanner(System.in);
			System.out.print("Informe o Nome do paciente. > ");
			eNome = Entrada.nextLine();
			Entrada.nextLine();
			System.out.print("Informe a idade. > ");
			eIdade = Entrada.nextInt();
			System.out.print("Informe o peso. > ");
			ePeso = Entrada.nextDouble();
			System.out.print("Informe a altura. > ");
			eAltura = Entrada.nextDouble();
			IMC cIMC = new IMC();			
			eIMC = cIMC.CalculaImc(ePeso, eAltura);
			System.out.println("IMC calculado: " + eIMC);
			System.out.print("Informe o sexo. > ");
			eSexo= Entrada.nextLine();
			
			try{
				Paciente NovoPaciente = new Paciente(eNome,eIdade,ePeso,eAltura,eSexo,eIMC);
				NivelAtividade cNivel = new NivelAtividade();
				cNivel.ListaNivelAtividade(NovoPaciente);
				System.out.print("Informe o nivel de atividade fisica. >");
				eNivel = Entrada.nextDouble();
				NEE cNEE = new NEE();
				cNEE.CalculaNEE(NovoPaciente, eNivel);
			}
			catch(IllegalArgumentException e){
				System.out.println("Informe em 'sexo': masculino ou feminino");
			}
			
		}while(true);
	}
}
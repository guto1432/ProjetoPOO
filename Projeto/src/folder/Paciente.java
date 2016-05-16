
public class Paciente extends Pessoa {
	private double IMC;
	
	public Paciente(String sNome, int iIdade, double dPeso, double dAltura, String sSexo, double dIMC) {
		super(sNome, iIdade, dPeso, dAltura, sSexo);
		IMC = dIMC;
	}

}


public class Pessoa {
    //Campos
    private String Nome;
    private int Idade;
    private double Peso;
    private double Altura;
    private String Sexo;
    
    
    //Construtor
    public Pessoa(String sNome, int iIdade, double dPeso, double dAltura, String sSexo)
    {        
    	Nome = sNome;
        Idade = iIdade;
        Peso = dPeso;
        Altura = dAltura;
        if (("MASCULINO".equals(sSexo.toUpperCase())|| ("FEMININO".equals(sSexo.toUpperCase())))){
        	Sexo = sSexo.toUpperCase();
        }
        else{
        	throw new IllegalArgumentException();
        }
    }


	public String getNome() {
		return Nome;
	}


	public void setNome(String nome) {
		Nome = nome;
	}


	public int getIdade() {
		return Idade;
	}


	public void setIdade(int idade) {
		Idade = idade;
	}


	public double getPeso() {
		return Peso;
	}


	public void setPeso(double peso) {
		Peso = peso;
	}


	public double getAltura() {
		return Altura;
	}


	public void setAltura(double altura) {
		Altura = altura;
	}


	public String getSexo() {
		return Sexo;
	}


	public void setSexo(String sexo) {
		Sexo = sexo;
	}
    
}

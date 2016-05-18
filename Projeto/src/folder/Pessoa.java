package folder;

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
        if ("MASCULINO".equals(sSexo.toUpperCase()|| "FEMININO".equals(sSexo.toUpperCase()))){
        	Sexo = sSexo.toUpperCase();
        }
        else{
        	throw new IllegalArgumentException();
        }
    }
}

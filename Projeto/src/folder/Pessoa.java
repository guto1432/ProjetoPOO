package folder;


public class Pessoa {
    //Campos
    String Nome;
    String Sexo;
    int Idade;
    double Peso;
    double Altura;
    double N_atividade;
    
    //Construtor
    public Pessoa(String sNome, String sexo, int iIdade, double dPeso, double dAltura, double Nivel)
    {
        Nome = sNome;
        Sexo = sexo;
	Idade = iIdade;
	Peso = dPeso;
	Altura = dAltura;
        N_atividade = Nivel;
    }
}

/**
 *
 * @author Thalyson
 */
public class Recomendacao {
    //Campos    
    private String CARBOIDRATO;
    private String CHOSIMPLES;
    private String LIPIDEOS;
    private String PROTEINAS;
    private double dValorDesvio;
    private double dValorNEE;
    
    //Construtor
    public Recomendacao()
    {
        CARBOIDRATO = "55 A 75%";
        CHOSIMPLES = "<10%";
        LIPIDEOS = "15  30%";
        PROTEINAS = "10 a 15%";
    }
    
    public void gettabela()
    {
        System.out.println("RECOMENDAÇÃO DRI (2005)" + "\n" + "Carboidrato = " + CARBOIDRATO + "\n" + "CHO SIMPLES = " + CHOSIMPLES + "\n" + "Lipídeos = " + LIPIDEOS + "\n" + "Proteínas = " + PROTEINAS + "\n");
    }
    
    //Metodo que gera a recomendação
    public String Receita(Paciente pPaciente, double dNivel)
    {
        double CH = 0,LI = 0,PTN = 0,total = 0;
        NEE calcNEE = new NEE();
        dValorNEE = calcNEE.CalculaNEE(pPaciente, dNivel);
        if("MASCULINO".equals(pPaciente.getSexo()))
        {
        	dValorDesvio = dValorNEE - 416;
            CH = dValorDesvio*75/100;
            LI = dValorDesvio*15/100;
            PTN = dValorDesvio*10*100;
            total = CH+LI+PTN;
        }
        
        if("FEMININO".equals(pPaciente.getSexo()))
        {
        	dValorDesvio = dValorNEE - 320;
            CH = dValorDesvio*75/100;
            LI = dValorDesvio*15/100;
            PTN = dValorDesvio*10*100;
            total = CH+LI+PTN;
        }
        return "CHO    LIP    PTN    TOTAL" + "\n" + CH + "    " + LI + "    " + PTN + "    " + total + " Kcal/dia" + "\n" + CH/4 + "    " + LI/9 + "    " + PTN/4 + "    " + CH/4+LI/9+PTN/4 + " g/dia" + "\n";                    
    }
}
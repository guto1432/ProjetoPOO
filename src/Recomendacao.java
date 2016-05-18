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
    public String Receita(String sexo)
    {
        double CH,LI,PTN,total;
        if("Masculino".equals(sexo) || "masculino".equals(sexo))
        {
            CH = 670*75/100;
            LI = 670*15/100;
            PTN = 670*10*100;
            total = CH+LI+PTN;
            return "CHO    LIP    PTN    TOTAL" + "\n" + CH + "    " + LI + "    " + PTN + "    " + total + " Kcal/dia" + "\n" + CH/4 + "    " + LI/9 + "    " + PTN/4 + "    " + CH/4+LI/9+PTN/4 + " g/dia" + "\n";                    
        }
        
        if("Femenino".equals(sexo) || "femenino".equals(sexo))
        {
            CH = 128*75/100;
            LI = 128*15/100;
            PTN = 128*10*100;
            total = CH+LI+PTN;
            return "CHO    LIP    PTN    TOTAL" + "\n" + CH + "    " + LI + "    " + PTN + "    " + total + " Kcal/dia" + "\n" + CH/4 + "    " + LI/9 + "    " + PTN/4 + "    " + CH/4+LI/9+PTN/4 + " g/dia" + "\n";                    
        }
        return null;
    }
}
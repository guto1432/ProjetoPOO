package folder;

/**
 *
 * @author Thalyson
 */
public class BasedeDados {
    
    //Método para retorno da tabela de Eutróficos
    public void Eutroficos(String sexo)
    {
        if("feminino".equals(sexo) || "Feminino".equals(sexo))
        {
            System.out.println("NAF=    1   SEDENTÁRIO" + "\n" + "NAF=    1,12   ATIVIDADE LEVE" + "\n" + "NAF=    1,27   ATIVIDADE MODERADA" + "\n" + "NAF=    1,45   ATIVIDADE INTENSA" + "\n");
        }
        else
        {
            if("masculino".equals(sexo) || "Masculino".equals(sexo))
            {
                System.out.println("NAF=    1   SEDENTÁRIO" + "\n" + "NAF=    1,11   ATIVIDADE LEVE" + "\n" + "NAF=    1,25   ATIVIDADE MODERADA" + "\n" + "NAF=    1,48   ATIVIDADE INTENSA" + "\n");
            }
        }
    }
    
    //Método para retorno da tabela de Sobrepesos
    public void SOBREPESOS(String sexo)
    {
        if("feminino".equals(sexo) || "Feminino".equals(sexo))
        {
            System.out.println("NAF=    1   SEDENTÁRIO" + "\n" + "NAF=    1,12   ATIVIDADE LEVE" + "\n" + "NAF=    1,27   ATIVIDADE MODERADA" + "\n" + "NAF=    1,45   ATIVIDADE INTENSA" + "\n");
        }
        else
        {
            if("masculino".equals(sexo) || "Masculino".equals(sexo))
            {
                System.out.println("NAF=    1   SEDENTÁRIO" + "\n" + "NAF=    1,12   ATIVIDADE LEVE" + "\n" + "NAF=    1,29   ATIVIDADE MODERADA" + "\n" + "NAF=    1,59   ATIVIDADE INTENSA" + "\n");
            }
        }
    }
    
}

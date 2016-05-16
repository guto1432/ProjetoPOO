package folder;

/**
 *
 * @author Thalyson
 */
public class CinturaQuadril {
    //Campos
    private double Cintura;
    private double Quadril;
    
    //Construtor
    public CinturaQuadril(double TamC, double TamQ)
    {
        Cintura = TamC;
        Quadril = TamQ;
    }
    
    //Calcula a relação
    private double relacao()
    {
        return Cintura/Quadril; 
    }
    
    //Mostra o resultado do calculo
    public String calculaRelacao(String sexo, int idade)
    {
        if("Feminino".equals(sexo) || "feminino".equals(sexo))
        {
            if(idade <= 29)
            {
                if(relacao() <= 0.71)
                {//Informar que o índice é baixo
                    return "PCCQ BAIXO" + "\n";
                }else{
                    if(relacao() <= 0.77)
                    {
                        return "PCCQ MODERADO" + "\n";
                    }else{
                        if(relacao() <= 0.81)
                        {
                            return "PCCQ ALTO" + "\n";
                        }else{
                            return "PCCQ MUITO ALTO!" + "\n";
                        }
                    }
                }
            }else{
                if(idade <= 39)
                {
                    if(relacao() <= 0.72)
                    {//Informar que o índice é baixo
                        return "PCCQ BAIXO" + "\n";
                    }else{
                        if(relacao() <= 0.78)
                        {
                            return "PCCQ MODERADO" + "\n";
                        }else{
                            if(relacao() <= 0.84)
                            {
                                return "PCCQ ALTO" + "\n";
                            }else{
                                return "PCCQ MUITO ALTO!" + "\n";
                            }
                        }
                    }
                }else{
                    if(idade <= 49)
                    {
                        if(relacao() <= 0.73)
                        {//Informar que o índice é baixo
                            return "PCCQ BAIXO" + "\n";
                        }else{
                            if(relacao() <= 0.79)
                            {
                                return "PCCQ MODERADO" + "\n";
                            }else{
                                if(relacao() <= 0.87)
                                {
                                    return "PCCQ ALTO" + "\n";
                                }else{
                                    return "PCCQ MUITO ALTO!" + "\n";
                                }
                            }
                        }
                    }else{
                        if(idade <=59)
                        {
                            if(relacao() <= 0.74)
                            {//Informar que o índice é baixo
                                return "PCCQ BAIXO" + "\n";
                            }else{
                                if(relacao() <= 0.81)
                                {
                                    return "PCCQ MODERADO" + "\n";
                                }else{
                                    if(relacao() <= 0.88)
                                    {
                                        return "PCCQ ALTO" + "\n";
                                    }else{
                                        return "PCCQ MUITO ALTO!" + "\n";
                                    }
                                }
                            }
                        }else{
                            if(relacao() <= 0.76)
                            {//Informar que o índice é baixo
                                return "PCCQ BAIXO" + "\n";
                            }else{
                                if(relacao() <= 0.83)
                                {
                                    return "PCCQ MODERADO" + "\n";
                                }else{
                                    if(relacao() <= 0.90)
                                    {
                                        return "PCCQ ALTO" + "\n";
                                    }else{
                                        return "PCCQ MUITO ALTO!" + "\n";
                                    }
                                }
                            }
                        }
                    }
                }
            }
            
        }
            
        if("Masculino".equals(sexo) || "masculino".equals(sexo))
        {
            if(idade <= 29)
            {
                if(relacao() <= 0.83)
                {//Informar que o índice é baixo
                    return "PCCQ BAIXO" + "\n";
                }else{
                    if(relacao() <= 0.88)
                    {
                        return "PCCQ MODERADO" + "\n";
                    }else{
                        if(relacao() <= 0.94)
                        {
                            return "PCCQ ALTO" + "\n";
                        }else{
                            return "PCCQ MUITO ALTO!" + "\n";
                        }
                    }
                }
            }else{
                if(idade <= 39)
                {
                    if(relacao() <= 0.84)
                    {//Informar que o índice é baixo
                        return "PCCQ BAIXO" + "\n";
                    }else{
                        if(relacao() <= 0.91)
                        {
                            return "PCCQ MODERADO" + "\n";
                        }else{
                            if(relacao() <= 0.96)
                            {
                                return "PCCQ ALTO" + "\n";
                            }else{
                                return "PCCQ MUITO ALTO!" + "\n";
                            }
                        }
                    }
                }else{
                    if(idade <= 49)
                    {
                        if(relacao() <= 0.88)
                        {//Informar que o índice é baixo
                            return "PCCQ BAIXO" + "\n";
                        }else{
                            if(relacao() <= 0.95)
                            {
                                return "PCCQ MODERADO" + "\n";
                            }else{
                                if(relacao() <= 1)
                                {
                                    return "PCCQ ALTO" + "\n";
                                }else{
                                    return "PCCQ MUITO ALTO!" + "\n";
                                }
                            }
                        }
                    }else{
                        if(idade <=59)
                        {
                            if(relacao() <= 0.90)
                            {//Informar que o índice é baixo
                                return "PCCQ BAIXO" + "\n";
                            }else{
                                if(relacao() <= 0.96)
                                {
                                    return "PCCQ MODERADO" + "\n";
                                }else{
                                    if(relacao() <= 1.02)
                                    {
                                        return "PCCQ ALTO" + "\n";
                                    }else{
                                        return "PCCQ MUITO ALTO!" + "\n";
                                    }
                                }
                            }
                        }else{
                            if(relacao() <= 0.91)
                            {//Informar que o índice é baixo
                                return "PCCQ BAIXO" + "\n";
                            }else{
                                if(relacao() <= 0.98)
                                {
                                    return "PCCQ MODERADO" + "\n";
                                }else{
                                    if(relacao() <= 1.03)
                                    {
                                        return "PCCQ ALTO" + "\n";
                                    }else{
                                        return "PCCQ MUITO ALTO!" + "\n";
                                    }
                                }
                            }
                        }
                    }
                }
            }
            
        }
        return null;
    }
}

package Classes;

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
    public String calculaRelacao(Paciente pPaciente)
    {
        if("FEMININO".equals(pPaciente.getSexo().toUpperCase()))
        {
            if(pPaciente.getIdade() <= 29)
            {
                if(relacao() <= 0.71)
                {//Informar que o índice é baixo
                    return "\n" + "PCCQ BAIXO" + "\n";
                }else{
                    if(relacao() <= 0.77)
                    {
                        return "\n" + "PCCQ MODERADO" + "\n";
                    }else{
                        if(relacao() <= 0.81)
                        {
                            return "\n" + "PCCQ ALTO" + "\n";
                        }else{
                            return "\n" + "PCCQ MUITO ALTO!" + "\n";
                        }
                    }
                }
            }else{
                if(pPaciente.getIdade() <= 39)
                {
                    if(relacao() <= 0.72)
                    {//Informar que o índice é baixo
                        return "\n" + "PCCQ BAIXO" + "\n";
                    }else{
                        if(relacao() <= 0.78)
                        {
                            return "\n" + "PCCQ MODERADO" + "\n";
                        }else{
                            if(relacao() <= 0.84)
                            {
                                return "\n" + "PCCQ ALTO" + "\n";
                            }else{
                                return "\n" + "PCCQ MUITO ALTO!" + "\n";
                            }
                        }
                    }
                }else{
                    if(pPaciente.getIdade() <= 49)
                    {
                        if(relacao() <= 0.73)
                        {//Informar que o índice é baixo
                            return "\n" + "PCCQ BAIXO" + "\n";
                        }else{
                            if(relacao() <= 0.79)
                            {
                                return "\n" + "PCCQ MODERADO" + "\n";
                            }else{
                                if(relacao() <= 0.87)
                                {
                                    return "\n" + "PCCQ ALTO" + "\n";
                                }else{
                                    return "\n" + "PCCQ MUITO ALTO!" + "\n";
                                }
                            }
                        }
                    }else{
                        if(pPaciente.getIdade() <=59)
                        {
                            if(relacao() <= 0.74)
                            {//Informar que o índice é baixo
                                return "\n" + "PCCQ BAIXO" + "\n";
                            }else{
                                if(relacao() <= 0.81)
                                {
                                    return "\n" + "PCCQ MODERADO" + "\n";
                                }else{
                                    if(relacao() <= 0.88)
                                    {
                                        return "\n" + "PCCQ ALTO" + "\n";
                                    }else{
                                        return "\n" + "PCCQ MUITO ALTO!" + "\n";
                                    }
                                }
                            }
                        }else{
                            if(relacao() <= 0.76)
                            {//Informar que o índice é baixo
                                return "\n" + "PCCQ BAIXO" + "\n";
                            }else{
                                if(relacao() <= 0.83)
                                {
                                    return "\n" + "PCCQ MODERADO" + "\n";
                                }else{
                                    if(relacao() <= 0.90)
                                    {
                                        return "\n" + "PCCQ ALTO" + "\n";
                                    }else{
                                        return "\n" + "PCCQ MUITO ALTO!" + "\n";
                                    }
                                }
                            }
                        }
                    }
                }
            }
            
        }
            
        if("MASCULINO".equals(pPaciente.getSexo().toUpperCase()))
        {
            if(pPaciente.getIdade() <= 29)
            {
                if(relacao() <= 0.83)
                {//Informar que o índice é baixo
                    return "\n" + "PCCQ BAIXO" + "\n";
                }else{
                    if(relacao() <= 0.88)
                    {
                        return "\n" + "PCCQ MODERADO" + "\n";
                    }else{
                        if(relacao() <= 0.94)
                        {
                            return "\n" + "PCCQ ALTO" + "\n";
                        }else{
                            return "\n" + "PCCQ MUITO ALTO!" + "\n";
                        }
                    }
                }
            }else{
                if(pPaciente.getIdade() <= 39)
                {
                    if(relacao() <= 0.84)
                    {//Informar que o índice é baixo
                        return "\n" + "PCCQ BAIXO" + "\n";
                    }else{
                        if(relacao() <= 0.91)
                        {
                            return "\n" + "PCCQ MODERADO" + "\n";
                        }else{
                            if(relacao() <= 0.96)
                            {
                                return "\n" + "PCCQ ALTO" + "\n";
                            }else{
                                return "\n" + "PCCQ MUITO ALTO!" + "\n";
                            }
                        }
                    }
                }else{
                    if(pPaciente.getIdade() <= 49)
                    {
                        if(relacao() <= 0.88)
                        {//Informar que o índice é baixo
                            return "\n" + "PCCQ BAIXO" + "\n";
                        }else{
                            if(relacao() <= 0.95)
                            {
                                return "\n" + "PCCQ MODERADO" + "\n";
                            }else{
                                if(relacao() <= 1)
                                {
                                    return "\n" + "PCCQ ALTO" + "\n";
                                }else{
                                    return "\n" + "PCCQ MUITO ALTO!" + "\n";
                                }
                            }
                        }
                    }else{
                        if(pPaciente.getIdade() <=59)
                        {
                            if(relacao() <= 0.90)
                            {//Informar que o índice é baixo
                                return "\n" + "PCCQ BAIXO" + "\n";
                            }else{
                                if(relacao() <= 0.96)
                                {
                                    return "\n" + "PCCQ MODERADO" + "\n";
                                }else{
                                    if(relacao() <= 1.02)
                                    {
                                        return "\n" + "PCCQ ALTO" + "\n";
                                    }else{
                                        return "\n" + "PCCQ MUITO ALTO!" + "\n";
                                    }
                                }
                            }
                        }else{
                            if(relacao() <= 0.91)
                            {//Informar que o índice é baixo
                                return "\n" + "PCCQ BAIXO" + "\n";
                            }else{
                                if(relacao() <= 0.98)
                                {
                                    return "\n" + "PCCQ MODERADO" + "\n";
                                }else{
                                    if(relacao() <= 1.03)
                                    {
                                        return "\n" + "PCCQ ALTO" + "\n";
                                    }else{
                                        return "\n" + "PCCQ MUITO ALTO!" + "\n";
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

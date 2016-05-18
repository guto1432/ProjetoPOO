public class NEE{
    
    private double Resultado;
    
    /*public String CalculaNEE(Paciente pPaciente, double dNivel){
    	if ("FEMININO".equals(pPaciente.))
    }*/
    
    //Calculos da NEE EUTROFICOS
    public String NEE_eutroficos(int idade, double nivelATV, double peso, double altura, String sexo)
    {
        if("Feminino".equals(sexo) || "feminino".equals(sexo))
        {
            Resultado = ( 354 - (idade*6.91) + (nivelATV * (9.36*peso + 726*altura)));
            return Resultado + " Kcal/dia." + "\n";
        }

        if("Masculino".equals(sexo) || "masculino".equals(sexo))
        {
            Resultado = (662-(idade*9.53) + (nivelATV * (15.91*peso+540*altura)));
            return Resultado + " Kcal/dia." + "\n";
        }
        return null;
    }
    
    //Calculos da NEE OBESOS
    public String NEE_obesos(int idade, double nivelATV, double peso, double altura, String sexo)
    {
        if("Feminino".equals(sexo) || "feminino".equals(sexo))
        {
            Resultado = ( 448 - (idade*7.95) + (nivelATV * (11.4*peso + 619*altura)));
            return Resultado + " Kcal/dia." + "\n";
        }

        if("Masculino".equals(sexo) || "masculino".equals(sexo))
        {
            Resultado = (1086-(idade*10.1) + (nivelATV * (13.7*peso+416*altura)));
            return Resultado + " Kcal/dia." + "\n";
        }
        return null;
    }
}
public class NEE{
    
    private double Resultado;
    
    public double CalculaNEE(Paciente pPaciente, double dNivel){
    	if ("FEMININO".equals(pPaciente.getSexo().toUpperCase())){
    		if(pPaciente.getIMC()>=25){
                Resultado = ( 448 - (pPaciente.getIdade()*7.95) + (dNivel* (11.4*pPaciente.getPeso()+ 619*pPaciente.getAltura())));
    		}
    		else{
                Resultado = ( 354 - (pPaciente.getIdade()*6.91) + (dNivel* (9.36*pPaciente.getPeso()+ 726*pPaciente.getAltura())));
    		}    			
		}
    	else{
    		if(pPaciente.getIMC()>=25){
                Resultado = (1086-(pPaciente.getIdade()*10.1) + (dNivel* (13.7*pPaciente.getPeso()+416*pPaciente.getAltura())));
    		}
    		else{
                Resultado = (662-(pPaciente.getIdade()*9.53) + (dNivel* (15.91*pPaciente.getPeso()+540*pPaciente.getAltura())));    			
    		}
    	}
        return Resultado;
    	}
}

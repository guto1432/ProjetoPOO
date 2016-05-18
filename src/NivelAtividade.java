
public class NivelAtividade {
	public void ListaNivelAtividade(Paciente pPaciente){
    	if ("FEMININO".equals(pPaciente.getSexo().toUpperCase())){
    		if(pPaciente.getIMC()>=25){
    			System.out.println("NAF=    1   SEDENTÃ�RIO" + "\n" + "NAF=    1,12   ATIVIDADE LEVE" + "\n" + "NAF=    1,27   ATIVIDADE MODERADA" + "\n" + "NAF=    1,45   ATIVIDADE INTENSA" + "\n");
    		}
			else{
				System.out.println("NAF=    1   SEDENTÃ�RIO" + "\n" + "NAF=    1,12   ATIVIDADE LEVE" + "\n" + "NAF=    1,27   ATIVIDADE MODERADA" + "\n" + "NAF=    1,45   ATIVIDADE INTENSA" + "\n");
			}
    	}
		else{
			if(pPaciente.getIMC()>=25){
				System.out.println("NAF=    1   SEDENTÃ�RIO" + "\n" + "NAF=    1,12   ATIVIDADE LEVE" + "\n" + "NAF=    1,29   ATIVIDADE MODERADA" + "\n" + "NAF=    1,59   ATIVIDADE INTENSA" + "\n");
			}
			else{
				System.out.println("NAF=    1   SEDENTÃ�RIO" + "\n" + "NAF=    1,11   ATIVIDADE LEVE" + "\n" + "NAF=    1,25   ATIVIDADE MODERADA" + "\n" + "NAF=    1,48   ATIVIDADE INTENSA" + "\n");
			}
		}
	}
}
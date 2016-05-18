package folder;

/**
 *
 * @author Thalyson
 */
public class IMC {
    private double imc;
    
    public double CalculaImc(double peso, double altura)
    {
        imc = peso/(altura*altura);
        return imc;
    }
}

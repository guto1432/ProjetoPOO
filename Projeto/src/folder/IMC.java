/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package folder;

/**
 *
 * @author bob
 */
public class IMC {
    private double imc;
    
    public double CalculaImc(double peso, double altura)
    {
        imc = peso/(altura*altura);
        return imc;
    }
}

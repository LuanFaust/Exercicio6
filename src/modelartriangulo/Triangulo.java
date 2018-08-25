/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelartriangulo;

/**
 *
 * @author Luan
 */
public class Triangulo {
    private double ladoa;
    private double ladob;

    /**
     * @return the ladoa
     */
    public double getLadoa() {
        return ladoa;
    }

    /**
     * @param ladoa the ladoa to set
     */
    public void setLadoa(double ladoa) {
        this.ladoa = ladoa;
    }

    /**
     * @return the ladob
     */
    public double getLadob() {
        return ladob;
    }

    /**
     * @param ladob the ladob to set
     */
    public void setLadob(double ladob) {
        this.ladob = ladob;
    }
    
    public double CalcularPerimetro()
        {
            return 2 *(ladoa + ladob);
        }

        public double CalcularArea()
        {
            return ladoa * ladob;
        }
    
}

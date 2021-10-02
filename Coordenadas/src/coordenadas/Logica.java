/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coordenadas;

/**
 *
 * @author Usuario
 */
public class Logica {

    private int a, b, c;

    public Logica() {
    }

    public String distancia(int aux1,int aux2,int aux3,int aux4,int aux5,int aux6) {

        double res;
        res = Math.sqrt(Math.pow((aux1 - aux3), 2) + (Math.pow((aux2-aux4), 2)) + (Math.pow((aux5-aux6), 2)));
        res = Math.round(res * 100d) / 100d;
        String s;
        s = String.valueOf(res);
        
        
        return s;
    }
   
}

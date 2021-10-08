/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica1_grupo2;
import org.mariuszgromada.math.mxparser.*;
/**
 *
 * @author teval
 */
public class Calculador {
    
    public static String operar(String texto){
        String parceText = new Ecuaciones().parceText(texto);
        Expression exp = new Expression(parceText);
        return(String.valueOf(exp.calculate()));
    }
}

package practica1_grupo2;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedList;
import org.mariuszgromada.math.mxparser.*;

/**
 *
 * @author luis-ep
 */

public class Asignacion {

    private String strExpresion;
    private double resultado;        
    private Argument[] variables;        
    
    public Asignacion(LinkedList<Constant> listaValores, String strExpresion) {        
        this.strExpresion = strExpresion;                
        resolverExpresion(strExpresion, listaValores);
    }
                
    private void resolverExpresion(String strExpresion, LinkedList<Constant> listaValores) {                
        Expression expresion = new Expression(strExpresion);        
        expresion.addConstants(listaValores);        
        this.resultado = expresion.calculate();
        System.out.println(expresion.calculate());
        System.out.println(expresion.checkSyntax());
    }
    
    public double getResultado() {
        return this.resultado;
    }
    
}

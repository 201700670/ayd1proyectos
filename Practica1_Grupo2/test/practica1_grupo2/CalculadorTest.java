/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1_grupo2;

import junit.framework.TestCase;
import org.mariuszgromada.math.mxparser.Expression;

/**
 *
 * @author teval
 */
public class CalculadorTest extends TestCase{
    
    private String entrada = "5+5+5-5-5*5/5*(5^2)^(1/2)";
    
    private String entrada2 = "5+5+5-(5)-5*5/5(5^2)^(1/2)";
    
    private String entradaError = "5+5+5-^(5)-5*5/0(5^2)^(1/2)";
    
    public void testOperar(){
        System.out.println("Calculadora TEST 1");
        double resultado = Double.parseDouble(Calculador.operar(entrada));
        double esperado = -15;
        assertTrue(resultado==esperado);
        System.out.println("Esperado: "+esperado+" Obtenido: "+resultado);
        
        System.out.println("Calculadora TEST 2");
        resultado = Double.parseDouble(Calculador.operar(entrada2));
        esperado = -15;
        assertTrue(resultado==esperado);
        System.out.println("Esperado: "+esperado+" Obtenido: "+resultado);
        
        System.out.println("Calculadora TEST Error");
        resultado = Double.parseDouble(Calculador.operar(entradaError));
        esperado = -15;
        assertTrue(resultado==esperado);
        System.out.println("Esperado: "+esperado+" Obtenido: "+resultado);
    }
}

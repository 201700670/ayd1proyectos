/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1_grupo2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.hamcrest.CoreMatchers.*;
import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.CoreMatchers.is;
import org.hamcrest.MatcherAssert.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;



/**
 *
 * @author Aldo_
 */
public class EcuacionesTest {
    
    /**
     * Testea que el modulo despeje correctamente una ecuacion lineal Sencilla
     * 
     * INPUT: 4X = 16
     * OUTPUT: 4
     * 
     */
    @Test
    public void ecuacionLineal() {
        System.out.println("Despeje de X en 4x = 16");
        Ecuaciones ecuacion = new Ecuaciones("4x = 16");
        double expResult = 4.0;
        double result = ecuacion.getValue();
        assertEquals(expResult, result, 0.0);
        System.out.println("Resultado Esperado: " + expResult + " Resultado Obtenido: " + result);
    }
    
    /**
     * Testea que el modulo despeje correctamente una ecuacion cuadratica Sencilla
     * 
     * INPUT: X^2 = 25
     * OUTPUT: 5
     * 
     */
    @Test
    public void ecuacionCuadratica() {
        System.out.println("Despeje de X en x^2 = 25");
        Ecuaciones ecuacion = new Ecuaciones("x^2 = 25");
        double expResult = 5.0;
        double result = ecuacion.getValue();
        assertEquals(expResult, result, 0.0);
        System.out.println("Resultado Esperado: " + expResult + " Resultado Obtenido: " + result);
    }
    
    /**
     * Testea que el modulo despeje correctamente una ecuacion compleja
     * 
     * INPUT: X^2 + 16X = 100
     * OUTPUT: 5
     * 
     */
    @Test
    public void ecuacionCombinada() {
        System.out.println("Despeje de X en X^2 + 16X = 100");
        Ecuaciones ecuacion = new Ecuaciones("X^2 + 16X = 100");
        double expResult[] = new double[]{ 4.80, -20.81 };
        double result = Math.floor(ecuacion.getValue() * 100) / 100;
        assertThat(result, anyOf(is(4.80), is(-20.81)));
        System.out.println("Resultados Esperados: " + expResult[0] + ", " + expResult[1] + " Resultado Obtenido: " + result);
    }
    
}

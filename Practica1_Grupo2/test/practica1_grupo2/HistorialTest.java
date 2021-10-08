/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1_grupo2;

import java.util.ArrayList;
import junit.framework.TestCase;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Andrea Palomo
 */
public class HistorialTest{
    private HistorialOp ecuaciones;
    
    /**
     * Testea la clase HistorialOp para agregar una ecuacion y comparar con ecuaciones en string
     * new HistorialOp("5+2","7")                       "5+2 = 7"
     * contenido agregado por variables "5+2" y "7"     "5+2 = 7"
     * */
    @Test
    public void AgregarEcuacion(){
        ecuaciones= new HistorialOp("5+2","7");
        String ecuacionactual= "5+2";
        String resultadoactual="7";
        System.out.println(ecuaciones.getOperacion()+" = "+ecuaciones.getResultado());
        assertEquals(ecuaciones.getOperacion()+" = "+ecuaciones.getResultado(), ecuacionactual+" = "+resultadoactual);
    }
    
    /**
     * Testea la clase HistorialOp para agregar a un arreglo y este arreglo que no sea Null
     * new HistorialOp("5+2","7")                       "5+2 = 7"
     * result[0]=resultado;
     * */
    @Test
    public void Notnull(){
        ecuaciones= new HistorialOp("5+2","7");
        String ecuacionactual= "5+2";
        String resultadoactual="7";
        HistorialOp[] expectedResult= new HistorialOp[1];
        
        expectedResult[0]=ecuaciones;
        System.out.println("OPERACIONES NOT NULL RESUELTAS");
        //resultado con Array obteniendo operacion
        assertNotNull(expectedResult[0].getOperacion());
        //resultado con Array obteniendo resultado
        assertNotNull(expectedResult[0].getResultado());
    }
    
    /**
     * Testea la clase HistorialOp para agregar a un arreglo
     * new HistorialOp("5+2","7")                       "5+2 = 7"
     * contenido agregado por variables "5+2" y "7"     "5+2 = 7"
     * result[0]=resultado;
     * expectedResult[0]=ecuaciones;
     * */
    @Test
    public void AgregarArray(){
        ecuaciones= new HistorialOp("5+2","7");
        String ecuacionactual= "5+2";
        String resultadoactual="7";
        HistorialOp[] expectedResult= new HistorialOp[1];
        HistorialOp[] result= new HistorialOp[1];
        HistorialOp resultado= new HistorialOp(ecuacionactual,resultadoactual);
        result[0]=resultado;
        expectedResult[0]=ecuaciones;
        //resultado con Array obteniendo operacion
        System.out.println("Operaciones "+expectedResult[0].getOperacion()+" Resultados "+ (expectedResult[0].getOperacion()== result[0].getOperacion()) );
        assertEquals(expectedResult[0].getOperacion(), result[0].getOperacion());
        //resultado con Array obteniendo resultado
        System.out.println("Operaciones "+expectedResult[0].getResultado()+" Resultados "+(expectedResult[0].getResultado()== result[0].getResultado()));
        assertEquals(expectedResult[0].getResultado(), result[0].getResultado());
    }
    
    /**
     * Testea la clase HistorialOp para verificar si no hay datos y esta en null
     * */
    @Test
    public void AssertNull(){
        ecuaciones= null;
        HistorialOp[] expectedResult= null;
               
        System.out.println("OPERACIONES NULL SI SON IGUALES== Espectativa "+ ecuaciones+" Resultado "+ expectedResult);
        //resultado con Array obteniendo operacion
        assertNull(ecuaciones);
        //resultado con Array obteniendo resultado
        assertNull(expectedResult);
        /// same null
        assertSame(expectedResult, ecuaciones);
    }
}

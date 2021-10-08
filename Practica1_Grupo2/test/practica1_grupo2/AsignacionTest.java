package practica1_grupo2;

import org.junit.Test;
import java.util.LinkedList;
import static org.junit.Assert.*;
import org.mariuszgromada.math.mxparser.Constant;

/**
 *
 * @author luis-ep
 */

public class AsignacionTest {
    
    LinkedList<Constant> valores1;
    LinkedList<Constant> valores2;
    LinkedList<Constant> valores3;
    LinkedList<Constant> valores4;
    String expr1;
    String expr2;
    String expr3;
    String expr4;
    
    public AsignacionTest() {
        // Inicializar lista
        valores1 = new LinkedList<>();
        valores2 = new LinkedList<>();        
        valores3 = new LinkedList<>();        
        valores4 = new LinkedList<>();        
        // LinkedList 1
        valores1.add(new Constant("a", 7.0));
        // LinkedList 2
        valores2.add(new Constant("a", 5.0));
        valores2.add(new Constant("b", 9.0));
        // LinkedList 3
        valores3.add(new Constant("a", 2.0));
        valores3.add(new Constant("b", 3.0));
        valores3.add(new Constant("c", 5.0));
        // LinkedList 3
        valores4.add(new Constant("a", 10.0));
        valores4.add(new Constant("b", 2.0));
        valores4.add(new Constant("c", 7.0));        
        valores4.add(new Constant("d", 8.0));
        // Inicializar expresiones
        expr1 = "a*2+10-a*5/2"; // Resultado: 6.50
        expr2 = "a*b+b-a";      // Resultado: 49.0 
        expr3 = "a+b*2+c";      // Resultado: 13
        expr4 = "a+c/b*c-d";    // Resultado: 26.50
    }
     
    @Test
    public void testExprUnaVariable() {
        System.out.println("Test #1");
        Asignacion asignacion = new Asignacion(valores1, expr1);
        double resultadoCorrecto = 6.50;
        double resultadoActual = asignacion.getResultado();
        assertEquals(resultadoCorrecto, resultadoActual, 0);
    }
    
    @Test
    public void testExprDosVariables() {
        System.out.println("Test #2");
        Asignacion asignacion = new Asignacion(valores2, expr2);
        double resultadoCorrecto = 49;
        double resultadoActual = asignacion.getResultado();
        assertEquals(resultadoCorrecto, resultadoActual, 0);
    }
    
    @Test
    public void testExprTresVariables() {
        System.out.println("Test #3");
        Asignacion asignacion = new Asignacion(valores3, expr3);
        double resultadoCorrecto = 13;
        double resultadoActual = asignacion.getResultado();
        assertEquals(resultadoCorrecto, resultadoActual, 0);        
    }
    
    @Test
    public void testExprCuatroVariables() {
        System.out.println("Test #4");
        Asignacion asignacion = new Asignacion(valores4, expr4);
        double resultadoCorrecto = 26.50;
        double resultadoActual = asignacion.getResultado();
        assertEquals(resultadoCorrecto, resultadoActual, 0);        
    }    
    
}

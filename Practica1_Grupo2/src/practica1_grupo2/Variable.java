/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1_grupo2;

/**
 *
 * @author diego
 */
public class Variable {
    public String variable;
    public double valor;
    public Variable prev;
    public Variable next;
    
    public Variable(String variable, double valor){
        this.variable = variable;
        this.valor = valor;
        this.prev = null;
        this.next = null;
    }
}


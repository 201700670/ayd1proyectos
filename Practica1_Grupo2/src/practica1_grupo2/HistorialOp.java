/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1_grupo2;

/**
 *
 * @author Andrea Palomo
 */
public class HistorialOp {
    private String operacion;
    private String resultado;
    
    public HistorialOp(String operaciones, String res){
        this.operacion= operaciones;
        this.resultado=res;
    }
    public String getOperacion(){
        return operacion;
    }
    public void setOperacion(String operation){
        this.operacion= operation;
    }
    public String getResultado(){
        return resultado;
    }
    public void setResultado(String res){
        this.resultado= res;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica1_grupo2;

import static java.lang.Double.NaN;
import static java.lang.Double.isNaN;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.mariuszgromada.math.mxparser.Expression;

/**
 *
 * @author Aldo_
 */
public class Ecuaciones {
    private String userString;
    private String normalizedString;
    
    public Ecuaciones(String expresion){
        this.userString = expresion.toUpperCase();
        
        String leftExp = this.userString.split("=")[0];
        String rightExp = this.userString.split("=")[1];
        leftExp = addMultiplySign(leftExp);
        rightExp = addMultiplySign(rightExp);
        
        rightExp = reverseSign(rightExp);
        this.normalizedString = leftExp.trim() + rightExp.trim();
    }
    
    public Ecuaciones(){
        
    }
    
    public String parceText(String expression){
        return this.addMultiplySign(expression);
    }
    
    private String addMultiplySign(String exp){
     
        Pattern p = Pattern.compile("(\\d|\\)|[A-Z])(\\(|[A-Z])");
        Matcher m = p.matcher(exp);
        int recursiveBase = 0;
        while(m.find()){
            recursiveBase++;
            exp = exp.replace(m.group(0), m.group(1)+"*"+m.group(2));
        }
        if (recursiveBase == 0)
            return exp;
        else
            return addMultiplySign(exp);
        
    }
    
    private String reverseSign(String exp){
        Pattern p = Pattern.compile("([+-]\\s*)?(([0-9.A-Z*/^]+|\\([\\s0-9.A-Z*/^+-]+\\))+)");
        Matcher m = p.matcher(exp);
        String result = "";
        while(m.find()){
            if (m.group(1) == null || m.group(1).trim().equalsIgnoreCase("+")) {
                exp = exp.replace(m.group(0), "-" + m.group(2));
            }else{
                exp = exp.replace(m.group(0), "+" + m.group(2));
            }            
        }        
        return exp;
    }

    public double getValue(){
        try {
            return findValue(10000);
        }catch (Exception ex) {
            System.out.println(ex.getMessage());
            return NaN;
        }        
    }
    
    private double findValue(int bounder){
        String solveString = "solve("+this.normalizedString+", X, -"+bounder+", "+bounder+")";
        Expression e = new Expression(solveString);
        double result = e.calculate();
        if(isNaN(result)){
            if (bounder == 1){
                return NaN;
            } else {
                return findValue(bounder/10);
            }
        } else {
            return result;
        }
    }
}

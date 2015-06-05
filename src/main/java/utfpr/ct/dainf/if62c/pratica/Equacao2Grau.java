/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.ct.dainf.if62c.pratica;

/**
 *
 * @author Marcos
 * @param <T>
 */
public class Equacao2Grau<T> {
    T a;
    T b;
    T c;
    
    public Equacao2Grau (){        
    }
    
    public Equacao2Grau (T a, T b, T c) {
        this.a = a;
        this.b = b;
        this.c = c;      
    }
    
    public T getA() {
        return a;
    }
    
    public void setA(T a){
        this.a = a;
    }
    
    public T getB() {
        return b;
    }
    
    public void setB(T b){
        this.b = b;
    }
    
    public T getC() {
        return c;
    }
    
    public void setC(T c){
        this.c = c;
    }
    
}

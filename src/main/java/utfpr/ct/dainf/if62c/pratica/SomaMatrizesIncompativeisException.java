/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.ct.dainf.if62c.pratica;

/**
 *
 * @author Gustavo
 */
public class SomaMatrizesIncompativeisException extends MatrizesIncompativeisException{
    
    public SomaMatrizesIncompativeisException(Matriz m1, Matriz m2){
        
        super(m1,m2,"Matrizes de %dx%d e %dx%d não podem ser somadas");
    }   
}

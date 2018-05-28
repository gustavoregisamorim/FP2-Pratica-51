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
public class MatrizInvalidaException extends Exception{
    
    private int linhas;
    private int colunas;
    
    public MatrizInvalidaException(int linhas, int colunas){
        super((String.format("Matriz de %dx%d não pode ser criada", linhas, colunas)));       
        this.linhas = linhas;
        this.colunas = colunas;
    }
    
    public int getNumLinhas(){
        return linhas;
    }
    
    public int getNumColunas(){       
        return colunas;
    }
}


import utfpr.ct.dainf.if62c.pratica.Matriz;
import utfpr.ct.dainf.if62c.pratica.MatrizInvalidaException;
import utfpr.ct.dainf.if62c.pratica.ProdMatrizesIncompativeisException;
import utfpr.ct.dainf.if62c.pratica.SomaMatrizesIncompativeisException;

/**Gustavo
 * IF62C Fundamentos de Programação 2
 * Exemplo de programação em Java.
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 */
public class Pratica51 {

    public static void main(String[] args){
       try{
        Matriz a = new Matriz(1, 2);
        Matriz b = new Matriz(3, 2);        
        System.out.println(a.soma(b));
       }
       catch(MatrizInvalidaException | SomaMatrizesIncompativeisException | ProdMatrizesIncompativeisException me){
            System.out.println(me);
       }             
    }
}
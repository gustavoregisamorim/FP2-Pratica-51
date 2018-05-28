package utfpr.ct.dainf.if62c.pratica;

public class Matriz {
    
    private final double[][] mat;
    
    public Matriz(int m, int n) throws MatrizInvalidaException{
        if(m <= 0 || n <= 0)
            throw new MatrizInvalidaException(m,n);
        mat = new double[m][n];
    }
    
    public double[][] getMatriz() {
        return mat;
    }
    
    public Matriz getTransposta() throws MatrizInvalidaException{
        Matriz t = new Matriz(mat[0].length, mat.length);
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                t.mat[j][i] = mat[i][j];
            }
        }
        return t;
    }
    
    public Matriz soma(Matriz m) throws MatrizInvalidaException{  
        if (this.mat.length != m.mat.length || this.mat[0].length != m.mat[0].length)
            throw new SomaMatrizesIncompativeisException(this,m);
        
            Matriz aux = new Matriz(mat.length,mat[0].length);        
            for(int i=0; i<mat.length; i++)
                for(int j=0; j<mat[0].length; j++)
                    aux.getMatriz()[i][j] = m.getMatriz()[i][j] + mat[i][j];
            return aux;         
    }
    /**
     *
     * @param m
     * @return
     * @throws MatrizInvalidaException
     */
    public Matriz prod(Matriz m) throws MatrizInvalidaException{
        
        if(this.mat[0].length != m.mat.length)
            throw new ProdMatrizesIncompativeisException(this,m);
        
        Matriz aux = new Matriz(mat.length,m.getMatriz()[0].length);
       
        double soma;
        
        for (int i = 0; i < mat.length; i++)
            for (int j = 0; j < m.getMatriz()[0].length; j++){
                soma = 0.0;
                for (int k = 0; k < mat[0].length; k++)
                    soma+=(mat[i][k]*m.getMatriz()[k][j]);
                aux.getMatriz()[i][j] = soma;
            }
        return aux;
    }

    /**
     * Retorna uma representação textual da matriz.
     * Este método não deve ser usado com matrizes muito grandes
     * pois não gerencia adequadamente o tamanho do string e
     * poderia provocar um uso excessivo de recursos.
     * @return Uma representação textual da matriz.
     */
    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (double[] linha: mat) {
            s.append("[ ");
            for (double x: linha) {
                s.append(x).append(" ");
            }
            s.append("]");
        }
        return s.toString();
    }
    
    
    
}
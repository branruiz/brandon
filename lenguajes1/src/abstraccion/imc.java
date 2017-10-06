
package abstraccion;

public class imc {
    Usuario u;
    String resultado;
    
    public String calcular(){
    
        float mivalor=u.getPeso()/(u.getAltura()+u.getAltura());
    resultado="tu imc es:" +mivalor;
    return resultado;
    }
    
}

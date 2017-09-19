
package lenguajes1;

public class imc {
    Usuario u;
    String resultado;
    
    public String calcular(){
    
        float mivalor=u.peso/(u.altura+u.altura);
    resultado="tu imc es:" +mivalor;
    return resultado;
    }
    
}

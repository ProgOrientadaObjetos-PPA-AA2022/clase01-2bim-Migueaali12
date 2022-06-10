
package paquete1;

public class Vehiculo {
    
    private String tipo;
    private String matricula;
    private double valor;
    
    public Vehiculo(String tip, String mat, double val){
        tipo = tip;
        matricula = mat;
        valor = val;
        
    }

    public String obtenerTipo() {
        return tipo;
    }

    public String obtenerMatricula() {
        return matricula;
    }

    public double obtenerValor() {
        return valor;
    }
    
    public void establecerTipo(String tipo) {
        this.tipo = tipo;
    }

    public void establecerMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void establecerValor(double valor) {
        this.valor = valor;
    }
    
}

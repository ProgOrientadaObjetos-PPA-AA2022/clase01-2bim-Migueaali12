/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author reroes
 */
public class Empresa {
    private String nombre;
    private Edificio [] edificios;
    private Vehiculo [] vehiculos;
    private double costoBienesInmuebles;
    private double costoVehiculos;
    private double costoTotalBienes;
    
    public void establecerNombre(String m){
        nombre = m;
    }
    
    public void establecerEdificios(Edificio[] m){
        edificios = m;
    }
    
    public void establecerVehiculos(Vehiculo[] m){
        vehiculos = m;
    }
    
    public void establecerCostoBienesInmuebles() {
        
        double suma = 0;
        
        for (int i = 0; i < edificios.length; i++) {
            suma = suma + edificios[i].obtenerCosto();
        }
        
        costoBienesInmuebles = suma;
        
    }
    
    public void establecerCostoVehiculos() {
        
        double suma = 0;
        
        for (int i = 0; i < vehiculos.length; i++) {
            suma = suma + vehiculos[i].obtenerValor();
        }
        
        costoVehiculos = suma;
        
    }
    
    public void establecercostoTotalBienes() {
        
        double suma = 0;
        
        for (int i = 0; i < edificios.length; i++) {
            suma = suma + edificios[i].obtenerCosto();
        }
        
        for (int i = 0; i < vehiculos.length; i++) {
            suma = suma + vehiculos[i].obtenerValor();
        }
        
        costoTotalBienes = suma;
        
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public Edificio[] obtenerEdificios(){
        return edificios;
    }
    
    public Vehiculo[] obtenerVehiculos(){
        return vehiculos;
    }
    
    public double obtenercostoBienesInmuebles() {
        return costoBienesInmuebles;
    }
    
    public double obtenercostoVehiculos() {
        return costoVehiculos;
    }
    
    public double obtenercostoTotalBienes() {
        return costoTotalBienes;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("%s\n Lista de Edficios\n", nombre);
        
        for (int i = 0; i < edificios.length; i++) {
            
            cadena = String.format("%s%d. %s (%.2f)\n"
                    ,cadena,(i+1),edificios[i].obtenerNombre().toUpperCase(), 
                    edificios[i].obtenerCosto());
            
        }
        
        cadena = String.format("%sTotal de Inmuebles: %.2f\n\n",
                cadena, costoBienesInmuebles);
        
        cadena = String.format("%sLista de Vehiculos\n", cadena);
        
        for (int i = 0; i < vehiculos.length; i++) {
            
            cadena = String.format("%s%d. %s, %s (%.2f)\n"
                    ,cadena,(i+1),vehiculos[i].obtenerTipo(),
                    vehiculos[i].obtenerMatricula().toUpperCase(),
                    vehiculos[i].obtenerValor());
            
        }
        
        cadena = String.format("%sTotal de vehiculos: %.2f\n\n",
                cadena, obtenercostoVehiculos());
        
        cadena = String.format("%sTotal bienes: %.2f\n",
                cadena, obtenercostoTotalBienes());
           
        return cadena;          
    }
}

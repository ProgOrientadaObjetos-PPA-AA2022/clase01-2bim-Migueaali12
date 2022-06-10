/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import paquete1.Edificio;
import paquete1.Empresa;
import paquete1.Vehiculo;

/**
 *
 * @author reroes
 */
public class Ejecutor {
    public static void main(String[] args) {
        
        // Crear una arreglo de 4 elementos de tipo Edificio       
        // Crear un objeto de tipo Empresa:
        
        Edificio edf1 = new Edificio("Edificio central");
        edf1.establecerCostos(20000.0);
        Edificio edf2 = new Edificio("Edificio norte");
        edf2.establecerCostos(30000.0);
        Edificio edf3 = new Edificio("Edificio sur");
        edf3.establecerCostos(10000.0);
        Edificio edf4 = new Edificio("Edificio secundario");
        edf4.establecerCostos(5000.0);
        
        Edificio[] listaEdificios = { edf1, edf2, edf3, edf4};
        
        Empresa emp = new Empresa();
        
        emp.establecerNombre("Empresa de Hojas");       
        emp.establecerEdificios(listaEdificios);
        emp.establecerCostoBienesInmuebles();
        
        Vehiculo vei1 = new Vehiculo("Auto", "LBB0011",10000);
        Vehiculo vei2 = new Vehiculo("Camioneta", "LCB001",20000);
        Vehiculo vei3 = new Vehiculo("Auto", "LBD0012",6000);
        Vehiculo vei4 = new Vehiculo("Camioneta", "LCC0011",10000);
        Vehiculo vei5 = new Vehiculo("Camioneta", "LDC0011",25000);
        
        Vehiculo[] listaVehiculos = { vei1, vei2, vei3, vei4, vei5};
        
        emp.establecerVehiculos(listaVehiculos);
        emp.establecerCostoVehiculos();
        emp.establecercostoTotalBienes();
        
        System.out.println(emp);
        
        //System.out.printf("%.2f\n",emp.obtenercostoBienesInmuebles());
        //System.out.println(listaEdificios[2].obtenerCosto());
        //double c = listaEdificios[2].obtenerCosto();
        //System.out.println(c);
        
        //  Nombre: Empresa de Hojas
        //  Lista de edificio: edf1, edf2, edf3, edf4
        
        // Imprimir el costo de los bienes inmuebles de la empresa
    }
}

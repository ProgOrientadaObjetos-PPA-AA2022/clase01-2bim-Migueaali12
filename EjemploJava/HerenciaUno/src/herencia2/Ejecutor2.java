
package herencia2;

import herencia1.EstudianteDistancia;
import herencia1.EstudiantePresencial;
import java.util.Locale;
import java.util.Scanner;

public class Ejecutor2 {
    
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        sc.useLocale(Locale.US);
        
        EstudianteDistancia e1 = new EstudianteDistancia();
        
        String nombres, apellidos, identificacion;
        int edad, numAsignaturas;
        double costoAsignatura;
        
        System.out.println("Ingrese sus nombres:");
        nombres = sc.nextLine();
        System.out.println("Ingrese sus apellidos:");
        apellidos = sc.nextLine();
        System.out.println("Ingrese su identificacion:");
        identificacion = sc.nextLine();
        System.out.println("Ingrese su edad:");
        edad = sc.nextInt();
        System.out.println("Ingrese numero de asignaturas:");
        numAsignaturas = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese el costo de asignatura:");
        costoAsignatura = sc.nextDouble();
        
        e1.establecerNombresEstudiante(nombres);
        e1.establecerApellidoEstudiante(apellidos);
        e1.establecerIdentificacionEstudiante(identificacion);
        e1.establecerEdadEstudiante(edad);
        e1.establecerNumeroAsginaturas(numAsignaturas);
        e1.establecerCostoAsignatura(costoAsignatura);
        e1.calcularMatriculaDistancia();               
        
        System.out.printf("%s\n", e1);
        
    }
    
}

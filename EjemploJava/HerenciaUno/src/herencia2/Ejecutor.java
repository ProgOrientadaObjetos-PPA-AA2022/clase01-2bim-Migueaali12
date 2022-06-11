package herencia2;

import herencia1.EstudiantePresencial;

public class Ejecutor {
    
    
    public static void main(String[] args) {
        
        EstudiantePresencial e1 = new EstudiantePresencial();
        
        e1.establecerNombresEstudiante("Miguel Alejandro");
        e1.establecerApellidoEstudiante("Alvarez Lima");
        e1.establecerIdentificacionEstudiante("1104545753");
        e1.establecerEdadEstudiante(18);
        e1.establecerNumeroCreditos(12);
        e1.establecerCostoCredito(10);
        e1.calcularMatriculaPresencial();
        
        System.out.printf("Nombres: %s\n"
                + "Apellidos: %s\n"
                + "Identificacion: %s\n"
                + "Edad: %d\n"
                + "Numero de credito: %d\n"
                + "Costo Credito: %1f\n"
                + "Costo Matricula: %.f\n",
                e1.obtenerNombresEstudiante(), e1.obtenerApellidoEstudiante(),
                e1.obtenerIdentificacionEstudiante(), e1.obtenerNumeroCreditos(),
                e1.obtenerCostoCredito(), e1.obtenerMatriculaPresencial());
        
    }
    
}

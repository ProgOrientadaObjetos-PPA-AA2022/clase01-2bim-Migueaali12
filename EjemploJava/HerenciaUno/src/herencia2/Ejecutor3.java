package herencia2;

import herencia1.EstudianteDistancia;
import herencia1.EstudiantePresencial;
import static herencia2.Ejecutor2.sc;
import java.util.Locale;
import java.util.Scanner;

public class Ejecutor3 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        sc.useLocale(Locale.US);

        String nombres,
                apellidos,
                identificacion;
        int edad;

        System.out.println("Ingrese sus nombres:");
        nombres = sc.nextLine();
        System.out.println("Ingrese sus apellidos:");
        apellidos = sc.nextLine();
        System.out.println("Ingrese su identificacion:");
        identificacion = sc.nextLine();
        System.out.println("Ingrese su edad:");
        edad = sc.nextInt();

        if (edad != 0) {

            int op;

            op = MiniMenu();

            switch (op) {

                case 1:

                    sc.nextLine();

                    EstudianteDistancia e1 = new EstudianteDistancia();

                    int numAsignaturas;
                    double costoAsignatura;

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

                    sc.nextLine();

                    break;

                case 2:
                    
                    sc.nextLine();

                    EstudiantePresencial e2 = new EstudiantePresencial();

                    int numAsignaturasP;
                    double costoAsignaturaP;

                    System.out.println("Ingrese numero de asignaturas:");
                    numAsignaturasP = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Ingrese el costo de asignatura:");
                    costoAsignaturaP = sc.nextDouble();

                    e2.establecerNombresEstudiante(nombres);
                    e2.establecerApellidoEstudiante(apellidos);
                    e2.establecerIdentificacionEstudiante(identificacion);
                    e2.establecerEdadEstudiante(edad);
                    e2.establecerNumeroCreditos(numAsignaturasP);
                    e2.establecerCostoCredito(costoAsignaturaP);
                    e2.calcularMatriculaPresencial();

                    System.out.printf("%s\n", e2);

                    break;

                default:

                    System.err.println("Numero Fuera de rango");

                    break;

            }

        }

    }

    public static int MiniMenu() {
        int opc;

        System.out.println("Estudiante a Distancia  (1)");
        System.out.println("Estudiante a Presencial (2)");
        opc = sc.nextInt();

        return opc;

    }

}

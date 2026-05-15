import java.util.Scanner;

/**
 * Clase principal del sistema académico
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArbolBST arbol = new ArbolBST();

        int opcion;

        do {

            System.out.println("\n========= MENU =========");
            System.out.println("1. Insertar estudiante");
            System.out.println("2. Buscar estudiante por cédula");
            System.out.println("3. Eliminar estudiante");
            System.out.println("4. Recorrido Inorden");
            System.out.println("5. Recorrido Preorden");
            System.out.println("6. Recorrido Postorden");
            System.out.println("7. Recorrido por niveles BFS");
            System.out.println("8. Contar estudiantes");
            System.out.println("9. Calcular altura del árbol");
            System.out.println("10. Mostrar estudiante con mayor nota");
            System.out.println("11. Mostrar estudiante con menor nota");
            System.out.println("12. Mostrar estudiantes aprobados");
            System.out.println("13. Mostrar estudiantes reprobados");
            System.out.println("14. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:

                    System.out.print("Cédula: ");
                    String cedula = sc.nextLine();

                    System.out.print("Apellidos: ");
                    String apellidos = sc.nextLine();

                    System.out.print("Nombres: ");
                    String nombres = sc.nextLine();

                    System.out.print("Nota final: ");
                    double nota = sc.nextDouble();

                    System.out.print("Nivel: ");
                    int nivel = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Carrera: ");
                    String carrera = sc.nextLine();

                    Estudiante nuevo = new Estudiante(
                            cedula,
                            apellidos,
                            nombres,
                            nota,
                            carrera,
                            nivel);

                    arbol.insertarEstudiante(nuevo);

                    System.out.println("Estudiante insertado.");
                    break;

                case 2:

                    System.out.print("Ingrese cédula: ");
                    String buscarCedula = sc.nextLine();

                    Estudiante encontrado = arbol.buscarEstudiante(buscarCedula);

                    if (encontrado != null) {
                        encontrado.mostrar();
                    } else {
                        System.out.println("Estudiante no encontrado.");
                    }

                    break;

                case 3:

                    System.out.print("Ingrese cédula a eliminar: ");
                    String eliminar = sc.nextLine();

                    arbol.eliminarEstudiante(eliminar);

                    System.out.println("Proceso de eliminación realizado.");
                    break;

                case 4:
                    arbol.recorridoInorden();
                    break;

                case 5:
                    arbol.recorridoPreorden();
                    break;

                case 6:
                    arbol.recorridoPostorden();
                    break;

                case 7:
                    arbol.recorridoPorNiveles();
                    break;

                case 8:
                    System.out.println("Total estudiantes: "
                            + arbol.contarNodos());
                    break;

                case 9:
                    System.out.println("Altura del árbol: "
                            + arbol.calcularAltura());
                    break;

                case 10:

                    Estudiante mayor = arbol.buscarNotaMayor();

                    if (mayor != null) {
                        System.out.println("Mayor nota:");
                        mayor.mostrar();
                    }

                    break;

                case 11:

                    Estudiante menor = arbol.buscarNotaMenor();

                    if (menor != null) {
                        System.out.println("Menor nota:");
                        menor.mostrar();
                    }

                    break;

                case 12:
                    arbol.mostrarAprobados();
                    break;

                case 13:
                    arbol.mostrarReprobados();
                    break;

                case 14:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 14);

        sc.close();
    }
}
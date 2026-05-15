import java.util.LinkedList;
import java.util.Queue;

/**
 * Árbol Binario de Búsqueda
 */
public class ArbolBST {

    Nodo raiz;

    /**
     * Constructor
     */
    public ArbolBST() {
        raiz = null;
    }

    /**
     * Inserta un estudiante
     */
    public void insertarEstudiante(Estudiante e) {
        raiz = insertarRecursivo(raiz, e);
    }

    /**
     * Inserción recursiva
     */
    private Nodo insertarRecursivo(Nodo actual, Estudiante e) {

        if (actual == null) {
            return new Nodo(e);
        }

        if (e.cedula.compareTo(actual.dato.cedula) < 0) {

            actual.izquierda = insertarRecursivo(actual.izquierda, e);

        } else if (e.cedula.compareTo(actual.dato.cedula) > 0) {

            actual.derecha = insertarRecursivo(actual.derecha, e);
        }

        return actual;
    }

    /**
     * Busca estudiante por cédula
     */
    public Estudiante buscarEstudiante(String cedula) {

        Nodo encontrado = buscarRecursivo(raiz, cedula);

        if (encontrado != null) {
            return encontrado.dato;
        }

        return null;
    }

    /**
     * Búsqueda recursiva
     */
    private Nodo buscarRecursivo(Nodo actual, String cedula) {

        if (actual == null ||
                actual.dato.cedula.equals(cedula)) {

            return actual;
        }

        if (cedula.compareTo(actual.dato.cedula) < 0) {

            return buscarRecursivo(
                    actual.izquierda,
                    cedula);
        }

        return buscarRecursivo(
                actual.derecha,
                cedula);
    }

    /**
     * Recorrido Inorden
     */
    public void recorridoInorden() {
        inorden(raiz);
    }

    private void inorden(Nodo actual) {

        if (actual != null) {

            inorden(actual.izquierda);

            actual.dato.mostrar();

            inorden(actual.derecha);
        }
    }

    /**
     * Recorrido Preorden
     */
    public void recorridoPreorden() {
        preorden(raiz);
    }

    private void preorden(Nodo actual) {

        if (actual != null) {

            actual.dato.mostrar();

            preorden(actual.izquierda);

            preorden(actual.derecha);
        }
    }

    /**
     * Recorrido Postorden
     */
    public void recorridoPostorden() {
        postorden(raiz);
    }

    private void postorden(Nodo actual) {

        if (actual != null) {

            postorden(actual.izquierda);

            postorden(actual.derecha);

            actual.dato.mostrar();
        }
    }

    /**
     * BFS por niveles
     */
    public void recorridoPorNiveles() {

        if (raiz == null) {
            return;
        }

        Queue<Nodo> cola = new LinkedList<>();

        cola.add(raiz);

        while (!cola.isEmpty()) {

            Nodo actual = cola.poll();

            actual.dato.mostrar();

            if (actual.izquierda != null) {
                cola.add(actual.izquierda);
            }

            if (actual.derecha != null) {
                cola.add(actual.derecha);
            }
        }
    }

    /**
     * Cuenta nodos
     */
    public int contarNodos() {
        return contar(raiz);
    }

    private int contar(Nodo actual) {

        if (actual == null) {
            return 0;
        }

        return 1
                + contar(actual.izquierda)
                + contar(actual.derecha);
    }

    /**
     * Calcula altura
     */
    public int calcularAltura() {
        return altura(raiz);
    }

    private int altura(Nodo actual) {

        if (actual == null) {
            return 0;
        }

        int izquierda = altura(actual.izquierda);
        int derecha = altura(actual.derecha);

        return 1 + Math.max(izquierda, derecha);
    }

    /**
     * Busca mayor nota
     */
    public Estudiante buscarNotaMayor() {

        if (raiz == null) {
            return null;
        }

        return buscarMayor(raiz, raiz.dato);
    }

    private Estudiante buscarMayor(
            Nodo actual,
            Estudiante mayor) {

        if (actual == null) {
            return mayor;
        }

        if (actual.dato.notaFinal > mayor.notaFinal) {
            mayor = actual.dato;
        }

        mayor = buscarMayor(actual.izquierda, mayor);
        mayor = buscarMayor(actual.derecha, mayor);

        return mayor;
    }

    /**
     * Busca menor nota
     */
    public Estudiante buscarNotaMenor() {

        if (raiz == null) {
            return null;
        }

        return buscarMenor(raiz, raiz.dato);
    }

    private Estudiante buscarMenor(
            Nodo actual,
            Estudiante menor) {

        if (actual == null) {
            return menor;
        }

        if (actual.dato.notaFinal < menor.notaFinal) {
            menor = actual.dato;
        }

        menor = buscarMenor(actual.izquierda, menor);
        menor = buscarMenor(actual.derecha, menor);

        return menor;
    }

    /**
     * Muestra aprobados
     */
    public void mostrarAprobados() {
        aprobados(raiz);
    }

    private void aprobados(Nodo actual) {

        if (actual != null) {

            aprobados(actual.izquierda);

            if (actual.dato.notaFinal >= 7) {
                actual.dato.mostrar();
            }

            aprobados(actual.derecha);
        }
    }

    /**
     * Muestra reprobados
     */
    public void mostrarReprobados() {
        reprobados(raiz);
    }

    private void reprobados(Nodo actual) {

        if (actual != null) {

            reprobados(actual.izquierda);

            if (actual.dato.notaFinal < 7) {
                actual.dato.mostrar();
            }

            reprobados(actual.derecha);
        }
    }

    /**
     * Elimina estudiante
     */
    public void eliminarEstudiante(String cedula) {
        raiz = eliminarRecursivo(raiz, cedula);
    }

    /**
     * Eliminación recursiva
     */
    private Nodo eliminarRecursivo(
            Nodo actual,
            String cedula) {

        if (actual == null) {
            return null;
        }

        if (cedula.compareTo(actual.dato.cedula) < 0) {

            actual.izquierda = eliminarRecursivo(
                    actual.izquierda,
                    cedula);

        } else if (cedula.compareTo(actual.dato.cedula) > 0) {

            actual.derecha = eliminarRecursivo(
                    actual.derecha,
                    cedula);

        } else {

            if (actual.izquierda == null &&
                    actual.derecha == null) {

                return null;
            }

            if (actual.izquierda == null) {
                return actual.derecha;
            }

            if (actual.derecha == null) {
                return actual.izquierda;
            }

            Nodo sucesor = obtenerMinimo(actual.derecha);

            actual.dato = sucesor.dato;

            actual.derecha = eliminarRecursivo(
                    actual.derecha,
                    sucesor.dato.cedula);
        }

        return actual;
    }

    /**
     * Obtiene el menor nodo
     */
    private Nodo obtenerMinimo(Nodo actual) {

        while (actual.izquierda != null) {
            actual = actual.izquierda;
        }

        return actual;
    }
}
/**
 * Nodo del árbol binario
 */
public class Nodo {

    Estudiante dato;

    Nodo izquierda;
    Nodo derecha;

    /**
     * Constructor del nodo
     */
    public Nodo(Estudiante dato) {

        this.dato = dato;

        izquierda = null;
        derecha = null;
    }
}

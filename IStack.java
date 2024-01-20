/**
 * @author Juan Solís
 * @creationDate 20/01/2024
 * @description Interfaz que define los métodos para el funcionamiento de la pila
 */

public interface IStack<T> {
    /*
     * Agrega un elemento a la parte superior de la pila
     * @param value El valor del elemento que será agregado
    */
    void push(T value);

    /*
     * Elimina y retorna el elemento que se encuentra en la parte superior de la pila
     * @return El elemento de la parte superior de la pila o null si la pila está vacía
     */
    T pop();
}
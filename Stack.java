/**
 * @author Juan Solís
 * @creationDate 20/01/2024
 * @description Clase que representa una pila que almacena elementos de tipo T basada en nodos para 
 * gestionar los elementos
 */

public class Stack <T> implements IStack<T> {
    private Node <T> lastNode;
    private Node <T> firstNode;

    /*
     * Agrega un elemento a la parte superior de la pila
     * @param value El valor del elemento que será agregado
    */
    @Override
    public void push(T value) {
        if (lastNode == null){
            lastNode = new Node<T>(value);
            firstNode = lastNode;
        } else {
            Node<T> current = new Node<T>(value);
            current.setNext(firstNode);
            firstNode = current;
        }
    }

    /*
     * Elimina y retorna el elemento que se encuentra en la parte superior de la pila
     * @return El elemento de la parte superior de la pila o null si la pila está vacía
     */
    @Override
    public T pop(){
        if (firstNode != null) {
            T value = firstNode.getValue();
            firstNode = firstNode.getNext();
            return value;
        }
        return null;
    }
}
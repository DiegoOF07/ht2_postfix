package OurCalculator;
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

    /**
     * Obtiene el primer nodo en los datos
     * @return El primer nodo de los datos
     */
    public Node<T> getFirstNode() {
        return firstNode;
    }

    /**
     * Actualiza el valor del primer nodo en los datos
     * @param node El nodo que se actualizará como el primer nodo
     */
    public void setFirstNode(Node<T> node) {
        this.firstNode = node;
    }

    /**
     * Obtiene el último nodo en los datos
     * @return El último nodo de los datos
     */
    public Node<T> getLastNode() {
        return lastNode;
    }

    /**
     * Actualiza el valor del último nodo en los datos
     * @param node El nodo que se actualizará como el último nodo
     */
    public void setLastNode(Node<T> lastNode) {
        this.lastNode = lastNode;
    }
}
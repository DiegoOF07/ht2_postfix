package OtherCalculator;
/**
 * @author Diego Flores
 * @creationDate 19/01/2024
 * @description Clase que identifica a un nodo el cual puede estar conectado con mas nodos
 */
public class Node<T>{
    
    private T value;
    private Node<T> next;

    public Node(T value){
        this.value = value;
        this.next = null;
    }

    /**
     * @return T
     */
    public T getValue() {
        return value;
    }

    /**
     * @param value
     */
    public void setValue(T value) {
        this.value = value;
    }

    /**
     * @return Node<T>
     */
    public Node<T> getNext() {
        return next;
    }

    /**
     * @param next
     */
    public void setNext(Node<T> next) {
        this.next = next;
    }

    
}
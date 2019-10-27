package by.epam.java.kazlova.linkedl;

public class Node<T> {
    private T data;
    private Node next;

    public Node(T data) {
        this.data = data;
        next = null;
    }
    public Node(T data,Node next) {
        this.data = data;
        this.next = next;
    }

    public void setData(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getNext() {
        return next;
    }

}

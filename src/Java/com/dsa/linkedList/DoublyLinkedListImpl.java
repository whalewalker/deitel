//package Java.com.dsa.linkedList;
//
//import Java.com.dsa.algo.byteWorks.LinkedListUnderFlowException;
//import Java.com.dsa.algo.byteWorks.Node;
//
//public class DoublyLinkedListImpl<T> implements DoublyLinkedList<T> {
//    private DoublyNode<T> head;
//    private DoublyNode<T> tail;
//    private int size = 0;
//
//    @Override
//    public boolean isEmpty() {
//        return size == 0;
//    }
//
//    @Override
//    public DoublyNode<T> getHeadNode() {
//        return head;
//    }
//
//    @Override
//    public DoublyNode<T> getTailNode() {
//        return tail;
//    }
//
//    @Override
//    public int getSize() {
//        return size;
//    }
//
//    @Override
//    public void insertAtHead(T t) {
//        DoublyNode<T> node = new DoublyNode<>(t, null);
//        node.setNext(head);
//        node.setPrev(null);
//        if (head != null) {
//            head.setPrev(node);
//        } else {
//            tail = node;
//        }
//        head = node;
//        size++;
//
//    }
//
//    @Override
//    public void insertAtTail(T t) {
//       if (tail == null){
//           insertAtHead(t);
//           return;
//       }
//        DoublyNode<T> node = new DoublyNode<>(t, null);
//       node.setPrev(tail);
//        tail.setNext(node);
//        node.setNext(null);
//        tail = node;
//        size++;
//    }
//
//    // Custom method for additional operation
//    public void add(T t){
//        DoublyNode<T> node = new DoublyNode<>(t, null);
//        if (head == null){
//            head = node;
//        }else {
//            DoublyNode<T> currentNode = head;
//            while (currentNode.getNext() != null){
//                currentNode = currentNode.getNext();
//            }
//            currentNode.setNext(node);
//            size++;
//        }
//    }
//
//    public DoublyNode<T> remove(int index) throws LinkedListUnderFlowException {
//        if (index > size || index < 1){
//            throw new IllegalArgumentException("Number of node out of bound");
//        }
//        if (isEmpty()) throw new LinkedListUnderFlowException("Linked list is empty");
//        DoublyNode<T> node = head;
//        Node<T> nodeToRemove;
//        for (int location = 1; location <= index; location++) {
//            node = getHeadNode().getNext();
//        }
//        nodeToRemove = node.getNext();
//        node.setNext(node.getNext().getNext());
//        return nodeToRemove;
//    }
//
//
//}

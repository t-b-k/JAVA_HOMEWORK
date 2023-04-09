package homework4.tasks;

// Реализуйте очередь с помощью LinkedList со следующими методами
// enqueue() - помещает элемент в конец очереди
// dequeue() - возвращает первый элемент из очереди и удаляет его
// first() - возвращает первый элемент из очереди, не удаляя его

import java.util.LinkedList;

public class QueueViaLinkedList {

    private LinkedList<String> ourQueue;

    public QueueViaLinkedList() {
        ourQueue = new LinkedList<>();
    }
    // Метод enqueue помещает строку в конец очереди
    public QueueViaLinkedList enqueue (String newElement) {
        ourQueue.add(newElement);
        return this;
    }

    // Метод dequeue возвращает первый элемент из очереди и удаляет его
    public String dequeue () {
        String firstElement = ourQueue.getFirst();
        ourQueue.removeFirst();
        return firstElement;
    }

    // Метод first возвращает первый элемент из очереди, не удаляя его
    public String first () {
        String firstElement = ourQueue.getFirst();
        return firstElement;
    }



}

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
        String firstElement;
        if (!ourQueue.isEmpty()) {
            firstElement = ourQueue.getFirst();
            ourQueue.removeFirst();
            return firstElement;
        } else {
            return null;
        }
    }

    // Метод firstInQueue возвращает первый элемент из очереди, не удаляя его
    public String firstInQueue () {
        String firstElement;
        if (!ourQueue.isEmpty()) {
            firstElement = ourQueue.getFirst();
            return firstElement;
        } else {
            return null;
        }
    }
    // Метод lastInQueue возвращает последний элемент в очереди, не удаляя его
    public String lastInQueue () {
        String lastElement;
        if (!ourQueue.isEmpty()) {
            lastElement = ourQueue.getLast();
            return lastElement;
        } else {
            return null;
        }
    }
}


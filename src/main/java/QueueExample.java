import java.util.*;

public class QueueExample {
    Queue<Integer> queue = new ArrayDeque<>();

    public void addItemToQueue(int number) {
        for (int i = 0; i < number; i++) {
            System.out.println("Элемент с номером " + i + " добавлен");
            queue.add(i);
        }
        System.out.println("Добавлено " + number + " элементов");
    }

    public  void searchLQueueItem(int number) {
        if(!(queue.contains(number))) {
            System.out.println("Элемент со значением " + number + " отсутствует");
        } else {
            System.out.println("Элемент: " + number + " найден");
        }
    }
    public  void deleteQueueItem(int number) {
        if(!(queue.contains(number))) {
            System.out.println("Элемент со значением " + number + " отсутствует");
        } else {
            queue.remove(number);
            System.out.println("Элемент: " + number + " удален");
        }
    }
}
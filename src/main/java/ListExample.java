import java.util.*;

public class ListExample {

    List<Integer> list = new ArrayList<>();

    public  void addToList(int amount) {
        for (int i = 0; i < amount; i++) {
            System.out.println("Элемент с номером " + i + " добавлен");
            list.add(i);
        }
        System.out.println("Добавлено элементов в List: " + amount);
    }

    public  void searchListItem(int number) {
        if(!(list.contains(number))) {
            System.out.println("Элемент с номером " + number + " отсутствует");
        } else {
            System.out.println("Элемент: " + list.get(number) + " найден");
        }
    }

    public  void deleteListItem(int number) {
        if(!(list.contains(number))) {
            System.out.println("Элемент с номером " + number + " отсутствует");
        } else {
            list.remove(number);
            System.out.println("Элемент: " + list.get(number) + " удален");
        }
    }
}
package day_10;
import java.util.LinkedList;
public class LinkedListCollections {
    public static void main(String[] args) {
        LinkedList<Integer> minhaLinkedList = new LinkedList<Integer>();
        for (int i = 1; i <= 10; i++) {
            minhaLinkedList.add(i);
        }
        System.out.println(minhaLinkedList);
        System.out.println(minhaLinkedList.pop());
        System.out.println(minhaLinkedList);
        System.out.println(minhaLinkedList.peek());
        System.out.println(minhaLinkedList.contains(3));
        minhaLinkedList.clear();
        System.out.println(minhaLinkedList);

    }
}

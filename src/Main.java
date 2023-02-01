import ibadts.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();
        queue.add (new Integer[] {3,5,11,9,-2});
        int count = 0;
        while (!queue.isEmpty()) {
            queue.dequeue();
            count++;
        }
        System.out.println(count);
    }
}
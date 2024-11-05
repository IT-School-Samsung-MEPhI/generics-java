package example4;

public class Example4 {
    public static void main(String[] args) {
        System.out.println("Queue");
        Queue<Integer> queue = new Queue<>();

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        System.out.println(queue);

        queue.poll();
        queue.add(5);
        System.out.println(queue);
        System.out.println(queue.peek());

        queue.poll();
        queue.add(6);
        System.out.println(queue);
        System.out.println(queue.peek());


        System.out.println("Stack");
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack);

        stack.pop();
        stack.push(5);
        System.out.println(stack);
        System.out.println(stack.peek());

        stack.pop();
        stack.push(6);
        System.out.println(stack);
        System.out.println(stack.peek());


        System.out.println("ArrayList");
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        System.out.println(list);

        for (int i = 0; i < 5; i++) {
            list.add(i);
        }
        System.out.println(list);

        System.out.println(list.remove(8));
        System.out.println(list);

        System.out.println(list.remove());
        System.out.println(list);

        list.add(30, -1);
        System.out.println(list);
    }
}

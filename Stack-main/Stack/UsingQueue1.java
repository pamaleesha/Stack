
import java.util.LinkedList;
import java.util.Queue;

public class UsingQueue1 {
    private Queue<Integer> queue = new LinkedList<>();

    // Push element onto stack
    public void push(int x) {
        // Get current size of queue
        int size = queue.size();
        
        // Add the new element to the queue
        queue.add(x);

        // Move all elements that were already in the queue before the new element
        // to the back of the queue
        for (int i = 0; i < size; i++) {
            // Remove the front element and add it to the back
            int temp = queue.remove();
            queue.add(temp);
        }
    }

    // Removes the element on top of the stack and returns that element
    public int pop() {
        if (queue.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return queue.remove();
    }

    // Get the top element
    public int top() {
        if (queue.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return queue.peek();
    }

    // Returns true if the stack is empty
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public static void main(String[] args) {
        UsingQueue1 stack = new UsingQueue1();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Top element: " + stack.top()); // Output: 30
        System.out.println("Popped element: " + stack.pop()); // Output: 30
        System.out.println("Top element after pop: " + stack.top()); // Output: 20
        System.out.println("Stack is empty: " + stack.isEmpty()); // Output: false
    }
}

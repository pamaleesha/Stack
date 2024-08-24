import java.util.LinkedList;
import java.util.Queue;

public class Using2Queues {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();
    
    // Push element x onto stack
    public void push(int x) {
        q2.add(x);
        while (!q1.isEmpty()) {
            q2.add(q1.remove());
        }
        // Swap the names of q1 and q2
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    // Removes the element on top of the stack
    public int pop() {
        if (q1.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return q1.remove();
    }

    // Get the top element
    public int top() {
        if (q1.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return q1.peek();
    }

    // Returns whether the stack is empty
    public boolean empty() {
        return q1.isEmpty();
    }

    public static void main(String[] args) {
        Using2Queues stack = new Using2Queues();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Top element: " + stack.top()); // Should print 30
        System.out.println("Pop element: " + stack.pop()); // Should print 30
        System.out.println("Pop element: " + stack.pop()); // Should print 20
        System.out.println("Is stack empty? " + stack.empty()); // Should print false
        System.out.println("Pop element: " + stack.pop()); // Should print 10
        System.out.println("Is stack empty? " + stack.empty()); // Should print true
    }
}

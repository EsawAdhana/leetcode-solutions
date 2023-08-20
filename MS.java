// Question #155: Min Stack
// Time complexity: O(1) (per operation) && Space complexity: O(n)
package MS155;

import java.util.Stack;

class MS {
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> cache = new Stack<>();
    public MS() {

    }
    public void push(int val) {
        stack.push(val);
        if (cache.isEmpty()) {
            cache.push(val);
            return;
        }
        int min = cache.peek();
        if (min > val) {
            cache.push(val);
        } else {
            cache.push(min);
        }
    }

    public void pop() {
        cache.pop();
        stack.pop();
    }

    public int top() {
        cache.peek();
        return stack.peek();
    }

    public int getMin() {
        return cache.peek();
    }
}

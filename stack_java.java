import java.util.*;

public class MainStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 1; i <= 5; i++) stack.push(i);
        while (!stack.isEmpty()) System.out.println(stack.pop());
    }
}

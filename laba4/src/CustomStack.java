import java.util.List;
import java.util.ArrayList;
public class CustomStack {
    private List<Object> stack;

    public CustomStack() {
        this.stack = new ArrayList<>();
    }

    public void push(Object element) {
        stack.add(element);
    }

    public Object pop() throws CustomEmptyStackException {
        if (stack.isEmpty()) {
            throw new CustomEmptyStackException("Stack is empty");
        }
        return stack.remove(stack.size() - 1);
    }
}

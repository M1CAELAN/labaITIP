public class Main {
    public static void main(String[] args) {
        CustomStack stack = new CustomStack();

        try {
            stack.pop();
        } catch (CustomEmptyStackException e) {
            ExceptionHandler.handleException(e);
        }
    }
}
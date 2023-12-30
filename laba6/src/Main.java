public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>(10);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        stack.push(4);
        System.out.println(stack.pop());

        SalesTracker tracker = new SalesTracker();
        tracker.addSale("Apple", 2.50);
        tracker.addSale("Banana", 1.80);
        tracker.addSale("Apple", 2.50);
        tracker.displaySales();
        System.out.println("Total sales: " + tracker.calculateTotalSales());
        System.out.println("Most popular product: " + tracker.mostPopularProduct());
    }
}

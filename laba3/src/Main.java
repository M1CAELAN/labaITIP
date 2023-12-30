import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        HashTable<Integer,String> table = new HashTable<>();
        table.put(1, "один");
        table.put(2, "два");
        table.put(3, "три");
        table.put(11, "десять");

        System.out.println(table.size());
        for(String str: table.getTable()){
            System.out.println(str);
        }

        HashTable<Integer, Order> orders = new HashTable<>();
        ArrayList<String> poduct1 = new ArrayList<>();
        poduct1.add("яблоко");
        poduct1.add("xiaomy");
        poduct1.add("realmebuds");
        Order ord1 = new Order("18.10.2023", poduct1);
        ArrayList<String> poduct2 = new ArrayList<>();
        poduct2.add("iphone");
        poduct2.add("чехол");
        poduct2.add("airpods");
        Order ord2 = new Order("22.10.2023", poduct2);
        orders.put(11, ord1);
        orders.put(22, ord2);
        System.out.println(orders.get(11));
        orders.get(11).Deliver();
        System.out.println(orders.get(11));
        orders.remove(11);
        System.out.println(orders.get(11));
        System.out.println(orders.size());
    }
}

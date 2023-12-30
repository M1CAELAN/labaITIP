import java.util.ArrayList;
import java.util.List;

public class Order {
    private String data;
    private  ArrayList<String> products;
    protected boolean isDelivered;
    public Order(String  data, ArrayList products){
        this.data = data;
        this.products = products;
        this.isDelivered = false;
    }

    public String getData() {
        return data;
    }

    public List<String> getProducts() {
        return products;
    }

    public boolean isDelivered() {
        return isDelivered;
    }
    public void Deliver(){
        isDelivered = true;
    }
    @Override
    public String toString(){
        return("дата доставки " + data
                +"\nпродукты " + products
                +"\nдоставлен заказа? " + (isDelivered?"да":"нет"));
    }
}

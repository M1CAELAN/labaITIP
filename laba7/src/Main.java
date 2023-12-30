import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

class Warehouse {
    private int totalWeight;
    private ReentrantLock lock;
    private Condition enoughWeight;

    public Warehouse() {
        totalWeight = 0;
        lock = new ReentrantLock();
        enoughWeight = lock.newCondition();
    }

    public void addWeight(int weight) throws InterruptedException {
        lock.lock();
        try {
            while (totalWeight + weight > 150) {
                enoughWeight.await();
            }
            totalWeight += weight;
            System.out.println("Взято со склада " + weight + " кг. Общий вес: " + totalWeight + " кг");
            enoughWeight.signalAll();
        } finally {
            lock.unlock();
        }
    }

    public void removeWeight(int weight) throws InterruptedException {
        lock.lock();
        try {
            while (totalWeight - weight < 0) {
                enoughWeight.await();
            }
            totalWeight -= weight;
            System.out.println("Перенисено " + weight + " кг на другой склад. Общий вес: " + totalWeight + " кг");
            enoughWeight.signalAll();
        } finally {
            lock.unlock();
        }
    }
}

class Loader implements Runnable {
    private Warehouse warehouse;
    private int weightToMove;

    public Loader(Warehouse warehouse, int weightToMove) {
        this.warehouse = warehouse;
        this.weightToMove = weightToMove;
    }

    @Override
    public void run() {
        try {
            warehouse.addWeight(weightToMove);
            Thread.sleep(1000);
            warehouse.removeWeight(weightToMove);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Thread worker1 = new Thread(new Loader(warehouse, 70));
        Thread worker2 = new Thread(new Loader(warehouse, 60));
        Thread worker3 = new Thread(new Loader(warehouse, 20));

        worker1.start();
        worker2.start();
        worker3.start();

        try {
            worker1.join();
            worker2.join();
            worker3.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
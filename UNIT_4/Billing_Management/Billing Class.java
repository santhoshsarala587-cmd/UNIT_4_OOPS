import java.util.*;

class Product {
    int id;
    String name;
    double price;

    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

class Bill<T> {
    List<T> items = new ArrayList<>();

    void addItem(T item) {
        items.add(item);
    }

    void showItems() {
        for (T item : items) {
            System.out.println(item);
        }
    }
}

class InvalidQuantityException extends Exception {
    InvalidQuantityException(String msg) {
        super(msg);
    }
}
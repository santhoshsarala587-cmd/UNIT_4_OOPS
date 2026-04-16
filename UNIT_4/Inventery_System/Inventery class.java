import java.util.*;

class Product {
    int id;
    String name;
    int stock;
    double price;

    Product(int id, String name, int stock, double price) {
        this.id = id;
        this.name = name;
        this.stock = stock;
        this.price = price;
    }

    void display() {
        System.out.println("ID: " + id +
                " | Name: " + name +
                " | Stock: " + stock +
                " | Price: ₹" + price);
    }
}
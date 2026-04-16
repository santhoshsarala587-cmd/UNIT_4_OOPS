public class Main {

    static Scanner sc = new Scanner(System.in);
    static HashMap<Integer, Product> map = new HashMap<>();

    public static void main(String[] args) {
        while (true) {
            int choice;
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                continue;
            }

            switch (choice) {
                case 1: addProduct(); break;
                case 2: viewProducts(); break;
                case 3: searchProduct(); break;
                case 4: updateStock(); break;
                case 5: return;
            }
        }
    }

    static void addProduct() {
        try {
            int id = Integer.parseInt(sc.nextLine());

            if (map.containsKey(id)) return;

            String name = sc.nextLine();
            int stock = Integer.parseInt(sc.nextLine());
            double price = Double.parseDouble(sc.nextLine());

            if (stock < 0 || price < 0) throw new Exception();

            map.put(id, new Product(id, name, stock, price));

        } catch (Exception e) { }
    }

    static void viewProducts() {
        if (map.isEmpty()) return;

        for (Product p : map.values()) {
            p.display();
        }
    }

    static void searchProduct() {
        int id = Integer.parseInt(sc.nextLine());

        if (map.containsKey(id)) {
            map.get(id).display();
        }
    }

    static void updateStock() {
        try {
            int id = Integer.parseInt(sc.nextLine());

            if (!map.containsKey(id)) return;

            int qty = Integer.parseInt(sc.nextLine());

            if (qty < 0) throw new Exception();

            map.get(id).stock += qty;

        } catch (Exception e) { }
    }
}
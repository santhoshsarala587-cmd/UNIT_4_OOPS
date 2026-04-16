public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Product> products = new ArrayList<>();

        products.add(new Product(1, "Bread", 40));
        products.add(new Product(2, "Cake", 350));
        products.add(new Product(3, "Cookies", 120));
        products.add(new Product(4, "Milk", 50));

        Bill<String> bill = new Bill<>();
        double total = 0;

        while (true) {
            try {
                System.out.println("\n===== Billing System =====");
                System.out.println("1. Show Products");
                System.out.println("2. Buy Product");
                System.out.println("3. Show Bill");
                System.out.println("4. Exit");

                System.out.print("Enter choice: ");
                int choice = sc.nextInt();

                if (choice == 1) {
                    System.out.println("\nProduct List:");
                    for (Product p : products) {
                        System.out.println(p.id + " " + p.name + " Rs." + p.price);
                    }
                } 
                else if (choice == 2) {
                    System.out.print("Enter Product ID: ");
                    int id = sc.nextInt();
                    Product selected = null;

                    for (Product p : products) {
                        if (p.id == id) {
                            selected = p;
                            break;
                        }
                    }

                    if (selected == null) {
                        System.out.println("Product not found!");
                        continue;
                    }

                    System.out.print("Enter Quantity: ");
                    int qty = sc.nextInt();

                    if (qty <= 0) {
                        throw new InvalidQuantityException("Quantity must be greater than 0");
                    }

                    double cost = selected.price * qty;
                    total += cost;

                    bill.addItem(selected.name + " x " + qty + " = Rs." + cost);
                    System.out.println("Item Added!");
                } 
                else if (choice == 3) {
                    System.out.println("\n------ BILL ------");
                    bill.showItems();
                    System.out.println("Total = Rs." + total);
                } 
                else if (choice == 4) {
                    System.out.println("Thank You!");
                    break;
                } 
                else {
                    System.out.println("Invalid Choice");
                }

            } 
            catch (InputMismatchException e) {
                System.out.println("Invalid input! Enter numbers only.");
                sc.nextLine();
            } 
            catch (InvalidQuantityException e) {
                System.out.println(e.getMessage());
            }
        }

        sc.close();
    }
}
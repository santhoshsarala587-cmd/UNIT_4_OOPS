📦 Inventory Management System (Java)
📌 Overview

This project is a console-based Inventory Management System developed in Java.
It uses:

Collections (HashMap)
Exception Handling
to efficiently manage products in an inventory.

The system allows users to:

Add products
View all products
Search for a product
Update product stock
⚙️ Features
➕ Add new products to inventory
📋 View all available products
🔍 Search product by ID
🔄 Update stock quantity
⚠️ Handles invalid input and values
⚡ Fast access using HashMap
🛠️ Technologies Used
Java
OOP Concepts
Collections Framework (HashMap)
Exception Handling
📂 Project Structure
Main Class:
    └── Main

Classes:
    └── Product
🧠 Class Description
🔹 Product
Data Members:
id → Product ID
name → Product Name
stock → Available quantity
price → Product price
Method:
display() → Displays product details
▶️ How to Run
Compile the program:
javac Main.java
Run the program:
java Main
📋 Menu Options
1. Add Product
2. View Products
3. Search Product
4. Update Stock
5. Exit
🧪 Sample Flow
User selects Add Product
Enters:
Product ID
Name
Stock
Price
User can:
View all products
Search using ID
Update stock
⚠️ Exception Handling
Handles:
Invalid input (non-numeric values)
Negative stock or price values
Prevents duplicate product IDs
✅ Output
Displays product list
Shows searched product details
Updates stock successfully
🎯 Result

The program successfully demonstrates:

Use of HashMap for efficient data storage
Exception handling for robust input validation
Basic inventory operations in a real-world scenario
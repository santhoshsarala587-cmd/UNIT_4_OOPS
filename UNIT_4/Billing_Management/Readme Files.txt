🧾 Billing System (Java)
📌 Overview

This project is a console-based Billing System developed in Java using:

Generics
Collections (ArrayList)
Exception Handling

It allows users to:

View available products
Purchase products
Generate a bill with total cost
⚙️ Features
📋 Display product list
🛒 Buy products with quantity
🧾 Generate and display bill
⚠️ Handles invalid input and quantity
🔄 Dynamic total calculation
🛠️ Technologies Used
Java
OOP Concepts
Collections Framework (ArrayList)
Generics
Exception Handling
📂 Project Structure
Main Class:
    └── Main

Classes:
    ├── Product
    ├── Bill<T>
    └── InvalidQuantityException
🧠 Class Description
🔹 Product
Data Members:
id → Product ID
name → Product Name
price → Product Price
🔹 Bill
Generic class to store purchased items
Uses ArrayList
Methods:
addItem() → Adds item to bill
showItems() → Displays all items
🔹 InvalidQuantityException
Custom exception class
Prevents invalid quantity input (≤ 0)
▶️ How to Run
Compile the program:
javac Main.java
Run the program:
java Main
📋 Menu Options
1. Show Products
2. Buy Product
3. Show Bill
4. Exit
🧪 Sample Flow
User selects Show Products
Chooses a Product ID
Enters quantity
System:
Calculates cost
Adds item to bill
User selects Show Bill to view total
⚠️ Exception Handling
Handles:
Invalid input (non-numeric values)
Invalid quantity (≤ 0)
Ensures smooth program execution
✅ Output
Displays product list
Adds selected items to bill
Shows detailed bill with total amount
🎯 Result

The program successfully demonstrates:

Use of Generics
Collections (ArrayList)
Exception Handling
in a real-world billing scenario
Movie Ticket Booking System (Java)
📌 Overview

This project is a Movie Ticket Booking System implemented in Java using:

Generics
Collections (ArrayList, HashMap)
Exception Handling

It allows users to:

View available shows
Book tickets
Prevent duplicate seat bookings
View booked tickets
⚙️ Features
📽️ View all movie shows with available seats
🎟️ Book tickets for a selected show
⚠️ Prevent booking already reserved seats using custom exception
📄 View all booked tickets
🔄 Menu-driven console application
🛠️ Technologies Used
Java
OOP Concepts
Collections Framework
Exception Handling
📂 Project Structure
Main Class:
    └── Main

Classes:
    ├── Show
    ├── Customer
    ├── Ticket<T>
    └── SeatBookedException
🧠 Class Description
🔹 Show
Stores show details:
showId
movieName
totalSeats
bookedSeats
Displays available seats
🔹 Customer
Stores:
Customer name
Seat number
🔹 Ticket
Generic class to store ticket details
Uses ArrayList
Methods:
addTicket()
showTickets()
count()
🔹 SeatBookedException
Custom exception
Prevents duplicate seat booking
▶️ How to Run
Compile the program:
javac Main.java
Run the program:
java Main
📋 Menu Options
1. View Shows
2. Book Ticket
3. View Tickets
4. Exit
🧪 Sample Flow
User selects View Shows
Chooses a Show ID
Enters:
Name
Seat Number
System checks:
If seat already booked → shows error
Else → ticket booked successfully
⚠️ Exception Handling
Handles invalid inputs
Prevents:
Duplicate seat booking
Invalid show selection
✅ Output
Displays available shows
Confirms booking
Shows booked ticket list
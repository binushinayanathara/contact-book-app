🌟 Contact Book Application (Java)

A clean, simple, and beginner-friendly Java console application for managing contacts — created to demonstrate OOP concepts.

<p align="center"> <img src="https://img.shields.io/badge/Java-Contact%20Book-blue?style=for-the-badge"> <img src="https://img.shields.io/badge/Status-Completed-brightgreen?style=for-the-badge"> <img src="https://img.shields.io/badge/OOP-Project-orange?style=for-the-badge"> <img src="https://img.shields.io/badge/License-Open%20Source-purple?style=for-the-badge"> </p>

📘 Overview

This Contact Book Application helps users store, view, delete, and save contact information. Contact details are saved permanently using Java file handling.

This mini-project showcases the core concepts of Object-Oriented Programming (OOP).

🚀 Features
🔹 Add Contact

Add a new contact by entering a name and phone number.

✔ Shows "Contact added!"

🔹 View All Contacts
Displays all saved entries.
✔ If none: "No contacts found"

🔹 Delete Contact
Remove a contact by name.
✔ “Contact deleted” or “Contact not found!”

🔹 Save Contacts to File
Stores all contacts in a text file.

🔹 Exit Program
Closes the application safely.

🧱 OOP Concepts Used
🎯 Classes & Objects

Contact
ContactBook
Main

🔐 Encapsulation
Private fields
Getters & setters

🔁 Polymorphism
Overridden toString() to format output

📂 File Handling
Writes saved contacts into a file for long-term storage

⚙️ Methods Used
addContact()
displayContacts()
deleteContact()
saveToFile()
public static void main(String[] args)

ContactBookApplication/
│
├── Contact.java
├── ContactBook.java
└── Main.java

▶️ How to Run the Program
Option 1: Using Terminal
javac Contact.java ContactBook.java Main.java
java Main

Option 2: Using an IDE
1.Open project in IntelliJ / Eclipse / NetBeans
2.Run Main.java

🏁 Conclusion

This project successfully demonstrates how OOP principles can be applied to solve real-world problems like managing contact information.
It strengthened knowledge in:
Java programming
Encapsulation
Polymorphism
File handling
Console-based application development

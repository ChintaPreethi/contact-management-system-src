# 📱 Contact Management System

A simple **console-based Contact Management System** developed using **Java**. This project allows users to add, view, search, update, and delete contacts.

## 📌 Features

* ➕ Add new contacts
* 👀 View all contacts
* 🔍 Search contacts by name or phone number
* ✏️ Update contact details
* 🗑️ Delete contacts
* 🚫 Prevent duplicate phone numbers
* ✅ Confirm before deleting a contact
* 🖥️ Simple console-based interface

## 🛠️ Technologies Used

* **Java**
* **ArrayList**
* **Object-Oriented Programming (OOP)**
* **Scanner**
* **Java Collections**

## 📂 Project Structure

```text
contact-management-system/
│
├── src/
│   ├── Contact.java
│   └── ContactManagementSystem.java
│
└── README.md
```

## 📖 Class Description

### `Contact.java`

Represents a contact and stores:

* Name
* Phone number
* Email

It also provides methods to update and display contact information.

### `ContactManagementSystem.java`

The main class of the application.

It handles:

* Adding contacts
* Viewing contacts
* Searching contacts
* Updating contacts
* Deleting contacts
* Duplicate phone number validation

## ⚙️ How to Run

### 1. Clone the repository

```bash
git clone https://github.com/Afrin-D/contact-management-system.git
```

### 2. Open the project

```bash
cd contact-management-system
```

### 3. Go to the source folder

```bash
cd src
```

### 4. Compile the Java files

```bash
javac *.java
```

### 5. Run the application

```bash
java ContactManagementSystem
```

## 🖥️ Sample Output

```text
===== CONTACT MANAGEMENT SYSTEM =====
1. Add Contact
2. View All Contacts
3. Search Contact
4. Update Contact
5. Delete Contact
6. Exit

Enter your choice: 1

----- ADD CONTACT -----
Enter Name: Afrin
Enter Phone Number: 9876543210
Enter Email: afrin@gmail.com

Contact added successfully!
```

### 🔍 Search Example

```text
Enter your choice: 3

----- SEARCH CONTACT -----
Enter name or phone number: Afrin

-----------------------------------
Name         : Afrin
Phone Number : 9876543210
Email        : afrin@gmail.com
-----------------------------------
```

### ✏️ Update Example

```text
Enter your choice: 4

----- UPDATE CONTACT -----
Enter phone number of contact: 9876543210

Current Contact Details:
-----------------------------------
Name         : Afrin
Phone Number : 9876543210
Email        : afrin@gmail.com
-----------------------------------

Enter new name: Afrin Khan
Enter new phone number: 9876543210
Enter new email: afrinkin@gmail.com

Contact updated successfully!
```

## 🎯 Learning Objectives

This project helps in understanding:

* Classes and Objects
* Encapsulation
* Constructors
* Getters and Setters
* ArrayList
* Loops
* Conditional Statements
* String methods
* Searching
* Updating and deleting data
* User input using Scanner
* Basic CRUD operations

## 🚀 Future Improvements

The project can be improved by adding:

* Contact groups
* Favorite contacts
* Contact sorting
* Multiple phone numbers
* Contact profile pictures
* Database connectivity using MySQL
* File storage
* User login and authentication
* Import and export contacts

## 👩‍💻 Author

**Preethi c**

B.Tech Computer Science Engineering

## 📄 License

This project is created for **learning and educational purposes**.

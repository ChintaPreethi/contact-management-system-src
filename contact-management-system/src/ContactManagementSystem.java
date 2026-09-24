import java.util.ArrayList;
import java.util.Scanner;

public class ContactManagementSystem {

    static ArrayList<Contact> contacts = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {

            System.out.println("\n===== CONTACT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Contact");
            System.out.println("2. View All Contacts");
            System.out.println("3. Search Contact");
            System.out.println("4. Update Contact");
            System.out.println("5. Delete Contact");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    addContact();
                    break;

                case 2:
                    viewContacts();
                    break;

                case 3:
                    searchContact();
                    break;

                case 4:
                    updateContact();
                    break;

                case 5:
                    deleteContact();
                    break;

                case 6:
                    System.out.println("Thank you for using Contact Management System!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    // Add a new contact
    public static void addContact() {

        System.out.println("\n----- ADD CONTACT -----");

        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Phone Number: ");
        String phoneNumber = scanner.nextLine();

        // Check duplicate phone number
        if (findByPhoneNumber(phoneNumber) != null) {
            System.out.println("A contact with this phone number already exists!");
            return;
        }

        System.out.print("Enter Email: ");
        String email = scanner.nextLine();

        Contact contact = new Contact(
                name,
                phoneNumber,
                email
        );

        contacts.add(contact);

        System.out.println("Contact added successfully!");
    }

    // View all contacts
    public static void viewContacts() {

        if (contacts.isEmpty()) {
            System.out.println("\nNo contacts available.");
            return;
        }

        System.out.println("\n========== ALL CONTACTS ==========");

        for (Contact contact : contacts) {
            contact.displayContact();
        }
    }

    // Search contact
    public static void searchContact() {

        System.out.println("\n----- SEARCH CONTACT -----");

        System.out.print("Enter name or phone number: ");
        String search = scanner.nextLine().toLowerCase();

        boolean found = false;

        for (Contact contact : contacts) {

            if (contact.getName().toLowerCase().contains(search)
                    || contact.getPhoneNumber().contains(search)) {

                contact.displayContact();
                found = true;
            }
        }

        if (!found) {
            System.out.println("Contact not found!");
        }
    }

    // Update contact
    public static void updateContact() {

        System.out.println("\n----- UPDATE CONTACT -----");

        System.out.print("Enter phone number of contact: ");
        String phoneNumber = scanner.nextLine();

        Contact contact = findByPhoneNumber(phoneNumber);

        if (contact == null) {
            System.out.println("Contact not found!");
            return;
        }

        System.out.println("\nCurrent Contact Details:");
        contact.displayContact();

        System.out.print("Enter new name: ");
        String newName = scanner.nextLine();

        System.out.print("Enter new phone number: ");
        String newPhoneNumber = scanner.nextLine();

        // Check if new phone number belongs to another contact
        Contact existingContact = findByPhoneNumber(newPhoneNumber);

        if (existingContact != null && existingContact != contact) {
            System.out.println(
                    "Another contact already uses this phone number!"
            );
            return;
        }

        System.out.print("Enter new email: ");
        String newEmail = scanner.nextLine();

        contact.setName(newName);
        contact.setPhoneNumber(newPhoneNumber);
        contact.setEmail(newEmail);

        System.out.println("Contact updated successfully!");
    }

    // Delete contact
    public static void deleteContact() {

        System.out.println("\n----- DELETE CONTACT -----");

        System.out.print("Enter phone number of contact: ");
        String phoneNumber = scanner.nextLine();

        Contact contact = findByPhoneNumber(phoneNumber);

        if (contact == null) {
            System.out.println("Contact not found!");
            return;
        }

        System.out.print(
                "Are you sure you want to delete this contact? (yes/no): "
        );

        String confirmation = scanner.nextLine();

        if (confirmation.equalsIgnoreCase("yes")) {

            contacts.remove(contact);

            System.out.println("Contact deleted successfully!");

        } else {

            System.out.println("Delete operation cancelled.");
        }
    }

    // Find contact by phone number
    public static Contact findByPhoneNumber(String phoneNumber) {

        for (Contact contact : contacts) {

            if (contact.getPhoneNumber().equals(phoneNumber)) {
                return contact;
            }
        }

        return null;
    }
}
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * An Object that represents an address book that contains a list of Contacts.
 *
 * @author Caroline Oliver (ycz017)
 * UTSA CS 3443 - Lab 2
 * Fall 2022
 */
public class AddressBook {

    /**
     * The name of the address book.
     */
    private String name;

    /**
     * A list of Contacts.
     */
    private ArrayList<Contact> Contacts;

    /**
     * Default constructor of AddressBook and provides default values.
     */
    public AddressBook() {
        setName("name");
        createArrayList();
    }

    /**
     * Non-default constructor of AddressBook and uses provided values.
     * @param name The name of the AddressBook, represented as a String.
     */
    public AddressBook(String name) {
        setName(name);
        createArrayList();
    }

    /**
     * Sets the name of the AddressBook.
     * @param name The name of the AddressBook, represented by a String.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Creates an empty ArrayList with an initial capacity of 10.
     */
    public void createArrayList() {
        Contacts = new ArrayList<Contact>(10);
    }

    /**
     * Adds a Contact to the list.
     * @param contact A contact, represented by a Contact.
     */
    public void addContact(Contact contact) {
        Contacts.add(contact);
    }

    /**
     * Loads contacts from a CSV file.
     * @param fileName The file name to load in contacts from.
     */
    public void loadContacts(String fileName) {

        // contains code within try/catch block
        try {

            // opens file
            Scanner fileScanner = new Scanner(new File(fileName));
            String[] line;

            // iterates through file
            while (fileScanner.hasNextLine()) {

                // separates by commas
                line = fileScanner.nextLine().split(",");
                Contact contact;

                // creates a family contact
                if (name.equals("Family"))
                    contact = new FamilyMember(line[0], line[2], line[1], line[3]);

                // creates a work contact
                else if (name.equals("Work Contacts"))
                    contact = new WorkContact(line[0], line[2], line[1]);

                // if contact type not found
                else
                    throw new IllegalArgumentException(String.format("Contact type not found [%s]", name));

                addContact(contact);
            }

            // close file
            fileScanner.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Creates a String representation of the AddressBook.
     * @return A dynamically generated representation of the AddressBook, represented by a String.
     */
    public String toString() {

        // uses StringBuilder for better ability to append
        StringBuilder out = new StringBuilder();

        // create header
        out.append(name);
        out.append("\n---------------\n");

        // user iterative for loop to append all contacts
        for (Contact c : Contacts) {
            out.append(" - ");
            out.append(c.toString());
            out.append("\n");
        }

        // converts te StringBuilder to String and returns it
        return out.toString();
    }
}

















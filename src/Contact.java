/**
 * An abstract Contact that has the basic components that all children
 * of Contact (WorkContact and FamilyMember) will have access to.
 *
 * @author Caroline Oliver (ycz017)
 * UTSA CS 3443 - Lab 2
 * Fall 2022
 */
public abstract class Contact {

    /**
     * The name of the individual being addressed in the Contact.
     */
    private String name;

    /**
     * The phone number of the individual being addressed in the Contact.
     */
    private String phoneNumber;

    /**
     * Default constructor that creates a Contact object with default values.
     */
    public Contact() {
        setName("firstname lastname");
        setPhoneNumber("555-5555");
    }

    /**
     * Non-default constructor that creates a Contact
     * object with the provided values, name and phoneNumber.
     * @param name The name of the individual being addressed in the Contact, represented by a String.
     * @param phoneNumber The phone number of the individual being addressed in the Contact, represented by a String.
     */
    public Contact(String name, String phoneNumber) {
        setName(name);
        setPhoneNumber(phoneNumber);
    }

    /**
     * Sets the name of the individual being addressed in the Contact.
     * @param name The name of the individual being addressed in the Contact, represented by a String.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets the phone number of the individual being addressed in the Contact.
     * @param phoneNumber The phone number of the individual being addressed in the Contact, represented by a String.
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Gets the name of the individual being addressed in the Contact.
     * @return The name of the individual being addressed in the Contact, represented by a String.
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the phone number of the individual being addressed in the Contact.
     * @return The phone number of the individual being addressed in the Contact, represented by a String.
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }
}

/**
 * A child object of Contact that stores all information necessary for a WorkContact
 *
 * @author Caroline Oliver (ycz017)
 * UTSA CS 3443 - Lab 2
 * Fall 2022
 */
public class WorkContact extends Contact {

    /**
     * The title of the individual being addressed in the Contact.
     */
    private String title;

    /**
     * The default constructor that provides default values.
     */
    public WorkContact() {
        super();
        setTitle("title");
    }

    /**
     * The non-default constructor that creates a WorkContact object containing the provided values
     * @param name The name of the individual being addressed in the Contact, represented by a String.
     * @param phoneNumber The phone number of the individual being addressed in the Contact, represented by a String.
     * @param title The title of the individual being addressed in the Contact, represented by a String.
     */
    public WorkContact(String name, String phoneNumber, String title) {
        super(name, phoneNumber);
        setTitle(title);
    }

    /**
     * Sets the title of the individual being addressed in the Contact.
     * @param title The title of the individual being addressed in the Contact, represented by a String.
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Gets the title of the individual being addressed in the Contact.
     * @return The title of the individual being addressed by the Contact, represented by a String.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Converts the Contact into a String representation in the format: "{name} ({title}): {phoneNumber}"
     * @return A String representation of the Contact.
     */
    public String toString() {
        return String.format("%s (%s): %s", super.getName(), title, super.getPhoneNumber());
    }
}

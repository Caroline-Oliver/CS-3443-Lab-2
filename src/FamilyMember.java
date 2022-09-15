/**
 * A child object of Contact that stores all information necessary for a FamilyMember
 *
 * @author Caroline Oliver (ycz017)
 * UTSA CS 3443 - Lab 2
 * Fall 2022
 */
public class FamilyMember extends Contact {

    /**
     * The relationship of the individual being addressed in the Contact.
     */
    private String relationship;

    /**
     * The location of the individual being addressed in the Contact.
     */
    private String location;

    /**
     * The default constructor that creates a FamilyMember Contact with default values.
     */
    public FamilyMember() {
        super();
        setRelationship("relationship");
        setLocation("location");
    }

    /**
     * The non-default constructor that creates a FamilyMember Contact with the provided values.
     * @param name The name of the individual being addressed in the Contact, represented by a String.
     * @param phoneNumber The phone number of the individual being addressed in the Contact, represented by a String.
     * @param relationship The relationship of the individual being addressed in the Contact, represented by a String.
     * @param location The location of the individual being addressed in the Contact, represented by a String.
     */
    public FamilyMember(String name, String phoneNumber, String relationship, String location) {
        super(name, phoneNumber);
        setRelationship(relationship);
        setLocation(location);
    }

    /**
     * Sets the relationship of the individual being addressed in the Contact.
     * @param relationship The relationship of the individual being addressed in the Contact, represented by a String.
     */
    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    /**
     * Sets the location of the individual being addressed in the Contact.
     * @param location The location of the individual being addressed in the Contact, represented by a String.
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * Gets the relationship of the individual being addressed in the Contact.
     * @return The relationship of the individual being addressed in the Contact, represented by a String.
     */
    public String getRelationship() {
        return relationship;
    }

    /**
     * Gets the location of the individual being addressed in the Contact.
     * @return The location of the individual being addressed in the Contact, represented by a String.
     */
    public String getLocation() {
        return location;
    }

    /**
     * Converts the Contact into a String representation in the format: "{name} ({relationship}, {location}): {phoneNumber}"
     * @return A String representation of the Contact.
     */
    public String toString() {
        return String.format("%s (%s, %s): %s", super.getName(), relationship, location, super.getPhoneNumber());
    }
}

public class FamilyMember extends Contract {
    private String relationship;
    private String location;

    public FamilyMember() {
        super();
        setRelationship("relationship");
        setLocation("location");
    }

    public FamilyMember(String name, String phoneNumber, String relationship, String location) {
        super(name, phoneNumber);
        setRelationship(relationship);
        setLocation(location);
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getRelationship() {
        return relationship;
    }

    public String getLocation() {
        return location;
    }

    public String toString() {
        return String.format("%s (%s, %s): %s", super.getName(), relationship, location, super.getPhoneNumber());
    }
}

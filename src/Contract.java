public abstract class Contract {
    private String name;
    private String phoneNumber;

    public Contract() {
        setName("firstname lastname");
        setPhoneNumber("555-5555");
    }

    public Contract(String name, String phoneNumber) {
        setName(name);
        setPhoneNumber(phoneNumber);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}

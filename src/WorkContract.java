public class WorkContract extends Contract {
    private String title;

    public WorkContract() {
        super();
        setTitle("title");
    }

    public WorkContract(String name, String phoneNumber, String title) {
        super(name, phoneNumber);
        setTitle(title);
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public String toString() {
        return String.format("%s (%s): %s", super.getName(), title, super.getPhoneNumber());
    }
}

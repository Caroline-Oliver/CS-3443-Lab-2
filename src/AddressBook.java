import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    private String name;
    private ArrayList<Contract> contracts;

    public AddressBook() {
        setName("name");
        createArrayList();
    }

    public AddressBook(String name) {
        setName(name);
        createArrayList();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void createArrayList() {
        contracts = new ArrayList<Contract>();
    }

    public void addContract(Contract contract) {
        contracts.add(contract);
    }

    public void loadContacts(String fileName) {
        try {
            Scanner fileScanner = new Scanner(new File(fileName));
            String[] line;
            while (fileScanner.hasNextLine()) {
                line = fileScanner.nextLine().split(",");
                Contract contract;

                if (name.equals("Family"))
                    contract = new FamilyMember(line[0], line[2], line[1], line[3]);

                else /* work contract */
                    contract = new WorkContract(line[0], line[2], line[1]);

                addContract(contract);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String toString() {
        StringBuilder out = new StringBuilder();

        out.append(name);
        out.append("\n---------------\n");

        for (Contract c : contracts) {
            out.append(" - ");
            out.append(c.toString());
            out.append("\n");
        }

        return out.toString();
    }
}

















import java.util.Scanner;

class Person {
    private String name;
    private String address;
    private String telephone;
    private String mobile;
    private String headOfFamily;
    private String uniqueID;

    public Person(String name, String address, String telephone, String mobile, String headOfFamily, String uniqueID) {
        this.name = name;
        this.address = address;
        this.telephone = telephone;
        this.mobile = mobile;
        this.headOfFamily = headOfFamily;
        this.uniqueID = uniqueID;
    }

    public String getUniqueID() {
        return uniqueID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setHeadOfFamily(String headOfFamily) {
        this.headOfFamily = headOfFamily;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nAddress: " + address + "\nTelephone: " + telephone + "\nMobile: " + mobile + 
               "\nHead of Family: " + headOfFamily + "\nUnique ID: " + uniqueID;
    }

    public boolean containsKeyword(String keyword) {
        return name.contains(keyword) || address.contains(keyword) || (telephone != null && telephone.contains(keyword)) || 
               (mobile != null && mobile.contains(keyword)) || headOfFamily.contains(keyword) || uniqueID.contains(keyword);
    }
}

public class Directory {
    private static Person[] directory = new Person[100];
    private static int count = 0;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Create a database entry");
            System.out.println("2. Edit an entry");
            System.out.println("3. Search by keyword");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    createEntry();
                    break;
                case 2:
                    editEntry();
                    break;
                case 3:
                    searchEntry();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void createEntry() {
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Address: ");
        String address = scanner.nextLine();
        System.out.print("Enter Telephone Number (with STD code, if available): ");
        String telephone = scanner.nextLine();
        System.out.print("Enter Mobile Number (if available): ");
        String mobile = scanner.nextLine();
        System.out.print("Enter Head of the Family: ");
        String headOfFamily = scanner.nextLine();
        System.out.print("Enter Unique ID No: ");
        String uniqueID = scanner.nextLine();

//        if (isUniqueID(uniqueID)) {
//            if (count < directory.length) {
//                directory[count++] = new Person(name, address, telephone, mobile, headOfFamily, uniqueID);
//                System.out.println("Entry created successfully.");
//            } else {
//                System.out.println("Directory is full. Cannot add more entries.");
//            }
//        } else {
//            System.out.println("Unique ID must be unique. Entry creation failed.");
//        }
    }

    private static boolean isUniqueID(String uniqueID) {
        for (int i = 0; i < count; i++) {
            if (directory[i].getUniqueID().equals(uniqueID)) {
                return false;
            }
        }
        return true;
    }

    private static void editEntry() {
        System.out.print("Enter Unique ID of the entry to edit: ");
        String uniqueID = scanner.nextLine();
        Person personToEdit = null;

        for (int i = 0; i < count; i++) {
            if (directory[i].getUniqueID().equals(uniqueID)) {
                personToEdit = directory[i];
                break;
            }
        }

        if (personToEdit != null) {
            System.out.print("Enter New Name (leave blank to keep unchanged): ");
            String name = scanner.nextLine();
            if (!name.isEmpty()) {
                personToEdit.setName(name);
            }
            System.out.print("Enter New Address (leave blank to keep unchanged): ");
            String address = scanner.nextLine();
            if (!address.isEmpty()) {
                personToEdit.setAddress(address);
            }
            System.out.print("Enter New Telephone Number (leave blank to keep unchanged): ");
            String telephone = scanner.nextLine();
            if (!telephone.isEmpty()) {
                personToEdit.setTelephone(telephone);
            }
            System.out.print("Enter New Mobile Number (leave blank to keep unchanged): ");
            String mobile = scanner.nextLine();
            if (!mobile.isEmpty()) {
                personToEdit.setMobile(mobile);
            }
            System.out.print("Enter New Head of the Family (leave blank to keep unchanged): ");
            String headOfFamily = scanner.nextLine();
            if (!headOfFamily.isEmpty()) {
                personToEdit.setHeadOfFamily(headOfFamily);
            }
            System.out.println("Entry updated successfully.");
        } else {
            System.out.println("No entry found with the given Unique ID.");
        }
    }

    private static void searchEntry() {
        System.out.print("Enter keyword to search: ");
        String keyword = scanner.nextLine();
        boolean found = false;

        for (int i = 0; i < count; i++) {
            if (directory[i].containsKeyword(keyword)) {
                System.out.println("\n" + directory[i]);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No entries found matching the keyword.");
        }
    }
}

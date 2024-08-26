import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Coach {
    static ArrayList<Integer> Coach_ID = new ArrayList<>();
    static ArrayList<String> Coach_Name = new ArrayList<>();
    ArrayList<String> Coach_Gender = new ArrayList<>();
    static ArrayList<String> Coach_Email = new ArrayList<>();
    ArrayList<String> Coach_Address = new ArrayList<>();
    static ArrayList<Integer> Coach_PhoneNumber = new ArrayList<>();
    ArrayList<Integer> Coach_WorkingHours = new ArrayList<>();
    ArrayList<Integer> availableCoaches = new ArrayList<>();  // Declare the list

    int NumberOfCustomers;

    Scanner input = new Scanner(System.in);

    public static ArrayList<Integer> getCoach_ID() {
        return Coach_ID;
    }

    public static void setCoach_ID(ArrayList<Integer> coach_ID) {
        Coach_ID = coach_ID;
    }

    public ArrayList<String> getCoach_Gender() {
        return Coach_Gender;
    }

    public void setCoach_Gender(ArrayList<String> coach_Gender) {
        Coach_Gender = coach_Gender;
    }

    public static ArrayList<String> getCoach_Email() {
        return Coach_Email;
    }

    public static void setCoach_Email(ArrayList<String> coach_Email) {
        Coach_Email = coach_Email;
    }

    public ArrayList<String> getCoach_Address() {
        return Coach_Address;
    }

    public void setCoach_Address(ArrayList<String> coach_Address) {
        Coach_Address = coach_Address;
    }

    public static ArrayList<Integer> getCoach_PhoneNumber() {
        return Coach_PhoneNumber;
    }

    public static void setCoach_PhoneNumber(ArrayList<Integer> coach_PhoneNumber) {
        Coach_PhoneNumber = coach_PhoneNumber;
    }

    public ArrayList<Integer> getCoach_WorkingHours() {
        return Coach_WorkingHours;
    }

    public void setCoach_WorkingHours(ArrayList<Integer> coach_WorkingHours) {
        Coach_WorkingHours = coach_WorkingHours;
    }

    public ArrayList<Integer> getAvailableCoaches() {
        return availableCoaches;
    }

    public void setAvailableCoaches(ArrayList<Integer> availableCoaches) {
        this.availableCoaches = availableCoaches;
    }

    public int getNumberOfCustomers() {
        return NumberOfCustomers;
    }

    public void setNumberOfCustomers(int numberOfCustomers) {
        NumberOfCustomers = numberOfCustomers;
    }

    public Scanner getInput() {
        return input;
    }

    public void setInput(Scanner input) {
        this.input = input;
    }

    public static ArrayList<String> getCoach_Name() {
        return Coach_Name;
    }

    public static void setCoach_Name(ArrayList<String> coach_Name) {
        Coach_Name = coach_Name;
    }

    public void Add_Coach() {
        int id;
        String name;
        String address;
        int phone;
        String email;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Coach ID:");
        id = input.nextInt();
        input.nextLine();  // Consume the newline character
        Coach_ID.add(id);

        System.out.println("Enter Coach name:");
        name = input.nextLine();
        Coach_Name.add(name);

        System.out.println("Enter Coach address:");
        address = input.nextLine();
        Coach_Address.add(address);

        System.out.println("Enter Coach email:");
        email = input.nextLine();
        Coach_Email.add(email);

        System.out.println("Enter Coach phone number:");
        phone = input.nextInt();
        Coach_PhoneNumber.add(phone);
    }


    public void Edit_Coa
    ch() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the coach ID to edit:");
        int idToEdit = input.nextInt();

        int index = Coach_ID.indexOf(idToEdit);

        if (index != -1) {
            System.out.println("Editing coach with ID: " + idToEdit);

            // You can choose which information to edit
            System.out.println("1. Edit Name");
            System.out.println("2. Edit Address");
            System.out.println("3. Edit Email");
            System.out.println("4. Edit Phone number");

            int choice = input.nextInt();
            input.nextLine();  // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.println("Enter new name:");
                    String newName = input.nextLine();
                    Coach_Name.set(index, newName);
                    break;
                case 2:
                    System.out.println("Enter new address:");
                    String newAddress = input.nextLine();
                    Coach_Address.set(index, newAddress);
                    break;
                case 3:
                    System.out.println("Enter new email:");
                    String newEmail = input.nextLine();
                    Coach_Email.set(index, newEmail);
                    break;
                case 4:
                    System.out.println("Enter new phone number:");
                    int newPhone = input.nextInt();
                    Coach_PhoneNumber.set(index, newPhone);
                    break;
                default:
                    System.out.println("Invalid choice.");
            }

            System.out.println("Coach information updated:");
            System.out.println("ID: " + Coach_ID.get(index));
            System.out.println("Name: " + Coach_Name.get(index));
            System.out.println("Address: " + Coach_Address.get(index));
            System.out.println("Email: " + Coach_Email.get(index));
            System.out.println("Phone: " + Coach_PhoneNumber.get(index));
        } else {
            System.out.println("Coach with ID " + idToEdit + " not found.");
        }
    }


    public void Delete_Coach() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the coach ID to delete:");
        int idToDelete = input.nextInt();

        int index = Coach_ID.indexOf(idToDelete);

        if (index != -1) {
            System.out.println("Deleting coach with ID: " + idToDelete);

            // Display the coach information before deletion
            System.out.println("Coach information to be deleted:");
            System.out.println("ID: " + Coach_ID.get(index));
            System.out.println("Name: " + Coach_Name.get(index));
            System.out.println("Address: " + Coach_Address.get(index));
            System.out.println("Email: " + Coach_Email.get(index));
            System.out.println("Phone Number: " + Coach_PhoneNumber.get(index));
            // Remove the coach from the lists
            Coach_ID.remove(index);
            Coach_Name.remove(index);
            Coach_Address.remove(index);
            Coach_Email.remove(index);
            Coach_PhoneNumber.remove(index);

            System.out.println("Coach deleted successfully.");
        } else {
            System.out.println("Coach with ID " + idToDelete + " not found.");
        }
    }


    public void DisplayCustomersForCoach(int coachId, Customer customer) {
        System.out.println("Customers assigned to Coach ID " + coachId + ":");
        for (int i = 0; i < customer.getCustomer_ID().size(); i++) {

            if (customer.Customer_AssignedCoach.get(i) == coachId) {
                System.out.println("Customer ID: " + customer.getCustomer_ID().get(i) + ", Name: " + customer.getCustomer_Name().get(i));
            }
        }
    }

    public void getCustomerDetailsByCoachId(Customer customer) {
        Scanner input = new Scanner(System.in);

        // Prompt for Coach ID
        System.out.println("Enter Coach ID:");
        int coachId = input.nextInt();

        // Check if the coach exists
        if (Coach_ID.contains(coachId)) {
            // Prompt for Customer Name
            System.out.println("Enter Customer Name:");
            input.nextLine();  // Consume the newline character
            String customerName = input.nextLine();

            // Find the customer index based on the name
            int customerIndex = customer.getCustomer_Name().indexOf(customerName);

            if (customerIndex != -1 && customer.Customer_AssignedCoach.get(customerIndex) == coachId) {
                // Display Customer Details
                System.out.println("Customer Details:");
                System.out.println("ID: " + customer.getCustomer_ID().get(customerIndex));
                System.out.println("Name: " + customerName);
                System.out.println("Address: " + customer.getAddress().get(customerIndex));
                System.out.println("Email: " + customer.getCustomer_Email().get(customerIndex));
                System.out.println("Age: " + customer.Customer_Age.get(customerIndex));
                System.out.println("Gender: " + customer.getCustomer_Gender().get(customerIndex));
                System.out.println("Assigned Coach ID: " + coachId);
            } else {
                System.out.println("Customer not found or not assigned to the specified coach.");
            }
        } else {
            System.out.println("Coach with ID " + coachId + " not found.");
        }
    }

    public void displayCustomersByGender(Customer customer) {

        System.out.println("Enter Coach ID:");
        int coachId = input.nextInt();
        input.nextLine();

        System.out.println("Choose gender: (1-Male  2-Female)");
        int genderChoice = input.nextInt();
        input.nextLine();

        String gender = (genderChoice == 1) ? "Male" : "Female";

        System.out.println("List of " + gender + " customers assigned to Coach ID " + coachId + ":");

        for (int i = 0; i < customer.getCustomer_ID().size(); i++) {
            if (customer.Customer_AssignedCoach.get(i) == coachId && customer.getCustomer_Gender().get(i).equalsIgnoreCase(gender)) {
                System.out.println("Customer ID: " + customer.getCustomer_ID().get(i) + ", Name: " + customer.getCustomer_Name().get(i));
            }
        }
    }

    //////
    public void orderCoachesByCustomerCount(Customer customer) {
        ArrayList<Integer> sortedCoachIds = new ArrayList<>(Coach_ID);

        // Sort the coach IDs based on customer count in descending order
        sortedCoachIds.sort((coachId1, coachId2) ->
                Integer.compare(getCustomerCountForCoach(coachId2, customer),
                        getCustomerCountForCoach(coachId1, customer)));

        // Display the ordered coaches
        System.out.println("Coaches ordered by the number of customers they train:");
        for (int coachId : sortedCoachIds) {
            int coachIndex = Coach_ID.indexOf(coachId);
            System.out.println("Coach ID: " + coachId +
                    ", Coach Name: " + Coach_Name.get(coachIndex) +
                    ", Customer Count: " + getCustomerCountForCoach(coachId, customer));
        }
    }



    // Helper function to get the number of customers assigned to a coach
    public int getCustomerCountForCoach(int coachId, Customer customer) {
        int customerCount = 0;
        for (int assignedCoachId : customer.Customer_AssignedCoach) {
            if (assignedCoachId == coachId) {
                customerCount++;
            }
        }
        return customerCount;
    }


}
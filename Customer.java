import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Customer {

    Coach coach = new Coach();
    //array Lists
    static ArrayList<Integer> Customer_ID = new ArrayList<>();

    static ArrayList<String> Customer_Name = new ArrayList<>();

    ArrayList<String> Customer_Gender = new ArrayList<>();

    ArrayList<Integer> Customer_Age = new ArrayList<>();

    ArrayList<String> Customer_Email = new ArrayList<>();

    ArrayList<String> Customer_Address = new ArrayList<>();

    ArrayList<Integer> Customer_PhoneNumber = new ArrayList<>();

    ArrayList<Integer> Customer_MemberShip_Plan = new ArrayList<>();

    ArrayList<Integer> Customer_AssignedCoach = new ArrayList<>(); // Add this for coach assignment


    //objects from other classes
    //private Equipment equipment;
    //private MembershipPlan membership;
    //private InBody inbody;

    //getters

    public ArrayList<Integer> getCustomer_ID() {
        return Customer_ID;
    }

    public ArrayList<String> getCustomer_Name() {
        return Customer_Name;
    }

    public ArrayList<String> getCustomer_Gender() {
        return Customer_Gender;
    }

    public ArrayList<String> getCustomer_Email() {
        return Customer_Email;
    }

    public ArrayList<String> getAddress() {
        return Customer_Address;
    }

    public ArrayList<Integer> getCustomer_PhoneNumber() {
        return Customer_PhoneNumber;
    }

    public ArrayList<Integer> getCustomer_MemberShip_Plan() {
        return Customer_MemberShip_Plan;
    }


    //setters

    public void setCustomer_ID(ArrayList<Integer> Customer_ID) {
        this.Customer_ID = Customer_ID;
    }

    public void setCustomer_Name(ArrayList<String> Customer_Name) {
        this.Customer_Name = Customer_Name;
    }

    public void setCustomer_Gender(ArrayList<String> Customer_Gender) {
        this.Customer_Gender = Customer_Gender;
    }

    public void setCustomer_Email(ArrayList<String> Customer_Email) {
        this.Customer_Email = Customer_Email;
    }

    public void setAddress(ArrayList<String> Address) {
        this.Customer_Address = Address;
    }

    public void setCustomer_PhoneNumber(ArrayList<Integer> Customer_PhoneNumber) {
        this.Customer_PhoneNumber = Customer_PhoneNumber;
    }

    public void setMemberShip_Plan(ArrayList<Integer> Customer_MemberShip_Plan) {
        this.Customer_MemberShip_Plan = Customer_MemberShip_Plan;
    }

    //methods
    public void Add_Costumer() {
        int id;
        int age;
        String name;
        String address;
        int phone;
        String email;
        int coach_choose;
        String gender;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter customer ID:");
        id = input.nextInt();
        input.nextLine();  // Consume the newline character

        // Add the ID to the list
        Customer_ID.add(id);

        // Display IDs
        System.out.println("Customer IDs:");
        for (int value : Customer_ID) {
            System.out.println(value);
        }

        System.out.println("Enter customer gender:");
        gender = input.nextLine();
        Customer_Gender.add(gender);

        System.out.println("Enter customer age:");
        age = input.nextInt();
        Customer_Age.add(age);
        input.nextLine();

        System.out.println("Enter customer address:");
        address = input.nextLine();
        Customer_Address.add(address);

        System.out.println("Enter customer name:");
        name = input.nextLine();
        Customer_Name.add(name);

        System.out.println("Enter customer email:");
        email = input.nextLine();
        Customer_Email.add(email);


        //display coach id and name

        System.out.println("Available Coaches:");
        for (int i = 0; i < Coach.Coach_ID.size(); i++) {
            int coachId = Coach.Coach_ID.get(i);
            String coachName = Coach.Coach_Name.get(i);

            // Check if the coach has less than 10 customers
            if (Coach.Coach_ID.contains(coachId) && coach.getCustomerCountForCoach(coachId, this) < 10) {
                System.out.print("Coach ID:" + coachId);
                System.out.println(" ----->   Coach Name: " + coachName);
            }
        }

        System.out.println("Choose a coach ID for the customer:");
        int chosenCoachId = input.nextInt();

        // Check if the chosen coach exists and has less than 10 customers
        if (Coach.Coach_ID.contains(chosenCoachId) && coach.getCustomerCountForCoach(chosenCoachId, this) < 10) {
            Customer_AssignedCoach.add(chosenCoachId);
            System.out.println("Customer assigned to Coach ID: " + chosenCoachId);
        } else {
            System.out.println("Invalid coach ID or coach has reached the maximum number of customers. Customer not assigned.");
        }
    }


    public void Edit_Customer() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the customer ID to edit:");
        int idToEdit = input.nextInt();

        int index = Customer_ID.indexOf(idToEdit);

        if (index != -1) {
            System.out.println("Editing customer with ID: " + idToEdit);

            // You can choose which information to edit
            System.out.println("1. Edit Name");
            System.out.println("2. Edit Address");
            System.out.println("3. Edit Email");
            System.out.println("4. Edit Age");

            int choice = input.nextInt();
            input.nextLine();  // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.println("Enter new name:");
                    String newName = input.nextLine();
                    Customer_Name.set(index, newName);
                    break;
                case 2:
                    System.out.println("Enter new address:");
                    String newAddress = input.nextLine();
                    Customer_Address.set(index, newAddress);
                    break;
                case 3:
                    System.out.println("Enter new email:");
                    String newEmail = input.nextLine();
                    Customer_Email.set(index, newEmail);
                    break;
                case 4:
                    System.out.println("Enter new age:");
                    int newAge = input.nextInt();
                    Customer_Age.set(index, newAge);
                    break;
                default:
                    System.out.println("Invalid choice.");
            }

            System.out.println("Customer information updated:");
            System.out.println("ID: " + Customer_ID.get(index));
            System.out.println("Name: " + Customer_Name.get(index));
            System.out.println("Address: " + Customer_Address.get(index));
            System.out.println("Email: " + Customer_Email.get(index));
            System.out.println("Age: " + Customer_Age.get(index));
        } else {
            System.out.println("Customer with ID " + idToEdit + " not found.");
        }
    }


    //delete
    public void Delete_Customer() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the customer ID to delete:");
        int idToDelete = input.nextInt();

        int index = Customer_ID.indexOf(idToDelete);

        if (index != -1) {
            System.out.println("Deleting customer with ID: " + idToDelete);

            // Display the customer information before deletion
            System.out.println("Customer information to be deleted:");
            System.out.println("ID: " + Customer_ID.get(index));
            System.out.println("Age: " + Customer_Age.get(index));
            System.out.println("Gender: " + Customer_Gender.get(index));
            System.out.println("Name: " + Customer_Name.get(index));
            System.out.println("Address: " + Customer_Address.get(index));
            System.out.println("Email: " + Customer_Email.get(index));

            // Remove the customer from the lists
            Customer_ID.remove(index);
            Customer_Name.remove(index);
            Customer_Address.remove(index);
            Customer_Email.remove(index);
            Customer_Gender.remove(index);
            Customer_Age.remove(index);

            System.out.println("Customer deleted successfully.");
        } else {
            System.out.println("Customer with ID " + idToDelete + " not found.");
        }
    }


    public void DisplayCoachForCustomer ( int customerId){
        int index = Customer_ID.indexOf(customerId);
        if (index != -1) {
            int coachId = Customer_AssignedCoach.get(index);
            System.out.println("Customer ID " + customerId + " is trained by Coach ID " + coachId);
        } else {
            System.out.println("Customer with ID " + customerId + " not found.");
        }
    }

    public void displayAssignedCoachDetails(Coach coach) {
        Scanner input = new Scanner(System.in);

        // Prompt for Customer ID
        System.out.println("Enter Customer ID:");
        int customerId = input.nextInt();

        // Check if the customer exists
        if (Customer_ID.contains(customerId)) {
            int assignedCoachId = Customer_AssignedCoach.get(Customer_ID.indexOf(customerId));

            // Check if the assigned coach exists
            if (Coach.Coach_ID.contains(assignedCoachId)) {
                int coachIndex = Coach.Coach_ID.indexOf(assignedCoachId);

                // Display Coach Details
                System.out.println("Assigned Coach Details:");
                System.out.println("Coach ID: " + Coach.Coach_ID.get(coachIndex));
                System.out.println("Coach Name: " + Coach.Coach_Name.get(coachIndex));
                System.out.println("Coach Email: " + Coach.Coach_Email.get(coachIndex));
                System.out.println("Coach Phone Number: " + Coach.Coach_PhoneNumber.get(coachIndex));
            } else {
                System.out.println("Assigned Coach not found for Customer ID " + customerId);
            }
        } else {
            System.out.println("Customer with ID " + customerId + " not found.");
        }
    }

}
import java.util.Date;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Scanner;
public class InBody {
    Customer customer = new Customer();

    LocalDate inputDate;

    ArrayList<Double> height = new ArrayList<>();

    ArrayList<Double> total_weight = new ArrayList<>();

    ArrayList<Double> bodyfat_mass = new ArrayList<>();

    ArrayList<Double> minerals = new ArrayList<>();

    ArrayList<Double> total_body_water = new ArrayList<>();

    ArrayList<Double> protein = new ArrayList<>();
// setters

    public void setheight(ArrayList<Double> height) {
        this.height = height;
    }

    public void setbodyfat_mass(ArrayList<Double> bodyfat_mass) {
        this.bodyfat_mass = bodyfat_mass;
    }

    public void settotal_weight(ArrayList<Double> total_weight) {
        this.total_weight = total_weight;
    }

    public void setminerals(ArrayList<Double> minerals) {
        this.minerals = minerals;
    }

    public void settotal_body_water(ArrayList<Double> total_body_water) {
        this.total_body_water = total_body_water;
    }
    public void setprotein(ArrayList<Double> protein) {
        this.protein = protein;
    }


//getters

    public ArrayList<Double> getheight() {
        return height;
    }

    public ArrayList<Double> getbodyfat_mass() {
        return bodyfat_mass;
    }

    public ArrayList<Double> gettotal_weight() {
        return total_weight;
    }

    public ArrayList<Double> gettotal_body_water() {
        return total_body_water;
    }

    public ArrayList<Double> getminerals() {
        return minerals;
    }

    public ArrayList<Double> getprotein() {
        return protein;
    }

    public void DoInBody(Customer customer) {
        Scanner scanner = new Scanner(System.in);

        // Get customer ID from the user
        System.out.print("Enter customer ID: ");
        int customerId = scanner.nextInt();

        // Check if the customer ID exists
        int customerIndex = customer.getCustomer_ID().indexOf(customerId);
        if (customerIndex == -1) {
            System.out.println("Customer with ID " + customerId + " not found.");
            return;
        }

        // Get inbody details
        System.out.print("Enter height in meters: ");
        double customerHeight = scanner.nextDouble();
        height.add(customerHeight);

        System.out.print("Enter total weight: ");
        double customerTotalWeight = scanner.nextDouble();
        total_weight.add(customerTotalWeight);

        System.out.print("Enter body fat mass: ");
        double customerBodyFatMass = scanner.nextDouble();
        bodyfat_mass.add(customerBodyFatMass);

        System.out.print("Enter minerals: ");
        double customerMinerals = scanner.nextDouble();
        minerals.add(customerMinerals);

        System.out.print("Enter total body water: ");
        double customerTotalBodyWater = scanner.nextDouble();
        total_body_water.add(customerTotalBodyWater);

        System.out.print("Enter protein: ");
        double customerProtein = scanner.nextDouble();
        protein.add(customerProtein);

        // Display success message
        System.out.println("InBody details added successfully for customer ID: " + customerId);
    }

    public void displayInBodyDetails(Customer customer) {
        Scanner scanner = new Scanner(System.in);

        // Get customer ID from the user
        System.out.print("Enter customer ID to display inbody details: ");
        int customerId = scanner.nextInt();

        // Check if the customer ID exists
        int customerIndex = customer.getCustomer_ID().indexOf(customerId);
        if (customerIndex == -1) {
            System.out.println("Customer with ID " + customerId + " not found.");
            return;
        }

        // Display inbody details
        System.out.println("InBody details for customer ID " + customerId + ":");
        System.out.println("Height: " + height.get(customerIndex));
        System.out.println("Total Weight: " + total_weight.get(customerIndex));
        System.out.println("Body Fat Mass: " + bodyfat_mass.get(customerIndex));
        System.out.println("Minerals: " + minerals.get(customerIndex));
        System.out.println("Total Body Water: " + total_body_water.get(customerIndex));
        System.out.println("Protein: " + protein.get(customerIndex));
    }

    public void displayWeightGoal(Customer customer) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter customer ID to display inbody details: ");
        int customerId = scanner.nextInt();

        int customerIndex = customer.getCustomer_ID().indexOf(customerId);
        if (customerIndex == -1) {
            System.out.println("Customer with ID " + customerId + " not found.");
            return;
        }

        // Get inbody details
        double height = this.height.get(customerIndex);
        double bodyWeight = this.total_weight.get(customerIndex);

        // Calculate BMI
        double bmi = bodyWeight / Math.pow(height, 2);

        // Set target BMI (you can adjust this based on your specific target BMI)
        double targetBMI = 22.0;

        // Calculate target weight based on target BMI
        double targetWeight = targetBMI * Math.pow(height, 2);

        // Display results
        System.out.println("Customer ID: " + customerId);
        System.out.println("Current BMI: " + bmi);
        System.out.println("Target BMI: " + targetBMI);
        System.out.println("Target Weight: " + targetWeight);
    }


    public long Difference_Days () {
        LocalDate today = LocalDate.now();

        // Get input date from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a date (yyyy-mm-dd): ");
        String inputDateStr = scanner.nextLine();
        inputDate = LocalDate.parse(inputDateStr);

        // Calculate the difference in days
        long daysDifference = ChronoUnit.DAYS.between(inputDate, today);

        // Display the result
        return daysDifference;
    }

}
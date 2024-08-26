import java.util.ArrayList;
import java.util.Scanner;

public class Equipment {
    static ArrayList<String> Equipment_Name = new ArrayList<>();
    ArrayList<Integer> Equipment_Quantity = new ArrayList<>();

    public ArrayList<String> getEquipment_Name() {
        return Equipment_Name;
    }

    public ArrayList<Integer> getEquipment_Quantity() {
        return Equipment_Quantity;
    }

    public void setEquipment_Name(ArrayList<String> Equipment_Name) {
        this.Equipment_Name = Equipment_Name;
    }

    public void setEquipment_Quantity(ArrayList<Integer> Equipment_Quantity) {
        this.Equipment_Quantity = Equipment_Quantity;
    }

    public static void Display_Equipment() {
        System.out.println("Equipments:");
        for (String equipment : Equipment_Name) {
            System.out.println(equipment);
        }
    }

    public static void Add_Equipment() {
        String name;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Equipment Name:");
        name = input.nextLine();
        input.nextLine();

        // Add the equipment to the list
        Equipment_Name.add(name);

        // Display equipments
        Display_Equipment();

    }

    public static void Delete_Equipment() {
        Scanner input = new Scanner(System.in);

        // Display equipments
        Display_Equipment();

        System.out.println("Enter the Equipment to delete:");
        String EquipmentToDelete = input.nextLine();

        boolean found = false;
        for (int i = 0; i < Equipment_Name.size(); i++) {
            if (Equipment_Name.get(i).equals(EquipmentToDelete)) {
                found = true;
                System.out.println("Deleting " + Equipment_Name.get(i));
                Equipment_Name.remove(i);
                System.out.println("Equipment deleted successfully.");
                break; // Exit the loop once the equipment is deleted
            }
        }

        if (!found) {
            System.out.println("Equipment not found.");
        }
    }

}
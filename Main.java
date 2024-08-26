
import java.util.Scanner;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer();
        Coach coach = new Coach();
        Equipment equipment = new Equipment();
        InBody inbody = new InBody();
        Subscription subscription=new Subscription();
        int ans;
        int ans2;
        while (true) {
            System.out.println("hello, choose: (1-Customer  2-coach  3-gym)");
            Scanner input = new Scanner(System.in);

            ans = input.nextInt();

            switch (ans) {
                case 1:
                    System.out.println("hello, choose: (1-add Customer  2-edit customer  3-delete customer 4-display subscription plan 5- do inbody 6- display inbody details 7- display weight goal");
                    ans2 = input.nextInt();
                    switch (ans2) {
                        case 1:
                            customer.Add_Costumer();
                            break;
                        case 2:
                            customer.Edit_Customer();
                            break;
                        case 3:
                            customer.Delete_Customer();
                            break;
                        case 4:
                            subscription.subscription_display(customer,coach);
                            break;
                        case 5:
                            inbody.DoInBody(customer);
                            break;
                        case 6:
                            inbody.displayInBodyDetails(customer);
                            break;
                        case 7:
                            inbody.displayWeightGoal(customer);
                            break;

                    }
                    break;

                case 2:
                    System.out.println("hello, choose: (1- add coach 2- edit coach 3-delete coach 4-display all customers  5-order coaches 6-get customer details 7-get customer inbody 8-show male/female customers)");
                    ans2 = input.nextInt();
                    switch (ans2) {
                        case 1:
                            coach.Add_Coach();
                            break;
                        case 2:
                            coach.Edit_Coach();
                            break;
                        case 3:
                            coach.Delete_Coach();
                            break;
                        case 4:
                            System.out.println("Enter Coach ID to display customers: ");
                            int coachId = input.nextInt();
                            coach.DisplayCustomersForCoach(coachId, customer);
                            break;
                        case 5:
                            System.out.println(". ");
                            coach.orderCoachesByCustomerCount(customer);
                            break;
                        case 6:
                            coach.getCustomerDetailsByCoachId(customer);
                            break;
                        case 7:
                            inbody.displayInBodyDetails(customer);
                            break;
                        case 8:
                            coach.displayCustomersByGender(customer);
                            break;
                    }
                    break;

                case 3:
                    System.out.println("hello, choose: (1-edit equipments  2-add equipments   3-delete equipments  4- Display Equipments 5- (not done yet) 6-(not done yet))");
                    ans2 = input.nextInt();

                    switch (ans2) {
                        case 1:
                            System.out.println(". ");
                            break;
                        case 2:
                            System.out.println(". ");
                            Equipment.Add_Equipment();
                            break;
                        case 3:
                            System.out.println(". ");
                            Equipment.Delete_Equipment();
                            break;
                        case 4:
                            System.out.println(". ");
                            Equipment.Display_Equipment();
                            break;
                        case 5:
                            System.out.println(". ");
                            break;
                        case 6:
                            System.out.println(". ");
                            break;
                    }
                    break;
            }
        }
    }
}
import java.util.ArrayList;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Subscription extends Customer{
    Scanner in=new Scanner(System.in);

    Customer customer=new Customer();
    Coach coach=new Coach();
    public MembershipPlan membershipplan;


    public Subscription()
    {

    }

    public Subscription( Customer customer, Coach coach, MembershipPlan membershipplan)
    {

        this.customer = customer;
        this.coach = coach;
        this.membershipplan = membershipplan;
    }
    //getters

    public Customer getcustomer()
    {
        return customer;
    }
    public Coach getcoach()
    {
        return coach;
    }
    public MembershipPlan getmembershipplan()
    {
        return membershipplan;
    }
    //setters


    public void setcustomer(Customer customer)
    {
        this.customer = customer;
    }


    public void setcoach(Coach coach)
    {
        this.coach = coach;
    }


    public void setmembershipplan (MembershipPlan membershipplan)
    {
        this.membershipplan = membershipplan;
    }




    public void subscription_display(Customer customer,Coach coach)
    {
        System.out.println("Enter your Customer ID ");
        int Entered_ID=in.nextInt();
        int index=customer.getCustomer_ID().indexOf(Entered_ID);
        if(index != -1) {
            for (int i = 0; i < customer.Customer_ID.size(); i++) {
                if (Entered_ID==customer.getCustomer_ID().get(index)) {
                    System.out.println("Your Subscription plan >> \n");
                    System.out.println("Customer name----------->" + customer.getCustomer_Name().get(index) + "     "+"Customer ID---->" + customer.getCustomer_ID().get(index));
                    System.out.println("Assigned Coach ID------->" + customer.Customer_AssignedCoach.get(index));



                    System.out.println("Membership plan ->");
                    System.out.println("-----------------------------------------------------------------------------------------------");
                    break;
                } else  {
                    System.out.println("The ID you Entered was not found ----\n");
                }

            }
        }

    }



}

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class MembershipPlan
{
    ArrayList<Date> Start_date = new ArrayList<>();
    ArrayList<Integer> Monthly_plan = new ArrayList<>();
    ArrayList<Integer> Months_registered = new ArrayList<>();

    ArrayList<Integer> Payment = new ArrayList<>();

    final double Discount = 0.8;
    int total =0 ;

    public ArrayList<Integer> Monthly_plan() {
        return Monthly_plan;
    }

    public ArrayList<Integer> Months_registered() {
        return Months_registered;
    }

    public ArrayList<Date> getStart_date()
    {
        return Start_date;
    }

    public ArrayList<Integer> payment()
    {
        return Payment;
    }

    public void setStart_date(ArrayList<Date> Start_date)
    {
        this.Start_date = Start_date;
    }
    public void setMonthly_plan(ArrayList<Integer> Monthly_plan)
    {
        this.Monthly_plan = Monthly_plan;
    }
    public void setMonths_registered(ArrayList<Integer> Months_registered)
    {
        this.Months_registered = Months_registered;
    }

    public void Payment(ArrayList<Integer> Payment)
    {
        this.Payment = Payment;
    }

    public void plans_options()
    {
        int payment=0;
        Scanner input = new Scanner(System.in);
        System.out.println ("our plans:");
        System.out.println ("1- 3 days per week ------> 800 per month");
        System.out.println ("2- 6 days per week ------> 1500 per month");

        System.out.println ("Please choose your plan: ");
        int plan_choice = input.nextInt();
        Monthly_plan.add (plan_choice);

        System.out.println("How many months do you want to subscribe? : ");
        int month_num = input.nextInt();
        Months_registered.add (month_num);

    /*    System.out.println("Enter today's Date ");
        Date Tdate = input.date();
        Months_registered.add (Tdate);
*/
        if (plan_choice ==1)
        {
            if (month_num >= 3) {
                payment = (int) (800*month_num*Discount);
                Payment.add(payment);
                total =total + payment;
            }
            else
            {
                payment = 800*month_num;
                Payment.add(payment);
                total =total + payment;
            }
        }
        else if (plan_choice ==2)
        {
            if (month_num >= 3)
            {
                payment = (int) (1500*month_num*Discount);
                Payment.add(payment);
                total =total + payment;          }
            else
            {
                payment = 1500*month_num;
                Payment.add(payment);
                total =total + payment;
            }
        }


    }
}
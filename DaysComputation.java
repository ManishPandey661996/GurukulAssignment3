import java.util.Scanner;

public class DaysComputation {

    public static void main (String[] args) {
           Scanner sc = new Scanner(System.in);
           int days,year,month,week ;
           days= sc.nextInt();
           System.out.println(" Input : "+ days +"  days");
           year = days/365;
           days= days%365;
           month=days/30;
           days= days%30;
           week= days/7;
           days=days%7;
           System.out.println("Output : "+ year +" Years : " + month + " Months : " + week +" Weeks : "+ days +" Days");
    }
}
           
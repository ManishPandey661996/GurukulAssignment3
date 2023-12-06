import java.util.Scanner;

public class Swap {

    public static void main (String[] args) {

          Scanner sc = new Scanner(System.in);
          int no, swapedNo;
          System.out.print("Input : ");
          no= sc.nextInt();
          swapedNo = ((no%100)*100)+(no/100);
          
          System.out.println("output : " + swapedNo );
    }
}
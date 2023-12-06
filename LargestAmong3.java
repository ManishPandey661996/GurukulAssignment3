

import java.util.Scanner;
class LargestAmong3{
      public static void main(String[] args){
           Scanner sc = new Scanner(System.in);
           int a,b,c,d,largest;
           System.out.print(" Input : ");
           a=sc.nextInt();
           b=sc.nextInt();
           c=sc.nextInt();
           d= a>b?a:b;
           largest= c>d?c:d;
           System.out.print(" Output : "+ largest);
      }
}
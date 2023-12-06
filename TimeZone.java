

import java.util.Scanner;
class TimeZone{
      public static void main(String[] args){
           Scanner sc = new Scanner(System.in);
           int a,value,minutes,hour;
           String str;
           a= sc.nextInt();
           value =a;
           minutes = value%100;
            
           value = value/100;
           if ( value >12 && value <=24){
                 str = "pm";
           } else {
                 str = "am";
           }
           hour =value/2;
           System.out.println( a + " >>> "+ hour + " : " + minutes + str);
     }
}
            
           


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
           if ( value >12 ){
                 str = "pm";
           } else {
                 str = "am";
           }
           if(value > 12 ){
                   hour=value-12;
           } else if( value == 0 ){
                   hour= value + 12;
           } else {
                  hour= value;
           }
           System.out.println( a + " >>> "+ hour + " : " + minutes + str);
     }
}
            
           
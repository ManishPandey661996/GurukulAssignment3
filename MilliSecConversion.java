

import java.util.Scanner;
class MilliSecConversion{
      public static void main(String[] args){
           Scanner sc = new Scanner(System.in);
           int MilliSec,hour , minutes ,sec ;
           System.out.print("Input :  ");
           MilliSec = sc.nextInt();
           hour=  ((MilliSec/(1000*60*60))%24) ;
           minutes = ((MilliSec / (1000*60)) % 60);
           sec = (MilliSec / 1000) % 60 ;
           System.out.println("output : " + " = " + hour +  " : " + minutes + " : " + sec);
     }
}
           
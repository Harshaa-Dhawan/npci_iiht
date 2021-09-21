import java.util.*;

public class Assignment2 {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      String a = sc.nextLine();
      
      int len = a.length();
      int result =0;
      
      if(len%2==0){
          
          result = len*len;
          System.out.println(len+", "+result);
          
      }else if (len%3==0){
          
          result = len*len*len;
          System.out.println(len+", "+result);
          
      }else if(len<2){
          //result = a*a;
          System.out.println(len);
      }else{
          result = (len-1)*(len-1);
          System.out.println(len+"["+(len-1)+"] "+result);
      }
      
      
      
    }
}
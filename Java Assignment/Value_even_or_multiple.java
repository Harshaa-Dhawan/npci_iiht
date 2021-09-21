import java.util.Scanner;

public class Value_even_or_multiple {
    public static void main(String[] args) {

        int num1, num2;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        num1 = input.nextInt();
        System.out.printf("%nEnter second number: ");
        num2 = input.nextInt();

        boolean multiple = isMultiple(num1,num2);

        if(multiple == true){
            if(num2==num1*num1){
                System.out.printf("%n%d is a square and a multiple of %d", num2,num1);
            }
            else{
                System.out.printf("%n%d is multiple of %d", num2,num1);
            } 
        }
        else{
            System.out.printf("%n%d *is neither multiples nor squares of %d",num2 ,num1);
        }


    }

    public static boolean isMultiple(int num1, int num2){

        int remainder = num1 % num2;
        boolean multiple;

        if (remainder != 0){
            multiple = false;
        }
        else{
            multiple = true;
        }

        return multiple;
    }

}
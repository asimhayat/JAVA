
import java.util.*;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number one:");
        int num1 = sc.nextInt();
        System.out.println("enter number two:");
        int num2 = sc.nextInt();
        System.out.println("select an opertion");
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Divide");

        int choice = sc.nextInt();
        switch (choice){
            case 1:
                System.out.println("Addition is : \n"+(num1+num2));
                break;
            case 2:
                System.out.println("Subtraction is : \n"+(num1-num2));
                break;
            case 3:
                System.out.println("Multiple is : \n"+(num1*num2));
                break;
            case 4 :
                System.out.println("Division is : \n"+(num1/num2));
                break;
            default:
                System.out.println("invalid choice");


        }
        sc.close();
    }
    }

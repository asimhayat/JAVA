import java.util.Scanner;
class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature in Celsius:");
        double celsius = sc.nextDouble();
        double fahrenheit = (celsius*9/5)+32;
        System.out.println("Temperature in fahrenhiet is : "+fahrenheit+"F.");
        }
                }
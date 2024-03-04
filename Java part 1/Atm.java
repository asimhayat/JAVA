import java.util.Scanner;
 class Main {
    public static void main(String[] args) {
        int balance = 0,deposit,withdraw;
        char op;
        Scanner Scanner = new Scanner(System.in);
        while (true){
            System.out.println("\nd= deposit");
            System.out.println("w= withdraw");
            System.out.println("b = balance");
            System.out.print("enter opertion:");
            op = Scanner.next().charAt(0);
            switch (op){
                case 'D':
                case 'd':
                    System.out.println("enter deposit amount");
                    deposit = Scanner.nextInt();
                    balance += deposit;
                    break;
                case 'W':
                case 'w':
                        System.out.println("enter amount withdraw");
                        withdraw = Scanner.nextInt();
                        balance -=withdraw;
                        break;
                case 'B':
                case 'b':
                            System.out.print("Balance:"+balance);
                            break;
                default:
                                    System.out.println("invalid opertion" );

            }



        }




    }
}
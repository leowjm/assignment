import java.util.Scanner;

public class TestAccount {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //todo:: create account object
        Account acc1 = new Account(909, "Ali Baba", 1000);
        //todo:: set Interest rate
        Account.setAnnualInterestRate(0.03);

        int choice;
        double amt;

        do {
            choice = displayMenu();
            switch (choice) {
                case 1:  //todo:: display balance 
                    System.out.print("Balance : " + acc1.getBalance());
                    break;

                case 2: //todo:: request deposit amount
                    System.out.print("Enter Amount : ");
                    //todo:: cash in
                    //todo:: display balance
                    amt = scanner.nextDouble();
                    acc1.cashIn(amt);
                    System.out.println("Balance : " + acc1.getBalance());
                    break;

                case 3:
                    
                    //todo:: cash out
                    //todo:: display balance
                    System.out.print("Enter deposit ammount: ");
                       amt = scanner.nextDouble();
                       acc1.cashOut(amt);
                       System.out.println("Balance: "+acc1.getBalance() );
                    break;

                case 4: //todo:: display interest amount
                    System.out.println("Interest amount: " + acc1.calculateInterest());
                    break;
            }
        } while (choice != 5);
    }

    public static int displayMenu() {
        System.out.println("\nMain Menu");
        System.out.println("1 : Check balance");
        System.out.println("2 : Cash In");
        System.out.println("3 : Cash Out");
        System.out.println("4 : Interest");
        System.out.println("5 : Exit");
        System.out.print("Enter a choice : ");

        //todo:: read and return selection 
        int choice = scanner.nextInt();
        return choice;

    }
}


import java.util.Scanner;

public class Checkings {

    private double balance;
    private String name;

    public void setBalance(double balance, String name) {
        this.balance = balance;
        this.name = name;
        System.out.println("Hello " + name);
    }

    public void checkBalance() {
        System.out.println("You current balance is " + balance);
    }

    public void withdraw(double amount) {
        if(amount > balance) {
            System.out.println("Unable to process, not enough funds");
        }
        balance -= amount;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void bankInterface() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please choose what you would like to do");

        System.out.println("1. Check Balance");
        System.out.println("2. Withdraw");
        System.out.println("3. Deposit");
        System.out.println("4. Exit");

        int option = scanner.nextInt();
        switch(option) {
            case 1:
                checkBalance();
                System.out.println("Would you like another transaction?");
                System.out.println("Y/N");
                String x = scanner.next();
                if(x.equals("y") || x.equals("Y")) {
                    bankInterface();
                } else {
                    System.out.println("Exit");
                    System.out.println("Press any key to exit");
                    if(scanner.hasNextLine()) {
                        break;
                    }
                }
            case 2:
                System.out.println("Withdraw");
                System.out.println("How much would you like to withdraw?");
                System.out.println("Current balance is " + balance);
                withdraw(scanner.nextDouble());
                System.out.println("Your new balance is " + balance);
                System.out.println("Would you like another transaction?");
                System.out.println("Y/N");
                String y = scanner.next();
                if(y.equals("y") || y.equals("Y")) {
                    bankInterface();
                } else {
                    System.out.println("Exit");
                    System.out.println("Press any key to exit");
                    if(scanner.hasNextLine()) {
                        break;
                    }
                }
                break;
            case 3:
                System.out.println("Deposit");
                System.out.println("How much would you like to deposit?");
                deposit(scanner.nextDouble());
                System.out.println("Your new balance is " + balance);
                System.out.println("Would you like another transaction?");
                System.out.println("Y/N");
                String Y = scanner.next();
                if(Y.equals("y") || Y.equals("Y")) {
                    bankInterface();
                } else {
                    System.out.println("Exit");
                    System.out.println("Press any key to exit");
                    if(scanner.hasNextLine()) {
                        break;
                    }
                }
                break;
            case 4:
                System.out.println("Exit");
                System.out.println("Press any key to exit.");
                scanner.nextLine();
                if(scanner.hasNextLine()) {
                    break;
                } else {
                    bankInterface();
                }

            default:
                System.out.println("Didn't choose an option please try again.\n");
                bankInterface();
        }
    }
}

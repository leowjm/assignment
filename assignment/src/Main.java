
import java.util.Scanner;

public class Main {

    public static void addProduct(FastFood[] fastfood) {
        Scanner scan = new Scanner(System.in);
        String add;
        String next;
        String confirm;
        int addP = 0;
        int burgerID = 4;
        int FrenchFriesID = 3;
        int FriedChickenID = 2;

        do {
            String productID = " ";
            String productName = " ";
            String id;
            double productPrice = 0;
            int confirmAdd = 0;
            int continuteAdd = 0;
            int productNo = 0;

            int productSelection = 0;
            int count = 0;

            System.out.println("\n\n\n\n=====================================");
            System.out.println("==          《Product Type》       ==");
            System.out.println("==       =====================     ==");
            System.out.println("==         1.Burger                ==");
            System.out.println("==         2.French Fries          ==");
            System.out.println("==         3.Fried Chicken         ==");
            System.out.println("======================================");
            int x = 0;
            do {

                System.out.printf("\nPlease enter what type of fast food your want add : ");
                productSelection = scan.nextInt();
                scan.nextLine();

                switch (productSelection) {

                    case 1:
                        count = 0;

                        for (int z = 0; z < fastfood.length; z++) {
                            if (fastfood[z] != null) {

                                count++;

                            }
                        }

                        fastfood[count] = new Burger("", "", 0);
                        burgerID++;
                        productID = "B" + burgerID;
                        System.out.printf("\nProduct ID : %s\n", productID);
                        fastfood[count].setFoodID(productID);
                        x = 1;

                        break;
                    case 2:
                        count = 0;

                        for (int z = 0; z < fastfood.length; z++) {
                            if (fastfood[z] != null) {

                                count++;

                            }
                        }

                        fastfood[count] = new FrenchFries("", "", 0);
                        FrenchFriesID++;
                        productID = "FF" + FrenchFriesID;
                        System.out.printf("\nProduct ID : %s\n", productID);
                        fastfood[count].setFoodID(productID);
                        x = 1;
                        break;

                    case 3:
                        count = 0;

                        for (int z = 0; z < fastfood.length; z++) {
                            if (fastfood[z] != null) {

                                count++;

                            }
                        }

                        fastfood[count] = new FriedChicken("", "", 0);
                        FriedChickenID++;
                        productID = "FC" + FriedChickenID;
                        System.out.printf("\nProduct ID : %s\n", productID);
                        fastfood[count].setFoodID(productID);
                        x = 1;
                        break;

                    default:

                        System.out.println("\nNo this type of food!!!! Please Try again!!!");
                        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
                        x = 0;
                        break;
                }
            } while (x == 0);

            System.out.print("Enter Product Name :");
            productName = scan.nextLine();

            System.out.print("Enter Product Price :");
            productPrice = scan.nextDouble();
            scan.nextLine();
            confirmAdd = 0;

            while (confirmAdd == 0) {
                System.out.println("\n\n\n\n======================================");
                System.out.println("==     《Confirm Add Product》     ==");
                System.out.println("=======================================");

                System.out.print("\nDo your confirm add product[Y=YES/N=NO]?");
                confirm = scan.next().toUpperCase();
                scan.nextLine();

                if (confirm.equals("Y")) {
                    fastfood[count].setFoodName(productName);
                    fastfood[count].setFoodPrice(productPrice);
                    System.out.println("\n\tAdding Complete!!!!!");
                    System.out.println("===============================");
                    confirmAdd = 1;
                    continuteAdd = 0;

                } else if (confirm.equals("N")) {
                    productID = null;
                    fastfood[count].setFoodID(productID);
                    System.out.println("\nAdding Fail!!!! ");
                    System.out.println("===============================");
                    System.out.println("Thank for your using!!!\n");
                    addP = 1;
                    confirmAdd = 1;
                    continuteAdd = 1;

                } else {
                    System.out.println("Invalid input!! Please try again!!!!");
                    confirmAdd = 0;
                    continuteAdd = 1;
                }
            }

            while (continuteAdd == 0) {
                System.out.println("\n\n\n\n======================================");
                System.out.println("==     《Continue Add Product》      ==");
                System.out.println("=======================================");

                System.out.print("Do your want continue add product [Y=YES/N=NO]?");
                next = scan.next().toUpperCase();
                scan.nextLine();

                if (next.equals("Y")) {
                    addP = 0;
                    continuteAdd = 1;
                    confirmAdd = 1;

                } else if (next.equals("N")) {
                    System.out.println("Thank for your using!!!\n");
                    addP = 1;
                    confirmAdd = 1;
                    continuteAdd = 1;
                } else {
                    System.out.println("Invalid input!! Please try again!!");
                    confirmAdd = 1;
                    continuteAdd = 0;

                }

            }

        } while (addP == 0);

    }

    public static void modifyProduct(FastFood[] fastfood) {
        Scanner scan = new Scanner(System.in);
        String next;
        int choice = 0;
        int selection = 0;
        int start = 0;
        int continues = 0;

        do {
            System.out.println("\n======================================");
            System.out.println("==       《Update Product》        ==");
            System.out.println("==       ==================        ==");
            System.out.println("==        1.Edit Product           ==");
            System.out.println("==        2.Exit                   ==");
            System.out.println("=======================================");

            System.out.printf("\nEnter your selection :");
            choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {
                case 1:
                    int correct = 0;
                    int promission = 0;
                    do {
                        String foodId;

                        do {
                            System.out.print("\nEnter the food ID you want edit :");
                            foodId = scan.nextLine().toUpperCase();
                            System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\n\n");

                            for (int x = 0; x < fastfood.length; x++) {

                                if (fastfood[x] != null) {

                                    if (fastfood[x].getFoodID().equals(foodId)) {
                                        System.out.println("\n======================================");
                                        System.out.println("==       1.Edit name               ==");
                                        System.out.println("==       2.Edit Price              ==");
                                        System.out.println("==       3.Edit name & price       ==");
                                        System.out.println("=======================================");

                                        System.out.print("Enter your selection :");
                                        selection = scan.nextInt();
                                        scan.nextLine();

                                        String name = "";
                                        double price = 0.0;

                                        switch (selection) {
                                            case 1:
                                                System.out.print("Enter name : ");
                                                name = scan.nextLine();
                                                fastfood[x].setFoodName(name);

                                                System.out.println("\nEdit Sucessful!!!");
                                                System.out.println("======================\n\n");

                                                correct = 1;

                                                break;

                                            case 2:
                                                System.out.print("Enter price : ");
                                                price = scan.nextDouble();
                                                scan.nextLine();
                                                fastfood[x].setFoodPrice(price);

                                                System.out.println("\nEdit Sucessful!!!");
                                                System.out.println("======================\n\n");

                                                correct = 1;

                                                break;
                                            case 3:
                                                System.out.print("Enter name : ");
                                                name = scan.nextLine();
                                                fastfood[x].setFoodName(name);

                                                System.out.print("Enter price : ");
                                                price = scan.nextDouble();
                                                scan.nextLine();

                                                fastfood[x].setFoodPrice(price);

                                                System.out.println("\nEdit Sucessful!!!");
                                                System.out.println("======================\n\n");

                                                correct = 1;
                                                break;

                                            default:
                                                System.out.println("Invalid input!!!! Please try again!!!!\n\n");
                                                correct = 0;
                                        }

                                    }
                                }
                            }

                        } while (correct == 0);

                        do {
                         System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
                            System.out.printf("\n\nDO your want continute modify product?[Y=YES/N=NO] :");
                            next = scan.nextLine().toUpperCase();

                            if (next.equals("Y")) {
                                continues = 1;
                                correct = 0;

                            } else if (next.equals("N")) {
                                continues = 1;
                                correct = 1;
                                promission = 1;
                                start = 1;

                            } else {
                                System.out.println("Invalid input!!!! Please try again!!!!\n\n");
                                continues = 0;
                                correct = 1;
                            }

                        } while (continues == 0);

                    } while (promission == 0);

                    break;

                case 2:
                    System.out.println("Thank for your using!!!!\n\n");
                    start = 1;
                    break;

            }

        } while (start == 0);
    }

    public static void displayProduct(FastFood[] fastfood) {

        System.out.print("======================================================\n");
        System.out.print("\t\t《Product List》\t\t");
        System.out.print("\n\t\t ===============\t\t");
        System.out.print("\n======================================================\n");
        System.out.print("\nProduct ID      Product Name                    Price");
        System.out.print("\n------------------------------------------------------\n");
        for (int t = 0; t < fastfood.length; t++) {
            if (fastfood[t] != null && fastfood[t].getFoodID() != null) {
                System.out.println(fastfood[t].toString());
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int selection = 0;

        Employee[] employee = new Employee[5];
        employee[0] = new Manager("M001", "Adrian", 2020, 5000.00, "Manager", 12345);
        employee[1] = new Clerk("C002", "Jian Ming", 2020, 1600.00, "Clerk", 23456);
        employee[2] = new Clerk("C002", "Derrick", 2020, 1200.00, "Clerk", 34567);
        employee[3] = new Clerk("C003", "Tan Yogene", 2020, 1800.00, "Clerk", 45678);

        FastFood[] fastfood = new FastFood[50];
        fastfood[0] = new Burger("B1", "Chicken Burger", 14.0);
        fastfood[1] = new Burger("B2", "Beef Burger", 12.0);
        fastfood[2] = new Burger("B3", "Pork Burger", 16.0);
        fastfood[3] = new Burger("B4", "Vegetable Burger", 10.0);
        fastfood[4] = new FrenchFries("FF1", "Cheesy Fries", 10.0);
        fastfood[5] = new FrenchFries("FF2", "Spicy Fries", 10.0);
        fastfood[6] = new FrenchFries("FF3", "Sweet and Sour Fries", 10.0);
        fastfood[7] = new FriedChicken("FC1", "Original Fried Chicken", 12.0);
        fastfood[8] = new FriedChicken("FC2", "Spicy Fried Chicken", 15.0);

        do {
            System.out.println("\n======================================");
            System.out.println("==             《Menu》            ==");
            System.out.println("==         =================       ==");
            System.out.println("==         1.Add Product           ==");
            System.out.println("==         2.Update Product        ==");
            System.out.println("==         3.Display Product       ==");
            System.out.println("==         4.Exit                  ==");
            System.out.println("=======================================");
            System.out.printf("\nEnter your selection : ");
            selection = scan.nextInt();

            switch (selection) {
                case 1:
                    addProduct(fastfood);
                    break;
                case 2:
                    modifyProduct(fastfood);
                    break;
                case 3:

                    displayProduct(fastfood);
                    break;
                case 4:

                    break;

                default:
                    System.out.println("Terminating program...");

            }

        } while (selection != 4);

    }
}

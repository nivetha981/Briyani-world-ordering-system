import java.util.Scanner;

public class briyaniworld {
    // Menu of the Hotel
    double price = 0.00;
    double totalprice = 0.00;  // To store the total price of the entire order

    // Veg Briyani prices
   
    private static final double PANEER_B_PRICE = 180.0;
    private static final double MUSHROOM_B_PRICE = 170.0;

    // Veg Starters prices
    private static final double MUSHROOM_FRY = 70.0;
    private static final double EGG_FRY = 170.0;
    private static final double PANEER_TIKKA_PRICE = 170.0;
    private static final double PANEER_FRY = 170.0;

    // Non-veg Briyani prices
    private static final double HALF_CHICKEN_B_PRICE = 140.0;
    private static final double FULL_CHICKEN_B_PRICE = 280.0;
    private static final double HALF_MUTTON_B_PRICE = 200.0;
    private static final double FULL_MUTTON_B_PRICE = 300.0;

    // Non-veg Starters prices
    private static final double CHICKEN_SIXTYFIVE_PRICE = 120.0;
    private static final double CHICKEN_GRILL_HALF_PRICE = 200.0;
    private static final double CHICKEN_DEEP_FRY_PRICE = 170.0;
    private static final double MUTTON_CHUKKA_PRICE = 180.0;
    private static final double FISH_FRY = 99.0;
    private static final double PRAWN_FRY = 120.0;
    private static final double BIG_FISH_FRY = 299.0;

    // Method to display the price of the current item and the total amount to be paid
    public void printPrice(double price) {
        // Accumulate the price to the total
        totalprice += price;
        // Display the current price and the total price so far
        System.out.println("Item Price: Rupees " + price);
        System.out.println("---------------------------------------------");
        System.out.println("Total Amount to be Paid: Rupees " + totalprice);
        System.out.println("---------------------------------------------");
    }

    // Veg or non-veg selection
    void veg_or_nonveg(String type) {
        if (type.equalsIgnoreCase("Veg")) {
            System.out.println("You have selected Vegetarian Briyani");
        } else {
            System.out.println("You have selected Non-Vegetarian Briyani");
        }
    }

    // Veg briyani selection
    void veg_type(String vegtype) {
        if (vegtype.equalsIgnoreCase("mushroom")) {
            System.out.println("You have selected Mushroom Briyani");
            price = MUSHROOM_B_PRICE;
        } else if (vegtype.equalsIgnoreCase("paneer")) {
            System.out.println("You have selected Paneer Briyani");
            price = PANEER_B_PRICE;
        } else {
            System.out.println("Sorry, the selected veg type is not available.");
            return;
        }
        printPrice(price);  // Add to the total price and display
    }

    // Non-veg briyani selection
    void ntype(String nontype) {
        Scanner s = new Scanner(System.in);

        if (nontype.equalsIgnoreCase("chicken")) {
            System.out.println("Enter Half/Full Chicken Briyani:");
            String types = s.nextLine();

            if (types.equalsIgnoreCase("half")) {
                price = HALF_CHICKEN_B_PRICE;
            } else if (types.equalsIgnoreCase("full")) {
                price = FULL_CHICKEN_B_PRICE;
            } else {
                System.out.println("Invalid option selected for chicken.");
                return;
            }
            printPrice(price);  // Add to the total price and display

        } else if (nontype.equalsIgnoreCase("mutton")) {
            System.out.println("Enter Half/Full Mutton Briyani:");
            String types = s.nextLine();

            if (types.equalsIgnoreCase("half")) {
                price = HALF_MUTTON_B_PRICE;
            } else if (types.equalsIgnoreCase("full")) {
                price = FULL_MUTTON_B_PRICE;
            } else {
                System.out.println("Invalid option selected for mutton.");
                return;
            }
            printPrice(price);  // Add to the total price and display

        } else {
            System.out.println("Briyani type not available.");
        }
    }

    // Non-veg starters selection
    void starters(String starter) {
        if (starter.equalsIgnoreCase("chicken grill half")) {
            System.out.println("You have selected Chicken Grill Half");
            price = CHICKEN_GRILL_HALF_PRICE;
        } else if (starter.equalsIgnoreCase("chicken sixty five")) {
            System.out.println("You have selected Chicken Sixty Five");
            price = CHICKEN_SIXTYFIVE_PRICE;
        } else if (starter.equalsIgnoreCase("mutton chukka")) {
            System.out.println("You have selected Mutton Chukka");
            price = MUTTON_CHUKKA_PRICE;
        } else if (starter.equalsIgnoreCase("fish fry")) {
            System.out.println("You have selected Fish Fry");
            price = FISH_FRY;
        } else if (starter.equalsIgnoreCase("prawn fry")) {
            System.out.println("You have selected Prawn Fry");
            price = PRAWN_FRY;
        } else if (starter.equalsIgnoreCase("big fish fry")) {
            System.out.println("You have selected Big Fish Fry");
            price = BIG_FISH_FRY;
        } else if (starter.equalsIgnoreCase("chicken deep fry")) {
            System.out.println("You have selected Chicken Deep Fry");
            price = CHICKEN_DEEP_FRY_PRICE;
        } else {
            System.out.println("Sorry, the selected starter is not available.");
            return;
        }
        printPrice(price);  // Add to the total price and display
    }

    // Veg starters selection
    void vstarters(String vstarter) {
        if (vstarter.equalsIgnoreCase("Paneer fry")) {
            System.out.println("You have selected Paneer Fry");
            price = PANEER_FRY;
        } else if (vstarter.equalsIgnoreCase("mushroom fry")) {
            System.out.println("You have selected Mushroom Fry");
            price = MUSHROOM_FRY;
        } else if (vstarter.equalsIgnoreCase("egg fry")) {
            System.out.println("You have selected Egg Fry");
            price = EGG_FRY;
        } else if (vstarter.equalsIgnoreCase("paneer tikka")) {
            System.out.println("You have selected Paneer Tikka");
            price = PANEER_TIKKA_PRICE;
        } else {
            System.out.println("Sorry, the selected starter is not available.");
            return;
        }
        printPrice(price);  // Add to the total price and display
    }

    // Main logic for the ordering loop
    void loop() {
        Scanner s = new Scanner(System.in);
        briyaniworld n = new briyaniworld();

        // Start the order process
        System.out.println("Enter the type of briyani you want (Veg/Non-veg):");
        String input = s.nextLine();

        n.veg_or_nonveg(input);

        if (input.equalsIgnoreCase("veg")) {
            System.out.println("We have options in Veg Briyani like:");
            System.out.println("Paneer Briyani and Mushroom Briyani");
            System.out.println("Enter which type of Briyani you want:");
            String vegtype = s.nextLine();
            n.veg_type(vegtype);

        } else if (input.equalsIgnoreCase("non veg")) {
            System.out.println("We have options in Non-Veg Briyani like:");
            System.out.println("Chicken Briyani and Mutton Briyani");
            System.out.println("Enter which type of Non-Veg Briyani you want:");
            String nvegtype = s.nextLine();
            n.ntype(nvegtype);

        } else {
            System.out.println("Invalid selection, please choose Veg or Non-veg.");
        }

        // Ask the user if they want to place an order for starters
        System.out.println("Want to place an order for Starters? (yes/no)");
        String sts = s.nextLine();

        if (sts.equalsIgnoreCase("yes")) {
            System.out.println("Veg or Non-veg Starters?");
            String ans = s.nextLine();

            if (ans.equalsIgnoreCase("veg")) {
                System.out.println("We have options like Paneer Fry, Mushroom Fry, Egg Fry, Paneer Tikka.");
                System.out.println("Enter which type of Veg Starters you want:");
                String vstarter = s.nextLine();
                n.vstarters(vstarter);
            } else {
                System.out.println("We have options like Chicken Deep Fry, Big Fish Fry, Prawn Fry, Fish Fry, Mutton Chukka, Chicken Sixty Five, Chicken Grill Half.");
                System.out.println("Enter which type of Non-Veg Starters you want:");
                String starter = s.nextLine();
                n.starters(starter);
            }
        }

        // Ask the user if they want to place another order
        System.out.println("Want to place any other order? (yes/no)");
        String answer = s.nextLine();

        // If the user wants to place another order, call the loop method again
        if (answer.equalsIgnoreCase("yes")) {
            loop();  // Recursive call to start a new order
        } else {
            // Display the total price at the end of the order
            System.out.println("Thanks for ordering!");
            System.out.println("Have a great day.");
        }

        // Close the scanner after all orders
        s.close();
    }

    public static void main(String[] args) {
        briyaniworld orderSystem = new briyaniworld();
        orderSystem.loop();  // Start the ordering loop
    }
}
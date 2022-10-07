import java.util.Scanner;

public class WelcomeMenu {

//    public String firstMenu() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Choose an option:\t");
//        System.out.println("1.");
//        System.out.println("2.");
//        System.out.println(3.);
//
//        return null;


    private static Scanner scanner = new Scanner(System.in);

    public static void homeScreenDisplay() {
        System.out.println();

        System.out.println("***************************************************");
        System.out.println("               ╦ ╦┌─┐┬  ┌─┐┌─┐┌┬┐┌─┐  \n" +
                "               ║║║├┤ │  │  │ ││││├┤   \n" +
                "               ╚╩╝└─┘┴─┘└─┘└─┘┴ ┴└─┘ ");
        System.out.println("***************************************************");

//        // are you hungry or not
        System.out.println();
        System.out.println();
        System.out.println("        Are you hungry?  (Y) or (N))");
        // condition 1: Most specific (not Y, not N)

        // condition 2: Specific (Not Y)
        // condition 3: least specific (Not N)
        String userHungry = promptForString();

        // condition 1: Most specific (not Y, not N)
        if(!userHungry.equalsIgnoreCase("N") && !userHungry.equalsIgnoreCase("Y")) {
            enterValidInput();
        }

        if(userHungry.equalsIgnoreCase("Y")) {
            cuisineMenu();
        }
        if (userHungry.equalsIgnoreCase("N")) {
            System.out.println(" __        __        __     ___  __      __   ___         __       \n" +
                    "/__` |  | /  ` |__/ /__`     |  /  \\    |__) |__     \\ / /  \\ |  | \n" +
                    ".__/ \\__/ \\__, |  \\ .__/     |  \\__/    |__) |___     |  \\__/ \\__/ ");

        }

        }


        public static void cuisineMenu () {

            // prompt for string input from youre hungry or not
            // with string input we check for Yes or No OR iNVALID
            // if condition is Yes then run the following:
            System.out.println();
            System.out.println("  __                                            \n" +
                    " (_   _        _      ._   |_      ._   _  ._   \n" +
                    " __) (_)   \\/ (_) |_| |    | | |_| | | (_| | \\/ \n" +
                    "           /                            _|   /   ");
            System.out.println();
            System.out.println("What food are you in the mood for?");
            System.out.println();
            System.out.println("(A)sian");
            System.out.println("(S)panish");
            System.out.println("(H)amburger");
            System.out.println("(V)egan");

            // prompt for user choice
            String userFoodChoice = promptForString();
            if (!userFoodChoice.equalsIgnoreCase("a") &&
                    !userFoodChoice.equalsIgnoreCase("s") &&
                    !userFoodChoice.equalsIgnoreCase("h") &&
                    !userFoodChoice.equalsIgnoreCase("v")) {
                enterValidInput();
            }
            if (userFoodChoice.equalsIgnoreCase("a")) {
                WelcomeMenu.asainDisplay();
            }
            if (userFoodChoice.equalsIgnoreCase("s")) {
                WelcomeMenu.spanishDisplay();
            }
            if (userFoodChoice.equalsIgnoreCase("h")) {
                WelcomeMenu.hamburgerDisplay();
            }
            if (userFoodChoice.equalsIgnoreCase("v")) {
                WelcomeMenu.veganDisplay();
            }

        }

        public static void asainDisplay () {
            System.out.println("   \u2BE8\u2BE8   \u2BE8   \u2BE8   \u2BE8   \u2BE8   \u2BE8   \u2BE8   \u2BE8   \u2BE8   \u2BE8   \u2BE8   \u2BE8   \u2BE8   \u2BE8   \u2BE8   \u2BE8   \u2BE8\u2BE8");
            System.out.println("          Here are some 4+ ratings Asian restaurants to try!");
            System.out.println("   \u2BE8\u2BE8   \u2BE8   \u2BE8   \u2BE8   \u2BE8   \u2BE8   \u2BE8   \u2BE8   \u2BE8   \u2BE8   \u2BE8   \u2BE8   \u2BE8   \u2BE8   \u2BE8   \u2BE8   \u2BE8\u2BE8");
            System.out.println();
            System.out.println("[1] OBAO [Hell's Kitchen] $$ ★★★★☆ Asian Fusion Restaurant ");
            System.out.println("[2] Jongro BBQ $$ ★★★★☆ Korean BBQ Restaurant");
            System.out.println("[3] Asuka Sushi  $$ ★★★★☆  Sushi restaurant");


            System.out.println();
            System.out.println(moreInfo);

            Integer option = promptForNumber();
            if (option > 3) {
                System.out.println("_____________________");
                System.out.println("You selected option " + option);
                System.out.println("_____________________");
                chooseRightNum();
                // call back the specific cuisine display
                asainDisplay();
            }



            switch (option) {
                case 1:
                    System.out.println();
                    System.out.println("OBAO [Hell's Kitchen] $$ ★★★★☆ Asian Fusion Restaurant");
                    System.out.println();
                    System.out.println("Sleek destination turning out Asian fusion BBQ & small plates with creative cocktails.");
                    System.out.println("Hours are Sun 11:30am - 10:30pm; Mon-Thur 11:30am - 11:30 pm; Fri - Sat 11:30am - 12am");
                    break;
                case 2:
                    System.out.println();
                    System.out.println("Jongro BBQ $$ ★★★★☆ Korean BBQ Restaurant");
                    System.out.println();
                    System.out.println("Korean BBQ & other traditional dishes served in a casual, open-timbered space with in-table grills.");
                    System.out.println("Sun-Thur 11:30am - 12am; Fri-Sat 11:30 - 1am;");
                    break;
                case 3:
                    System.out.println();
                    System.out.println("Asuka Sushi  $$ ★★★★☆  Sushi restaurant");
                    System.out.println();
                    System.out.println("Chelsea Japanese hangout with sushi bar, lunch specials & free salad bar for in-house diners.");
                    System.out.println("Hours are Sun-Thur 11am - 10pm; Fri-Sat 11am - 10:30pm;");
                    break;

            }

        }
        public static void spanishDisplay () {
            System.out.println("   \u2BE8\u2BE8   \u2BE8   \u2BE8   \u2BE8   \u2BE8   \u2BE8   \u2BE8   \u2BE8   \u2BE8   \u2BE8   \u2BE8   \u2BE8\u2BE8");
            System.out.println(" Here are some 4+ ratings Spanish restaurants to try!");
            System.out.println("   \u2BE8\u2BE8   \u2BE8   \u2BE8   \u2BE8   \u2BE8   \u2BE8   \u2BE8   \u2BE8   \u2BE8   \u2BE8   \u2BE8   \u2BE8\u2BE8");
            System.out.println();
            System.out.println("[1] Rosa Mexicano [18th St] $$ ★★★★☆ Mexican Restaurant ");
            System.out.println("[2] Coppelia $$ ★★★★☆ Cuban Restaurant");
            System.out.println("[3] Gonzalez y Gonzalez  $$ ★★★★☆  Mexican restaurant ◕‿↼) Salsa dancing");

            System.out.println();
            System.out.println(moreInfo);


            Integer option = promptForNumber();
            if (option > 3) {
                System.out.println("_____________________");
                System.out.println("You selected option " + option);
                System.out.println("_____________________");
                chooseRightNum();
                // call back the specific cuisine display
                spanishDisplay();
            }


            switch (option) {
                case 1:
                    System.out.println();
                    System.out.println("Rosa Mexicano [18th St] $$ ★★★★☆ Mexican Restaurant");
                    System.out.println();
                    System.out.println("Modern Mexican chain eatery known for tableside guacamole, creative margaritas & chic surrounds.");
                    System.out.println("Hours are Sun - Wed 11:30am - 10pm; Thur 11:30am - 10:30 pm; Fri - Sat 11:30am - 11pm");
                    break;
                case 2:
                    System.out.println();
                    System.out.println("Coppelia $$ ★★★★☆ Cuban Restaurant");
                    System.out.println();
                    System.out.println("24/7 luncheonette dishing out Pan-Latin comfort fare in a casual, colorful setting.");
                    System.out.println("Open 24 hours");
                    break;
                case 3:
                    System.out.println();
                    System.out.println("Gonzalez y Gonzalez  $$ ★★★★☆  Mexican restaurant ◕‿↼) Salsa dancing");
                    System.out.println();
                    System.out.println("Mexican restaurant featuring happy hours, salsa bands & free salsa dance classes, plus a dance club.");
                    System.out.println("Hours are Sun 1pm - 10pm; Mon-Wed Closed; Thur 4pm - 2am; Fri-Sat 4pm - 4am;");
                    break;
                case 4:
                    System.out.println("Please choose a proper number");
                    spanishDisplay();
//            default:
//                enterValidInput();
            }

        }


        public static void hamburgerDisplay () {
            System.out.println("   \u2BE8\u2BE8   \u2BE8   \u2BE8   \u2BE8   \u2BE8   \u2BE8   \u2BE8   \u2BE8   \u2BE8   \u2BE8   \u2BE8   \u2BE8\u2BE8");
            System.out.println(" Here are some 4+ ratings restaurants to get a burger at!");
            System.out.println("   \u2BE8\u2BE8   \u2BE8   \u2BE8   \u2BE8   \u2BE8   \u2BE8   \u2BE8   \u2BE8   \u2BE8   \u2BE8   \u2BE8   \u2BE8\u2BE8");
            System.out.println();
            System.out.println("[1] 5 Napkin Burger [9th Ave] $$ ★★★★☆ Hamburger Restaurant ");
            System.out.println("[2] Bea $$ ★★★★☆ American Restaurant ◕‿↼) Late night ");
            System.out.println("[3] Black Tap Craft Burgers & Beer  $$ ★★★★☆  Hamburger restaurant ◕‿↼) Milkshakes");


            System.out.println();
            System.out.println(moreInfo);


            Integer option = promptForNumber();
            System.out.println("You selected option " + option);
            if (option > 3) {
                System.out.println("_____________________");
                System.out.println("You selected option " + option);
                System.out.println("_____________________");
                chooseRightNum();
                // call back the specific cuisine display
                hamburgerDisplay();
            }


            switch (option) {
                case 1:
                    System.out.println();
                    System.out.println("5 Napkin Burger [9th Ave] $$ ★★★★☆ Hamburger Restaurant ");
                    System.out.println();
                    System.out.println("Modern bistro chain serving gourmet meat & veggie burgers");
                    System.out.println("Hours are Sun-Tues 11:30am - 10:30pm; Wed-Sat 11:30am - 11:30pm");
                    break;
                case 2:
                    System.out.println();
                    System.out.println("Bea $$ ★★★★☆ American Restaurant ◕‿↼) Late night ");
                    System.out.println();
                    System.out.println("Intimate, brick-walled eatery & bar with handcrafted cocktails, eclectic small plates & a courtyard.");
                    System.out.println("Hours are Sun 11am - 9pm; Mon-Thur 12pm - 9pm; Fri-Sat 11am -11pm");
                    break;
                case 3:
                    System.out.println();
                    System.out.println("Black Tap Craft Burgers & Beer  $$ ★★★★☆  Hamburger restaurant ◕‿↼) Milkshakes");
                    System.out.println();
                    System.out.println("Creative gourmet burgers, modern sides, shakes & draft beers served in a small, casually hip space.");
                    System.out.println("Hours are Sun 11am - 4pm, 5pm - 2am; Mon-Fri 5pm - 2am; Sat 11am - 4pm, 5pm - 2am");
                    break;

            }
        }

        public static void veganDisplay () {
            System.out.println("   \u2BE8\u2BE8   \u2BE8   \u2BE8   \u2BE8   \u2BE8   \u2BE8   \u2BE8   \u2BE8   \u2BE8   \u2BE8   \u2BE8   \u2BE8   \u2BE8   \u2BE8   \u2BE8   \u2BE8\u2BE8");
            System.out.println(" No meat no problem! Here are some 4+ ratings vegan restaurants to try!");
            System.out.println("   \u2BE8\u2BE8   \u2BE8   \u2BE8   \u2BE8   \u2BE8   \u2BE8   \u2BE8   \u2BE8   \u2BE8   \u2BE8   \u2BE8   \u2BE8   \u2BE8   \u2BE8   \u2BE8   \u2BE8\u2BE8");
            System.out.println();
            System.out.println("[1] LuAnne's Wild Ginger [Broome St] $$ ★★★★☆  Asian Fusion Vegan Restaurant ");
            System.out.println("[2] Beyond Sushi [37 St] $$ ★★★★☆ Vegan Sushi Restaurant");
            System.out.println("[3] Urban Vegan Kitchen $$ ★★★★☆  Vegan Comfort Food Restaurant ");

            System.out.println();
            System.out.println(moreInfo);


            Integer option = promptForNumber();

            if (option > 3) {
                System.out.println("_____________________");
                System.out.println("You selected option " + option);
                System.out.println("_____________________");
                chooseRightNum();
                // call back the specific cuisine display
                veganDisplay();
            }

            switch (option) {
                case 1:
                    System.out.println();
                    System.out.println("This vegan venue has Japanese, Korean, Chinese & Thai influences & uses local produce & mock meat.");
                    System.out.println(" Hours are Sun-Sat 12pm - 10pm");
                    break;
                case 2:
                    System.out.println();
                    System.out.println("This location features a bar, serving a range of cocktails, wine, beer and sake. Enjoy your favorite plant-based food including their signature vegan sushi rolls in the heart of Manhattan!");
                    System.out.println("Hours are Sun-Thur 11:30am - 9:30pm; Fri-Sat 11:30am - 10:30pm");
                    break;
                case 3:
                    System.out.println();
                    System.out.println("Organic vegan comfort food, along with cocktails & mocktails in an intimate West Village setting.");
                    System.out.println("Hours are Sun 10am - 10pm; Mon-Thur 12pm - 10pm; Fri 12pm - 12am; Sat 10am - 12am");

            }


        }
        public static void enterValidInput () {
            System.out.println("<------------------------>");
            System.out.println("YOU ENTERED AN INVALID REQUEST ");
            System.out.println("<------------------------>");

        }
        public static String moreInfo = "For more restaurant information select a number:  ";

        public static String promptForString () {
            Scanner scanner = new Scanner(System.in);
//            scanner.close();
            return scanner.nextLine();
        }

        public static int promptForNumber () {
            Scanner scanner2 = new Scanner(System.in);
            int variable2 = scanner2.nextInt();
//            scanner2.close();
            return variable2;
        }

        public static void chooseRightNum(){
            System.out.println();
            System.out.println(" __                               _                            \n" +
                    "/  |_  _  _  _  _     _     __ o (_||_ _|_   __    __ |_  _  __\n" +
                    "\\__| |(_)(_)_> (/_   (_|    |  | __|| | |_   | ||_|||||_)(/_ | ");
            System.out.println();
        }

}







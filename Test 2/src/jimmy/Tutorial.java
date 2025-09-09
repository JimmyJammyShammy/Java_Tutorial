package jimmy;

// This is needed for the Scanner input
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Tutorial {
    public static void main(String[] args) {

        // Table of Contents
            // Comments & Multiline Comments, line: 107
            // Variables, line: 114
            // Data types, line: 141
                // Integers & Longs, line: 156
                // Floating Point Numbers (floats & doubles), line: 163
                // Booleans (True or False), line: 176
                // Chars, line: 182
            // Basic Syntax, line: 191
            // Input & Output, line: 234
                // Output, line: 236
                // Input, line: 253
            // Integers & Math, line: 293
                // Addition & Subtraction, line: 297
                // Multiplication & Division, line: 303
                // Powers & Roots, line: 334
                // Remainder (Modulo), line: 350
                // Extra Math Methods, line: 357
                    // Absolute Value, line: 361
                    // Constants, line: 365
                    // Rounding, line: 371
                    // Min/Max, line: 382
            // Booleans & Logic, line: 390
                // Booleans, line: 392
                // Comparisons, line: 402
                // Logic, line: 420
            // Assignment Operators, line:464
                // Assignment (=), line: 466
                // Addition (+=), line: 470
                // Subtraction (-=), line: 478
                // Multiplication (*=), line: 485
                // Division (/=), line: 490
                // Remainder (Modulo) (%=), line: 495
            // If & Switch Statements, line: 500
                // If Statements, line: 502
                // Switch Statements, line: 530
            // Loops, line: 551
                // For Loop, line: 553
                // While Loop, line: 590
            // EXERCISE 1: Simple Calculator, line: 614
                // Solution, line: 631
            // Ternary Operator, line: 680
            // Casting Variables, line: 694
                // Implicit Cast, line: 703
                // Explicit Cast, line: 706
            // String & String Methods, line: 723
                // Quotation Marks, line: 726
                // Concatenation, line: 732
                // Uppercase & Lowercase (.toUpperCase) (.toLowerCase), line: 750
                // Contain, line: 760
                // Replace, line: 768
                    // .replace, line: 775
                    // .replaceAll, line: 781
                    // .replaceFirst, line: 784
                // CharAt, line: 787
                // Equals, line: 797
            // Arrays, line: 812
                // String Arrays, line: 815
                // Numerical Arrays, line: 848
            // Methods, line: 861
            // Collections, line: 918
                // Lists, line: 921
                // Sets, line: 930
                // Maps, line: 941
            // Exercise 2: Calculator, line: 960
            // Object-Oriented Programming - Theory, line: 1030
            // Classes & Objects, line: 1066
                // Using New Class - Constructors, line: 1069
            // Access Modifiers, line: 1093
                // Static Variables, line: 1119
                // Static Methods, line: 1127
            // Inheritance & Polymorphism, line: 1136
            // Abstract Classes & Interfaces, line: 1149
                // Abstract Class, line: 1149
                // Interface, line: 1159
            // Anonymous Classes, line: 1192
            // Exercise 3, line: 1223
            // Enums & Advanced Enums, line: 1231
                // Enums, line: 1232
                // Advanced Enums, line: 1249
            // Generics, line: 1291
            // Lambda & Streams, line: 1316
                // Lambda Expressions, line: 1317
                // Lambda Expressions with Methods, line: 1328
                // Streams, line: 1377
            // Records, line: 1397
            // JSON Files, line: 1409
            // Additional Java Info, line: 1439
                // Null, line: 1441
                // var Keyword, line: 1446
                // Design Patterns for Java, line: 1453
                    // Singleton Patterns, line: 1456
                        // Class-Based Singleton, line: 1459
                        // Enum Singleton, line:1500


        // Comments & Multiline Comments

            // <-- double slash notates a comment
            /* <-- notates the beginning of a multiline comment
            * this is the rest of my comment
            Notates the end of the multiline comment--> */

        // Variables

            // datatype variable_name; <-- called the Declaration
            // datatype variable_name = variable_value; <-- called an Initialization = Declaration + Value Assignment
            // Variables can be used multiple times if not given a datatype

            // int tmo would be equal to all 3, if printed, would print all 3 separately
            int tmo = 10;
            tmo = 20;
            tmo = 30;

            // Will only reference the latest declaration, while ignoring the others
            int tom = tmo + 30;

            // Previous declarations are only ignored if the variable is referenced in an operation

            // If printed, it would reference the variable directly before it
            int mot = 30 + 1;
            System.out.println(mot); // returns 31

            mot = 30 + 2;
            System.out.println(mot); // returns 32

            mot = 30 + 3;
            System.out.println(mot);// returns 33


        // Data types

            // Integers & Longs (int & long)
            // NO COMMAS

            // Integers(All whole numbers) from -2,147,483,648 -> 2,147,483,648
                // Store less integers, 32-bit data type

                //Declaration: int = datatype, value = variable_name
                int value;
                //Assignment: value = variable_name, 5 = variable_value
                value = 5;
                //Initialization: int x = Declaration, "= 10" = Assignment
                int m = 10;

            // Long (All whole numbers) from -9,223,372,036,854,775,808 -> 9,223,372,036,854,775,808
                // Store more integers, 64-bit data type

                        /* L needed at the end of long value to indicate it is a numerical literal,
                           or else it will try and save as an integer */
                long big = 99999999999999L;

            // Floating Point Numbers (floats & doubles)
                // floats store 6-7 decimals, 32-bit data type

                        /* f needed at the end of float value to dictate its termination as a numerical literal,
                           or else it will try and save as a double */
                float pi = 3.1415963f;

                // doubles store 15 decimals, 64-bit data type
                double e = 2.1938091230;

                // precision can be an issue for real numbers due to rounding error
                // Scientific notation - 239482348 * 10^-5

            // Booleans (True or False)
                // set a variable as true or false

                boolean state = true;
                boolean effect = false;

            // Chars (characters) & Strings
                // char = a letter, symbol, or number
                // string = multiple chars

                // Assignment of a char must use apostrophes ''
                char letter = 'a';
                // Assignment of a string must use quotes "", S in String must be capital
                String word = "Java";

        // Basic Syntax

            // Every instruction/ line needs a semicolon ;.
            int l = 10;
            boolean k = true;

            /* the equals sign = is a sided assignment operator when assigning a value
               this means you cannot assign a number a string or char value */

            // When setting two strings/chars equal to each other, the variable and value changes what happens to each

            int x = 10;
            int y = 20;

            // x will = 20
            x = y;

            // y will = 20
            y = x;

            /* The order in which the assignment happens matters
             * In the above case the initial assigned value for x (10) was greyed out due to it being changed
             * x was assigned to the value of y (20) replacing the previous (10) assignment */

            int z = 10;
            int p = 20;

            // p will = 10
            p = z;
            // z will = 10
            z = p;

            /* Whichever assignment happens first overwrites the previous assignment

             * The datatype of a variable limits what value it can be assigned

             * Introducing the char 'a' into the assignment of an integer variable creates an error since it expects numbers
             * int r = 43a;

             * Even using a previously establish variable will not work since it is not a proper statement
             * 42 next to the variable x does not have any actual value that can be assigned
             * int g = 42x; */

        // Input & Output

            // Output

                /* Used to output a string
                 * "S" in System must be capital
                 * Message written in parentheses
                 * System.out.println("Hello World"); */

                // Can be used to output variables
                int hp = 24;
                System.out.println(hp);

                // Can output strings alongside variables
                int health = 54;

                // Need a space after "is" to have a space between the end of the string and the variable
                System.out.println("Your health is " + health);// returns, Your health is 54

            // Input

                /* If import java.util.Scanner doesn't appear, click on Scanner and press alt + enter to import
                 * Scanner is the datatype
                 * scan is the variable name
                 * EXPLAINED LATER */
                Scanner scan = new Scanner(System.in);

                /* "I" in nextInt has to be capital
                 * Integer datatype limits what can be typed to only integers, if a string is typed an error is made
                 * Scanner_name.nextInt is used to scan for integers
                 * This function scans what integer you type and stores it in a variable */
                int number = scan.nextInt();

                System.out.println("You have typed " + number);

                // Scanner_name.next is used to scan for strings
                // .next only scans a string up to the first space

                String input = scan.next();
                System.out.println("You have typed " + input); // returns "You have typed (first word of input)"

                // Scanner_name.nextLine is used to scan for an entire string
                String input2 = scan.nextLine();
                System.out.println("You have typed " + input2); // returns "You have typed (full inputted string)"

                /* The order of scans creates weird interaction
                 * scan.nextInt takes in an integer, then call the scan.next/ scan.nextLine command
                 * On pressing "enter" to input the integer for scan.nextInt,
                 * The "enter" is taken as the input for scan.next/ scan.nextLine */

                int grade = scan.nextInt();
                System.out.println("You have typed " + grade);

                // Adding a scan.nextLine(); before your actual scan.nextLine(): command negates this effect
                scan.nextLine();
                String words = scan.nextLine();
                System.out.println("You have typed " + words);


        // Integers & Math

            /* Operations work with all numerical data types, integers, floats, doubles */

            // Addition & Subtraction

                int sum = 20 + 10; // returns 30 for "sum"

                int dif = 20 - 10; // returns 10 for "dif"

            // Multiplication & division

                int prod = 50 * 5; // returns 250 for "prod", 50*5

                int quo = 50 / 5; // returns 10 for "quo", 50/5

                int quo2 = 5 / 50; // returns 0 for "quo2" since it is an integer and integers can only be whole numbers

                float quo3 = 5 / 50; // returns 0 for "quo3" since the variables also need to be a float or double


                float hb = 20;
                float hj = 30;
                // Doubles would give an answer to more decimal places
                float hjhb = hb / hj; // returns 0.66666667, both the operation variable and the input variables are floats

                double jh = 30;
                double kj = 10;

                // float jhkj = jh / kj; // returns an error since the operator variable is less precise than the input variables
                // floats(7 digits) are less precise than doubles(15 digits)


                // Having input variables be a float and double does not matter
                // As long as the operation variable is more or as precise as the input variables, it will work


                // NO DIVISION BY ZERO

                    int yuuy = 10 / 0; // returns an arithmetic error since you cannot divide by zero

            // Powers & Roots

                // Power function is in the form, Math.pow(double a, double b), returning a^b
                // Must be a double

                double pow = Math.pow(10, 2); // returns 100

                // Power can be used to put a number to a fractional power
                double powfrac = Math.pow(8, 1 / 3); // returns 2, 2^(1/3) = the cube root of 8

                // Must be a double
                double root = Math.sqrt(4); // returns 2, square root of 4 is 2

                // Must be a double
                double root2 = Math.cbrt(8); // returns 2, cube root of 8 is 2

            // Remainder (Modulo)
                // Uses % as its operator

                int rem = 100 % 2; // returns 0 for "rem", 100 / 2 has no remainder

                int rem2 = 100 % 6; // returns 4 for "rem2", 100 / 6 has a remainder of 4

            // Extra Math Methods

                    // Inputting Math. will give a variety of operations

                // Absolute Value

                    double tem = Math.abs(-99); // returns 99 for "tem", Math.abs finds the absolute value

                // Constants

                    double PI = Math.PI; // Gives PI up to 15 decimals

                    double E = Math.E; // Gives E up to 15 decimals

                // Rounding

                    // returns a double
                    double rndup = Math.ceil(1.44); // returns 2 for "rndup", rounding up from 1.44 to the next whole number

                    // returns a long
                    long rnd = Math.round(1.44); // returns 1 for "rnd", rounding to the nearest whole number

                    // returns a double
                    double rnddwn = Math.floor(1.45); // returns 1 for "rnddwn", rounding 1.45 down to the nearest whole number

                // Min / Max

                    // Can return any of the number data types
                    int min = Math.min(1, 2); // returns 1 for min, 1 is the minimum value in the array

                    // Can return any of the number data types
                    int max = Math.max(1, 2); // returns 2 for max, 2 is the maximum value of the array

        // Booleans & Logic

            // Booleans

                //Booleans are either true(1) of false(0)
                boolean hfu = true;
                boolean gub = false;

                System.out.println("hfu is: " + hfu); // returns hfu is: true

                System.out.println("gub is: " + gub); // returns gub is: false

            // Comparisons

                // Operators: < <= > >= == != (not equal to)
                // Used to compare two values

                // Comparisons combined with a Boolean will return a true or false based on if the numerical operation was true
                boolean comparison = 100 > 50;
                System.out.println("100 is larger than 50: " + comparison); // returns 100 is larger than 50: true

                comparison = 100 < 50;
                System.out.println("100 is smaller than 50: " + comparison); // returns 100 is smaller than 50: false

                comparison = 100 == 100;
                System.out.println("100 is equal to 100: " + comparison); // returns 100 is equal to 100: true

                comparison = 100 != 100;
                System.out.println("100 is not equal to 100: " + comparison); // returns 100 is not equal to 100: false

            // Logic (OR | AND | NOT)

                // OR (||)
                    /* Looks at a OR b to determine the output c, if a OR b is 1, or both are 1, then c is 1
                     * if neither a OR b is 1, then c is 0
                     * a | b | c
                     * 0 | 0 | 0
                     * 1 | 0 | 1
                     * 0 | 1 | 1
                     * 1 | 1 | 1
                     */

                // actionDone only returns true if either motion or motion2 is true, if neither then false
                boolean motion = true;
                boolean motion2 = false;
                boolean actionDone = motion || motion2;

                // AND (&&)
                    /* Looks at a AND b to determine output c, if only a OR b is 1, or if neither are 1, then c is 0
                     * a AND b must be 1 for c to be 1
                     * a | b | c
                     * 0 | 0 | 0
                     * 1 | 0 | 0
                     * 0 | 1 | 0
                     * 1 | 1 | 1
                     */

                // isGood only returns true if both goodDeed AND goodDeed2 are true, else its false
                boolean goodDeed = true;
                boolean goodDeed2 = true;
                boolean isGood = goodDeed && goodDeed2;

                // NOT (!)
                    /* Looks at a boolean value and returns its inverse
                     * a | !a
                     * 0 | 1
                     * 1 | 0
                    */

                // Sets isSmol to be the inverse of pump(true) which is false
                boolean hasPump = true;
                boolean isSmol = !hasPump;
                System.out.println("isSmol is: " + !hasPump); // returns isSmol is: false

        // Assignment Operators

            // Assignment (=)
                // Variable bum is equal to 50
                int bum = 50;

            // Addition (+=)
                int tum = 50;
                // Is the same as, tum = tum + 20;
                tum += 20;  // returns 70

            // Is the same as, tum += 1 or tum = tum + 1;
                tum++; // returns 51

            // Subtraction (-=)
                int yum = 50;
                // Is the same as, yum = yum - 20;
                yum -= 20; // returns 30
                // Is the same as, yum -= 1 or yum = yum - 1;
                yum--; // returns 49

            // Multipliation (*=)
                int uum = 50;
                // Is the same as, uum = uum * 20;
                uum *= 20; // returns 1000

            // Division (/=)
                int dum = 50;
                // Is the same as, dum = dum / 5;
                dum /= 5; // returns 10

            // Remainder (Modulo) (%=)
                int rum = 50;
                // Is the same as, rum = rum % 6;
                rum %= 6; // returns 2

        // If & Switch Statements

                // If Statements

                    boolean gem = true;
                    // Code within if statements ONLY runs if the boolean variable inside it is true
                    // Takes in boolean variable(s) and checks its true or false value, returning the result in a boolean
                    if (gem) {
                        System.out.println("Hello World"); // returns "Hello World" if gem = true
                    }
                    // Code within else statements ONLY runs if the boolean variable within the previous if statement is false
                    else {
                        System.out.println("Goodbye World"); // returns "Goodbye World" if gem = false
                    }


                    int pom = 25;
                    if (pom > 60 && pom < 100) {
                        System.out.println("pom is a big number between 60 and 100");
                    }
                    // else if statements MUST be AFTER an if statement and BEFORE an else statement
                    // Runs another if statement ONLY if the previous if statement was false AND the current if statement is true
                    else if (pom >= 25) {
                        System.out.println("pom is a medium number smaller than 60 but greater than or equal to 25");
                    }
                    // Runs only if previous if and else if statements are false
                    else {
                        System.out.println("pom is a small number less than 25");
                    }

            // Switch Statements

                // For switch statements, integers instead of doubles of floats should be used since those data types rarely equal a round number
                int gus = 1;
                // switch statements are like if statements but with a defined action per value the variable can take
                // Should only be used if the variable has a finite amount of values or enums
                switch (gus) {

                    default: // For when gus has no value
                        System.out.println("gus is Unknown");
                        break;

                    case 0: // WHen gus = 0
                        System.out.println("gus is 0");
                        break; // The break is needed to run only the current case, else it would run the rest

                    case 1: // When gus = 1
                        System.out.println("gus is 1");
                        break;
                }

        // Loops

            // For Loop

                /* Structure, for(initialisation; condition; updater;)
                 * As the loop runs, it will continually check if the condition (comparison) is true to loop, once it isn't, the loop ends
                 * int i = 10, Initialisation (creates i as a referenceable variable)
                 * i < 100, Condition (acts as an if statement, if "i" is less than 100, code is run)
                 * i++, Updater (once code is run this increases the value of i by 1) */
                for(int i = 0; i <= 100; i++) {
                    System.out.println(i); // returns numbers from 0-100
                }

                // Examples with different functions

                // returns only odd values from 0-100
                for(int tree = 0; tree <= 100; p++) {
                    // If statements can be used within loops to specify certain values
                    // This if statements checks for the remainder of p/2 and if it is not 0, then the code is run in the if statement
                    if (tree % 2 != 0) {
                        System.out.println(tree);
                    }
                }

                // returns only leap years from 4241 bc - 2024 ad
                for(int leap = -4241; leap <= 2024; leap++){
                    if(leap < 0 && (leap % 4 == 0 && (leap % 100 != 0 || leap % 400 == 0))){
                        System.out.println(Integer.parseInt(Math.abs(leap) + " bce"));
                    }
                    else if(leap % 4 == 0 && (leap % 100 != 0 || leap % 400 == 0)){
                        System.out.println(leap + " ad");
                    }
                }

               // For Each Loop
                    // Look at the Arrays Section



            // While Loop

                int monster = 100;
                while(monster > 0) {
                    monster -= 5; // Subtracts 5 from monster until monster is less than 0
                }

                // returns the value of monster along with a string every loop
                monster = 100;
                while(monster > 0){
                    monster -= 5;
                    if(monster == 50){
                        System.out.println("Monster is at 50!");
                        // continue is useful when overwriting the behavior of a loop at a certain value since it replaces the original
                        continue; // Once "continue" is called, it skips everything after it and starts the loop again until it ends
                    }

                    if(monster <= 0){
                        System.out.println("Monster is dead!");
                        break; // Once "break" is called, it stops the loop, completely ignoring everything after it
                    }
                    System.out.println("Monster has " + monster + " health left!"); // When monster == 50, this line is skipped since it restarts
                }

        // EXCERCISE 1: Simple Calculator

            /* Create a calculator that runs multiple times until you manually break out of it.
             * You should read the operation first, then read the first and second number.
             *
             * Depending on the operation chosen, you then have to return a different result.
             * You can do this with if statements or a switch statement.
             *
             * NOTE: When reading a String, you need to use scanner.next()
             * And when comparing strings use (yourVariable.equals("diffVariable")
             * == is only for numbers
             *
             * After the result has been output, ask the user if they want to continue, if not, end the program!
             * Estimated Time: 30-45 Minutes
             *
             */

            /* String onOff = "OFF";
       Scanner input = new Scanner(System.in);
       if(onOff.equalsIgnoreCase("OFF")) {
           System.out.println("Type 'ON' to turn on the calculator");
           onOff = input.next();
       }
       while(onOff.equalsIgnoreCase("ON")){
           System.out.println("Addition(+), Subtraction(-), Multiplication(*), Or Division(/)? Only Input The Symbol. Type 'OFF' to turn off");
           String operation = input.next();

               if(operation.equals("+")){
                   System.out.println("Input First Number");
                   float firstNum = input.nextFloat();
                   System.out.println("Input Second Number");
                   float secNum = input.nextFloat();
                   System.out.println("The Answer is: " + (firstNum + secNum));
                   }

                   if(operation.equals("-")){
                       System.out.println("Input First Number");
                      float firstNum = input.nextFloat();
                       System.out.println("Input Second Number");
                      float secNum = input.nextFloat();
                       System.out.println("The Answer is: " + (firstNum - secNum));
                       }

                       if(operation.equals("*")){
                           System.out.println("Input First Number");
                          float firstNum = input.nextFloat();
                           System.out.println("Input Second Number");
                          float secNum = input.nextFloat();
                           System.out.println("The Answer is: " + (firstNum * secNum));
                           }

                           if(operation.equals("/")){
                               System.out.println("Input First Number");
                              float firstNum = input.nextFloat();
                               System.out.println("Input Second Number");
                              float secNum = input.nextFloat();
                               System.out.println("The Answer is: " + (firstNum / secNum));
                           }
                           if(operation.equalsIgnoreCase("OFF")){
                               onOff = "off";
                           }

                   }

        }*/

        // Ternary Operator
            // Single lined if statement

            int val = 0;
            /* String Ternary operator format
             * string = boolean ? "string value if true" : "else string value";
             */
            String status = val > 0 ? "positive" : "negative";

            /* Numerical Ternary operator format
             * int/float/long/double = string.equals("string value") ? number if true : else number;
             */
            val = status.equals("orange") ? 10 : 20;

        // Casting Variables
            // Turning datatypes into another

            int pogg = 10;
            float zonn = 20.64f;
            // Will not work since result is larger than an integer
            // int combination = pogg - zonn; // returns an error

            // Two Casting Methods

            // *When doing arithmetic with two different datatypes, the smaller will always get promoted to the larger
            // Implicit Cast, int pogg gets turned into a float for the operation
            float combo = pogg - zonn; // returns -10.64

            // Explicit Cast, turns zonn into an integer datatype manually
            // Explicit Cast does not round, decimals get cut off, 20.64 = 20
            int combinationInt = pogg - (int)zonn; // returns -10

            // An explicit cast is needed when the operation datatype is smaller than the variables
            // If operation datatype is larger, an implicit cast is always used

            // Casts can be ordered with parenthesis, pogg is turned into a float for the operation, the result is then cast as an integer
            combinationInt = (int)((float)pogg - zonn); // returns -10
            // pogg is turned into a float for the operations, the result: -10.64 is then cast into an integer, cutting of the decimals


            // Strings can be cast into numerical datatypes
            String bonus = "240";
            int total = Integer.parseInt(bonus) + 20; // Can have operations performed on it after casting
            System.out.println(total); // returns 260

        // String & String Methods
                // String Methods do not change the original string, it modifies it and returns a new one

            // Quotation Marks
                // \"string\"
                    // Using backslash before a quote will make it a string character instead of a quote for marking a string
                String sentence = "You said, \"Hello\"";
                System.out.println(sentence); // You said, "Hello"

            // Concatenation (+) (+=)
                // When using + to add to strings, it is called the Concatenation Operator,
                // Used to add parts onto a string

                String name = "Jimmy";
                System.out.println(name); // returns Jimmy

                name = name + "Jammy";
                System.out.println(name); // returns JimmyJammy

                name += "Shammy";
                System.out.println(name); // returns JimmyJammyShammy
                /* Concatenation can be used on both strings themselves and variables holding strings
                 * Variables can be re-assigned a new string with Concatenation
                 * String assignment that is used is based on the order they are assigned
                 * Concatenation also works as an Assignment Operator, meaning += works on strings
                 */

            // Uppercase & Lowercase (.toUpperCase) (.toLowerCase)
                // One of the string methods available, a . after a string variable will show the string methods

                String hello = "hello";
                System.out.println(hello.toUpperCase()); // returns Hello

                hello = "Hello";
                System.out.println(hello.toLowerCase()); // returns hello
                // Both upper and lowercase methods affect the entire string

            // Contain
                // Checks if a string contains a specific string

                sentence = "This is a sentence of value and is a statement of value";
                System.out.println(sentence.contains("value")); // returns true
                System.out.println(sentence.contains("Jimmy")); // returns false
                // Contain method returns a boolean value

            // Replace
                // Replaces parts of a string with another string
                    // string.replace(target, replacement); is based on chars
                    // string.replaceAll(regex, replacement); regex is a string that the method looks for in the current string and replaces all instances
                        // regex = regular expression
                    // string.replaceFirst(regex, replacement);

                // .replace replaces each substring of this string that matches the literal target sequence with the specified literal replacement sequence.
                System.out.println(sentence.replace("value", "no value")); // returns This is a sentence of no value and has a history of no value
                /* String replace(char oldChar, char newChar)
                *     Returns a new string resulting from replacing all occurrences of oldChar in this string with newChar.
                */

                // .replaceAll replaces each substring of the current string that matches the given regular expression with the given replacement.
                System.out.println(sentence.replaceAll("is a", "is not a")); // returns This is not a sentence of value and is not a statement of value

                // .replaceFirst replaces the first substring of the current string that matches the given regular expression with the given replacement.
                System.out.println(sentence.replaceFirst("value", "no value")); // returns This is a sentence of no value and is a statement of value

            // charAt

                System.out.println(sentence.charAt(3)); // returns s, Thi's' is a sentence of value and is a statement of value
                // Counts each character in a string starting from 0
                /* 0 T
                   1 h
                   2 i
                   3 s
                 */

            // Equals

                // When comparing two strings directly, == can be used
                // Only use on strings when comparing directly or comparing two object references, will only look at the memory location not content
                System.out.println("Hello" == "Hello"); // returns true

                String Mop = "Hello";
                String Stop = "Hello";
                System.out.println(Mop == Stop); // returns false

                // The .equals method should be used in all other comparison cases with strings, looks at content
                System.out.println(Mop.equals(Stop)); // returns true
                System.out.println(Stop.equals("Hello")); // returns true
                // returns a boolean value

        // Arrays
            // Basically a list

            // String Arrays
                // String[] name = new String[Number of Items in list];
                // name[Index Number (starts at 0)] = "string"
                String[] quest = new String[3];
                quest[0] = "Slay Goblin";
                quest[1] = "Save Princess";
                quest[2] = "Slay Boss";

                String[] rewards = new String[3];
                rewards[0] = "10 Gold";
                rewards[1] = "50 Gold";
                rewards[2] = "Sword of Azah";

                System.out.println("Quest: " + quest[0] + " | Reward: " + rewards[0]); // returns Quest: Slay Goblin | Reward: 10 Gold

                for(int i = 0; i < 4; i++){
                    System.out.println("Quest: " + quest[i] + " | Reward: " + rewards[i]); // returns quest 0-3 with corresponding rewards 0-3
                }

                // Would not work since index amount(6) is larger than the array(3), gives ArrayIndexOutOfBoundsException
                for(int i = 0; i < 6; i++){
                    System.out.println("Quest: " + quest[i] + " | Reward: " + rewards[i]); // returns quest 0-3 with corresponding rewards 0-3
                }

                // Instead we can use variable.length to get the length of the array
                for(int i = 0; i < quest.length; i++){
                    System.out.println("Quest: " + quest[i] + " | Reward: " + rewards[i]); // returns quest 0-3 with corresponding rewards 0-3
                }
                // Either variable can be used  as long as they have the same array length
                for(int i = 0; i < rewards.length; i++){
                    System.out.println("Quest: " + quest[i] + " | Reward: " + rewards[i]); // returns quest 0-3 with corresponding rewards 0-3
                }

                // For Each Loop For An Array
                // for(String variable : array variable)
                    // Sets the String variable to each value in the array for as long as there are values in the array
                for(String quests : quest){
                    System.out.println(quests); // returns each value in the quest array individually
                }


                for(int i = 0; i < 5; i++){
                    questsAndRewards(quest, rewards); // Calls the questsAndRewards method 5 times
                }

    }
        // Methods

            // public static "void or datatype" "name"(parameters) - Called the Method Signature
                // The parameter in a method is a variable that is used within the method
            public static String test(String param) // the parameter defines param as a variable within the method
            {
                return "This is " + param;
            }

            // Uses the method defined before and inputs a string as a value for the previous method's parameter: param, then prints
            public static void testing(String phrase){
                phrase = test("a long sentence");
                System.out.println(phrase); // returns This is a long sentence
            }

           // The parameter String[] args is only useable by the main java method, it is used to retrieve console inputs
            // 255 is the max amount of parameters

            // Methods with a datatype need to return that datatype
            public static int sum(int x, int y){
                return x+y;
            }

            // Void methods do not need to return a value
            public static void array(){
                String[] quest = new String[3];
                quest[0] = "Slay Goblin";
                quest[1] = "Save Princess";
                quest[2] = "Slay Boss";

                String[] rewards = new String[3];
                rewards[0] = "10 Gold";
                rewards[1] = "50 Gold";
                rewards[2] = "Sword of Azah";

                // Calls the custom method and passes the arrays into it so that it may function
                questsAndRewards(quest, rewards);// returns 3 quests and their rewards

            }

            // Variables defined in other methods cannot be directly referenced in another, they must be passed in

            // Method that references an array made in another method and prints its entirety
            // Original method with the array must pass the array variables into this method's parameters so it can reference it
            public static void questsAndRewards(String[] quest, String[] rewards) // The parameters define two arrays with the same names as in the other method, allowing that method to pass the arrays into this method.
            {
                for(int i = 0; i < quest.length; i++){
                    System.out.println("Quests: " + quest[i] + " | " + rewards[i]);// returns 3 quests with their rewards
                }
            }

            // Defining variables in a method's parameters allows other methods to reference or change the variables within other methods
                // methodName(param1Value, param2Value) - This passes values into the parameters of the method its calling


    public static void main2() throws Exception {

        // Collections
            // Like arrays but allow different features to manipulate data and different stipulations for entered data

            // Lists
                List<String> addQuests = new ArrayList<>(); // Imports List util and ArrayList util
                addQuests.add("Slay a Dire Wolf"); // Adds element to the list with index 0
                addQuests.clear(); // Deletes on all elements of the list

                List<Integer> goldAmt = new ArrayList<>(); // Must use Integer from Java.lang and not Int
                goldAmt.add(20);
                // Lists have many other methods that can manipulate and measure data within

            // Sets
                // Cannot contain duplicates, will ignore duplicates
                // Set<dataType> name = new setType
                Set<String> bosses = new HashSet<>();
                bosses.add("Hulcrum");
                bosses.add("Teenzin");
                bosses.add("Hulcrum"); // Will be ignored

                System.out.println(bosses); // Outputs first two but ignores the last
                    // Individual elements cannot be outputted from a set

            // Maps
                // Used to asign a value to a key
                // Map<"first dataType, second datatype> name = new mapType
                Map<String, Integer> bossToGold = new HashMap<>();
                bossToGold.put("Hulcrum", 4500); // First value is the key that maps to the second value
                bossToGold.put("Teenzin", 5000); // First value is the key that maps to the second value

                System.out.println(bossToGold.get("Hulcrum")); // returns 4500
                System.out.println(bossToGold.get("Angarth")); // returns null, key does not correspond to a value in the map
                System.out.println(bossToGold); // returns {Hulcrum=4500, Teenzin=5000}

                // These can all be used the same as arrays but are more dynamic and can be edited outside the array itself

                // For each String key and Integer pair, set the string to each pair for as long as there are pairs
                    // Map.Entry<String, Integer> acts as the datatype for the variable, specifying it is taking in only entries from the map of pair type String and Integer
                    // bossToGold.entrySet() sets this map as the entry for the previous variable
                for(Map.Entry<String, Integer> input : bossToGold.entrySet()){
                    System.out.println("Key = " + input.getKey() + " | " + input.getValue()); // Gets the Key and Value of the key for each pair in the map

        // EXERCISE 2: Calculator

            /* Create a Calculator similar to the first exercise
             * However, this time use at least two custom methods (one for evaluating the operation and one for continuing)
             *
             * Additionally, make sure if Dividing by 0 would happen, you catch that and just return 0 instead of an error.
             */
                /*public class Main {
    public static void main(String[] args) {
        String onOff = "OFF";
        Scanner input = new Scanner(System.in);
        if (onOff.equalsIgnoreCase("OFF")) {
            System.out.println("Type 'ON' to turn on the calculator");
            onOff = input.next();
        }
        while(onOff.equalsIgnoreCase("on")){
            Scanner number = new Scanner(System.in);
            System.out.println("Enter First Number: ");
            float num = number.nextFloat();
            System.out.println("Addition(+), Subtraction(-), Multiplication(*), Division(/)?");
            Scanner operation = new Scanner(System.in);
            String op = operation.next();
            System.out.println("Enter Second Number: ");
            number = new Scanner(System.in);
            float num2 = number.nextFloat();

            calc(num, num2, op);
            off(onOff, input);
        }
    }
    public static void calc(float num, float num2, String op){

        if(op.equalsIgnoreCase("Addition") || (op.equalsIgnoreCase("+"))){
            float result = num + num2;
            System.out.println(result);
        }else if(op.equalsIgnoreCase("Subtraction") || (op.equalsIgnoreCase("-"))){
            float result = num + num2;
            System.out.println(result);
        }else if(op.equalsIgnoreCase("Multiplication") || (op.equalsIgnoreCase("*"))){
            float result = num + num2;
            System.out.println(result);
        }else if(op.equalsIgnoreCase("Division") || (op.equalsIgnoreCase("/"))){
            if(num2 == 0){
                System.out.println("No Division by 0");
            }else{
                float result = num + num2;
                System.out.println(result);
            }
        }
    }
    public static void off(String onOff, Scanner input){
        if(onOff.equalsIgnoreCase("on")){
            System.out.println("Type 'off' to Turn Off, Press Enter Anything to Continue");
            String off = input.next();
            if(off.equalsIgnoreCase("off")) {
                onOff = "off";
            }
            else if(off.isEmpty()){
                System.out.println("Continuing...");
            }





            }
    }
}*/


        /* Object-Oriented Programming - Theory
            - Everything is an Object
            - "Class" and "Object"
            - Class is a "blueprint" for an object, The Object is an instance of that class

            - Classes: "User Defined Datatypes." Used as "template" or "blueprint" to create Objects. Includes Methods and Fields called Members.
                - Used to define a set of rules for Objects within the class to abide by like a blueprint
            - Object: Instance of a Class with defined data.
                - Used to create actual data using the blueprint set in the Class
            - Members
                - Methods/Functions: Defines behaviour for an Object. Methods can be called on an object and modify it or its other Members. ex. ".math"
                - Fields/Attributes: Variables defined in the Class that store data relevant or related to that Class. ex. "int age = 17"

            - Mob                                  ^
            - |                  |                 | Super Class
            - Humanoids          Quadrupeds
            - |        |         |        |        | Sub Class
            - Zombie   Husk      Pigs     Cows     v

            - Zombies and Husks are a subclass of Humanoids so they both inherit similar attributes from the Super Class
            - Quadrupeds are a subclass of Mobs so they inherit the attributes of Mobs

            Class and Objects to Instances
            - Mob - Class
                - Name      }
                - Model     | - Members (Fields)
                - Texture   }

            - Created a new Mob:
                - Mob grubbling = new Mob("Grubbling", "grubblingModel.bbmodel", "grubblingTex.png");
                    - "new" is used to show a new instance of the Class Mob is being created
                    - The previously defined fields of Mob are passed into the new instance with defined data
                    - This can be used with multiple instances of the Class Mob to create different mobs with different defined data in the fields of the Mob Class
                    - Each defined instance of the Mob Class is an Object that inherits the fields assigned to the Mob Class, for later data to be passed into the instance
         */

        // Classes & Objects
                // Under Package, right click, New Java Class, Capitalize name "Mine"

            // Using New Class - Constructors
                // New Java Classes are referenced like a datatype
                // new creates a new instance of the class usage
                // Custom constructor with parameters need to have values inputted into the parameter
                    Mine cave = new Mine("iron", "diamond_ore", 0.1);
                    Mine cave2 = new Mine("stone", "gold_ore", 0.35);

                    // "cave." has access to the fields and methods within the "Mine" Class
                    // cave.pickaxe gets the value of the "pickaxe" parameter
                    System.out.println("You have an " + cave.pickaxe + "pickaxe in this cave"); // returns You have an iron pickaxe in this cave
                    // cave.ore_chance gets the value of the "ore_chance" parameter
                    System.out.println("Your chance of gold in this cave is " + cave.getOre_chance()); // returns Your chance of gold in this cave is 0.35

                    // Calls the "oreGen" method in the "Mine" class of instance "cave2" which increase ore_chance of cave2 by 1
                    cave.oreGen();

                    System.out.println("Your chance of gold in this cave is " + cave.getOre_chance()); // returns Your chance of gold in this cave is 1.35

                    // Fields of an instance can be altered directly for that instance
                    cave.pickaxe = "netherite";

                    System.out.println("You have a " + cave.pickaxe + "pickaxe in this cave"); // returns You have a netherite pickaxe in this cave


        // Access Modifiers

            // See "Mine" class
                // public - Accessible and changeable from anywhere
                // protected - Accessible in subclasses and same package
                // private - Accessible only in the class it's made
                // final - Forces a variable to take on only one unchangeable value, constant

                // To access private variables you need a Getter and a Setter

                    // Getter
                    // public double getOre_Chance(){
                    //     return ore_chance;
                    // }

                    // Setter
                    // public void setOre_chance(double ore_chance){
                    //     this.ore_chance = ore_chance;
                    // }

                // Look in "Mine" Class for more info

                Mine cave3 = new Mine("Iron", "gold_ore", 0.25);

                    cave3.setOre_chance(-1); // Would be set to 0 since the setter in the "Mine" class sets it to 0 if the value is negative

            // Static Variables
                // Look in "Mine" Class

                    // Gets the current value of caveTunnels, will be 3 since the class has been called 3 times previously
                    System.out.println("Amount of tunnels:" + Mine.caveTunnels); // returns "Amount of tunnels:3

                        // the caveTunnels variable will change with each call of the "Mine" class since the constructor it uses adds 1 to caveTunnels everytime it is called

            // Static Methods
                // Similar to static variables, they are independent of any instance of a class
                // Rather they exist for the original class
                // They have access to static variables without instancing the class, but have no access to variables in an instance
                // In any other method they can be accessed directly.

            // Static is used to make something globally accessible


        // Inheritance & Polymorphism
            // When two classes have very similar content, they can be made into a super class
                // Classes can only have one super class
                // Look at "AndesiteCave" class
                // Can either call the specific subclass as the datatype
                AndesiteCave cave4 = new AndesiteCave("Iron", "andesite, diamond", 0.1);

                // Or call the main super class, then reference the subclass
                CaveSystem cave5 = new GraniteCave("Diamond", "", 1.0); // Will call the setBlock method specifically from the GraniteCave subclass
                    System.out.println(cave5.getBlock()); // returns "granite"


        // Abstract Classes & Interfaces
            // Abstract Class
                /* Creating a tunnel with CaveSystem is ABSTRACT since it is not as specific at AndesiteCave or GraniteCave
                // It does not make sense to be making a cave using the abstract idea of a whole CaveSystem
                // You can make a class abstract so that you have to make a subclass to reference it for an object
                    // Look at CaveSystem class
                */
                    // CaveSystem tunnel = new CaveSystem(("Iron", "gravel", 1.0); // This gives an error since it is directly referencing an abstract class
                // You can call abstract methods through the subclasses
                        cave4.length(); // returns 0.25, ore_chance is 0.1, 0.1*2.5 is 0.25

            // Interface
                // Interfaces are another type of abstraction
                // Used to group related methods with empty bodies
                // Interfaces can be implemented in subclasses or abstract classes so that all subclass implement the interface
                // There are many options and ways to implement methods, abstract methods, and interface, it is not rigid and can form to your preference
                    // Look in IGeneratable
                    // Look in GraniteCave
                    // Look in CaveSystem

                CaveSystem cave6 = new GraniteCave("stone","", 0.5);
                cave6.addCave(); // returns "Generating Cave"
                // cave6.generate(); // This does not work because it directly references the method from the interface
                                  // Even though the subclass implements the interface, the super class is unaware of it
                                  // To fix it you have to cast it to the subclass that implemented the interface
                ((GraniteCave) cave6).generate(); // This will now work, this only happen because the datatype is a class that has not implemented the interface

                GraniteCave cave7 = new GraniteCave("iron", "", 0.65);
                cave7.generate(); // returns "Generating Cave", it now works since both the datatype and the object reference implement the interface
                // An interface can only be used directly by classes that implement it, otherwise it needs to be cast
                // The super class is completely unaware of interfaces in its subclasses,
                // and, interfaces are unaware of super classes of the subclass it is implemented in

                List<CaveSystem> caves = new ArrayList<>();
                caves.add(cave4);
                caves.add(cave5);
                caves.add(cave6);

                for(CaveSystem cavern : caves){ // Creates a for each loop of the previous array
                    System.out.println(cavern.getBlock());
                    System.out.println(cavern.getOre_chance());
                } // Calls the methods for each of the CaveSystem instances in the previous array and prints them


        // Anonymous Classes
            // Classes that you can make in line without having to make it own separate class
                    // Since CaveSystem is an abstract class, you cannot make an instance of it
                    // However you can use it to make an anonymous class

            // This creates a new instance of CaveSystem without having to make another subclass
            // Automatically adds abstract classes that need to be filled in
            // Can also still override methods made in the CaveSystem class
            // Mainly useful for single time instances of a class
            CaveSystem cave8 = new CaveSystem("Netherite", "Stone", 5.0) {
                @Override
                public void length() {
                    System.out.println(getOre_chance()*2.7);
                }

                @Override
                public void addCave() {
                    System.out.println("Generating Cave...");
                }

                // Can override a method made in CaveSystem just like a normal subclass
                @Override
                public void setOre_chance() {
                    super.setOre_chance();
                }
            }; /* This anonymous class cannot be reused since it is not named,
                * but can be called like a regular subclass
                */



        /* Exercise 3: Calculator with Classes
         * Same functions as previous calculator
         * Make custom classes for each operation
         * Create an interface all of them implement
         * Add a Calculator class that deals with the calculation itself
         */// Done in other project file


        // Enums & Advanced Enums
            // Enums = Enumerations, establishing a number of something
                // A data type you can predetermine certain elements or values in
                    // Look in MobAi class for more

                // Uses the new enum datatype created to reference an element from the enum MobAi
                // Specifically references the HOSTILE element
                MobAi ai = MobAi.HOSTILE;

                System.out.println(ai); // returns "HOSTILE"

                /* Enums are perfect to use in switch statements.
                 * Switch statements work by defining action based on every value a variable can take.
                 * Ex, a different method or class can be called with a switch statement
                 *     based on which value the enum takes on. In this instance of the ai variable,
                 *     if it were used in a switch statement, there would be a defined action for it
                 *     being HOSTILE
                 */
            // Advances Enums
                // Advanced Enums are similar to regular enums, but have some things specified.
                    // Look in AdvMobAi class for more

                /* Using this enum is similar to other classes,
                 * you can get different elements of the enum referenced
                 */
                AdvMobAi Mahoraga = AdvMobAi.NXHOSTILE;
                Mahoraga.getAiType(); // returns "NXHOSTILE"
                Mahoraga.getBehavior(); // returns "Attack everything, attack owner first"
                Mahoraga.getAgroRange(); // returns 50
                Mahoraga.getDamage(); // returns 100

                // Minecraft uses Advanced Enums for things like as materials


        // Exceptions & Try and Catch
            // Exceptions are an error given to you in the stacktrace(The red errors in the console)
                // Once an exception is given, code after it is not run, acting as a crash
            // try runs the code
            try{
                int r = 100/0;
            }
            // catch finds any exceptions from the code in the try function
            // Stores the exception in the Exception datatype variable x
            // The Exception datatype comes with its own methods
            catch(Exception x){
                System.out.println(x.getMessage()); // returns "/ by 0"
            }
            // This allows code after the exception to still be run

            // You can manually throw an exception, although this is rarely done

            boolean x = true;
            if(x){
                // This gets a red underline since it needs to be added to the method signature
                // The method signature shows that running the method will throw an exception
                // public static void main2() throws Exception{
                throw new Exception("OH NO IT'S TRUE"); // throws exception message "OH NO IT'S TRUE"
            }


        // Generics
            // Include lists, which by themselves have no datatype, meaning they are generic
            // List<> This list can take any datatype, String, int, or even custom ones
                // Look in CaveGen for more

            // Creates a new instance of CaveGen that specifically uses the CaveSystem datatype
            CaveGen<CaveSystem> cavegeneration = new CaveGen<>();
            cavegeneration.addCave(new AndesiteCave("Iron", "", 0.5));
            cavegeneration.displayCaves(); // returns
                                           /* "Current caves in generation"
                                            * "Iron", "Andesite", 0.5
                                            */
            // Creates a new instance of CaveGen that only allows elements with the GraniteCave datatype to be added
            CaveGen<GraniteCave> GraniteGen = new CaveGen<>();
            GraniteGen.addCave(new GraniteCave("Diamond", "", 0.2));
                // This will not work since it does not have the right datatype to be added to the CaveGen list
           // GraniteGen.addCave(new AndesiteCave("Iron", "", 0.4));
            GraniteGen.displayCaves(); // returns
                                       /* "Current caves in generation"
                                        * "Diamond", "Granite", 0.2
                                        */
            // This also applies to subclasses
            // A subclass of GraniteCave can also be added to this array since it is an extension of this datatype


        // Lambda & Streams
            // Lambda Expression
                // Basically a method as a variable

                // This is a lambda expression
                // Used like a method, but is stored in a variable, "method"
                Runnable method = () -> System.out.println("Hello");

                // Runnable is used like an object of a class with its own methods
                // .run runs the code that is stored in the lambda expression
                method.run(); // returns "Hello"

            // Lambda Expressions with Methods
    }
}
            static Runnable method = ()->System.out.println("Hello");

            public static void hello(){
                System.out.println("hello");
            }

            public static void lambda(Runnable method){
                method.run();

            }

            // Passes the Runnable above into this method as a variable
            // The Runnable behaves like a variable and an instance,
            // allowing the run() method to be used on it, even though it is a command itself
            public void running(Runnable runner){
                lambda(runner);

                // Existing methods can be turned into Runnables
                // As long as it is passed as a Runnable
                lambda(Tutorial::hello);


                // Suppliers are similar to a Runnable, but they return a value
                Supplier<Double> age = ()->34.5;
                age.get(); // returns 34.5
            }
            // Works identically to this
            public static double age(){
                return 34.5;
            }

            // Acts like the previous "lambda" method in running a Runnable
            // Has a parameter for a Runnable to be passed in,
            // Then calls a Runnable method on the passed in Runnable
            static Consumer<Runnable> con = eat-> eat.run();

            public static void eater(){

                method.run();

                // This works identically to the previous but does not need its own method
                con.accept(method);
            }

    public static void main3() {

        // Streams
        // A way to process lists and other types of collections

        List<String> mobs = List.of("Zombie", "Skeleton", "Spider", "Horse", "Donkey");

        /* This turns the list into a stream to be able to use stream methods
         * The filter method is one of many stream methods for lists
         * Stream methods can be stacked to do multiple functions at once

         * Takes in a "predicate" or a variable to be used for filtering, in this case mob
         * Then it is assigned a characteristic to filter for, startsWith("s")
         * Then once it filters, a forEach method is called on each elementing matching the filter
         * This method can run code like a conditional
         * This does not have to be layered like this, it is just easier to read */
        mobs.stream()
                .filter(mob -> mob.startsWith("s"))
                // These can take lambda expressions
                .forEach(mob -> System.out.println(mob)); // returns "Skeleton" "Spider"


        // Records
            // An easier way to declare a class with limited usage
            // Used often for reading and writing to files, such as with recipes
                // Look in mob record

            // Comes with all the basic methods, including getters
            mob zilla = new mob("Godzilla", 3000);
            zilla.mobHealth(); // returns 3000

            System.out.println("Godzilla Info: " + zilla); // returns "Godzilla Info mob[mobName=Godzilla, mobHealth=3000]


        // JSON Files
            // Look in out->resources->creature.json
            // JSON files are entirely contained within the two brackets, denoting an object

            /*
            "creatureName": "Mahoraga", is a JSON field called a key value pair,
                                        where "creatureName" is the key, and "Mahoraga" is the value
                                        The datatype is handled, so the value could also be an integer
            "creatureHealth": 3000


            "weapons": { , The bracket denotes a new object tied to the key "weapons"

                "numWeapons": 4, This is an individual value

                "weapons": [ , The straight bracket denotes a list
                               Lists can take individual values or objects
                ]
            }
            ex. with objects
            "weapons": [
              {"name": "Fist", "damage": 200},
              {"name": "Blade", "damage": 500},
              {"name": "Leg", "damage": 300}
            ]

            "isAlive": true , keys can take boolean values
             */


        // Additional Java Info

            // Null - no value
            List<String> list = null;

            list.get(0); // returns a NullPointer exception since the list has no value

            // var keyword
                // Acts as a datatype when initializing a variable
                // Automatically finds the datatype of the variable without needing to define it
            var mort = 52.3;
            var morg = "john";
            var mora = 52.4f;

            // Design Patterns for Java
                // Design Pattern - A way of organizing java classes

                // Singleton Patterns
                    // A design pattern to ensure a class only has one instance and provides global access point

                    // Class-Based Singleton
                        /*
                        Create a regular class,
                            Make a private constructor
                            Make a static field containing its only instance
                            Make a static factory method for obtaining the instance

                     ex.
                     public final class ClassSingleton {

                        private static ClassSingleton INSTANCE;
                        private String info = "Initial info class";

                        private ClassSingleton() { , private constructor
                        }

                        public static ClassSingleton getInstance() { , static method for obtaining instance
                            if(INSTANCE == null) {
                                INSTANCE = new ClassSingleton(); , field containing only instance
                            }

                            return INSTANCE;
                        }

                        // getters and setters
                    }

                    ClassSingleton singletonInstance = ClassSingleton.getInstance(); returns "Initial info class"

                    ClassSingleton singletonInstance = ClassSingleton.getInstance();
                    newSingletonInstance.setInfo("New info class");

                    singletonInstance.getInfo(); returns "New info class"
                    newSingletonInstance.getInfo(); returns "New info class"


                        May not work in multithreading scenarios, being the main reason to use singletons
                            Can result in more than one instance
                         */


                    // Enum Singleton
                        // Fixes the Class-Based Singleton's multi-instance problem
                        /*
                        public enum EnumSingleton {

                            INSTANCE("Initial class info"); , enum holding the class info

                            private String info;

                            private EnumSingleton(String info) { , adds info parameter to the advanced enum
                                this.info = info;
                            }

                            public EnumSingleton getInstance() { , getter for the parameter
                                return INSTANCE;
                            }

                            // getters and setters
                        }

                        EnumSingleton singletonInstance = EnumSingleton.INSTANCE.getInstance(); returns "Initial class info"

                        EnumSingleton newSingletonInstance = EnumSingleton.INSTANCE.getInstance();
                        newSingletonInstance.setInfo("New enum info");

                        singletonInstance.getInfo(); returns "New enum info"
                        newSingletonInstance.getInfo(): returns "New enum info"

                            Has serialization and thread-safety guaranteed by the enum since internally only a single instance is available
                                Whereas the Class-Based Singleton has the possibility of creating a new instance
                         */






    }






}

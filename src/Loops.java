import java.util.Scanner;

public class Loops
{
    public static void main(String[] args)
    {
        /*
        Goals(1-4):
        Write a program that prints the numbers 1-10.
        Write a program that prints the numbers 1-10 backwards.
        Write a program that prints all the odd numbers from 1-20.
        Write a program that prints all the even numbers from 1-20.
        1.Place each program inside a while loop prompting user to initiate
        mass number printing.
        2.Use for loops to assign numbers to an empty string and print it.
         */
        int i;
        Scanner scn = new Scanner(System.in);
        //1 to 10
        System.out.println("Enter 'y' to initiate 1 to 10 display");
        String initiate_one_ten = scn.nextLine();
        while(initiate_one_ten.equalsIgnoreCase("y"))
        {
            String one_ten = "";            // initiate empty string at the begging of the loop to avoid
            for (i = 1; i<=10; i++)         // duplicate display on re-initiations
            {
                one_ten += i + " ";             //Concatenating numbers onto my empty string
            }
            System.out.println("1 to 10: "+one_ten);
            System.out.println("Re-initiate 1 to 10 display? y/n");
            initiate_one_ten = scn.nextLine();
        }
        //10 to 1
        System.out.println("Enter 'y' to initiate 10 to 1 display");
        String initiate_ten_one = scn.nextLine();
        while(initiate_ten_one.equalsIgnoreCase("y"))
        {
            String ten_one = "";
            for (i = 10; i>=1; i--) {
                ten_one += i + " ";
            }
            System.out.println("10 to 1: "+ten_one);
            System.out.println("Re-initiate 10 to 1 display? y/n");
            initiate_ten_one = scn.nextLine();
        }
        //Odds 1-20
        System.out.println("Enter 'y' to initiate 1 to 20 odd number display");
        String initiate_odds = scn.nextLine();
        while(initiate_odds.equalsIgnoreCase("y"))
        {
            String odds = "";
            for (i = 1; i < 20; i+=2 )
            {
                 odds += i + " ";
            }
            System.out.println("Odd numbers from 1 to 20: "+odds);
            System.out.println("Re-initiate 1 to 20 odd number display? y/n");
            initiate_odds = scn.nextLine();
        }
        //Evens 1-20
        System.out.println("Enter 'y' to initiate 1 to 20 even number display");
        String initiate_evens = scn.nextLine();
        while(initiate_evens.equalsIgnoreCase("y"))
        {
            String evens = "";
            for (i = 2; i <= 20; i+=2)
            {
                evens += i + " ";
            }
            System.out.println("Even numbers from 1 to 20: "+evens);
            System.out.println("Re-initiate 1 to 20 even number display? y/n");
            initiate_evens = scn.nextLine();
        }

        /*
        Goals (5-7):
        5.Have the user input a number and print all numbers from that input value to 1.
        > for loop: initialize at user input, set condition to '>= 1', decrements of 1.
        > populate empty string with them and print it.
        6.Sum all values from 1-10.
        > initialize sum total variable = 0 outside for loop.
        > initialize for loop at 1, condition '<= 10', increments of 1.
        > add each element to sum total variable and print.
        7.Have the user enter a number and print the sum of all numbers from that inputted value to 1.
        > combine 5 and 6.
         */
        //# to 1
        System.out.println("Enter 'y' to initiate # to 1 display.");
        String initiate_num_to_one = scn.nextLine();
        while(initiate_num_to_one.equalsIgnoreCase("y"))
        {
            String numbers = "";
            System.out.println("Enter a whole number: ");
            int user_input = scn.nextInt();
            scn.nextLine();
            for (i = user_input; i>=1; i--)
            {
                numbers += i + " ";
            }
            System.out.println("Numbers from "+user_input+" to 1: "+numbers);
            System.out.println("Re-initiate # to 1 display? y/n");
            initiate_num_to_one = scn.nextLine();
        }
        //1-10 sum
        System.out.println("Enter 'y' to initiate sum of (1 to 10) display.");
        String initiate_sum_10 = scn.nextLine();
        while(initiate_sum_10.equalsIgnoreCase("y"))
        {
            int sum_10 = 0;
            for (i = 1; i <= 10; i++)
            {
                sum_10 += i;
            }
            System.out.println("The sum of all numbers from 1 to 10 is: "+sum_10);
            System.out.println("Re-initiate sum of (1 to 10) display? y/n");
            initiate_sum_10 = scn.nextLine();
        }
        //Sum of # to 1
        System.out.println("Enter 'y' to initiate sum of (# to 1) display.");
        String initiate_input_sum = scn.nextLine();
        while(initiate_input_sum.equalsIgnoreCase("y"))
        {
            int sum_input_one = 0;
            System.out.println("Enter a whole number: ");
            int user_input = scn.nextInt();
            scn.nextLine();
            for (i = user_input; i >= 1; i--)
            {
                sum_input_one += i;
            }
            System.out.println("The sum of all numbers from "+user_input+" to 1 is: "+sum_input_one);
            System.out.println("Re-initiate sum of (# to 10) display? y/n");
            initiate_input_sum = scn.nextLine();
        }
        //8. Print stars
        System.out.println("Enter 'y' to initiate stars for no reason: ");
        String initiate_stars = scn.nextLine();
        while (initiate_stars.equalsIgnoreCase("y"))
        {
            System.out.println("**********\n**********\n**********\n**********");
            System.out.println("*\n**\n***\n****\n*****");
            System.out.println("    *\n   **\n  ***\n ****\n*****");

            System.out.println("Re-initiate stars? y/n");
            initiate_stars = scn.nextLine();
            if (initiate_stars.equalsIgnoreCase("y"))
            {
                System.out.println("Seriously? y/n");
                initiate_stars = scn.nextLine();
            }
        }
        /*
        Goal 10:
        You are going to write an application to determine the factorial of a single number.
        A factorial of an integer is the product of that integer and all the integers below it.
        For example, the factorial of 4 is (4 x 3 x 2 x 1 = 24). The user will be required to
        enter an integer. You will then calculate the factorial of that integer and print the
        result to the screen.
        1. Prompt for input
        2. initialize empty string for factorial display
        3. use for loop to calculate factorial and concatenate elements to empty string
        4. print string, display factorial
         */
        System.out.println("Enter 'y' to initiate 'Factorial of a number': y/n");
        String initialize_factorial = scn.nextLine();
        while (initialize_factorial.equalsIgnoreCase("y"))
        {
            String factorial_display = "";
            int factorial = 1;
            System.out.println("Enter a number: ");
            int user_input = scn.nextInt();
            scn.nextLine();
            for (i = user_input; i >= 1; i--)
            {
                factorial *= i;
                if (i > 1)
                {
                    factorial_display += i +" * ";
                }
                else
                {
                    factorial_display += i +" = ";
                }
            }
            System.out.println("!"+user_input+" is "+factorial_display+factorial);
            System.out.println("Re-initiate 'Factorial of a number'? y/n");
            initialize_factorial = scn.nextLine();

        }
    }
}

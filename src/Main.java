import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {

        Scanner keyboard = new Scanner(System.in);
        try
        {
            System.out.println("Enter number of donuts");
            int donuts= keyboard.nextInt();

            System.out.println("Enter number of cups of milk");
            int milkCount = keyboard.nextInt();

            if(milkCount < 1)
                throw new Exception("Exception: No milk");

            double donutsPerGlass = donuts/(double)milkCount;
            System.out.println("donuts: "+ donuts);
            System.out.println("milkCount: "+ milkCount);
            System.out.println("You have: " + donutsPerGlass + " of milk for each donut");
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Go buy some milk");
        }
        System.out.println("end of program");
    }
}

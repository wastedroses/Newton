import components.simplereader.SimpleReader;
import components.simplereader.SimpleReader1L;
import components.simplewriter.SimpleWriter;
import components.simplewriter.SimpleWriter1L;

/**
 * Put a short phrase describing the program here.
 *
 * @author Put your name here
 *
 */
public final class Newton2 {

    /**
     * No argument constructor--private to prevent instantiation.
     */
    private Newton2() {
    }

    //This method is to calculate the square root using Newton Iteration.
    private static double sqrt(double x) {
        //Since I want the program to work even if x is 0, I put an else statement
        //to output x even if it's 0 instead of an error.
        final double epsilon = 0.0001;
        double i = 0;
        if (x > 0) {
            double r = 0.5 * (x + x / x);
            while (((r * r) - x) >= (epsilon * epsilon)) {
                r = ((r + x / r) * 0.5);
            }
            i = r;
        }
        return i;
    }

    /**
     * Main method.
     *
     * @param args
     *            the command line arguments
     */
    public static void main(String[] args) {
        SimpleReader in = new SimpleReader1L();
        SimpleWriter out = new SimpleWriter1L();
        //Using a boolean so that the program terminates if boolean is false (aka
        //if user inputs anything except y.
        boolean t = true;
        while (t) {
            out.println("Do you wish to calculate a square root? y/n");
            String character = in.nextLine();
            //I did a string here instead of character
            if (character.equals("y")) {
                out.println(
                        "What number do you want to calculate? (use a decimal point.)");
                double number = in.nextDouble();
                //Calls method and returns the value of method after method runs.
                out.println(sqrt(number));
            } else {
                t = false;
            }

        }
        in.close();
        out.close();

    }
}

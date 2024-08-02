import components.simplereader.SimpleReader;
import components.simplereader.SimpleReader1L;
import components.simplewriter.SimpleWriter;
import components.simplewriter.SimpleWriter1L;

/**
 * Put a short phrase describing the program here.
 *
 * @author Kardiatou Ly
 *
 */
public final class Newton4 {

    /**
     * No argument constructor--private to prevent instantiation.
     */
    private Newton4() {
    }

    //This method is to calculate the square root using Newton Iteration.
    private static double sqrt(double x, double y) {
        //The error in the main method is equal to y in this method.
        double i = 0;
        if (x > 0) {
            double r = 0.5 * (x + x / x);
            while (((r * r) - x) >= (y * y)) {
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
            out.println("What number would you like to calculate?");
            double number = in.nextDouble();
            //if statement that says if number is greater than/equal to 0, program can run
            //else, the program terminates.
            if (number >= 0) {
                out.println("What would you like the margin of error to be?");
                double error = in.nextDouble();
                //Calls method and returns the value of method after method runs.
                out.println(sqrt(number, error));
            } else {
                t = false;
            }

        }
        in.close();
        out.close();

    }
}

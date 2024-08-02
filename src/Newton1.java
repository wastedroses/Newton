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
public final class Newton1 {

    /**
     * No argument constructor--private to prevent instantiation.
     */
    private Newton1() {
    }

    /**
     * Put a short phrase describing the static method myMethod here.
     */
    private static double sqrt(double x) {
        double r = 0.5 * (x + x / x);
        final double epsilon = 0.0001;
        //Does r^2 - x and makes sure that the error margin is lower than .0001.
        while (((r * r) - x) >= (epsilon * epsilon)) {
            r = ((r + x / r) * 0.5);

        }

        return r;
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
            //I did a string here instead of character
            String character = in.nextLine();
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

package addition; /**
 * This module is about impact of the final keyword on performance
 * <p>
 * This module explores  if there are any performance benefits from
 * using the final keyword in our code. This module examines the performance
 * implications of using final on a variable, method, and class level.
 * </p>
 *
 * @since 1.0
 * @author baeldung
 * @version 1.1
 */


/**
 * Main Klasse.
 * Notwendig für ein Konsolenanwendung.
 * @author Bianca Kolodziej
 */
public final class AdditionProgram {

    /**
     * Anzahl der notwendigen Argumente.
     */
    private static final int ARG_COUNT = 2;

    /**
     * Privater Konstructor.
     */
    private AdditionProgram() { }

    /**
     * Main Klasse.
     * @param args Terminal Parameter.
     */
    public static void main(final String[] args) {
        assert args.length == ARG_COUNT;
        int i1;
        int i2;
        int result = 0;

        boolean success = true;

        try {
            i1 = Integer.parseInt(args[0]);
            i2 = Integer.parseInt(args[1]);
            result = Addition.sum(i1, i2);
        } catch (NumberFormatException e) {
            success = false;
        }

        if (success) {
            System.out.println(result);
        } else {
            System.out.println("Numbers Only!");
        }

    }

}

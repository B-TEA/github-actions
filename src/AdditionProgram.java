import addition.Addition;

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

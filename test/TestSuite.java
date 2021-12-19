import org.junit.runner.RunWith;
import org.junit.runners.Suite;


@RunWith(Suite.class)
@Suite.SuiteClasses({
    MyTest.class
})

public class TestSuite {

    /**
     * Private Constructor.
     */
    private TestSuite() { }

    /**
     * Methode zum einfachen Starten des Tests von der Kommandozeile.
     *
     * @param args Kommandozeilenargumente.
     */
    public static void main(final String[] args) {
        org.junit.runner.JUnitCore.main(TestSuite.class.getName());
    }
}

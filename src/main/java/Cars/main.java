package Cars;

public class main {
    public static void main(String[] args)  {
        NumberPlateFinder i = new NumberPlateFinder();
        seleiniumChecker j = new seleiniumChecker();

        try {
            i.stress();
        } catch (Exception e) {
            e.printStackTrace();
        }
        j.setUp();
        j.iAmSoAngry(i.getNumbers().get(0));
        j.tearDown();

    }
}

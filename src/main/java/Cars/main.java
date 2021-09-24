package Cars;

public class main {
    public static void main(String[] args)  {
        NumberPlateFinder hello = new NumberPlateFinder();
        IAmSoAngry j = new IAmSoAngry();

        try {
            hello.stress();
        } catch (Exception e) {
            e.printStackTrace();
        }
        j.setUp();
        j.iAmSoAngry(hello.getNumbers().get(0));
        j.tearDown();

    }
}

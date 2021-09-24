package Cars;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Vector;
import java.util.regex.*;

public class NumberPlateFinder {
    public Vector<String> Numbers = new Vector<>();

    public void stress()  {


        String output = null;
        try {
            output = new String(Files.readAllBytes(Paths.get("C:\\Users\\billy\\IdeaProjects\\CarTester\\car_input.txt"))).replaceAll("\\s+", "");
        } catch (IOException e) {
            e.printStackTrace();
        }
        //System.out.println(output);

        Pattern pattern = Pattern.compile("[A-Z]{2}[0-9]{2}[A-Z]{3}");
        Matcher matcher = pattern.matcher(output);

        while(matcher.find()){
            Numbers.add(matcher.group());
        }
        for (String plates :Numbers )
        {
        }

    }

    public Vector<String> getNumbers() {
        return Numbers;
    }
}





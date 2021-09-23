package Cars;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.io.*;
import java.util.Scanner;
import java.util.Vector;
import java.util.regex.*;

public class NumberPlateFinder {


    public static void main(String[] args) throws Exception {
        Vector<String> Numbers = new Vector<>();
        Vector<String> NumberPlates = new Vector<>();

        String output = new String(Files.readAllBytes(Paths.get("C:\\Users\\billy\\IdeaProjects\\CarTester\\car_input.txt"))).replaceAll("\\s+", "");
        //System.out.println(output);

        Pattern pattern = Pattern.compile("[A-Z]{2}[0-9]{2}[A-Z]{3}");
        Matcher matcher = pattern.matcher(output);

        while(matcher.find()){
            Numbers.add(matcher.group());
        }
        for (String plates :Numbers )
        {
            PrintStream out = new PrintStream(new FileOutputStream("plateOutput.txt"));
            System.setOut(out);

        }


    }


}





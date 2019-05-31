import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

@RunWith(Parameterized.class)
public class TstY {

    @Parameterized.Parameter
    public List<String> list;

    @Parameterized.Parameters
    public static List<String> cityProvider() {
        Path path = Paths.get("src/main/resources/list.txt");
        List<String> lines = new ArrayList<>();

        try (BufferedReader reader = Files.newBufferedReader(path)) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException ignored) {}
        return lines;


    }



    @Test

    public void tstOutpuFile() {


        list.stream().forEach(System.out::println);
    }
}

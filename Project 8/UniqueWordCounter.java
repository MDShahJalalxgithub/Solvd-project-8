import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;

public class UniqueWordCounter {
    public static void main(String[] args) throws IOException {
        File inputFile = new File("input.txt");
        File outputFile = new File("output.txt");

        // Read file content
        String content = FileUtils.readFileToString(inputFile, "UTF-8");

        // Split content into words and calculate unique words
        Set<String> uniqueWords = new HashSet<>(Arrays.asList(StringUtils.split(content, " \n\r\t.,;:!?")));

        // Write the number of unique words to the output file
        FileUtils.writeStringToFile(outputFile, "Unique words: " + uniqueWords.size(), "UTF-8");
    }
}
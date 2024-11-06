package com.company;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class StringUtils {
    /**
     *
     * @param file
     * @param pattern
     * @return if the pattern exist in the file
     */
    public static boolean isPatternInFile(File file, String pattern){
        boolean isValid = false;
        try {
            Object[] lines =  getLinesFromFile(file);
            for (Object line : lines) {
                if (((String)line).toLowerCase().contains(pattern)) {
                    return true;
                }
            }
        } catch (IOException e) {
            System.out.println("unable to read from file " + file.getName());
            isValid = true;
        }
        return isValid;
    }

    /**
     *
     * @param file
     * @return lines as array from the file
     * @throws IOException
     */
    public static Object[] getLinesFromFile(File file) throws IOException {
        return Files.lines(file.toPath()).toArray();
    }

}

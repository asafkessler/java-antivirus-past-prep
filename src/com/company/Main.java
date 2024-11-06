package com.company;

import java.io.File;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        List<File> myFiles = FileUtils.getSubFilesOnly("C:\\files");
        for (File file : myFiles) {
            if (StringUtils.isPatternInFile(file, "c:\\\\ delete")) {
                System.out.println(file.getName() + " you are a virus ! die !");
                file.delete();
            }else {
                System.out.println("you ate not a virus");
            }
        }
    }
}

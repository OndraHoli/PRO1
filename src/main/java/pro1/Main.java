package pro1;

import java.io.File;
import java.nio.file.Path;
// staticka trida je napr Math - nevytvari se new Math math = , ale jen Math.sqrt(neco)


public class Main {
    public static void main(String[] args)
    {
        File inputDir = new File("C:/data/input");
        File[] inputFiles = inputDir.listFiles();

        for(File inputFile : inputFiles){
            System.out.println("Reading " + inputFile);
            ExamRecord[] records = readInputFile(inputFile.toPath());
            System.out.println(ExamRecord[0].getName()); // ?????
        }
    }

    public static ExamRecord[] readInputFile(Path path) {

        return new ExamRecord[0];
    }
}

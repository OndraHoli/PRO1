package pro1;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.io.FileWriter;



public class Main {
    public static void main(String[] args)
    {

        File inputDir = new File("C:/data/input");
        File[] inputFiles = inputDir.listFiles();
        String nazevSlozky;

        for(File inputFile : inputFiles){

            //System.out.println("Reading " + inputFile);
            ExamRecord[] records = readInputFile(inputFile.toPath());
            //System.out.println("Ukázka: " + records[0].getScore());

            nazevSlozky = inputFile.getPath().replaceAll("input","output");
            File outFile = new File(nazevSlozky);

            try{
                FileWriter fWriter = new FileWriter(nazevSlozky);

                for(ExamRecord record : records){
                    fWriter.write(record.getName() + "," + record.getScore() + "\n");
                    System.out.println(record.getName() + "," + record.getScore());
                }
                fWriter.close();
            } catch(Exception e){
                System.out.println(e.getMessage());
            }

        }
    }
    //nacteni filu do examrecords pole
    public static ExamRecord[] readInputFile(Path path) {

        List<String> lines = null;
        try {
            lines = Files.readAllLines(path);
        } catch (IOException e) {
            return new ExamRecord[0];
        }
        List<ExamRecord> resultList = new ArrayList<>();
        for(String line : lines)
        {
            String[] split= line.split("[:=;]");
            resultList.add(new ExamRecord(split[0], Fraction.parse(split[1])));
        }
        return resultList.toArray(new ExamRecord[0]);
    }
}


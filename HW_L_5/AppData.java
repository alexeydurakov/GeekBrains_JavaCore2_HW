package gb.javacore_2.lesson_5.HW_L_5;

import com.opencsv.*;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppData {

    private String[] header = new String[]{"Value 1", "Value 2", "Value 3"};
    private int[][] data = new int[][]{{100,200,300}, {400,500,600}};

    public String[] getHeader() {
        return header;
    }

    public void setHeader(String[] header) {
        this.header = header;
    }

    public int[][] getData() {
        return data;
    }

    public void setData(int[][] data) {
        this.data = data;
    }

    public static void main(String[] args) throws Exception {

        AppData appData = new AppData();

        File file = new File("Data.csv");
        try {
            FileWriter outputfile = new FileWriter(file);
//            CSVWriter writer = new CSVWriter(outputfile);
            CSVWriter writer = new CSVWriter(outputfile, ';',
                    CSVWriter.NO_QUOTE_CHARACTER,

                    CSVWriter.DEFAULT_ESCAPE_CHARACTER,

                    CSVWriter.DEFAULT_LINE_END);

            writer.writeNext(appData.header);
            for(int i = 0; i < appData.data.length; i++){
                ArrayList<String> tmp = new ArrayList<>();
                for(int j = 0; j < appData.data[i].length; j++){
                    tmp.add(Integer.toString(appData.data[i][j]));
                }
                writer.writeNext(tmp.toArray(new String[0]));
            }

            writer.flush();
            writer.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        try {
            FileReader filereader = new FileReader(file);

            CSVParser parser = new CSVParserBuilder().withSeparator(';').build();

            CSVReader csvReader = new CSVReaderBuilder(filereader).withCSVParser(parser).build();

            List<String[]> allRows = csvReader.readAll();

            for(String[] row : allRows){
                System.out.println(Arrays.toString(row));
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }
}
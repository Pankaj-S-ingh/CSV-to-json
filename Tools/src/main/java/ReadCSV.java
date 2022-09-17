
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.opencsv.*;

public class ReadCSV {
    private static final String CSV_FILE_PATH
            = "src/main/java/places.csv";
    public static void main(String[] args) throws Exception {
        System.out.println("Read All Data at Once and Hide the Header also \n");
       // readAllDataAtOnce(CSV_FILE_PATH);
        List<List<String>> records = new ArrayList<List<String>>();
        records= readCSV("src/main/java/places.csv");
        System.out.println(records.get(1).get(3));
        System.out.println("_______________________________________________");
    }
    public static void readAllDataAtOnce(String file)
    {
        try {

            // Create an object of filereader class
            // with CSV file as a parameter.
            FileReader filereader = new FileReader(file);

            // create csvReader object
            // and skip first Line
            CSVReader csvReader = new CSVReaderBuilder(filereader)
                    .withSkipLines(1)
                    .build();
            List<String[]> allData = csvReader.readAll();
            ArrayList<String[]> al = new ArrayList<String[]>();
            // print Data
            for (String[] row : allData) {
                al.add(row);
//                for (String cell : row) {
//                    System.out.print(cell + "\t");
//                }
//                System.out.println();
            }
            System.out.println(al);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    public   static List<List<String>>  readCSV(String file) throws Exception{
        List<List<String>> records = new ArrayList<List<String>>();
        CSVReader csvReader = new CSVReader(new FileReader( file));
            String[] values = null;
            while ((values = csvReader.readNext()) != null) {
                records.add(Arrays.asList(values));
            }
            return records;
    }
    }



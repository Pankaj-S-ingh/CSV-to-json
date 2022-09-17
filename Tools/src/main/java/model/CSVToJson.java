package model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;;

public class CSVToJson {


    public static void main(String[] args) throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();
        List<List<String>> places1 = readCSV("src/main/java/places.csv");
        List<Places> plcs=new ArrayList<Places>();

        for (List<String> list : places1) {
            String Place = getSpace(list.get(1));
            Integer main_pincode=Integer.parseInt(checkNum(list.get(2)));
            Integer sub_pincode=Integer.parseInt(checkNum(list.get(2)));
            String address=getSpace(list.get(3));
            List<Double> loc=new ArrayList<>();
            loc.add(Double.parseDouble(list.get(4)));
            loc.add(Double.parseDouble(list.get(5)));
            List<Double> location=loc;

            String type=getSpace(list.get(6));
            String rating=getSpace(list.get(7));
            String diety=getSpace(list.get(8));
            Long contact_number=Long.parseLong(checkNum(list.get(10)));
            String validate=getSpace(list.get(11));
            String best_time_to_Visit=getSpace(list.get(13));
            String opening_and_closing_time=getSpace(list.get(14));
            String best_month_to_visit=getSpace(list.get(18));
            String best_whether_to_visit=getSpace(list.get(19));
            String best_age_to_visit=getSpace(list.get(20));


           Places  places = new Places(Place,main_pincode,sub_pincode,address ,location,type,rating,
                    diety,contact_number,validate,best_time_to_Visit,opening_and_closing_time,best_month_to_visit,best_whether_to_visit,best_age_to_visit);
          plcs.add(places);
            objectMapper.writeValue(new File("target/Places.json"), places);
        }

        objectMapper.writeValue(new File("target/Places.json"), plcs);


    }

    public static List<List<String>> readCSV(String file) throws Exception {
        List<List<String>> records = new ArrayList<List<String>>();
        CSVReader csvReader = new CSVReaderBuilder(new FileReader(file)).withSkipLines(1).build();
        String[] values = null;
        while ((values = csvReader.readNext()) != null) {
            records.add(Arrays.asList(values));
        }
        return records;
    }
    static String checkNum(String str){
        String s1="NA";
        String s2="";
        if (s2.equals(str))
            return "000000";
        if (s1.equals(str)){
            return "00000000";
        }
        else{
            return str;
        }
    }
    public  static  String getSpace(String str){
        String s1="";
        if (str.equals(s1)){
            return "NA";
        }
        else{
            return str;
        }
    }

}

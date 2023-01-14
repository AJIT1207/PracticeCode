package geeksforgeeks;

import java.io.*;
import java.util.*;

public class TextFileread {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\jajit\\Downloads\\CSVReader1.txt"));
        List<String> list = new ArrayList<>();
        String line = "";

        while ((line = br.readLine()) != null)
        {
            list.add(line);
//            String data[]   = line.split(",");
//
//            int id = Integer.parseInt(data[0]);
//            String name  = data[1];
//            String grade = data[2];
//
//            System.out.println(id);
//            System.out.println(name);
//            System.out.println(grade);
        }

        br.close();

        Collections.sort(list);

        System.out.println(list + " After sorting");

        BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\jajit\\Downloads\\CSVReader1.txt"));
        for (String sortedLine : list)
        {
            writer.write(sortedLine);
            writer.newLine();
        }

        writer.close();
    }
}

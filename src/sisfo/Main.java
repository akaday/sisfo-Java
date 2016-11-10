/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sisfo;
import java.io.FileNotFoundException;
import java.io.IOException;
import au.com.bytecode.opencsv.CSVReader;
import java.io.FileReader;
import java.util.List;
/**
 *
 * @author User
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {

        

    }

    public static void doRead(String[] args) throws FileNotFoundException, IOException
    {
        // TODO code application logic here
        String[] row = null;
        String csvFilename = "C://Users/User/Documents/NetBeansProjects/sisfo/db.csv";
        CSVReader csvReader = new CSVReader(new FileReader(csvFilename), ';');
        List content = csvReader.readAll();

        for (Object object : content) {
                row = (String[]) object;

                System.out.println(row[0]
                           + " # " + row[1]
                           + " #  " + row[2]
                           + " #  " + row[3]);
        }

        csvReader.close();

    }

}

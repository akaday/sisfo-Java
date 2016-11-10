/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sisfo;

import au.com.bytecode.opencsv.CSVReader;
import au.com.bytecode.opencsv.CSVWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author User
 */
public class DBSistem {
    //Delimiter used in CSV file
    public static final char DEFAULT_ESCAPE_CHARACTER = '"';
    public static final char DEFAULT_SEPARATOR = ';';
    public static final char DEFAULT_QUOTE_CHARACTER = '"';
    public static final char NO_QUOTE_CHARACTER = '\u0000';
    public static final char NO_ESCAPE_CHARACTER = '\u0000';
    public static final String DEFAULT_LINE_END = "\n";
    DefaultTableModel model;
    Object[][] semuaData;
    Object[] dataBaru, kolom, listKegiatan;

    public static String fileMahasiswa    = "C://Users/User/Documents/NetBeansProjects/sisfo/mahasiswa.csv";
    public static String fileKegiatan     = "C://Users/User/Documents/NetBeansProjects/sisfo/kegiatan.csv";


    public static List readKegiatan() throws FileNotFoundException, IOException
    {
        CSVReader csvReader2 = new CSVReader(new FileReader(fileKegiatan), ';');
        List content2 = csvReader2.readAll();

        csvReader2.close();
        return content2;
    }

    public static List readMahasiswa() throws FileNotFoundException, IOException
    {
        CSVReader csvReader = new CSVReader(new FileReader(fileMahasiswa), ';');
        List content = csvReader.readAll();

        csvReader.close();
        return content;
    }

//    public static void main(String[] args) throws Exception
    public static void writeMahasiswa(String dataBaru) throws Exception
    {
        CSVWriter writer = new CSVWriter(new FileWriter(fileMahasiswa, true), ';', CSVWriter.NO_QUOTE_CHARACTER);
//        String dataBaru = "15042025;Sedayu;Unknow;Manah";
        String [] record = dataBaru.split(";");

        writer.writeNext(record);

        writer.close();
    }

    public static void writeKegiatan(String dataBaru) throws Exception
    {
        CSVWriter writer = new CSVWriter(new FileWriter(fileKegiatan, true), ';', CSVWriter.NO_QUOTE_CHARACTER);

//        String dataBaru = "3;David;Feezor;USA;40";
        String [] record = dataBaru.split(";");

        writer.writeNext(record);

        writer.close();
    }

}

package filehandling;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Eg1 {
    public static void main(String[] args) {
        //Blank workbook
        XSSFWorkbook workbook = new XSSFWorkbook();
        //Creating a blank Excel sheet
        XSSFSheet sheet = workbook.createSheet("PlayerDetails");
        //Creating an empty TreeMap of string and Object[] type
        Map<String,Object[]> data = new TreeMap<String,Object[]>();
        //Writing data to Object[] using put() method
        data.put("1",new Object[]{"Id","Name","LastName"});
        data.put("2",new Object[]{"101","Vernon","Chwe"});
        data.put("3",new Object[]{"102","Josh","Hong"});
        data.put("4",new Object[]{"103","Dino","Lee"});
        data.put("5",new Object[]{"104","Hoshi","Kwan"});
        data.put("6",new Object[]{"105","DK","Lee"});
        //Iterating over data and writing it to sheet
        Set<String> keyset = data.keySet();
        int rownum=0;
        for(String key  : keyset)
        {
            //Creating a new row in the sheet
            Row row = sheet.createRow(rownum++);
            Object[] objArr = data.get(key);
            int cellnum=0;
            for(Object obj : objArr)
            {
             //This line creates a cell in the next column of that row
                Cell cell = row.createCell(cellnum++);
                if(obj instanceof String)
                {
                    cell.setCellValue((String)obj);
                }
                else if(obj instanceof Integer)
                {
                    cell.setCellValue((Integer)obj);
                }

            }
            //try block to check for expections
            try
            {
                //writing the workbook
                FileOutputStream out = new FileOutputStream(new File("src/PlayerDetails"));
                //Closing file output connections
                out.close();
                //Console message for successful execution of program
                System.out.println("Done");
            }
            catch (Exception e)
            {
                //Display exceptions along with line number using printStackTrace()
                e.printStackTrace();
            }

        }




    }
}

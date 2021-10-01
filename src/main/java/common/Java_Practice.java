package common;

import java.util.ArrayList;
import java.util.List;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;

public class Java_Practice {

    public static void main1(String[] args) {
        String string1 = "Great responsibility";
        int count;

        //Converts given string into character array
        char string[] = string1.toCharArray();

        System.out.println("Duplicate characters in a given string: ");
        //Counts each character present in the string
        for(int i = 0; i <string.length; i++) {
            count = 1;
            for(int j = i+1; j <string.length; j++) {
                if(string[i] == string[j] && string[i] != ' ') {
                    count++;
                    //Set string[j] to 0 to avoid printing visited character
                    string[j] = '0';
                }
            }
            //A character is considered as duplicate if count is greater than 1
            if(count > 1 && string[i] != '0')
                System.out.println(string[i]);
        }
    }

    public static void main2(String a[]){
            String str="aaabbbbcccc";
            char[] carray=str.toCharArray();
            for(int i=0; i<str.length(); i++)
            {
                for(int j=i+1; j<str.length();j++)
                {
                    if(carray[i]==carray[j])
                    {
                        System.out.println(carray[j]);
                        break;
                    }
                }
            }
    }

    //public static List chars = new ArrayList();

    public static void main3(String[] args) {
        String str="aaaabbbcccccddddddeaaee";
    // print count of each character in a given string.
        for (int i = 0; i < str.length(); i++) {
            //char ch = str.charAt(i);
            int count = 0;
            for (int j = 0; j < str.length(); j++)
            {
                if (str.charAt(i) == str.charAt(j))
                {
                    count++;
                }
            }
            System.out.println(str.charAt(i) + " : " + count);
        }

    }

    public static  void main(String args[]) throws IOException {

        //Create an object of File class to open xlsx file
        File file =    new File("C://Users//agupta515//Documents//Exceldata.xlsx");

        //Create an object of FileInputStream class to read excel file
        FileInputStream inputStream = new FileInputStream(file);

        //Creating workbook instance that refers to .xls file
        HSSFWorkbook wb=new HSSFWorkbook(inputStream);

        //Creating a Sheet object using the sheet Name
        HSSFSheet sheet=wb.getSheet("STUDENT_DATA");

        //Create a row object to retrieve row at index 1
        HSSFRow row2=sheet.getRow(1);

        //Create a cell object to retreive cell at index 5
        HSSFCell cell=row2.getCell(1);

        //Get the address in a variable
        String address= cell.getStringCellValue();

        //Printing the address
        System.out.println("Address is :"+ address);
    }

}

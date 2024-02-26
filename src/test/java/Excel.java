import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.awt.font.NumericShaper;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Excel {
    public static void main(String[] args) throws IOException {

        String excelfile="src/test/java/org/example/for.xlsx";
        FileInputStream fileinput=new FileInputStream(excelfile);

     XSSFWorkbook workbook= new XSSFWorkbook(fileinput);
     XSSFSheet sheet=workbook.getSheetAt(0);

     //loop for row
        int rows=sheet.getLastRowNum();
        int cells=sheet.getRow(1).getLastCellNum();

        for(int r=0;r<=rows; r++){
            XSSFRow row= sheet.getRow(r);
            for(int c=0; c<cells; c++){
                XSSFCell cell=row.getCell(c);
               switch (cell.getCellType()){


                   case NUMERIC -> {
                       System.out.println(cell.getNumericCellValue());
                       break;
                   }

                   case STRING -> {
                       System.out.println(cell.getStringCellValue());
                       break;
                   }

                       case BOOLEAN -> {
                           System.out.println(cell.getBooleanCellValue());
                           break;
                   }

               }

            }
        }


    }
}

package myPackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ArrayList a = new ArrayList();
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Devgan\\Desktop\\DataDriven.xlsx");

		XSSFWorkbook wb = new XSSFWorkbook(fis);
		int sheets = wb.getNumberOfSheets();
		for (int i = 0; i < sheets; i++) {

			if (wb.getSheetName(i).equalsIgnoreCase("TestData")) {

				XSSFSheet sheet = wb.getSheetAt(i);

				Iterator<Row> rows = sheet.iterator();
				Row firstRow = rows.next();
				Iterator<Cell> ce = firstRow.cellIterator();
				int k = 0;
				int coloumn = 0;
				while (ce.hasNext()) {

					Cell value = ce.next();
					if (value.getStringCellValue().equalsIgnoreCase("TestCases")) {
						coloumn = k;

					}
					k++;

				}
				System.out.println(coloumn);
				while(rows.hasNext()) {
				Row r =	rows.next();
				if(r.getCell(coloumn).getStringCellValue().equalsIgnoreCase("Purchase"))		
				{
				Iterator<Cell> cv = 	r.cellIterator();
				while(cv.hasNext()) {
					System.out.println(cv.next().getStringCellValue());
				}
				}
				}

			}
		}

	}

}

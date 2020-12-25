package utils;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	public  ExcelUtils(String excelpath,String sheetName)
	{
		try {
			workbook=new XSSFWorkbook(excelpath);
			sheet=workbook.getSheet(sheetName);
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	static String projectPath;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	public static void main(String args[])
	{
		//getRowCount();
		//getCellDataString(0, 0);
		//getCellDataNumber(1, 1);
	}
	public static int getRowCount()
	{
		int rowCount=0;
		try {
			rowCount=sheet.getPhysicalNumberOfRows();
			System.out.println("rowcount= "+rowCount);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			System.out.println(e.getStackTrace());
		}
		return rowCount;
	}
	public static int getColCount()
	{
		int ColCount=0;
		try {
			ColCount=sheet.getRow(0).getPhysicalNumberOfCells();
			System.out.println("Colcount= "+ColCount);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			System.out.println(e.getStackTrace());
		}
		return ColCount;
	}
	public static String getCellDataString(int rowNum,int colNum)
	{
		String cellData=null;
		try {
			cellData=sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
		//	System.out.println(cellData);
		    }
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			System.out.println(e.getStackTrace());
		}
		return cellData;
	}
	public static void getCellDataNumber(int rowNum,int colNum)
	{
		try {
			double cellData=sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
	//		System.out.println(cellData);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			System.out.println(e.getStackTrace());
		}
	}
}

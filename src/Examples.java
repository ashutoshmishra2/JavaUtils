/**
 * @author Ashutosh Mishra
 * Examples.java
 * @desc just a sample file to implement an Example for the utilities.
 * 
 */

import java.util.List;

import org.nng.utils.Excel;
import org.nng.utils.Conversion;
import static java.nio.charset.StandardCharsets.*;

public class Examples {

	/*
	 * =================================
	 * Entry Point
	 * =================================
	 */
		public static void main(String[] args) throws Exception {
			Examples example = new Examples();	
			
			String myString = "chrome";
			byte[] ptext = myString.getBytes(ISO_8859_1); 
			String value = new String(ptext, UTF_8);
			 System.out.println(">>> " + value);
			 
			// Implementing Excel Utility
			//example.excelExample();
			//myString.compareTo("");
			// Implementing TimeUnit Conversion
			//example.conversion();
		}
	
	/*
	 * =================================
	 * Utility Implementation Code
	 * =================================
	 * */
		public void printData(List<String> data) throws Exception {
			// Print the results.
				System.out.println("DATA >>>> Len="+ data.size());
				for(String str :  data) { System.out.println(str); }
			// End
			return;
		}
		
		/*
		 * Unit Conversion Utility
		 */
		public void conversion() throws Exception {
			Conversion uc = new Conversion();
			//conversion
			long seconds = 3600; // 1 Hour
			System.out.println(seconds+ " Seconds to HMS: " + uc.secondsToHMSTime(seconds) );
			long minutes = 68; // 1 hours 8 minutes
			System.out.println(minutes+ " Minutes to HMS: " + uc.minutesToHMSTime(minutes) );
		}
		/*
		 * Excel Utility
		 */
		public void excelExample() throws Exception {
			// Excel Object creation
				// Excel File Format: XLSX
				//Excel excel = new Excel("./data/TC_128_addNewUserData.xlsx");
				
				// Excel File Format: XLS
				Excel excel = new Excel("./data/UserData2003Format.xls");
				
			// getting Data from an Excel file
				//Excel excel = new Excel("E:\\OFFICE-WORKPLACE\\__TestPoint\\FLEXI-CRM-Scenario.xlsx");
				//excel.printExcelSheet(0);
				
				// CASE: Get Row data by SheetIndex and rowIndex
				//List<String> data = excel.getRowData(0, 1);
			
				// CASE: Get Row data by SheetName and rowIndex
				//List<String> data = excel.getRowData("sheet1", 1);
			
				// CASE: Get Column data by Column Name
				List<String> colData = excel.getColumnData(0, "USERID");
				
			// Print the results.
				this.printData(colData);
		}
	
/*EOClass*/
}

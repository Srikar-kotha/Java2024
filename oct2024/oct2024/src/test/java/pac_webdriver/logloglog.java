package pac_webdriver;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
 
public class logloglog {
 
    public static void main(String[] args) throws Exception {
        FileInputStream input = new FileInputStream("C:\\Users\\srikar.kotha\\eclipse-workspace\\oct2024\\opencart.xlsx");
 
        XSSFWorkbook workbook = new XSSFWorkbook(input);
        XSSFSheet moduleSheet = workbook.getSheet("Module");
        XSSFSheet testcaseSheet = workbook.getSheet("Testcase");
        XSSFSheet teststepSheet = workbook.getSheet("Teststep");
 
        int moduleRows = moduleSheet.getPhysicalNumberOfRows();
        System.out.println("Module rows: " + moduleRows);
 
        for (int i = 0; i < moduleRows; i++) {
            String moduleExe = moduleSheet.getRow(i).getCell(2).getStringCellValue();
            if (moduleExe.equals("Y")) {
                String modId = moduleSheet.getRow(i).getCell(0).getStringCellValue();
                System.out.println("Module ID: " + modId);
 
                int testcaseRows = testcaseSheet.getPhysicalNumberOfRows();
                for (int j = 0; j < testcaseRows; j++) {
                    String testcaseModuleId = testcaseSheet.getRow(j).getCell(3).getStringCellValue();
                    String testExe = testcaseSheet.getRow(j).getCell(2).getStringCellValue();
                    if (testcaseModuleId.equals(modId) && testExe.equals("Y")) {
                        String testcaseId = testcaseSheet.getRow(j).getCell(0).getStringCellValue();
                        System.out.println("Testcase ID: " + testcaseId);
 
                        int teststepRows = teststepSheet.getPhysicalNumberOfRows();
                        for (int k = 0; k < teststepRows; k++) {
                            String teststepTestcaseId = teststepSheet.getRow(k).getCell(4).getStringCellValue();
                            if (teststepTestcaseId.equals(testcaseId)) {
                                
                                String keyword = teststepSheet.getRow(k).getCell(3).getStringCellValue();
 
                                
                                switch (keyword) {
                                    case "ln":
                                        login();
                                        break;
                                    case "ca":
                                        close();
                                        break;
                                    default:
                                    System.out.println("No action defined for keyword: " + keyword);
                                 
                                }
                            }
                        }
                    }
                }
            }
        }
 
        workbook.close();
        input.close();
    }
 
    private static void close()
    {
    	
        System.out.println("This is the close code");
    }
 
    private static void login()
    {
    	
        System.out.println("This is the login code");
    }
}
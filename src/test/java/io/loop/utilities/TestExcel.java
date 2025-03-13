package io.loop.utilities;

public class TestExcel {

    public static void main(String[] args) {
        // Correct the file path to an absolute path or fix relative path
        ExcelUtils excelUtils = new ExcelUtils("C:/Users/nsh/Documents/Repo2024/cucumber-project-b4/src/test/resources/Book1.xlsx", "Sheet1");

        // Printing the cell data
        System.out.println("excelUtils.getCellData(1, 1) = " + excelUtils.getCellData(0, 0));

        // Correcting the syntax error
        // Assuming you want to set data to a cell (you must implement the method in ExcelUtils)
        excelUtils.setCellData("Nadir is hungry", 3, 4);
    }
}

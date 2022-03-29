package com.agnext.reporting.service;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.List;

public interface ExcelGenerationService {
    <T> ByteArrayInputStream generateExcelSheet(XSSFWorkbook workbook, String sheetName, List<T> reportEntityList)
            throws IOException, NoSuchFieldException, IllegalAccessException, InterruptedException;
}

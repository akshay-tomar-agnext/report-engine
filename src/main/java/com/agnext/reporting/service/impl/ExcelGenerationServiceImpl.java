package com.agnext.reporting.service.impl;

import com.agnext.reporting.enums.ReportFormat;
import com.agnext.reporting.service.ExcelGenerationService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Service
@Slf4j
public class ExcelGenerationServiceImpl implements ExcelGenerationService {

    @Override
    public <T> ByteArrayInputStream generateExcelSheet(XSSFWorkbook workbook, String sheetName, List<T> reportsList)
            throws IOException, NoSuchFieldException, IllegalAccessException {
        XSSFSheet sheet = workbook.createSheet(sheetName);
        return export(workbook, sheet, reportsList);
    }

    private <T> void writerHeadersRow(XSSFSheet sheet, List<T> reportsList) {
        Row row = sheet.createRow(0);
        Field[] fields = reportsList.get(0).getClass().getDeclaredFields();
        AtomicInteger columnCount = new AtomicInteger(0);
        Arrays.stream(fields).forEach(field -> {
            Cell cell = row.createCell(columnCount.getAndIncrement());
            cell.setCellValue(ReportFormat.getFieldByAnalysisName(field.getName()));
        });
    }

    private <T> void writeDataRows(XSSFSheet sheet, List<T> reportsList) throws NoSuchFieldException, IllegalAccessException {
        AtomicInteger rowCount = new AtomicInteger(sheet.getLastRowNum());
        Field[] fields = reportsList.get(0).getClass().getDeclaredFields();
        for (T t : reportsList) {
            Row row = sheet.createRow(rowCount.incrementAndGet());
            AtomicInteger columnCount = new AtomicInteger(0);
            for (Field field : fields) {
                Cell cell = row.createCell(columnCount.getAndIncrement());
                String data = (String) field.get(t);
                if (!StringUtils.isEmpty(data))
                    cell.setCellValue(data);
            }
        }
    }

    private String capitalize(String s) {
        if (s.length() == 0)
            return s;
        StringBuilder str = new StringBuilder(s.substring(0, 1).toUpperCase());
        for (int i = 1; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                str.append(" ").append(ch);
            } else
                str.append(ch);
        }
        return str.toString();
    }

    private <T> ByteArrayInputStream export(XSSFWorkbook workbook, XSSFSheet sheet, List<T> reportsList) throws IOException,
            NoSuchFieldException, IllegalAccessException {
        writerHeadersRow(sheet, reportsList);
        writeDataRows(sheet, reportsList);
        ByteArrayOutputStream arrayOutputStream = new ByteArrayOutputStream();
        workbook.write(arrayOutputStream);
        return new ByteArrayInputStream(arrayOutputStream.toByteArray());
    }

}

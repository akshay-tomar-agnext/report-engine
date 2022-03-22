package com.agnext.reporting.adapter;

import com.agnext.reporting.entity.scan.ScanEntity;
import com.agnext.reporting.entity.report.ScanReportEntity;
import com.agnext.reporting.model.ScanReportModel;
import com.agnext.reporting.model.kcs.KCSRagiModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface MapStructMapper {
    ScanReportEntity ScanEntityToScanReportEntity(ScanEntity scanEntity);

    @Mapping(source = "createdOnDate", target = "sampleDate")
    @Mapping(source = "location", target = "procurementCenter")
    @Mapping(source = "surveyorName", target = "surveyorName")
    @Mapping(source = "commodityName", target = "commodity")
    @Mapping(source = "farmerName", target = "farmerName")
    @Mapping(source = "fId", target = "fruitId")
    @Mapping(source = "sampleId", target = "sampleNo")
    @Mapping(source = "quantityUnit", target = "quantityUnit")
    @Mapping(source = "bag", target = "totalBags")
    @Mapping(source = "acceptedBags", target = "acceptedBags")
    @Mapping(source = "rejectedBags", target = "rejectedBags")
    @Mapping(source = "weight", target = "totalQuantity")
    @Mapping(source = "moistureManual", target = "moistureContent")
    @Mapping(source = "foreignMatterManual", target = "foreignMatter")
    @Mapping(source = "damagedManual", target = "damaged")
    @Mapping(source = "slightlyDamagedManual", target = "slightlyDamaged")
    @Mapping(source = "otherFoodGrainsManual", target = "otherFoodGrains")
    @Mapping(source = "amount", target = "amount")
    @Mapping(source = "remark", target = "remark")
    KCSRagiModel from(ScanReportModel scanReportModel);

    ScanReportModel ScanReportEntityToScanReportModel(ScanReportEntity scanReport);
}

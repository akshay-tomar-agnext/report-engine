package com.agnext.reporting.adapter;

import com.agnext.reporting.entity.scan.ScanEntity;
import com.agnext.reporting.entity.report.ScanReportEntity;
import com.agnext.reporting.model.CredentialModel;
import com.agnext.reporting.model.EmailData;
import com.agnext.reporting.model.ScanReportModel;
import com.agnext.reporting.model.kcs.KCSJowrModel;
import com.agnext.reporting.model.kcs.KCSPaddyModel;
import com.agnext.reporting.model.kcs.KCSRagiModel;
import com.agnext.reporting.model.mcs.MCSModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface MapStructMapper {
    @Mapping(source = "id",target = "scanId")
    @Mapping(source = "assayingTypeEnum.scanType", target = "assayingType")
    ScanReportEntity ScanEntityToScanReportEntity(ScanEntity scanEntity);
    ScanReportModel ScanReportEntityToScanReportModel(ScanReportEntity scanReport);

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
    KCSRagiModel ScanReportModelToKCSRagiModel(ScanReportModel scanReportModel);

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
    @Mapping(source = "foreignMatterOrganicManual", target = "foreignMatterOrganic")
    @Mapping(source = "foreignMatterManual", target = "foreignMatterInorganic")
    @Mapping(source = "damagedManual", target = "DamagedDiscolouredSproutedAndWeevilledGrains")
    @Mapping(source = "immatureManual", target = "ImmatureShrunkenAndShriveledGrains")
    @Mapping(source = "admixtureManual", target = "AdmixtureOfLowerClass")
    @Mapping(source = "amount", target = "amount")
    @Mapping(source = "remark", target = "remark")
    KCSPaddyModel ScanReportModelToKCSPaddyModel(ScanReportModel scanReportModel);

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
    @Mapping(source = "damagedManual", target = "damagedGrains")
    @Mapping(source = "slightlyDamagedManual", target = "slightlyDamagedDiscoloured")
    @Mapping(source = "otherFoodGrainsManual", target = "otherFoodGrains")
    @Mapping(source = "weevilledManual", target = "WeevilledGrains")
    @Mapping(source = "immatureManual", target = "ShriveledImmatureGrains")
    @Mapping(source = "amount", target = "amount")
    @Mapping(source = "remark", target = "remark")
    KCSJowrModel ScanReportModelToKCSJowrModel(ScanReportModel scanReportModel);

    @Mapping(source = "createdOnDate", target = "sampleDate")
    @Mapping(source = "location", target = "procurementCenter")
    @Mapping(source = "surveyorName", target = "surveyorName")
    @Mapping(source = "commodityName", target = "commodity")
    @Mapping(source = "farmerName", target = "farmerName")
    @Mapping(source = "sampleId", target = "sampleNo")
    @Mapping(source = "quantityUnit", target = "quantityUnit")
    @Mapping(source = "bag", target = "totalBags")
    @Mapping(source = "acceptedBags", target = "acceptedBags")
    @Mapping(source = "rejectedBags", target = "rejectedBags")
    @Mapping(source = "weight", target = "totalQuantity")
    @Mapping(source = "moistureManual", target = "moistureContent")
    @Mapping(source = "foreignMatterManual", target = "foreignMatter")
    @Mapping(source = "damagedManual", target = "damaged")
    @Mapping(source = "immatureManual", target = "immature")
    @Mapping(source = "admixtureManual", target = "admixture")
    @Mapping(source = "amount", target = "amount")
    @Mapping(source = "remark", target = "remark")
    MCSModel ScanReportModelToMCSModel(ScanReportModel scanReportModel);

    @Mapping(source = "from",target = "emailSender")
    @Mapping(source = "subject",target = "emailSubject")
    @Mapping(source = "content",target = "emailContent")
    @Mapping(source = "emails",target = "emailToRecipient")
    EmailData CredentialModelToEmailData(CredentialModel credentialModel);
}


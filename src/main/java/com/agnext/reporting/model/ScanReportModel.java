package com.agnext.reporting.model;

import com.agnext.reporting.enums.AssayingTypeEnum;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.cassandra.core.mapping.Column;

import javax.persistence.*;

@Getter
@Setter
public class ScanReportModel {

    public Long id;
    public Long scanId;
    public String farmerCode;
    public String location;
    public String lotId;
    public String seal;
    public String locationCode;
    public String farmerName;
    public String vendorCode;
    public String scanType;
    public String fId;
    public String filePath;
    public String quantity;
    public String quantityUnit;
    public String varietyId;
    public String refernceId;
    public String installatonCenterId;
    public String customerId;
    public String dateDone;
    public String deviceSerialNo;
    public String farmerId;
    public String qualityScore;
    public String userId;
    public String createdBy;
    public String fileName;
    public String vendorId;
    public String weight;
    public String amount;
    public String weightAmt;
    public String regionId;
    public String instCenterTypeId;
    public String commodityVarietyId;
    public String commodityCategoryId;
    public String commodityName;
    public String grade;
    public String deviceType;
    public String deviceTypeId;
    public String plotId;
    public Integer accepted;
    public String variance;
    public String createdDate;
    public String createdOnDate;
    public String createdOn;
    public String areaCovered;
    public String sampleId;
    public String surveyorName;
    public String sectionId;
    public String barCode;
    public String imageUniqueId;
    public Integer approval;
    public String density;
    public String airesult;
    public String truckNumber;
    public String slipNo;
    public String gatePass;
    public String cadNo;
    public String bag;
    public String truckGrossWeight;
    public String truckTareWeight;
    public String truckNetWeight;
    public String stackNumber;
    public String chamberNumber;
    public String avgWeightPerBag;
    public String packingSize;
    public Integer state;
    public String weighbridgeName;
    public String cropYear;
    public String GRNNumber;
    public String operatorId;
    public String message;
    public String statusChangedOn;
    public String societyName;
    public String sampleWeight;
    public String sampleWeightUnit;
    public String varietyName;
    public String remark;
    public String stateAdmin;
    public String acceptedBags;
    public String rejectedBags;
    public Boolean isValid;
    public Boolean isImageUrlValid;
    public String deviceModelNo;
    public String modeOfScan;
    public String bucketName;
    public String uuid;
    public Boolean isDuplicate;
    public String vendorName;
    public String rejectionReasonIds;
    public String systemGeneratedTimestamp;
    public String inferenceRequestId;
    public String migratedScanId;
    @Enumerated(EnumType.STRING)
    public AssayingTypeEnum assayingType;
    public String farmerAddress;
    public String eventStatus;
    private String scanByUserCode;
    private String clientCode;
    private String uid;
    private String userName;
    private String date;
    private String farmer;
    private String village;
    private String block;
    private String contactNum;
    private String adhaar;
    private String commodityGrossWt;
    private String commodityNetWt;
    private String foulSmell;
    private String vehicle;
    private String buyersName;
    private String rate;
    private String mandalName;
    public String moistureManual;
    public String moistureVisioCount;
    public String moistureVisioDensity;
    public String foreignMatterManual;
    public String foreignMatterVisioCount;
    public String foreignMatterVisioDensity;
    public String foreignMatterOrganicManual;
    public String foreignMatterOrganicVisioCount;
    public String foreignMatterOrganicVisioDensity;
    public String admixtureManual;
    public String admixtureVisioCount;
    public String admixtureVisioDensity;
    public String damagedManual;
    public String damagedVisioCount;
    public String damagedVisioDensity;
    public String weevilledManual;
    public String weevilledVisioCount;
    public String weevilledVisioDensity;
    public String shrivelledAndImmatureManual;
    public String shrivelledAndImmatureVisioCount;
    public String shrivelledAndImmatureVisioDensity;
    public String slightlyDamagedManual;
    public String slightlyDamagedVisioCount;
    public String slightlyDamagedVisioDensity;
    public String podsOfOtherVarietyManual;
    public String podsOfOtherVarietyVisioCount;
    public String podsOfOtherVarietyVisioDensity;
    public String shellingManual;
    public String shellingVisioCount;
    public String shellingVisioDensity;
    public String damagedAndWeevilledManual;
    public String damagedAndWeevilledVisioCount;
    public String damagedAndWeevilledVisioDensity;
    public String immatureManual;
    public String immatureVisioCount;
    public String immatureVisioDensity;
    public String otherFoodGrainsManual;
    public String otherFoodGrainsVisioCount;
    public String otherFoodGrainsVisioDensity;
    public String smallAtrophiedSeedsManual;
    public String smallAtrophiedSeedsVisioCount;
    public String smallAtrophiedSeedsVisioDensity;
    public String splitCrackedManual;
    public String splitCrackedVisioCount;
    public String splitCrackedVisioDensity;
    public String blackTipManual;
    public String blackTipVisioCount;
    public String blackTipVisioDensity;
    public String brokenManual;
    public String brokenVisioCount;
    public String brokenVisioDensity;
    public String broken2Manual;
    public String broken2VisioCount;
    public String broken2VisioDensity;
    public String cleanManual;
    public String cleanVisioCount;
    public String cleanVisioDensity;
    public String grainCountManual;
    public String grainCountVisioCount;
    public String grainCountVisioDensity;
    public String aspectRatioManual;
    public String aspectRatioVisioCount;
    public String aspectRatioVisioDensity;
    public String lengthManual;
    public String lengthVisioCount;
    public String lengthVisioDensity;
    public String widthManual;
    public String widthVisioCount;
    public String widthVisioDensity;
    public String karnalBuntManual;
    public String karnalBuntVisioCount;
    public String karnalBuntVisioDensity;
    public String redWheatManual;
    public String redWheatVisioCount;
    public String redWheatVisioDensity;
    public String fungusManual;
    public String fungusVisioCount;
    public String fungusVisioDensity;
    public String fungusDamagedManual;
    public String fungusDamagedVisioCount;
    public String fungusDamagedVisioDensity;
    public String whiteFungusManual;
    public String whiteFungusVisioCount;
    public String whiteFungusVisioDensity;
    public String temperatureManual;
    public String temperatureVisioCount;
    public String temperatureVisioDensity;
    public String moistureWeightManual;
    public String moistureWeightVisioCount;
    public String moistureWeightVisioDensity;
    public String blackManual;
    public String blackVisioCount;
    public String blackVisioDensity;
    public String redManual;
    public String redVisioCount;
    public String redVisioDensity;
    public String shrivelledManual;
    public String shrivelledVisioCount;
    public String shrivelledVisioDensity;
    public String tcwManual;
    public String tcwVisioCount;
    public String tcwVisioDensity;
    public String radiusManual;
    public String radiusVisioCount;
    public String radiusVisioDensity;
    public String greenManual;
    public String greenVisioCount;
    public String greenVisioDensity;
    public String discoloredManual;
    public String discoloredVisioCount;
    public String discoloredVisioDensity;
    public String starchManual;
    public String starchVisioCount;
    public String starchVisioDensity;
    public String flakesManual;
    public String flakesVisioCount;
    public String flakesVisioDensity;
    public String huskManual;
    public String huskVisioCount;
    public String huskVisioDensity;
    public String waterDamagedManual;
    public String waterDamagedVisioCount;
    public String waterDamagedVisioDensity;
    public String insectDamagedMatterManual;
    public String insectDamagedMatterVisioCount;
    public String insectDamagedMatterVisioDensity;
    public String shrunkenManual;
    public String shrunkenVisioCount;
    public String shrunkenVisioDensity;
    public String splitAndThripsCapsulesManual;
    public String splitAndThripsCapsulesVisioCount;
    public String splitAndThripsCapsulesVisioDensity;
    public String sproutedWeevilledManual;
    public String sproutedWeevilledVisioCount;
    public String sproutedWeevilledVisioDensity;
    public String liveInfestationManual;
    public String liveInfestationVisioCount;
    public String liveInfestationVisioDensity;
    public String moldsManual;
    public String moldsVisioCount;
    public String moldsVisioDensity;
    public String whitishSeedsManual;
    public String whitishSeedsVisioCount;
    public String whitishSeedsVisioDensity;
    public String chalkyGrainManual;
    public String chalkyGrainVisioCount;
    public String chalkyGrainVisioDensity;
    public String emptyShellManual;
    public String emptyShellVisioCount;
    public String emptyShellVisioDensity;
    public String hullingRecoveryManual;
    public String hullingRecoveryVisioCount;
    public String hullingRecoveryVisioDensity;
    public String undehuskedSplitsManual;
    public String undehuskedSplitsVisioCount;
    public String undehuskedSplitsVisioDensity;
    public String stoneManual;
    public String stoneVisioCount;
    public String stoneVisioDensity;
    public String aflatoxin;
    public String astaColour;
    public String capsaicin;
    public String ddp;
    public String good;
    public String pows;
    public String mip;
}

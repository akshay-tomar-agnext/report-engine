package com.agnext.reporting.entity.report;

import com.agnext.reporting.enums.AssayingTypeEnum;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.lang.reflect.Field;

@Entity
@Getter
@Setter
@Table(name = "scan_report")
public class ScanReportEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public Long id;

    @Column(name = "scan_id", length = 50)
    public Long scanId;

    @Column(name = "farmer_code", length = 50)
    public String farmerCode;

    @Column(name = "location", length = 50)
    public String location;

    @Column(name = "lot_id", length = 50)
    public String lotId;

    @Column(name = "seal", length = 50)
    public String seal;

    @Column(name = "location_code", length = 50)
    public String locationCode;

    @Column(name = "farmer_name", length = 50)
    public String farmerName;

    @Column(name = "vendor_code", length = 50)
    public String vendorCode;

    @Column(name = "scan_type", length = 50)
    public String scanType;

    @Column(name = "f_id", length = 50)
    public String fId;

    @Column(name = "file_path", length = 50)
    public String filePath;

    @Column(name = "quantity", length = 50)
    public String quantity;

    @Column(name = "quantity_unit", length = 50)
    public String quantityUnit;

    @Column(name = "variety_id", length = 50)
    public String varietyId;

    @Column(name = "refernce_id", length = 50)
    public String refernceId;

    @Column(name = "installation_center_id", length = 50)
    public String installatonCenterId;

    @Column(name = "company_id", length = 50)
    public String customerId;

    @Column(name = "date_done", length = 50)
    public String dateDone;

    @Column(name = "device_serial_no", length = 50)
    public String deviceSerialNo;

    @Column(name = "farmer_id", length = 50)
    public String farmerId;

    @Column(name = "quality_score", length = 50)
    public String qualityScore;

    @Column(name = "user_id", length = 50)
    public String userId;

    @Column(name = "created_by", length = 50)
    public String createdBy;

    @Column(name = "file_name", length = 50)
    public String fileName;

    @Column(name = "vendor_id", length = 50)
    public String vendorId;

    @Column(name = "weight", length = 50)
    public String weight;

    @Column(name = "amount", length = 50)
    public String amount;

    @Column(name = "weight_amt", length = 50)
    public String weightAmt;

    @Column(name = "region_id", length = 50)
    public String regionId;

    @Column(name = "inst_center_type_Id", length = 50)
    public String instCenterTypeId;

    @Column(name = "commodity_variety_id", length = 50)
    public String commodityVarietyId;

    @Column(name = "commodity_category_id", length = 50)
    public String commodityCategoryId;

    @Column(name = "commodity_name", length = 50)
    public String commodityName;

    @Column(name = "grade", length = 50)
    public String grade;

    @Column(name = "device_type", length = 50)
    public String deviceType;

    @Column(name = "device_type_id", length = 50)
    public String deviceTypeId;

    @Column(name = "plot_id", length = 50)
    public String plotId;

    @Column(name = "accepted", length = 50)
    public Integer accepted;

    @Column(name = "variance", length = 50)
    public String variance;

    @Column(name = "created_date", length = 50)
    public String createdDate;

    @Column(name = "created_on_date", length = 50)
    public String createdOnDate;

    @Column(name = "created_on", length = 50)
    public String createdOn;

    @Column(name = "area_covered", length = 50)
    public String areaCovered;

    @Column(name = "sample_id", length = 50)
    public String sampleId;

    @Column(name = "surveyor_name", length = 50)
    public String surveyorName;

    @Column(name = "section_id", length = 50)
    public String sectionId;

    @Column(name = "bar_code", length = 50)
    public String barCode;

    @Column(name = "image_unique_id", length = 255)
    public String imageUniqueId;

    @Column(name = "approval", length = 50)
    public Integer approval;

    @Column(name = "density", length = 255)
    public String density;

    @Column(name = "airesult", length = 50)
    public String airesult;

    @Column(name = "truck_number", length = 50)
    public String truckNumber;

    @Column(name = "slip_no", length = 50)
    public String slipNo;

    @Column(name = "gate_pass", length = 50)
    public String gatePass;

    @Column(name = "cad_no", length = 50)
    public String cadNo;

    @Column(name = "bag", length = 50)
    public String bag;

    @Column(name = "truck_gross_weight", length = 50)
    public String truckGrossWeight;

    @Column(name = "truck_tare_weight", length = 50)
    public String truckTareWeight;

    @Column(name = "truck_net_weight", length = 50)
    public String truckNetWeight;

    @Column(name = "stack_number", length = 50)
    public String stackNumber;

    @Column(name = "chamber_number", length = 50)
    public String chamberNumber;

    @Column(name = "avg_weight_per_bag", length = 50)
    public String avgWeightPerBag;

    @Column(name = "packing_size", length = 50)
    public String packingSize;

    @Column(name = "state", length = 50)
    public Integer state;

    @Column(name = "weighbridge_name", length = 50)
    public String weighbridgeName;

    @Column(name = "crop_year", length = 50)
    public String cropYear;

    @Column(name = "grn_number", length = 50)
    public String GRNNumber;

    @Column(name = "operator_id", length = 50)
    public String operatorId;

    @Column(name = "message", length = 50)
    public String message;

    @Column(name = "status_changed_on", length = 50)
    public String statusChangedOn;

    @Column(name = "society_name", length = 50)
    public String societyName;

    @Column(name = "sample_weight", length = 50)
    public String sampleWeight;

    @Column(name = "sample_weight_unit", length = 50)
    public String sampleWeightUnit;

    @Column(name = "variety", length = 50)
    public String varietyName;

    @Column(name = "remark", length = 255)
    public String remark;

    @Column(name = "state_admin", length = 50)
    public String stateAdmin;

    @Column(name = "accepted_bags", length = 50)
    public String acceptedBags;

    @Column(name = "rejected_bags", length = 50)
    public String rejectedBags;

    @Column(name = "is_valid", length = 50)
    public Boolean isValid;

    @Column(name = "is_image_url_valid", length = 50)
    public Boolean isImageUrlValid;

    @Column(name = "device_model_no", length = 50)
    public String deviceModelNo;

    @Column(name = "mode_of_scan", length = 50)
    public String modeOfScan;

    @Column(name = "bucket_name", length = 50)
    public String bucketName;

    @Column(name = "uuid", length = 50)
    public String uuid;

    @Column(name = "is_duplicate", length = 50)
    public Boolean isDuplicate;

    @Column(name = "vendor_name", length = 50)
    public String vendorName;

    @Column(name = "rejection_reason_ids", length = 50)
    public String rejectionReasonIds;

    @Column(name = "system_generated_timestamp", length = 50)
    public String systemGeneratedTimestamp;

    @Column(name = "inference_request_id", length = 50)
    public String inferenceRequestId;

    @Column(name = "migrated_scan_id", length = 50)
    public String migratedScanId;

    @Enumerated(EnumType.STRING)
    @Column(name = "assaying_type", length = 50)
    public AssayingTypeEnum assayingType;

    @Column(name = "farmer_address", length = 50)
    public String farmerAddress;

    @Column(name = "event_status", length = 50)
    public String eventStatus;

    @Column(name = "moisture_manual")
    public Double moistureManual;
    @Column(name = "moisture_visio_count")
    public Double moistureVisioCount;
    @Column(name = "moisture_visio_density")
    public Double moistureVisioDensity;

    @Column(name = "foreign_matter_manual")
    public Double foreignMatterManual;
    @Column(name = "foreign_matter_visio_count")
    public Double foreignMatterVisioCount;
    @Column(name = "foreign_matter_visio_density")
    public Double foreignMatterVisioDensity;

    @Column(name = "foreign_matter_organic_manual")
    public Double foreignMatterOrganicManual;
    @Column(name = "foreign_matter_organic_visio_count")
    public Double foreignMatterOrganicVisioCount;
    @Column(name = "foreign_matter_organic_visio_density")
    public Double foreignMatterOrganicVisioDensity;

    @Column(name = "admixture_manual")
    public Double admixtureManual;
    @Column(name = "admixture_visio_count")
    public Double admixtureVisioCount;
    @Column(name = "admixture_visio_density")
    public Double admixtureVisioDensity;

    @Column(name = "damaged_manual")
    public Double damagedManual;
    @Column(name = "damaged_visio_count")
    public Double damagedVisioCount;
    @Column(name = "damaged_visio_density")
    public Double damagedVisioDensity;

    @Column(name = "weevilled_manual")
    public Double weevilledManual;
    @Column(name = "weevilled_visio_count")
    public Double weevilledVisioCount;
    @Column(name = "weevilled_visio_density")
    public Double weevilledVisioDensity;

    @Column(name = "shrivelled_and_immature_manual")
    public Double shrivelledAndImmatureManual;
    @Column(name = "shrivelled_and_immature_visio_count")
    public Double shrivelledAndImmatureVisioCount;
    @Column(name = "shrivelled_and_immature_visio_density")
    public Double shrivelledAndImmatureVisioDensity;

    @Column(name = "slightly_damaged_manual")
    public Double slightlyDamagedManual;
    @Column(name = "slightly_damaged_visio_count")
    public Double slightlyDamagedVisioCount;
    @Column(name = "slightly_damaged_visio_density")
    public Double slightlyDamagedVisioDensity;

    @Column(name = "pods_of_other_variety_manual")
    public Double podsOfOtherVarietyManual;
    @Column(name = "pods_of_other_variety_visio_count")
    public Double podsOfOtherVarietyVisioCount;
    @Column(name = "pods_of_other_variety_visio_density")
    public Double podsOfOtherVarietyVisioDensity;

    @Column(name = "shelling_manual")
    public Double shellingManual;
    @Column(name = "shelling_visio_count")
    public Double shellingVisioCount;
    @Column(name = "shelling_visio_density")
    public Double shellingVisioDensity;

    @Column(name = "damaged_and_weevilled_manual")
    public Double damagedAndWeevilledManual;
    @Column(name = "damaged_and_weevilled_visio_count")
    public Double damagedAndWeevilledVisioCount;
    @Column(name = "damaged_and_weevilled_visio_density")
    public Double damagedAndWeevilledVisioDensity;

    @Column(name = "immature_manual")
    public Double immatureManual;
    @Column(name = "immature_visio_count")
    public Double immatureVisioCount;
    @Column(name = "immature_visio_density")
    public Double immatureVisioDensity;

    @Column(name = "other_food_grains_manual")
    public Double otherFoodGrainsManual;
    @Column(name = "other_food_grains_visio_count")
    public Double otherFoodGrainsVisioCount;
    @Column(name = "other_food_grains_visio_density")
    public Double otherFoodGrainsVisioDensity;

    @Column(name = "small_atrophied_seeds_manual")
    public Double smallAtrophiedSeedsManual;
    @Column(name = "small_atrophied_seeds_visio_count")
    public Double smallAtrophiedSeedsVisioCount;
    @Column(name = "small_atrophied_seeds_visio_density")
    public Double smallAtrophiedSeedsVisioDensity;

    @Column(name = "split_cracked_manual")
    public Double splitCrackedManual;
    @Column(name = "split_cracked_visio_count")
    public Double splitCrackedVisioCount;
    @Column(name = "split_cracked_visio_density")
    public Double splitCrackedVisioDensity;

    @Column(name = "black_tip_manual")
    public Double blackTipManual;
    @Column(name = "black_tip_visio_count")
    public Double blackTipVisioCount;
    @Column(name = "black_tip_visio_density")
    public Double blackTipVisioDensity;

    @Column(name = "broken_manual")
    public Double brokenManual;
    @Column(name = "broken_visio_count")
    public Double brokenVisioCount;
    @Column(name = "broken_visio_density")
    public Double brokenVisioDensity;

    @Column(name = "broken2manual")
    public Double broken2Manual;
    @Column(name = "broken2visio_count")
    public Double broken2VisioCount;
    @Column(name = "broken2visio_density")
    public Double broken2VisioDensity;

    @Column(name = "clean_manual")
    public Double cleanManual;
    @Column(name = "clean_visio_count")
    public Double cleanVisioCount;
    @Column(name = "clean_visio_density")
    public Double cleanVisioDensity;

    @Column(name = "grain_count_manual")
    public Double grainCountManual;
    @Column(name = "grain_count_visio_count")
    public Double grainCountVisioCount;
    @Column(name = "grain_count_visio_density")
    public Double grainCountVisioDensity;

    @Column(name = "aspect_ratio_manual")
    public Double aspectRatioManual;
    @Column(name = "aspect_ratio_visio_count")
    public Double aspectRatioVisioCount;
    @Column(name = "aspect_ratio_visio_density")
    public Double aspectRatioVisioDensity;

    @Column(name = "length_manual")
    public Double lengthManual;
    @Column(name = "length_visio_count")
    public Double lengthVisioCount;
    @Column(name = "length_visio_density")
    public Double lengthVisioDensity;

    @Column(name = "width_manual")
    public Double widthManual;
    @Column(name = "width_visio_count")
    public Double widthVisioCount;
    @Column(name = "width_visio_density")
    public Double widthVisioDensity;

    @Column(name = "karnal_bunt_manual")
    public Double karnalBuntManual;
    @Column(name = "karnal_bunt_visio_count")
    public Double karnalBuntVisioCount;
    @Column(name = "karnal_bunt_visio_density")
    public Double karnalBuntVisioDensity;

    @Column(name = "red_wheat_manual")
    public Double redWheatManual;
    @Column(name = "red_wheat_visio_count")
    public Double redWheatVisioCount;
    @Column(name = "red_wheat_visio_density")
    public Double redWheatVisioDensity;

    @Column(name = "fungus_manual")
    public Double fungusManual;
    @Column(name = "fungus_visio_count")
    public Double fungusVisioCount;
    @Column(name = "fungus_visio_density")
    public Double fungusVisioDensity;

    @Column(name = "fungus_damaged_manual")
    public Double fungusDamagedManual;
    @Column(name = "fungus_damaged_visio_count")
    public Double fungusDamagedVisioCount;
    @Column(name = "fungus_damaged_visio_density")
    public Double fungusDamagedVisioDensity;

    @Column(name = "white_fungus_manual")
    public Double whiteFungusManual;
    @Column(name = "white_fungus_visio_count")
    public Double whiteFungusVisioCount;
    @Column(name = "white_fungus_visio_density")
    public Double whiteFungusVisioDensity;

    @Column(name = "temperature_manual")
    public Double temperatureManual;
    @Column(name = "temperature_visio_count")
    public Double temperatureVisioCount;
    @Column(name = "temperature_visio_density")
    public Double temperatureVisioDensity;

    @Column(name = "moisture_weight_manual")
    public Double moistureWeightManual;
    @Column(name = "moisture_weight_visio_count")
    public Double moistureWeightVisioCount;
    @Column(name = "moisture_weight_visio_density")
    public Double moistureWeightVisioDensity;

    @Column(name = "black_manual")
    public Double blackManual;
    @Column(name = "black_visio_count")
    public Double blackVisioCount;
    @Column(name = "black_visio_density")
    public Double blackVisioDensity;

    @Column(name = "red_manual")
    public Double redManual;
    @Column(name = "red_visio_count")
    public Double redVisioCount;
    @Column(name = "red_visio_density")
    public Double redVisioDensity;

    @Column(name = "shrivelled_manual")
    public Double shrivelledManual;
    @Column(name = "shrivelled_visio_count")
    public Double shrivelledVisioCount;
    @Column(name = "shrivelled_visio_density")
    public Double shrivelledVisioDensity;

    @Column(name = "tcw_manual")
    public Double tcwManual;
    @Column(name = "tcw_visio_count")
    public Double tcwVisioCount;
    @Column(name = "tcw_visio_density")
    public Double tcwVisioDensity;

    @Column(name = "radius_manual")
    public Double radiusManual;
    @Column(name = "radius_visio_count")
    public Double radiusVisioCount;
    @Column(name = "radius_visio_density")
    public Double radiusVisioDensity;

    @Column(name = "green_manual")
    public Double greenManual;
    @Column(name = "green_visio_count")
    public Double greenVisioCount;
    @Column(name = "green_visio_density")
    public Double greenVisioDensity;

    @Column(name = "discolored_manual")
    public Double discoloredManual;
    @Column(name = "discolored_visio_count")
    public Double discoloredVisioCount;
    @Column(name = "discolored_visio_density")
    public Double discoloredVisioDensity;

    @Column(name = "starch_manual")
    public Double starchManual;
    @Column(name = "starch_visio_count")
    public Double starchVisioCount;
    @Column(name = "starch_visio_density")
    public Double starchVisioDensity;

    @Column(name = "flakes_manual")
    public Double flakesManual;
    @Column(name = "flakes_visio_count")
    public Double flakesVisioCount;
    @Column(name = "flakes_visio_density")
    public Double flakesVisioDensity;

    @Column(name = "husk_manual")
    public Double huskManual;
    @Column(name = "husk_visio_count")
    public Double huskVisioCount;
    @Column(name = "husk_visio_density")
    public Double huskVisioDensity;

    @Column(name = "water_damaged_manual")
    public Double waterDamagedManual;
    @Column(name = "water_damaged_visio_count")
    public Double waterDamagedVisioCount;
    @Column(name = "water_damaged_visio_density")
    public Double waterDamagedVisioDensity;

    @Column(name = "insect_damaged_matter_manual")
    public Double insectDamagedMatterManual;
    @Column(name = "insect_damaged_matter_visio_count")
    public Double insectDamagedMatterVisioCount;
    @Column(name = "insect_damaged_matter_visio_density")
    public Double insectDamagedMatterVisioDensity;

    @Column(name = "shrunken_manual")
    public Double shrunkenManual;
    @Column(name = "shrunken_visio_count")
    public Double shrunkenVisioCount;
    @Column(name = "shrunken_visio_density")
    public Double shrunkenVisioDensity;

    @Column(name = "split_and_thrips_capsules_manual")
    public Double splitAndThripsCapsulesManual;
    @Column(name = "split_and_thrips_capsules_visio_count")
    public Double splitAndThripsCapsulesVisioCount;
    @Column(name = "split_and_thrips_capsules_visio_density")
    public Double splitAndThripsCapsulesVisioDensity;

    @Column(name = "sprouted_weevilled_manual")
    public Double sproutedWeevilledManual;
    @Column(name = "sprouted_weevilled_visio_count")
    public Double sproutedWeevilledVisioCount;
    @Column(name = "sprouted_weevilled_visio_density")
    public Double sproutedWeevilledVisioDensity;

    @Column(name = "live_infestation_manual")
    public Double liveInfestationManual;
    @Column(name = "live_infestation_visio_count")
    public Double liveInfestationVisioCount;
    @Column(name = "live_infestation_visio_density")
    public Double liveInfestationVisioDensity;

    @Column(name = "molds_manual")
    public Double moldsManual;
    @Column(name = "molds_visio_count")
    public Double moldsVisioCount;
    @Column(name = "molds_visio_density")
    public Double moldsVisioDensity;

    @Column(name = "whitish_seeds_manual")
    public Double whitishSeedsManual;
    @Column(name = "whitish_seeds_visio_count")
    public Double whitishSeedsVisioCount;
    @Column(name = "whitish_seeds_visio_density")
    public Double whitishSeedsVisioDensity;

    @Column(name = "chalky_grain_manual")
    public Double chalkyGrainManual;
    @Column(name = "chalky_grain_visio_count")
    public Double chalkyGrainVisioCount;
    @Column(name = "chalky_grain_visio_density")
    public Double chalkyGrainVisioDensity;

    @Column(name = "empty_shell_manual")
    public Double emptyShellManual;
    @Column(name = "empty_shell_visio_count")
    public Double emptyShellVisioCount;
    @Column(name = "empty_shell_visio_density")
    public Double emptyShellVisioDensity;

    @Column(name = "hulling_recovery_manual")
    public Double hullingRecoveryManual;
    @Column(name = "hulling_recovery_visio_count")
    public Double hullingRecoveryVisioCount;
    @Column(name = "hulling_recovery_visio_density")
    public Double hullingRecoveryVisioDensity;

    @Column(name = "undehusked_splits_manual")
    public Double undehuskedSplitsManual;
    @Column(name = "undehusked_splits_visio_count")
    public Double undehuskedSplitsVisioCount;
    @Column(name = "undehusked_splits_visio_density")
    public Double undehuskedSplitsVisioDensity;

    @Column(name = "stone_manual")
    public Double stoneManual;
    @Column(name = "stone_visio_count")
    public Double stoneVisioCount;
    @Column(name = "stone_visio_density")
    public Double stoneVisioDensity;

    public void setField(String fieldName, Double value)
            throws NoSuchFieldException, IllegalAccessException {
        Field field = getClass().getDeclaredField(fieldName);
        field.set(this, value);
    }
}

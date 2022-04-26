package com.agnext.reporting.entity.report;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.cassandra.core.cql.Ordering;
import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;
import java.lang.reflect.Field;

@Setter
@Getter
@Table("report")
public class ScanReportEntity {

    @PrimaryKeyColumn(name = "scan_id",ordinal = 1,type = PrimaryKeyType.CLUSTERED,ordering = Ordering.ASCENDING)
    public Long scanId;

    @Column("farmer_code")
    public String farmerCode;

    @Column("location")
    public String location;

    @Column("lot_id")
    public String lotId;

    @Column("seal")
    public String seal;

    @Column("location_code")
    public String locationCode;

    @Column("farmer_name")
    public String farmerName;

    @Column("vendor_code")
    public String vendorCode;

    @Column("scan_type")
    public String scanType;

    @Column("f_id")
    public String fId;

    @Column("file_path")
    public String filePath;

    @Column("quantity")
    public String quantity;

    @Column("quantity_unit")
    public String quantityUnit;

    @Column("variety_id")
    public String varietyId;

    @Column("refernce_id")
    public String refernceId;

    @Column("installation_center_id")
    public String installatonCenterId;

    @PrimaryKeyColumn(name = "company_id",ordinal = 0,type = PrimaryKeyType.PARTITIONED)
    public String customerId;

    @Column("date_done")
    public String dateDone;

    @Column("device_serial_no")
    public String deviceSerialNo;

    @Column("farmer_id")
    public String farmerId;

    @Column("quality_score")
    public String qualityScore;

    @Column("user_id")
    public String userId;

    @Column("created_by")
    public String createdBy;

    @Column("file_name")
    public String fileName;

    @Column("vendor_id")
    public String vendorId;

    @Column("weight")
    public String weight;

    @Column("amount")
    public String amount;

    @Column("weight_amt")
    public String weightAmt;

    @Column("region_id")
    public String regionId;

    @Column("inst_center_type_Id")
    public String instCenterTypeId;

    @Column("commodity_variety_id")
    public String commodityVarietyId;

    @Column("commodity_category_id")
    public String commodityCategoryId;

    @Column("commodity_name")
    public String commodityName;

    @Column("grade")
    public String grade;

    @Column("device_type")
    public String deviceType;

    @Column("device_type_id")
    public String deviceTypeId;

    @Column("plot_id")
    public String plotId;

    @Column("accepted")
    public Integer accepted;

    @Column("variance")
    public String variance;

    @Column("created_date")
    public String createdDate;

    @Column("created_on_date")
    public String createdOnDate;

    @Column("created_on")
    public String createdOn;

    @Column("area_covered")
    public String areaCovered;

    @Column("sample_id")
    public String sampleId;

    @Column("surveyor_name")
    public String surveyorName;

    @Column("section_id")
    public String sectionId;

    @Column("bar_code")
    public String barCode;

    @Column("image_unique_id")
    public String imageUniqueId;

    @Column("approval")
    public Integer approval;

    @Column("density")
    public String density;

    @Column("airesult")
    public String airesult;

    @Column("truck_number")
    public String truckNumber;

    @Column("slip_no")
    public String slipNo;

    @Column("gate_pass")
    public String gatePass;

    @Column("cad_no")
    public String cadNo;

    @Column("bag")
    public String bag;

    @Column("truck_gross_weight")
    public String truckGrossWeight;

    @Column("truck_tare_weight")
    public String truckTareWeight;

    @Column("truck_net_weight")
    public String truckNetWeight;

    @Column("stack_number")
    public String stackNumber;

    @Column("chamber_number")
    public String chamberNumber;

    @Column("avg_weight_per_bag")
    public String avgWeightPerBag;

    @Column("packing_size")
    public String packingSize;

    @Column("state")
    public Integer state;

    @Column("weighbridge_name")
    public String weighbridgeName;

    @Column("crop_year")
    public String cropYear;

    @Column("grn_number")
    public String GRNNumber;

    @Column("operator_id")
    public String operatorId;

    @Column("message")
    public String message;

    @Column("status_changed_on")
    public String statusChangedOn;

    @Column("society_name")
    public String societyName;

    @Column("sample_weight")
    public String sampleWeight;

    @Column("sample_weight_unit")
    public String sampleWeightUnit;

    @Column("variety")
    public String varietyName;

    @Column("remark")
    public String remark;

    @Column("state_admin")
    public String stateAdmin;

    @Column("accepted_bags")
    public String acceptedBags;

    @Column("rejected_bags")
    public String rejectedBags;

    @Column("is_valid")
    public Boolean isValid;

    @Column("is_image_url_valid")
    public Boolean isImageUrlValid;

    @Column("device_model_no")
    public String deviceModelNo;

    @Column("mode_of_scan")
    public String modeOfScan;

    @Column("bucket_name")
    public String bucketName;

    @Column("uuid")
    public String uuid;

    @Column("is_duplicate")
    public Boolean isDuplicate;

    @Column("vendor_name")
    public String vendorName;

    @Column("rejection_reason_ids")
    public String rejectionReasonIds;

    @Column("system_generated_timestamp")
    public String systemGeneratedTimestamp;

    @Column("inference_request_id")
    public String inferenceRequestId;

    @Column("migrated_scan_id")
    public String migratedScanId;

    @Column("assaying_type")
    public String assayingType;

    @Column("farmer_address")
    public String farmerAddress;

    @Column("event_status")
    public String eventStatus;

    @Column("moisture_manual")
    public String moistureManual;
    @Column("moisture_visio_count")
    public String moistureVisioCount;
    @Column("moisture_visio_density")
    public String moistureVisioDensity;

    @Column("foreign_matter_manual")
    public String foreignMatterManual;
    @Column("foreign_matter_visio_count")
    public String foreignMatterVisioCount;
    @Column("foreign_matter_visio_density")
    public String foreignMatterVisioDensity;

    @Column("foreign_matter_organic_manual")
    public String foreignMatterOrganicManual;
    @Column("foreign_matter_organic_visio_count")
    public String foreignMatterOrganicVisioCount;
    @Column("foreign_matter_organic_visio_density")
    public String foreignMatterOrganicVisioDensity;

    @Column("admixture_manual")
    public String admixtureManual;
    @Column("admixture_visio_count")
    public String admixtureVisioCount;
    @Column("admixture_visio_density")
    public String admixtureVisioDensity;

    @Column("damaged_manual")
    public String damagedManual;
    @Column("damaged_visio_count")
    public String damagedVisioCount;
    @Column("damaged_visio_density")
    public String damagedVisioDensity;

    @Column("weevilled_manual")
    public String weevilledManual;
    @Column("weevilled_visio_count")
    public String weevilledVisioCount;
    @Column("weevilled_visio_density")
    public String weevilledVisioDensity;

    @Column("shrivelled_and_immature_manual")
    public String shrivelledAndImmatureManual;
    @Column("shrivelled_and_immature_visio_count")
    public String shrivelledAndImmatureVisioCount;
    @Column("shrivelled_and_immature_visio_density")
    public String shrivelledAndImmatureVisioDensity;

    @Column("slightly_damaged_manual")
    public String slightlyDamagedManual;
    @Column("slightly_damaged_visio_count")
    public String slightlyDamagedVisioCount;
    @Column("slightly_damaged_visio_density")
    public String slightlyDamagedVisioDensity;

    @Column("pods_of_other_variety_manual")
    public String podsOfOtherVarietyManual;
    @Column("pods_of_other_variety_visio_count")
    public String podsOfOtherVarietyVisioCount;
    @Column("pods_of_other_variety_visio_density")
    public String podsOfOtherVarietyVisioDensity;

    @Column("shelling_manual")
    public String shellingManual;
    @Column("shelling_visio_count")
    public String shellingVisioCount;
    @Column("shelling_visio_density")
    public String shellingVisioDensity;

    @Column("damaged_and_weevilled_manual")
    public String damagedAndWeevilledManual;
    @Column("damaged_and_weevilled_visio_count")
    public String damagedAndWeevilledVisioCount;
    @Column("damaged_and_weevilled_visio_density")
    public String damagedAndWeevilledVisioDensity;

    @Column("immature_manual")
    public String immatureManual;
    @Column("immature_visio_count")
    public String immatureVisioCount;
    @Column("immature_visio_density")
    public String immatureVisioDensity;

    @Column("other_food_grains_manual")
    public String otherFoodGrainsManual;
    @Column("other_food_grains_visio_count")
    public String otherFoodGrainsVisioCount;
    @Column("other_food_grains_visio_density")
    public String otherFoodGrainsVisioDensity;

    @Column("small_atrophied_seeds_manual")
    public String smallAtrophiedSeedsManual;
    @Column("small_atrophied_seeds_visio_count")
    public String smallAtrophiedSeedsVisioCount;
    @Column("small_atrophied_seeds_visio_density")
    public String smallAtrophiedSeedsVisioDensity;

    @Column("split_cracked_manual")
    public String splitCrackedManual;
    @Column("split_cracked_visio_count")
    public String splitCrackedVisioCount;
    @Column("split_cracked_visio_density")
    public String splitCrackedVisioDensity;

    @Column("black_tip_manual")
    public String blackTipManual;
    @Column("black_tip_visio_count")
    public String blackTipVisioCount;
    @Column("black_tip_visio_density")
    public String blackTipVisioDensity;

    @Column("broken_manual")
    public String brokenManual;
    @Column("broken_visio_count")
    public String brokenVisioCount;
    @Column("broken_visio_density")
    public String brokenVisioDensity;

    @Column("broken2manual")
    public String broken2Manual;
    @Column("broken2visio_count")
    public String broken2VisioCount;
    @Column("broken2visio_density")
    public String broken2VisioDensity;

    @Column("clean_manual")
    public String cleanManual;
    @Column("clean_visio_count")
    public String cleanVisioCount;
    @Column("clean_visio_density")
    public String cleanVisioDensity;

    @Column("grain_count_manual")
    public String grainCountManual;
    @Column("grain_count_visio_count")
    public String grainCountVisioCount;
    @Column("grain_count_visio_density")
    public String grainCountVisioDensity;

    @Column("aspect_ratio_manual")
    public String aspectRatioManual;
    @Column("aspect_ratio_visio_count")
    public String aspectRatioVisioCount;
    @Column("aspect_ratio_visio_density")
    public String aspectRatioVisioDensity;

    @Column("length_manual")
    public String lengthManual;
    @Column("length_visio_count")
    public String lengthVisioCount;
    @Column("length_visio_density")
    public String lengthVisioDensity;

    @Column("width_manual")
    public String widthManual;
    @Column("width_visio_count")
    public String widthVisioCount;
    @Column("width_visio_density")
    public String widthVisioDensity;

    @Column("karnal_bunt_manual")
    public String karnalBuntManual;
    @Column("karnal_bunt_visio_count")
    public String karnalBuntVisioCount;
    @Column("karnal_bunt_visio_density")
    public String karnalBuntVisioDensity;

    @Column("red_wheat_manual")
    public String redWheatManual;
    @Column("red_wheat_visio_count")
    public String redWheatVisioCount;
    @Column("red_wheat_visio_density")
    public String redWheatVisioDensity;

    @Column("fungus_manual")
    public String fungusManual;
    @Column("fungus_visio_count")
    public String fungusVisioCount;
    @Column("fungus_visio_density")
    public String fungusVisioDensity;

    @Column("fungus_damaged_manual")
    public String fungusDamagedManual;
    @Column("fungus_damaged_visio_count")
    public String fungusDamagedVisioCount;
    @Column("fungus_damaged_visio_density")
    public String fungusDamagedVisioDensity;

    @Column("white_fungus_manual")
    public String whiteFungusManual;
    @Column("white_fungus_visio_count")
    public String whiteFungusVisioCount;
    @Column("white_fungus_visio_density")
    public String whiteFungusVisioDensity;

    @Column("temperature_manual")
    public String temperatureManual;
    @Column("temperature_visio_count")
    public String temperatureVisioCount;
    @Column("temperature_visio_density")
    public String temperatureVisioDensity;

    @Column("moisture_weight_manual")
    public String moistureWeightManual;
    @Column("moisture_weight_visio_count")
    public String moistureWeightVisioCount;
    @Column("moisture_weight_visio_density")
    public String moistureWeightVisioDensity;

    @Column("black_manual")
    public String blackManual;
    @Column("black_visio_count")
    public String blackVisioCount;
    @Column("black_visio_density")
    public String blackVisioDensity;

    @Column("red_manual")
    public String redManual;
    @Column("red_visio_count")
    public String redVisioCount;
    @Column("red_visio_density")
    public String redVisioDensity;

    @Column("shrivelled_manual")
    public String shrivelledManual;
    @Column("shrivelled_visio_count")
    public String shrivelledVisioCount;
    @Column("shrivelled_visio_density")
    public String shrivelledVisioDensity;

    @Column("tcw_manual")
    public String tcwManual;
    @Column("tcw_visio_count")
    public String tcwVisioCount;
    @Column("tcw_visio_density")
    public String tcwVisioDensity;

    @Column("radius_manual")
    public String radiusManual;
    @Column("radius_visio_count")
    public String radiusVisioCount;
    @Column("radius_visio_density")
    public String radiusVisioDensity;

    @Column("green_manual")
    public String greenManual;
    @Column("green_visio_count")
    public String greenVisioCount;
    @Column("green_visio_density")
    public String greenVisioDensity;

    @Column("discolored_manual")
    public String discoloredManual;
    @Column("discolored_visio_count")
    public String discoloredVisioCount;
    @Column("discolored_visio_density")
    public String discoloredVisioDensity;

    @Column("starch_manual")
    public String starchManual;
    @Column("starch_visio_count")
    public String starchVisioCount;
    @Column("starch_visio_density")
    public String starchVisioDensity;

    @Column("flakes_manual")
    public String flakesManual;
    @Column("flakes_visio_count")
    public String flakesVisioCount;
    @Column("flakes_visio_density")
    public String flakesVisioDensity;

    @Column("husk_manual")
    public String huskManual;
    @Column("husk_visio_count")
    public String huskVisioCount;
    @Column("husk_visio_density")
    public String huskVisioDensity;

    @Column("water_damaged_manual")
    public String waterDamagedManual;
    @Column("water_damaged_visio_count")
    public String waterDamagedVisioCount;
    @Column("water_damaged_visio_density")
    public String waterDamagedVisioDensity;

    @Column("insect_damaged_matter_manual")
    public String insectDamagedMatterManual;
    @Column("insect_damaged_matter_visio_count")
    public String insectDamagedMatterVisioCount;
    @Column("insect_damaged_matter_visio_density")
    public String insectDamagedMatterVisioDensity;

    @Column("shrunken_manual")
    public String shrunkenManual;
    @Column("shrunken_visio_count")
    public String shrunkenVisioCount;
    @Column("shrunken_visio_density")
    public String shrunkenVisioDensity;

    @Column("split_and_thrips_capsules_manual")
    public String splitAndThripsCapsulesManual;
    @Column("split_and_thrips_capsules_visio_count")
    public String splitAndThripsCapsulesVisioCount;
    @Column("split_and_thrips_capsules_visio_density")
    public String splitAndThripsCapsulesVisioDensity;

    @Column("sprouted_weevilled_manual")
    public String sproutedWeevilledManual;
    @Column("sprouted_weevilled_visio_count")
    public String sproutedWeevilledVisioCount;
    @Column("sprouted_weevilled_visio_density")
    public String sproutedWeevilledVisioDensity;

    @Column("live_infestation_manual")
    public String liveInfestationManual;
    @Column("live_infestation_visio_count")
    public String liveInfestationVisioCount;
    @Column("live_infestation_visio_density")
    public String liveInfestationVisioDensity;

    @Column("molds_manual")
    public String moldsManual;
    @Column("molds_visio_count")
    public String moldsVisioCount;
    @Column("molds_visio_density")
    public String moldsVisioDensity;

    @Column("whitish_seeds_manual")
    public String whitishSeedsManual;
    @Column("whitish_seeds_visio_count")
    public String whitishSeedsVisioCount;
    @Column("whitish_seeds_visio_density")
    public String whitishSeedsVisioDensity;

    @Column("chalky_grain_manual")
    public String chalkyGrainManual;
    @Column("chalky_grain_visio_count")
    public String chalkyGrainVisioCount;
    @Column("chalky_grain_visio_density")
    public String chalkyGrainVisioDensity;

    @Column("empty_shell_manual")
    public String emptyShellManual;
    @Column("empty_shell_visio_count")
    public String emptyShellVisioCount;
    @Column("empty_shell_visio_density")
    public String emptyShellVisioDensity;

    @Column("hulling_recovery_manual")
    public String hullingRecoveryManual;
    @Column("hulling_recovery_visio_count")
    public String hullingRecoveryVisioCount;
    @Column("hulling_recovery_visio_density")
    public String hullingRecoveryVisioDensity;

    @Column("undehusked_splits_manual")
    public String undehuskedSplitsManual;
    @Column("undehusked_splits_visio_count")
    public String undehuskedSplitsVisioCount;
    @Column("undehusked_splits_visio_density")
    public String undehuskedSplitsVisioDensity;

    @Column("stone_manual")
    public String stoneManual;
    @Column("stone_visio_count")
    public String stoneVisioCount;
    @Column("stone_visio_density")
    public String stoneVisioDensity;

    public void setField(String fieldName, String value)
            throws NoSuchFieldException, IllegalAccessException {
        Field field = getClass().getDeclaredField(fieldName);
        field.set(this, value);
    }


}



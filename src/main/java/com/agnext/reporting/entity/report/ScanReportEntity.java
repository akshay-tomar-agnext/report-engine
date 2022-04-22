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
@Table("scan_report")
public class ScanReportEntity {

    @PrimaryKeyColumn(name = "scan_id",type = PrimaryKeyType.PARTITIONED)
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

    @Column("company_id")
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
    public Double moistureManual;
    @Column("moisture_visio_count")
    public Double moistureVisioCount;
    @Column("moisture_visio_density")
    public Double moistureVisioDensity;

    @Column("foreign_matter_manual")
    public Double foreignMatterManual;
    @Column("foreign_matter_visio_count")
    public Double foreignMatterVisioCount;
    @Column("foreign_matter_visio_density")
    public Double foreignMatterVisioDensity;

    @Column("foreign_matter_organic_manual")
    public Double foreignMatterOrganicManual;
    @Column("foreign_matter_organic_visio_count")
    public Double foreignMatterOrganicVisioCount;
    @Column("foreign_matter_organic_visio_density")
    public Double foreignMatterOrganicVisioDensity;

    @Column("admixture_manual")
    public Double admixtureManual;
    @Column("admixture_visio_count")
    public Double admixtureVisioCount;
    @Column("admixture_visio_density")
    public Double admixtureVisioDensity;

    @Column("damaged_manual")
    public Double damagedManual;
    @Column("damaged_visio_count")
    public Double damagedVisioCount;
    @Column("damaged_visio_density")
    public Double damagedVisioDensity;

    @Column("weevilled_manual")
    public Double weevilledManual;
    @Column("weevilled_visio_count")
    public Double weevilledVisioCount;
    @Column("weevilled_visio_density")
    public Double weevilledVisioDensity;

    @Column("shrivelled_and_immature_manual")
    public Double shrivelledAndImmatureManual;
    @Column("shrivelled_and_immature_visio_count")
    public Double shrivelledAndImmatureVisioCount;
    @Column("shrivelled_and_immature_visio_density")
    public Double shrivelledAndImmatureVisioDensity;

    @Column("slightly_damaged_manual")
    public Double slightlyDamagedManual;
    @Column("slightly_damaged_visio_count")
    public Double slightlyDamagedVisioCount;
    @Column("slightly_damaged_visio_density")
    public Double slightlyDamagedVisioDensity;

    @Column("pods_of_other_variety_manual")
    public Double podsOfOtherVarietyManual;
    @Column("pods_of_other_variety_visio_count")
    public Double podsOfOtherVarietyVisioCount;
    @Column("pods_of_other_variety_visio_density")
    public Double podsOfOtherVarietyVisioDensity;

    @Column("shelling_manual")
    public Double shellingManual;
    @Column("shelling_visio_count")
    public Double shellingVisioCount;
    @Column("shelling_visio_density")
    public Double shellingVisioDensity;

    @Column("damaged_and_weevilled_manual")
    public Double damagedAndWeevilledManual;
    @Column("damaged_and_weevilled_visio_count")
    public Double damagedAndWeevilledVisioCount;
    @Column("damaged_and_weevilled_visio_density")
    public Double damagedAndWeevilledVisioDensity;

    @Column("immature_manual")
    public Double immatureManual;
    @Column("immature_visio_count")
    public Double immatureVisioCount;
    @Column("immature_visio_density")
    public Double immatureVisioDensity;

    @Column("other_food_grains_manual")
    public Double otherFoodGrainsManual;
    @Column("other_food_grains_visio_count")
    public Double otherFoodGrainsVisioCount;
    @Column("other_food_grains_visio_density")
    public Double otherFoodGrainsVisioDensity;

    @Column("small_atrophied_seeds_manual")
    public Double smallAtrophiedSeedsManual;
    @Column("small_atrophied_seeds_visio_count")
    public Double smallAtrophiedSeedsVisioCount;
    @Column("small_atrophied_seeds_visio_density")
    public Double smallAtrophiedSeedsVisioDensity;

    @Column("split_cracked_manual")
    public Double splitCrackedManual;
    @Column("split_cracked_visio_count")
    public Double splitCrackedVisioCount;
    @Column("split_cracked_visio_density")
    public Double splitCrackedVisioDensity;

    @Column("black_tip_manual")
    public Double blackTipManual;
    @Column("black_tip_visio_count")
    public Double blackTipVisioCount;
    @Column("black_tip_visio_density")
    public Double blackTipVisioDensity;

    @Column("broken_manual")
    public Double brokenManual;
    @Column("broken_visio_count")
    public Double brokenVisioCount;
    @Column("broken_visio_density")
    public Double brokenVisioDensity;

    @Column("broken2manual")
    public Double broken2Manual;
    @Column("broken2visio_count")
    public Double broken2VisioCount;
    @Column("broken2visio_density")
    public Double broken2VisioDensity;

    @Column("clean_manual")
    public Double cleanManual;
    @Column("clean_visio_count")
    public Double cleanVisioCount;
    @Column("clean_visio_density")
    public Double cleanVisioDensity;

    @Column("grain_count_manual")
    public Double grainCountManual;
    @Column("grain_count_visio_count")
    public Double grainCountVisioCount;
    @Column("grain_count_visio_density")
    public Double grainCountVisioDensity;

    @Column("aspect_ratio_manual")
    public Double aspectRatioManual;
    @Column("aspect_ratio_visio_count")
    public Double aspectRatioVisioCount;
    @Column("aspect_ratio_visio_density")
    public Double aspectRatioVisioDensity;

    @Column("length_manual")
    public Double lengthManual;
    @Column("length_visio_count")
    public Double lengthVisioCount;
    @Column("length_visio_density")
    public Double lengthVisioDensity;

    @Column("width_manual")
    public Double widthManual;
    @Column("width_visio_count")
    public Double widthVisioCount;
    @Column("width_visio_density")
    public Double widthVisioDensity;

    @Column("karnal_bunt_manual")
    public Double karnalBuntManual;
    @Column("karnal_bunt_visio_count")
    public Double karnalBuntVisioCount;
    @Column("karnal_bunt_visio_density")
    public Double karnalBuntVisioDensity;

    @Column("red_wheat_manual")
    public Double redWheatManual;
    @Column("red_wheat_visio_count")
    public Double redWheatVisioCount;
    @Column("red_wheat_visio_density")
    public Double redWheatVisioDensity;

    @Column("fungus_manual")
    public Double fungusManual;
    @Column("fungus_visio_count")
    public Double fungusVisioCount;
    @Column("fungus_visio_density")
    public Double fungusVisioDensity;

    @Column("fungus_damaged_manual")
    public Double fungusDamagedManual;
    @Column("fungus_damaged_visio_count")
    public Double fungusDamagedVisioCount;
    @Column("fungus_damaged_visio_density")
    public Double fungusDamagedVisioDensity;

    @Column("white_fungus_manual")
    public Double whiteFungusManual;
    @Column("white_fungus_visio_count")
    public Double whiteFungusVisioCount;
    @Column("white_fungus_visio_density")
    public Double whiteFungusVisioDensity;

    @Column("temperature_manual")
    public Double temperatureManual;
    @Column("temperature_visio_count")
    public Double temperatureVisioCount;
    @Column("temperature_visio_density")
    public Double temperatureVisioDensity;

    @Column("moisture_weight_manual")
    public Double moistureWeightManual;
    @Column("moisture_weight_visio_count")
    public Double moistureWeightVisioCount;
    @Column("moisture_weight_visio_density")
    public Double moistureWeightVisioDensity;

    @Column("black_manual")
    public Double blackManual;
    @Column("black_visio_count")
    public Double blackVisioCount;
    @Column("black_visio_density")
    public Double blackVisioDensity;

    @Column("red_manual")
    public Double redManual;
    @Column("red_visio_count")
    public Double redVisioCount;
    @Column("red_visio_density")
    public Double redVisioDensity;

    @Column("shrivelled_manual")
    public Double shrivelledManual;
    @Column("shrivelled_visio_count")
    public Double shrivelledVisioCount;
    @Column("shrivelled_visio_density")
    public Double shrivelledVisioDensity;

    @Column("tcw_manual")
    public Double tcwManual;
    @Column("tcw_visio_count")
    public Double tcwVisioCount;
    @Column("tcw_visio_density")
    public Double tcwVisioDensity;

    @Column("radius_manual")
    public Double radiusManual;
    @Column("radius_visio_count")
    public Double radiusVisioCount;
    @Column("radius_visio_density")
    public Double radiusVisioDensity;

    @Column("green_manual")
    public Double greenManual;
    @Column("green_visio_count")
    public Double greenVisioCount;
    @Column("green_visio_density")
    public Double greenVisioDensity;

    @Column("discolored_manual")
    public Double discoloredManual;
    @Column("discolored_visio_count")
    public Double discoloredVisioCount;
    @Column("discolored_visio_density")
    public Double discoloredVisioDensity;

    @Column("starch_manual")
    public Double starchManual;
    @Column("starch_visio_count")
    public Double starchVisioCount;
    @Column("starch_visio_density")
    public Double starchVisioDensity;

    @Column("flakes_manual")
    public Double flakesManual;
    @Column("flakes_visio_count")
    public Double flakesVisioCount;
    @Column("flakes_visio_density")
    public Double flakesVisioDensity;

    @Column("husk_manual")
    public Double huskManual;
    @Column("husk_visio_count")
    public Double huskVisioCount;
    @Column("husk_visio_density")
    public Double huskVisioDensity;

    @Column("water_damaged_manual")
    public Double waterDamagedManual;
    @Column("water_damaged_visio_count")
    public Double waterDamagedVisioCount;
    @Column("water_damaged_visio_density")
    public Double waterDamagedVisioDensity;

    @Column("insect_damaged_matter_manual")
    public Double insectDamagedMatterManual;
    @Column("insect_damaged_matter_visio_count")
    public Double insectDamagedMatterVisioCount;
    @Column("insect_damaged_matter_visio_density")
    public Double insectDamagedMatterVisioDensity;

    @Column("shrunken_manual")
    public Double shrunkenManual;
    @Column("shrunken_visio_count")
    public Double shrunkenVisioCount;
    @Column("shrunken_visio_density")
    public Double shrunkenVisioDensity;

    @Column("split_and_thrips_capsules_manual")
    public Double splitAndThripsCapsulesManual;
    @Column("split_and_thrips_capsules_visio_count")
    public Double splitAndThripsCapsulesVisioCount;
    @Column("split_and_thrips_capsules_visio_density")
    public Double splitAndThripsCapsulesVisioDensity;

    @Column("sprouted_weevilled_manual")
    public Double sproutedWeevilledManual;
    @Column("sprouted_weevilled_visio_count")
    public Double sproutedWeevilledVisioCount;
    @Column("sprouted_weevilled_visio_density")
    public Double sproutedWeevilledVisioDensity;

    @Column("live_infestation_manual")
    public Double liveInfestationManual;
    @Column("live_infestation_visio_count")
    public Double liveInfestationVisioCount;
    @Column("live_infestation_visio_density")
    public Double liveInfestationVisioDensity;

    @Column("molds_manual")
    public Double moldsManual;
    @Column("molds_visio_count")
    public Double moldsVisioCount;
    @Column("molds_visio_density")
    public Double moldsVisioDensity;

    @Column("whitish_seeds_manual")
    public Double whitishSeedsManual;
    @Column("whitish_seeds_visio_count")
    public Double whitishSeedsVisioCount;
    @Column("whitish_seeds_visio_density")
    public Double whitishSeedsVisioDensity;

    @Column("chalky_grain_manual")
    public Double chalkyGrainManual;
    @Column("chalky_grain_visio_count")
    public Double chalkyGrainVisioCount;
    @Column("chalky_grain_visio_density")
    public Double chalkyGrainVisioDensity;

    @Column("empty_shell_manual")
    public Double emptyShellManual;
    @Column("empty_shell_visio_count")
    public Double emptyShellVisioCount;
    @Column("empty_shell_visio_density")
    public Double emptyShellVisioDensity;

    @Column("hulling_recovery_manual")
    public Double hullingRecoveryManual;
    @Column("hulling_recovery_visio_count")
    public Double hullingRecoveryVisioCount;
    @Column("hulling_recovery_visio_density")
    public Double hullingRecoveryVisioDensity;

    @Column("undehusked_splits_manual")
    public Double undehuskedSplitsManual;
    @Column("undehusked_splits_visio_count")
    public Double undehuskedSplitsVisioCount;
    @Column("undehusked_splits_visio_density")
    public Double undehuskedSplitsVisioDensity;

    @Column("stone_manual")
    public Double stoneManual;
    @Column("stone_visio_count")
    public Double stoneVisioCount;
    @Column("stone_visio_density")
    public Double stoneVisioDensity;

    public void setField(String fieldName, Double value)
            throws NoSuchFieldException, IllegalAccessException {
        Field field = getClass().getDeclaredField(fieldName);
        field.set(this, value);
    }


}



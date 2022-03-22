package com.agnext.reporting.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ScanModel {

    @JsonProperty("id")
    private Long scanId;

    @JsonProperty("batch_id")
    private String batchId;

    @JsonProperty("commodity_id")
    private String commodityId;

    @JsonProperty("created_on")
    private String createdOn;

    @JsonProperty("farmer_code")
    private String farmerCode;

    @JsonProperty("location")
    private String location;

    @JsonProperty("lot_id")
    private String lotId;

    @JsonProperty("seal")
    private String seal;

    @JsonProperty("location_code")
    private String locationCode;

    @JsonProperty("farmer_name")
    private String farmerName;

    @JsonProperty("vendor_code")
    private String vendorCode;

    @JsonProperty("scan_type")
    private String scanType;

    @JsonProperty("f_id")
    private String fId;

    @JsonProperty("file_path")
    private String filePath;

    @JsonProperty("quantity")
    private String quantity;

    @JsonProperty("quantity_unit")
    private String quantityUnit;

    @JsonProperty("variety_id")
    private String varietyId;

    @JsonProperty("refernce_id")
    private String refernceId;

    @JsonProperty("installation_center_id")
    private String installatonCenterId;

    @JsonProperty("company_id")
    private String customerId;

    @JsonProperty("date_done")
    private String dateDone;

    @JsonProperty("device_serial_no")
    private String deviceSerialNo;

    @JsonProperty("farmer_id")
    private String farmerId;

    @JsonProperty("quality_score")
    private String qualityScore;

    @JsonProperty("user_id")
    private String userId;

    @JsonProperty("created_by")
    private String createdBy;

    @JsonProperty("file_name")
    private String fileName;

    @JsonProperty("vendor_id")
    private String vendorId;

    @JsonProperty("weight")
    private String weight;

    @JsonProperty("amount")
    private String amount;

    @JsonProperty("weight_amt")
    private String weightAmt;

    @JsonProperty("region_id")
    private String regionId;

    @JsonProperty("inst_center_type_Id")
    private String instCenterTypeId;

    @JsonProperty("commodity_variety_id")
    private String commodityVarietyId;

    @JsonProperty("commodity_category_id")
    private String commodityCategoryId;

    @JsonProperty("commodity_name")
    private String commodityName;

    @JsonProperty("grade")
    private String grade;

    @JsonProperty("device_type")
    private String deviceType;

    @JsonProperty("device_type_id")
    private String deviceTypeId;

    @JsonProperty("plot_id")
    private String plotId;

    @JsonProperty("accepted")
    private Integer accepted;

    @JsonProperty("variance")
    private String variance;

    @JsonProperty("created_date")
    private String createdDate;

    @JsonProperty("created_on_date")
    private String createdOnDate;

    @JsonProperty("area_covered")
    private String areaCovered;

    @JsonProperty("sample_id")
    private String sampleId;

    @JsonProperty("surveyor_name")
    private String surveyorName;

    @JsonProperty("section_id")
    private String sectionId;

    @JsonProperty("bar_code")
    private String barCode;

    @JsonProperty("image_unique_id")
    private String imageUniqueId;

    @JsonProperty("approval")
    private Integer approval;

    @JsonProperty("density")
    private String density;

    @JsonProperty("airesult")
    private String airesult;

    @JsonProperty("truck_number")
    private String truckNumber;

    @JsonProperty("slip_no")
    private String slipNo;

    @JsonProperty("gate_pass")
    private String gatePass;

    @JsonProperty("cad_no")
    private String cadNo;

    @JsonProperty("bag")
    private String bag;

    @JsonProperty("truck_gross_weight")
    private String truckGrossWeight;

    @JsonProperty("truck_tare_weight")
    private String truckTareWeight;

    @JsonProperty("truck_net_weight")
    private String truckNetWeight;

    @JsonProperty("stack_number")
    private String stackNumber;

    @JsonProperty("chamber_number")
    private String chamberNumber;

    @JsonProperty("avg_weight_per_bag")
    private String avgWeightPerBag;

    @JsonProperty("packing_size")
    private String packingSize;

    @JsonProperty("state")
    private Integer state;

    @JsonProperty("weighbridge_name")
    private String weighbridgeName;

    @JsonProperty("crop_year")
    private String cropYear;

    @JsonProperty("grn_number")
    private String GRNNumber;

    @JsonProperty("operator_id")
    private String operatorId;

    @JsonProperty("message")
    private String message;

    @JsonProperty("status_changed_on")
    private String statusChangedOn;

    @JsonProperty("society_name")
    private String societyName;

    @JsonProperty("sample_weight")
    private String sampleWeight;

    @JsonProperty("sample_weight_unit")
    private String sampleWeightUnit;

    @JsonProperty("variety")
    private String varietyName;

    @JsonProperty("remark")
    private String remark;

    @JsonProperty("state_admin")
    private String stateAdmin;

    @JsonProperty("accepted_bags")
    private String acceptedBags;

    @JsonProperty("rejected_bags")
    private String rejectedBags;

    @JsonProperty("is_valid")
    private Boolean isValid;

    @JsonProperty("is_image_url_valid")
    private Boolean isImageUrlValid;

    @JsonProperty("device_model_no")
    private String deviceModelNo;

    @JsonProperty("mode_of_scan")
    private String modeOfScan;

    @JsonProperty("bucket_name")
    private String bucketName;

    @JsonProperty("uuid")
    private String uuid;

    @JsonProperty("is_duplicate")
    private Boolean isDuplicate;

    @JsonProperty("vendor_name")
    private String vendorName;

    @JsonProperty("rejection_reason_ids")
    private String rejectionReasonIds;

    @JsonProperty("system_generated_timestamp")
    private String systemGeneratedTimestamp;

    @JsonProperty("inference_request_id")
    private String inferenceRequestId;

    @JsonProperty("migrated_scan_id")
    private String migratedScanId;

    @JsonProperty("assaying_type")
    private String assayingType;

    @JsonProperty("farmer_address")
    private String farmerAddress;

    @JsonProperty("event_status")
    private String eventStatus;
}

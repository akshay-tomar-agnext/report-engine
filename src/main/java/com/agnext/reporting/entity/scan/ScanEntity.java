package com.agnext.reporting.entity.scan;

import com.agnext.reporting.enums.AssayingTypeEnum;
import com.agnext.reporting.enums.ScanEventStatus;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "scm_scans")
public class ScanEntity {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "batch_id")
    private String batchId;

    @Column(name = "commodity_id")
    private String commodityId;

    @Column(name = "created_on")
    private String createdOn;

    @Column(name = "farmer_code")
    private String farmerCode;

    @Column(name = "location")
    private String location;

    @Column(name = "lot_id")
    private String lotId;

    @Column(name = "seal")
    private String seal;

    @Column(name = "location_code")
    private String locationCode;

    @Column(name = "farmer_name")
    private String farmerName;

    @Column(name = "vendor_code")
    private String vendorCode;

    @Column(name = "scan_type")
    private String scanType;

    @Column(name = "f_id")
    private String fId;

    @Column(name = "file_path")
    private String filePath;

    @Column(name = "quantity")
    private BigDecimal quantity;

    @Column(name = "quantity_unit")
    private String quantityUnit;

    @Column(name = "variety_id")
    private Long varietyId;

    @Column(name = "refernce_id")
    private String refernceId;

    @Column(name = "installation_center_id")
    private Long installatonCenterId;

    @Column(name = "company_id")
    private Long customerId;

    @Column(name = "date_done")
    private Long dateDone;

    @Column(name = "device_serial_no")
    private String deviceSerialNo;

    @Column(name = "farmer_id")
    private Long farmerId;

    @Column(name = "quality_score")
    private BigDecimal qualityScore;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "created_by")
    private Long createdBy;

    @Column(name = "file_name")
    private String fileName;

    @Column(name = "vendor_id")
    private Long vendorId;

    @Column(name = "weight")
    private BigDecimal weight;

    @Column(name = "amount")
    private BigDecimal amount;

    @Column(name = "weight_amt")
    private BigDecimal weightAmt;

    @Column(name = "region_id")
    private Long regionId;

    @Column(name = "inst_center_type_Id")
    private Long instCenterTypeId;

    @Column(name = "commodity_variety_id")
    private Long commodityVarietyId;

    @Column(name = "commodity_category_id")
    private Long commodityCategoryId;

    @Column(name = "commodity_name")
    private String commodityName;

    @Column(name = "grade")
    private String grade;

    @Column(name = "device_type")
    private String deviceType;

    @Column(name = "device_type_id")
    private Long deviceTypeId;

    @Column(name = "plot_id")
    private Long plotId;

    @Column(name = "accepted")
    private Integer accepted;

    @Column(name = "variance")
    private Long variance;

    @Column(name = "created_date")
    private BigDecimal createdDate;

    @Column(name = "created_on_date")
    private Date createdOnDate;

    @Column(name = "area_covered")
    private BigDecimal areaCovered;

    @Column(name = "sample_id")
    private String sampleId;

    @Column(name = "surveyor_name")
    private String surveyorName;

    @Column(name = "section_id")
    private Long sectionId;

    @Column(name = "bar_code")
    private String barCode;

    @Column(name = "image_unique_id")
    private String imageUniqueId;

    @Column(name = "approval")
    private Integer approval;

    @Column(name = "density")
    private String density;

    @Column(name = "airesult")
    private String airesult;

    @Column(name = "truck_number")
    private String truckNumber;

    @Column(name = "slip_no")
    private String slipNo;

    @Column(name = "gate_pass")
    private String gatePass;

    @Column(name = "cad_no")
    private String cadNo;

    @Column(name = "bag")
    private String bag;

    @Column(name = "truck_gross_weight")
    private String truckGrossWeight;

    @Column(name = "truck_tare_weight")
    private String truckTareWeight;

    @Column(name = "truck_net_weight")
    private String truckNetWeight;

    @Column(name = "stack_number")
    private String stackNumber;

    @Column(name = "chamber_number")
    private String chamberNumber;

    @Column(name = "avg_weight_per_bag")
    private String avgWeightPerBag;

    @Column(name = "packing_size")
    private String packingSize;

    @Column(name = "state")
    private Integer state;

    @Column(name = "weighbridge_name")
    private String weighbridgeName;

    @Column(name = "crop_year")
    private String cropYear;

    @Column(name = "grn_number")
    private String GRNNumber;

    @Column(name = "operator_id")
    private Long operatorId;

    @Column(name = "message")
    private String message;

    @Column(name = "status_changed_on")
    private LocalDateTime statusChangedOn;

    @Column(name = "society_name")
    private String societyName;

    @Column(name = "sample_weight")
    private BigDecimal sampleWeight;

    @Column(name = "sample_weight_unit")
    private String sampleWeightUnit;

    @Column(name = "variety")
    private String varietyName;

    @Column(name = "remark")
    private String remark;

    @Column(name = "state_admin")
    private Long stateAdmin;

    @Column(name = "accepted_bags")
    private String acceptedBags;

    @Column(name = "rejected_bags")
    private String rejectedBags;

    @Column(name = "is_valid")
    private Boolean isValid;

    @Column(name = "is_image_url_valid")
    private Boolean isImageUrlValid;

    @Column(name = "device_model_no")
    private String deviceModelNo;

    @Column(name = "mode_of_scan")
    private String modeOfScan;

    @Column(name = "bucket_name")
    private String bucketName;

    @Column(name = "uuid")
    private String uuid;

    @Column(name = "is_duplicate")
    private Boolean isDuplicate;

    @Column(name = "vendor_name")
    private String vendorName;

    @Column(name = "rejection_reason_ids")
    private String rejectionReasonIds;

    @Column(name = "system_generated_timestamp")
    private Long systemGeneratedTimestamp;

    @Column(name = "inference_request_id")
    private String inferenceRequestId;

    @Column(name = "migrated_scan_id")
    private String migratedScanId;

    @Enumerated(EnumType.STRING)
    @Column(name = "assaying_type")
    private AssayingTypeEnum assayingTypeEnum;

    @Column(name = "farmer_address")
    private String farmerAddress;

    @Column(name = "event_status")
    private String eventStatus = ScanEventStatus.NOT_SENT.name();
}

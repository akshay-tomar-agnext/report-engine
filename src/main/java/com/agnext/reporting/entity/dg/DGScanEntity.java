package com.agnext.reporting.entity.dg;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "scm_scans")
public class DGScanEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "batch_id")
    private String batchId;

    @Column(name = "commodity_id")
    private Long commodityId;

    @Column(name = "created_on")
    private Long createdOn;

    @Column(name = "farmer_code")
    private String farmerCode;

    @Column(name = "location")
    private String location;

    @Column(name = "lot_id")
    private String lotId;

    @Column(name = "scan_by_user_code")
    private String scanByUserCode;

    @Column(name = "location_code")
    private String locationCode;

    @Column(name = "device_code")
    private String deviceCode;

    @Column(name = "vendor_code")
    private String vendorCode;

    @Column(name = "scan_type")
    private String scanType;

    @Column(name = "client_code")
    private String clientCode;

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

    @Column(name = "uuid")
    private String uuid;

    @Column(name = "uid")
    private String uid;

    @Column(name = "sample_id")
    private String sampleId;

    @Column(name = "user_name")
    private String userName;

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

    @Column(name = "date")
    private String date;

    @Column(name = "farmer")
    private String farmer;

    @Column(name = "village")
    private String village;

    @Column(name = "block")
    private String block;

    @Column(name = "contact_num")
    private String contactNum;

    @Column(name = "adhaar")
    private String adhaar;

    @Column(name = "commodity_gross_wt")
    private BigDecimal commodityGrossWt;

    @Column(name = "commodity_net_wt")
    private BigDecimal commodityNetWt;

    @Column(name = "foul_smell")
    private String foulSmell;

    @Column(name = "vehicle")
    private String vehicle;

    @Column(name = "grade")
    private String grade;

    @Column(name = "buyers_name")
    private String buyersName;

    @Column(name = "rate")
    private BigDecimal rate;

    @Column(name = "is_valid")
    private Boolean isValid;

    @Column(name = "is_duplicate")
    private Boolean isDuplicate;

    @Column(name = "mandal_name")
    private String mandalName;

}

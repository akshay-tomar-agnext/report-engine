package com.agnext.reporting.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;

@Getter
@AllArgsConstructor
public enum ReportFormat {

    SAMPLEDATE("sampleDate","SAMPLE DATE"),
    PROCUREMENTCENTER("procurementCenter","PROCUREMENT CENTER"),
    SURVEYORNAME("surveyorName","SURVEYOR NAME"),
    COMMODITY("commodity","COMMODITY"),
    FARMERNAME("farmerName","FARMER NAME"),
    FRUITID("fruitId","FRUIT ID"),
    SAMPLENO("sampleNo","SAMPLE NO"),
    QTL("quantityUnit","Qty (QTL)"),
    TOTALNOOFBAGS("totalBags","TOTAL NO OF BAGS"),
    ACCEPTEDNOOFBAGS("acceptedBags","ACCEPTED NO OF BAGS"),
    REJECTEDNOOFBAGS("rejectedBags","REJECTED NO OF BAGS"),
    TOTALQTY("totalQuantity","Total Qty in Qtl"),
    MOISTURECONTENT("moistureContent","moisturecontent"),
    FOREIGNMATTER("foreignMatter","foreignmatter"),
    DAMAGED("damaged","damaged"),
    SLIGHTLYDAMAGED("slightlyDamaged","slightlydamaged"),
    OTHERFOODGRAINS("otherFoodGrains","otherfoodgrains"),
    FOREIGNMATTERORGANIC("foreignMatterOrganic","foreignmatter (Organic)"),
    FOREIGNMATTERINORGANIC("foreignMatterInorganic","foreignmatter (In Organic)"),
    DAMAGEDDISCOLOUREDSPROUTED("DamagedDiscolouredSproutedAndWeevilledGrains","Damaged, discoloured, sprouted & weevilled grains "),
    IMMATURESHRUNKEN("ImmatureShrunkenAndShriveledGrains","Immature, shrunken & shriveled grains"),
    ADMIXTURE("AdmixtureOfLowerClass","Admixture of Lower class "),
    DAMAGEDGRAINS("damagedGrains","damagedGrains"),
    SLIGHTLYDAMAGEDDISCOLOURED("slightlyDamagedDiscoloured","Slightly Damaged, Discoloured grains "),
    SHRIVELLEDIMMATUTE("ShriveledImmatureGrains","Shriveled & immature grains"),
    WEWILLEDGRAINS("WeevilledGrains","Weevilled grains "),
    AMOUNT("amount","amount"),
    REMARKS("remark","REMARKS");

    private final String analysisName;
    private final String reportName;

    public static String getFieldByAnalysisName(String analysisName) {
        return Arrays.stream(ReportFormat.values())
                .filter(reportFormat -> StringUtils.equalsIgnoreCase(reportFormat.analysisName,analysisName))
                .findFirst().get().getReportName();
    }
}

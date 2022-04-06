package com.agnext.reporting.converter;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import com.agnext.reporting.enums.AssayingTypeEnum;

@Converter(autoApply = true)
public class AssayingTypeEnumConverter implements AttributeConverter<AssayingTypeEnum, String> {
  @Override
  public String convertToDatabaseColumn(AssayingTypeEnum assayingTypeEnum) {
    if (assayingTypeEnum == null) {
      return null;
    }
    return assayingTypeEnum.getScanType();
  }

  @Override
  public AssayingTypeEnum convertToEntityAttribute(String scanType) {
    if (scanType == null) {
      return null;
    }
    return AssayingTypeEnum.getEnumFromType(scanType);
  }
}

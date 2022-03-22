package com.agnext.reporting.converter;

import java.util.stream.Stream;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import com.agnext.reporting.enums.AssayingTypeEnum;
import lombok.SneakyThrows;

@Converter(autoApply = true)
public class AssayingTypeEnumConverter implements AttributeConverter<AssayingTypeEnum, String> {

  @Override
  public String convertToDatabaseColumn(AssayingTypeEnum assayingTypeEnum) {
    if (assayingTypeEnum == null) {
      return null;
    }
    return assayingTypeEnum.name();
  }

  @SneakyThrows
  @Override
  public AssayingTypeEnum convertToEntityAttribute(String status) {
    if (status == null) {
      return null;
    }

    return Stream.of(AssayingTypeEnum.values())
        .filter(c -> c.name().equalsIgnoreCase(status))
        .findFirst()
        .orElseThrow(IllegalAccessException::new);
  }
}

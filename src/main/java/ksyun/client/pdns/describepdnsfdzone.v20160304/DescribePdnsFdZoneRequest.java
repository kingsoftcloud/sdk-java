package ksyun.client.pdns.describepdnsfdzone.v20160304;

import common.annotation.KsYunField;
import java.util.List;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname DescribePdnsFdZoneRequest @Description 请求参数
 */
@Data
public class DescribePdnsFdZoneRequest {
  /** 转发Zone的ID */
  @KsYunField(name = "FdZoneId")
  private List<String> FdZoneIdList;

  /** 筛选Filter */
  @KsYunField(name = "Filter")
  private List<FilterDto> FilterList;

  @Data
  @ToString
  public static class FilterDto {}
}

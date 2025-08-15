package ksyun.client.vpc.describenatratelimit.v20160304;

import common.annotation.KsYunField;
import java.util.List;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname DescribeNatRateLimitRequest @Description 请求参数
 */
@Data
public class DescribeNatRateLimitRequest {
  /** Nat的ID */
  @KsYunField(name = "NatId")
  private String NatId;

  /** 筛选Filter */
  @KsYunField(name = "Filter")
  private List<FilterDto> FilterList;

  @Data
  @ToString
  public static class FilterDto {
    /** 有效值： - private-ip-address，私网IP地址 - network-interface-id，网卡ID */
    @KsYunField(name = "Name")
    private String Name;

    /***/
    @KsYunField(name = "Value")
    private List<String> ValueList;
  }
}

package ksyun.client.epc.describeepcdeviceattributes.v20151101;

import common.annotation.KsYunField;
import java.util.List;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname DescribeEpcDeviceAttributesRequest @Description 请求参数
 */
@Data
public class DescribeEpcDeviceAttributesRequest {
  /** 筛选Filter */
  @KsYunField(name = "Filter")
  private List<FilterDto> FilterList;

  @Data
  @ToString
  public static class FilterDto {
    /** 有效值： - host-type，裸金属服务器类型 */
    @KsYunField(name = "Name")
    private String Name;

    /***/
    @KsYunField(name = "Value")
    private List<String> ValueList;
  }

  /** 设备的ID */
  @KsYunField(name = "DeviceAttributeId")
  private List<String> DeviceAttributeIdList;

  /** 单次调用可返回的最大条目数量 */
  @KsYunField(name = "MaxResults")
  private Integer MaxResults;

  /** 获取另一页返回结果的 token. */
  @KsYunField(name = "NextToken")
  private String NextToken;
}

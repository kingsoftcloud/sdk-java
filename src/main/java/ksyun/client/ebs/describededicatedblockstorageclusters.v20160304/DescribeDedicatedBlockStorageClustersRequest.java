package ksyun.client.ebs.describededicatedblockstorageclusters.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DescribeDedicatedBlockStorageClustersRequest @Description 请求参数
 */
@Data
public class DescribeDedicatedBlockStorageClustersRequest {
  /***/
  @KsYunField(name = "AvailabilityZone")
  private String AvailabilityZone;

  /***/
  @KsYunField(name = "DbscName")
  private String DbscName;

  /***/
  @KsYunField(name = "Marker")
  private Integer Marker;

  /***/
  @KsYunField(name = "MaxResults")
  private Integer MaxResults;

  /***/
  @KsYunField(name = "DbscCreateDate")
  private String DbscCreateDate;
}

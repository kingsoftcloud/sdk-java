package ksyun.client.influxdb.describeinstances.v20191010;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DescribeInstancesRequest @Description 请求参数
 */
@Data
public class DescribeInstancesRequest {
  /***/
  @KsYunField(name = "InstanceId")
  private String InstanceId;

  /***/
  @KsYunField(name = "InstanceName")
  private String InstanceName;

  /***/
  @KsYunField(name = "Vip")
  private String Vip;

  /***/
  @KsYunField(name = "VpcId")
  private String VpcId;

  /***/
  @KsYunField(name = "FuzzySearch")
  private String FuzzySearch;
}
